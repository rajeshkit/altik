package org.example;

public class Department {
    private College college;

    public void setCollege(College college) {
        this.college = college;
    }
    void display(){
        college.displayCollege();
    }
}
