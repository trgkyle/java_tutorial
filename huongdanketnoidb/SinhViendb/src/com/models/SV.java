/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/**
 *
 * @author VuVu
 */
import com.db.Database;

import java.util.ArrayList;

/**
 *
 * @author VuVu
 */
public class SV {
    private int id;
    private String name;
    private Database db;

    public SV() {
        db=new Database();
    }

    public SV(int id, String name, Database db) {
        this.id = id;
        this.name = name;
        this.db = db;
         db=new Database();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Database getDb() {
        return db;
    }

    public void setDb(Database db) {
        this.db = db;
    }
 
    public int add(){
        return db.themSinhVien(id, name);
    }
     public int update(int id, String newName){
        return db.sua(id, newName);
    }
     public int delete(int id){
        return db.xoa(id);
    }
     public ArrayList find(int id){
        return db.tim(id);
    }
    

   public ArrayList getAll()
   {
       return db.LayTatCaSV();
   }
}
