package com.example.testeapp;
//OBJECTS
public class Client {
    int cpf, date;
    String name, adress, email, pswd;
 public Client(){

 }
 //CONSTRUCTOR
 public Client(Integer_cpf, Integer_date, String_name, String_adress, String_email, String_pswd){
    this.cpf = _cpf;
    this.date =_date;
    this.name =_name;
    this.adress =_adress;
    this.email =_email;
    this.pswd =_pswd;
 }
    // METHODS GETERS AND SETERS
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }
}

