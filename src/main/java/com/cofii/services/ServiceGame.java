package com.cofii.services;

import java.sql.SQLException;

import com.cofii.beans.Game;

public interface ServiceGame {
    
    public void registrar(Game game) throws SQLException;
}
