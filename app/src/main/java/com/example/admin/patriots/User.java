package com.example.admin.patriots;

class User {
    public String name,email,password,age,confirm,phoneNumber;

    public User()
    {

    }

    public User(String name, String email,String phoneNumber, String age, String password, String confirm ) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.password = password;
        this.confirm = confirm;
    }
}
