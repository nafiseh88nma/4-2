package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	// write your code here
        Scanner input = new Scanner(System.in);
      Student<Integer,String,Integer> student= new Student<Integer,String,Integer>(971113053,"nafiseh",123456789);
        List list= new ArrayList();
        list.add(input.nextInt());
        list.add(input.nextInt());
        list.add(input.nextInt());
        list.add(input.nextInt());
        list.add(input.nextInt());
        Student student1=(Student)student.clone();
        Student student2=(Student)student.clone();
        Student student3=(Student)student.clone();
        Student student4=(Student)student.clone();
        Student student5=(Student)student.clone();
    }
}
