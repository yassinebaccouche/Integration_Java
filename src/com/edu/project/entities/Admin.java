/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.project.entities;

import java.sql.Date;

/**
 *
 * @author THEOLDISBACK
 */
public class Admin extends User{

    public Admin() {
    }

    public Admin( String username, String password, Date age, String nom, String prenom, int numtel, String email) {
       
        super(0, username, password, age, nom, prenom, "admin", numtel, email);
    }
    
    
    
}
