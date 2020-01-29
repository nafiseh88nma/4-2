package com.company;

/**
 * Created by admin on 10/25/2019.
 */
public class Student <Id,Name,Password> implements Cloneable{
    Id id;
    Name name;
    Password password;
    public Student(Id id,Name name,Password password)
    {
        this.id=id;
        this.name=name;
        this.password=password;
    }
    @Override
    protected Object clone () throws CloneNotSupportedException {
        return super.clone();
    }
}
