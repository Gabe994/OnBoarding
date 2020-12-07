package com.nttdata.test;

import com.nttdata.test.beans.*;

import com.nttdata.test.operation.*;
import com.nttdata.test.db.PostgresDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;


public class Main {
    public static void main(String[]args) throws SQLException {
        System.out.println("Hello");

        //DB CONNECTION
        PostgresDB postgresdb = new PostgresDB();
        Connection conn = postgresdb.connectToDatabase();

        //OPERATIONS
        Select select = new Select(conn);
        Update update = new Update(conn);
        Insert insert = new Insert(conn);
        Delete delete = new Delete(conn);

        //ANAGRAFICA
        Anagrafica ana = new Anagrafica();
        ana.setNome("Luca");
        ana.setCognome("Gabellini");
        ana.setId(12);

        //RECAPITI TELEFONICI
        RecapitiTelefonici reca = new RecapitiTelefonici();
        reca.setIdReca(8);
        reca.setIdAna(12);
        reca.setTipo_recapito("mobile");
        reca.setNumero_recapito("+39 331 45 73 347");

        // INDIRIZZI
        Indirizzo indirizzo = new Indirizzo();
        indirizzo.setIdaddress(7);
        indirizzo.setIdana(12);
        indirizzo.setDescrizione("via montevecchio 122");

        //DELETE
        delete.deleteAnagrafica(ana);
        delete.deleteRecapiti(reca);
        delete.deleteIndirizzo(indirizzo);

        // INSERT
        insert.insertAnagrafica(ana);
        insert.insertRecapiti(reca);
        insert.insertIndirizzo(indirizzo);

        //UPDATE
        update.updateAnagrafica(ana);
        update.updateRecapiti(reca);
        update.updateIndirizzi(indirizzo);


        // SELECT
        ResultSet anaSelect = select.selectAnagrafica(ana);
        ResultSet recaSelect = select.selectRecapiti(reca);
        ResultSet indirizzoSelect = select.selectIndirizzo(indirizzo);

        //DELETE
        delete.deleteAnagrafica(ana);
        delete.deleteRecapiti(reca);
        delete.deleteIndirizzo(indirizzo);












    }

}
