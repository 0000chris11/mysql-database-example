package com.cofii.main;

import java.sql.SQLException;

import com.cofii.beans.Console;
import com.cofii.beans.Game;
import com.cofii.services.ServiceGame;
import com.cofii.services.ServiceGameImpl;
import com.cofii2.methods.MString;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		/*
		Game game = new Game();
		game.setId(2);
		game.setName("Kingdom Hearts");

		Console console = new Console();
		console.setId(3);
		console.setName("Playstation 2");
		game.setConsole(console);
		*/

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/cofii/xml/beans.xml");
		ServiceGame ser = (ServiceGame) appContext.getBean("serviceGameImpl");
		Game game = (Game) appContext.getBean("new game");
		
		try {
			ser.registrar(game);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		((ConfigurableApplicationContext)appContext).close();
	}

}
