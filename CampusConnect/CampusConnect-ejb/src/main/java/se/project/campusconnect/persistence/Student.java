/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.project.campusconnect.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Advait
 */

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id, studentID;
    private String sname;
    private double semailID;
    private String level;
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

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
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
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
      return "Student [" +id + ", Student ID =" + studentID + ", Name =" + sname + ", Email ID =" + semailID + ", Level = " + level +"]";
    }
}
