/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;

/**
 *
 * @author fagun at 17/09/2024 mergetest
 */
public class Student {
    private String name;
    private static int studentID;
    private String address;
    
    public Student() {}
    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
}
