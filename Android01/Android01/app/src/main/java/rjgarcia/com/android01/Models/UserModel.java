package rjgarcia.com.android01.Models;

import android.content.Intent;

import java.io.Serializable;

/**
 * Created by rjgarcia on 05/08/2017.
 */


public class UserModel implements Serializable {

    private String userName;

    public void setUserName(String _userName){
        this.userName = _userName;
    }

    public  String getUserName(){
        return this.userName;
    }

    private String passwordText;

    public String getPasswordText() {
        return passwordText;
    }

    public void setPasswordText(String passwordText) {
        this.passwordText = passwordText;
    }

    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String _lastName) {
        this.lastName = _lastName;
    }

    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName() {
        this.fullName = String.format("%s %s", firstName, lastName);
    }

    private Integer gender;

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public UserModel(String _userName, String _passwordText, String _firstName, String _lastName, Integer _gender, Integer _age){
        this.userName = _userName;
        this.passwordText = _passwordText;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.gender = _gender;
        this.age = _age;
        this.setFullName();
    }

}
