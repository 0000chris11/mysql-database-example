package com.cofii.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.cofii.beans.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GameDAOImpl implements GameDAO{

    @Autowired
    private DataSource dataSource;

    @Override
    public void registrar(Game game) throws SQLException {
        String sql = "INSERT INTO Game (id, name, console) VALUES(?,?,?)";
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = dataSource.getConnection();

            ps = con.prepareStatement(sql);
            ps.setInt(1, game.getId());
            ps.setString(2, game.getName());
            ps.setInt(3, game.getConsole().getId());
            
            ps.executeUpdate();
            

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            if(con != null){
                con.close();
            }
            if(ps != null){
                ps.close();
            }
        }
        
    }
    
}
