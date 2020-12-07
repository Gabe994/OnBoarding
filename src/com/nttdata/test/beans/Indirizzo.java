package com.nttdata.test.beans;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

public class Indirizzo {
    int idaddress;
    int idana;
    String descrizione;

    public int getIdaddress() {
        return idaddress;
    }

    public void setIdaddress(int idaddress) {
        this.idaddress = idaddress;
    }

    public int getIdana() {
        return idana;
    }

    public void setIdana(int idana) {
        this.idana = idana;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }




}