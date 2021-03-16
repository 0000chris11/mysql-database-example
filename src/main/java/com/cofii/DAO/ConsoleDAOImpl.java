package com.cofii.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.cofii.beans.Console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ConsoleDAOImpl implements ConsoleDAO{

    @Autowired
    private DataSource dataSource;

    @Override
    public void registrar(Console console) throws SQLException {
        String sql = "INSERT INTO Console (id, name) VALUES(?,?)";
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = dataSource.getConnection();

            ps = con.prepareStatement(sql);
            ps.setInt(1, console.getId());
            ps.setString(2, console.getName());
            
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
