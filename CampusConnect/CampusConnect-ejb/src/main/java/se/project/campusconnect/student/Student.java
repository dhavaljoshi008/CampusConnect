/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.project.campusconnect.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.*;

/**
 *
 * @author Advait
 * For the validations follow 
 * "http://docs.oracle.com/javaee/6/tutorial/doc/gircz.html"
 */
@Entity
@Table
public class Student {

    @TableGenerator(name = "Student", pkColumnName = "studentID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; 
    
    @Size(max = 7)
    private double studentID;
    
    @NotNull(message="Student Name must be specified.")
    @Size(min = 2,max = 30)
    private String sname;
    
    @NotNull(message="Student Email ID must be specified.")
    @Size(min = 12,max = 35)
    private double semailID;
    /*for digits
    @DecimalMax(value = "50000.00")
    private int salary;
    */
    @Size(max = 10)
    private String slevel;

    /*
    public Student(int id, int studentID, String sname, double semailID, String level) {
        super();
        this.id = id;
        this.studentID = studentID;
        this.sname = sname;
        this.semailID = semailID;
        this.level = level;
    }
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getStudentID() {
        return studentID;
    }

    public void setStudentID(double studentID) {
        this.studentID = studentID;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getSemailID() {
        return semailID;
    }

    public void setSemailID(double semailID) {
        this.semailID = semailID;
    }

    public String getLevel() {
        return slevel;
    }

    public void setLevel(String level) {
        this.slevel = level;
    }

    @Override
    public String toString() {
        return "Student [" + id + ", Student ID =" + studentID + ", Name =" + sname + ", Email ID =" + semailID + ", Level = " + slevel + "]";
    }
}
