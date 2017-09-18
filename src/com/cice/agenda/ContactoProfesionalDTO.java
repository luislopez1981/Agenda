/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda;

/**
 *
 * @author cice
 */
public class ContactoProfesionalDTO extends PersonaDTO{
    
    private String cif;
    
    private String telefonoPro1;
    
    private String telefonoPro2;
    
    private String callePro;
    
    private String municipioPro;
    
    private String sector;

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getTelefonoPro1() {
        return telefonoPro1;
    }

    public void setTelefonoPro1(String telefonoPro1) {
        this.telefonoPro1 = telefonoPro1;
    }

    public String getTelefonoPro2() {
        return telefonoPro2;
    }

    public void setTelefonoPro2(String telefonoPro2) {
        this.telefonoPro2 = telefonoPro2;
    }

    public String getCallePro() {
        return callePro;
    }

    public void setCallePro(String callePro) {
        this.callePro = callePro;
    }

    public String getMunicipioPro() {
        return municipioPro;
    }

    public void setMunicipioPro(String municipioPro) {
        this.municipioPro = municipioPro;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    
        
}
