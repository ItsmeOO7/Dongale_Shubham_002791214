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
public class datainfo {
    
    private ArrayList <Saveinfo> dinfo;
    
    public datainfo()
    {
        this.dinfo = new ArrayList <Saveinfo> ();
    }

    public ArrayList<Saveinfo> getDinfo() {
        return dinfo;
    }

    public void setDinfo(ArrayList<Saveinfo> dinfo) {
        this.dinfo = dinfo;
    }
    
    public Saveinfo add()
    {
        Saveinfo newinfo = new Saveinfo();
        dinfo.add(newinfo);
        return newinfo;
    }
 
}
