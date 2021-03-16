package com.cofii.DAO;

import java.sql.SQLException;

import com.cofii.beans.Game;

public interface GameDAO {
    
    public void registrar(Game game) throws SQLException;
}
