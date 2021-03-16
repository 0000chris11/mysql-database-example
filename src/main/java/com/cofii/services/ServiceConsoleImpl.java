package com.cofii.services;

import java.sql.SQLException;

import com.cofii.DAO.ConsoleDAO;
import com.cofii.beans.Console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceConsoleImpl implements ServiceConsole{

    @Autowired
    private ConsoleDAO consoleDAO;

    @Override
    public void registrar(Console console) throws SQLException {
        consoleDAO.registrar(console);
        
    }
    
}
