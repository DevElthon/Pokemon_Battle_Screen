/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poderes;

/**
 *
 * @author samuel
 */
public class Moves {
    private String name;
    private int power;
    private String type;
    private String attribute;
    private int accuracy;
    private int cost;

    public Moves(String name, int power, String type, String atribute, int accuracy, int cost) {
        this.name = name;
        this.power = power;
        this.attribute = atribute;
        this.type = type;
        this.accuracy = accuracy;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String Attribute) {
        this.attribute = Attribute;
    }
    
    
    
    
    
}
