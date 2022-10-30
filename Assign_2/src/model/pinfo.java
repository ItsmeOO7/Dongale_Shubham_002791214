/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Shubh's PC
 */
public class pinfo {

   
    public String getUname() {
        return Uname;
    }

    public void setUname(String Uname) {
        this.Uname = Uname;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAddr() {
        return Addr;
    }

    public void setAddr(String Addr) {
        this.Addr = Addr;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public int getZip() {
        return Zip;
    }

    public void setZip(int Zip) {
        this.Zip = Zip;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    
      

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
       private  int Age ;
       private   String Addr ;
       private  String City ;
       private  String State ;
       private  String Country ;
       private  int Zip ;
       private  int Phone ;
       private  String Email ;
        private  String Uname ;
       private  String Pass ;
       private  String Name ;
       private  String Gender ;
       
       
       public pinfo (String Uname,String Pass,String Name,String Gender,int Age,String Addr,String City,String State,String Country,int Zip,int Phone,String Email )
       {
           this.Uname =Uname;
           this.Pass = Pass;
           this.Name = Name;
           this.Age = Age;
           this.Gender =Gender;
           this.Addr =Addr;
           this.City =City;
           this.State =State;
           this.Country = Country;
           this.Zip =Zip;
           this.Phone = Phone;
           this.Email = Email;
       }
            
         
    
    
}
