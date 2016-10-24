/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drools.workshop.misc.model;

/**
 *
 * @author salaboy
 */
public class Student extends Person{
    private String university;

    public Student(String university, String name, int age, String email, String city, Gender gender) {
        super(name, age, email, city, gender);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" + "university=" + university + '}' + " -> " + super.toString();
    }

    
    
    
}
