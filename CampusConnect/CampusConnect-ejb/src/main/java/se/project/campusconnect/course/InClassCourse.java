/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.project.campusconnect.course;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Dhaval
 */
@Entity
public class InClassCourse extends Course {
    @Column(name = "Location")
    private String location;

    /**
     * Get the value of location
     *
     * @return the value of location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Set the value of location
     *
     * @param location new value of location
     */
    public void setLocation(String location) {
        this.location = location;
    }

}
