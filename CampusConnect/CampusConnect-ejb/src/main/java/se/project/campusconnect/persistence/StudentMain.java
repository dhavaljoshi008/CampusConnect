/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.project.campusconnect.persistence;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Advait
 */
public class StudentMain 
{
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    public static void main(String[] args) {
        StudentMain main = new StudentMain();
        emf = Persistence.createEntityManagerFactory("jpa-demoPU");
        em = emf.createEntityManager();
        em.getTransaction().begin();
        main.insertRecord();
        main.updateRecord();
        main.deleteRecord();
        em.close();
        emf.close();
    }
    
    private void insertRecord() {
        Student student = new Student();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        System.out.print("Before save: ");
        System.out.println(student.getId());
        em.persist(student);
        System.out.print("After save: ");
        System.out.println(student.getId());
        tx.commit();
        
        List<Student> students = 
                em.createNamedQuery("retrieveRecord").getResultList();
        
        System.out.println("Number of students: " + students.size());
    }
    
    private void updateRecord() {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Student student1 = em.find(Student.class, new Long(1));
        System.out.println(student1);
        tx.commit();
        
        List<Student> student2 = 
                em.createNamedQuery("retrieveRecord").getResultList();
        System.out.println(student2.get(0));
    }
    
    private void deleteRecord() {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Student student1 = em.find(Student.class, new Long(1));
        System.out.println(student1);
        em.remove(student1);
        tx.commit();
        
        List<Student> student2 = 
                em.createNamedQuery("retrieveRecord").getResultList();
        System.out.print("After delete number of rows remaining is: ");
        System.out.println(student2.size());
    }
  
}
