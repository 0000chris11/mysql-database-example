package com.cofii.services;

import java.sql.SQLException;

import com.cofii.beans.Console;

public interface ServiceConsole {
    
    public void registrar(Console console) throws SQLException;
}
