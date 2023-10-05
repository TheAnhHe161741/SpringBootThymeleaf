package com.example.form;


public class LoginForm {
    private String username;
    private String passsword;

    public LoginForm(String username, String passsword) {
        this.username = username;
        this.passsword = passsword;
    }
    public LoginForm() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

}
