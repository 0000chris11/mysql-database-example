package com.cofii.services;

import java.sql.SQLException;

import com.cofii.DAO.GameDAO;
import com.cofii.beans.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceGameImpl implements ServiceGame{

    @Autowired
    private GameDAO gameDAO;

    @Override
    public void registrar(Game game) throws SQLException {
        gameDAO.registrar(game);
        
    }
    
}
