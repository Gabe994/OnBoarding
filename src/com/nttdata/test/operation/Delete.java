package com.nttdata.test.operation;

import com.nttdata.test.beans.Anagrafica;
import com.nttdata.test.beans.Indirizzo;
import com.nttdata.test.beans.RecapitiTelefonici;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    Connection conn = null;

    public Delete(Connection connection){
        conn = connection;
    }

    public void deleteAnagrafica(Anagrafica ana){
        String query = "DELETE from anagrafica where idana = "+ ana.getId() +";";
        System.out.println(query);
        executeDelete(query);
    }

    public void deleteRecapiti(RecapitiTelefonici reca){
        String query = "DELETE from recapiti_telefonici where idreca = "+ reca.getIdReca() +";";
        System.out.println(query);
        executeDelete(query);
    }

    public void deleteIndirizzo(Indirizzo indirizzo){
        String query = "DELETE from indirizzo where idaddress = "+ indirizzo.getIdaddress() +";";
        System.out.println(query);
        executeDelete(query);
    }

    public void executeDelete(String query) {
        Statement st = null;
        try {
            st = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ResultSet rs = null;
        try {
            assert st != null;
            st.executeQuery(query);
            st.close();
            System.out.println("deleted element successfully");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
