package com.players;

public class Player extends Team{

    private String name;
    private int points;

    public Player(String name, int points, String team){
        super(team);
        this.name = name;
        this.points = points;
    }

    public String getName() {  return name; }
    public void setName(String name) {  this.name = name; }

    public int getPoints() {  return points; }
    public void setPoints(int points) { this.points = points; }
}
