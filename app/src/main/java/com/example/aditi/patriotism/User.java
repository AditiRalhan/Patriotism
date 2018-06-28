package com.example.aditi.patriotism;

/**
 * Created by ADITI on 6/27/2018.
 */

public class User
{
    public String name,email,password,age,confirm,phoneNumber;

    public User()
    {

    }

    public User(String name, String email,String phoneNumber, String age, String password, String confirm ) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.password=password;
        this.confirm = confirm;
    }
}
