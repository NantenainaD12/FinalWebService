package com.example.demo.Function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conn_Encher{
    public Connection conn=null;
    private Statement espace;

    public Conn_Encher(){


        try{
            Class.forName("org.postgresql.Driver");
            Class.forName("org.postgresql.Driver");
            this.conn = DriverManager.getConnection("jdbc:postgresql://hattie.db.elephantsql.com:5432/rfharpmk","rfharpmk","y3_VINdERSmmXdBb9De5fbUVAUgGz4U0");
            //étape 3: créer l'objet statement

            this.espace=this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);


            //"jdbc:postgresql://host:port/database"
          //  this.conn=  DriverManager.getConnection("jdbc:postgresql://snuffleupagus.db.elephantsql.com:5432/tioxwyhf","tioxwyhf","ylLj--uUH8gutjATR4z4rXqX7sq33uJq");
          //  this.conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/encher","encher","encher");

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Statement get_espace()
    {
        return this.espace;
    }
    public void close()
    {
        try {
            this.conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}