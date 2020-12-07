package com.nttdata.test.operation;

import com.nttdata.test.beans.Anagrafica;
import com.nttdata.test.beans.Indirizzo;
import com.nttdata.test.beans.RecapitiTelefonici;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    Connection conn = null;

    public Insert(Connection connection){
        conn = connection;
    }

    public void insertAnagrafica(Anagrafica ana){
        String query = "INSERT INTO anagrafica (idana, nome, cognome, date_create, date_agg) VALUES ("+ ana.getId() +", '"+ ana.getNome() +"', '"+ ana.getCognome() +"', CURRENT_DATE, CURRENT_DATE);";
        System.out.println(query);
        executeInsert(query);
    }

    public void insertRecapiti(RecapitiTelefonici reca){
        String query = "INSERT INTO recapiti_telefonici (idreca, idana, tipo_recapito, numero_recapito) VALUES ("+ reca.getIdReca() + ", "+ reca.getIdAna() +", '"+ reca.getTipo_recapito() +"',  '"+ reca.getNumero_recapito() +"');";
        System.out.println(query);
        executeInsert(query);
    }

    public void insertIndirizzo(Indirizzo indirizzo){
        String query = "INSERT INTO indirizzo (idaddress, idana, descrizione, date_create, date_agg) VALUES ("+ indirizzo.getIdaddress() +", '"+ indirizzo.getIdana() +"', '"+ indirizzo.getDescrizione() +"', CURRENT_DATE, CURRENT_DATE);";
        System.out.println(query);
        executeInsert(query);
    }

    public void executeInsert(String query) {
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
            System.out.println("insert element successfully");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }


}
