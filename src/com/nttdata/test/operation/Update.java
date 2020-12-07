package com.nttdata.test.operation;

import com.nttdata.test.beans.Anagrafica;
import com.nttdata.test.beans.Indirizzo;
import com.nttdata.test.beans.RecapitiTelefonici;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    Connection conn= null;

    public Update(Connection connection){
        conn = connection;
    }

    public void updateAnagrafica(Anagrafica ana){
        String query = "UPDATE anagrafica set date_agg = CURRENT_DATE where idana = "+ ana.getId() +";";
        System.out.println(query);
        executeUpdate(query);
    }

    public void updateRecapiti(RecapitiTelefonici reca){
        String query = "UPDATE recapiti_telefonici set date_agg = CURRENT_DATE where idreca = "+ reca.getIdReca() +";";
        System.out.println(query);
        executeUpdate(query);
    }

    public void updateIndirizzi(Indirizzo indirizzo){
        String query = "UPDATE indirizzo set date_agg = CURRENT_DATE where idaddress = "+ indirizzo.getIdaddress() +";";
        System.out.println(query);
        executeUpdate(query);
    }

    public void executeUpdate(String query) {

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
            System.out.println("update element successfully");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
