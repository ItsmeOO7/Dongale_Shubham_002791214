/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Shubh's PC
 */
public class patient_app {

    public int getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(int doc_id) {
        this.doc_id = doc_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    int doc_id;
    Date date;
    
    public patient_app (int doc_id,Date Pass )
       {
           this.doc_id =doc_id;
           this.date = date;
           
       }
          
    
}
