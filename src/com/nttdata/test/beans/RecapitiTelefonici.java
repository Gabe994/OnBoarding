package com.nttdata.test.beans;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

public class RecapitiTelefonici {
    int idReca;
    int idAna;
    String tipo_recapito;
    String numero_recapito;

    public int getIdReca() {
        return idReca;
    }

    public void setIdReca(int idReca) {
        this.idReca = idReca;
    }

    public int getIdAna() {
        return idAna;
    }

    public void setIdAna(int idAna) {
        this.idAna = idAna;
    }

    public String getTipo_recapito() {
        return tipo_recapito;
    }

    public void setTipo_recapito(String tipo_recapito) {
        this.tipo_recapito = tipo_recapito;
    }

    public String getNumero_recapito() {
        return numero_recapito;
    }

    public void setNumero_recapito(String numero_recapito) {
        this.numero_recapito = numero_recapito;
    }


}
