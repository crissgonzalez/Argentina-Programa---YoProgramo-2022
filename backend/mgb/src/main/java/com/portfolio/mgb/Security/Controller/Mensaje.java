package com.portfolio.mgb.Security.Controller;

import org.springframework.http.HttpStatus;

public class Mensaje {
    private String mensaje;
    
    
    //constructores

    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Mensaje(String ese_nombre_ya_existe, HttpStatus httpStatus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    //getter y setter

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
}
