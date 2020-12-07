package com.nttdata.test.operation;

import com.nttdata.test.beans.Anagrafica;
import com.nttdata.test.beans.Indirizzo;
import com.nttdata.test.beans.RecapitiTelefonici;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Hashtable;

public class Select {
    Connection conn = null;
    public Select(Connection connection){
        conn = connection;
    }

    public ResultSet selectAnagrafica(Anagrafica ana) throws SQLException{
        String query = "SELECT * from anagrafica;";
        System.out.println(query);
        ResultSet rs = executeSelect(query);
        while (rs.next()) {
            int id = rs.getInt("idana");
            String name = rs.getString("nome");
            String cognome = rs.getString("cognome");
            Date date_create = rs.getTimestamp("date_create");
            Date date_agg = rs.getTimestamp("date_agg");

            System.out.print(id + " ");
            System.out.print(name + " ");
            System.out.print(cognome + " ");
            System.out.print(date_create + " ");
            System.out.print(date_agg + " ");
            System.out.println(" ");
        }
        return rs;
    }

    public ResultSet selectRecapiti(RecapitiTelefonici reca) throws SQLException{
        String query = "SELECT * from recapiti_telefonici;";
        System.out.println(query);
        ResultSet rs = executeSelect(query);
        while (rs.next()) {
            int idAddress = rs.getInt("idreca");
            int idAna = rs.getInt("idana");
            String tipo_recapito = rs.getString("tipo_recapito");
            String numero_recapito = rs.getString("numero_recapito");

            System.out.print(idAddress + " ");
            System.out.print(idAna + " ");
            System.out.print(tipo_recapito + " ");
            System.out.print(numero_recapito + " ");
            System.out.println(" ");
        }
        return rs;
    }

    public ResultSet selectIndirizzo(Indirizzo indirizzo) throws SQLException{
        String query = "SELECT * from indirizzo;";
        System.out.println(query);
        ResultSet rs = executeSelect(query);
        while (rs.next()) {
            int idAddress = rs.getInt("idaddress");
            int idAna = rs.getInt("idana");
            String descrizione = rs.getString("descrizione");
            Date date_create = rs.getTimestamp("date_create");
            Date date_agg = rs.getTimestamp("date_agg");

            System.out.print(idAddress + " ");
            System.out.print(idAna + " ");
            System.out.print(descrizione + " ");
            System.out.print(date_create + " ");
            System.out.print(date_agg + " ");
            System.out.println(" ");
        }
        return rs;
    }

    public ResultSet executeSelect(String query){
        Statement st = null;
        try {
            st = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ResultSet rs = null;
        try {
            assert st != null;
            rs = st.executeQuery(query);
            st.close();
            System.out.println("selection elements successfully");
        } catch (SQLException e){
            System.out.println("selection elements failed");
            System.out.println(e);
        }
        return rs;

    }


}
