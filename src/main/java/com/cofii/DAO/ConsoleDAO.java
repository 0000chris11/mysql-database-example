package com.cofii.DAO;

import java.sql.SQLException;

import com.cofii.beans.Console;

public interface ConsoleDAO {
    
    public void registrar(Console console) throws SQLException;
}
