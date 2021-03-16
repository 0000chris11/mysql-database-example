package com.cofii.beans;

public class Game {
 
    private int id;
    private String name;
    private Console console;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Console getConsole() {
        return console;
    }
    public void setConsole(Console console) {
        this.console = console;
    }
}
