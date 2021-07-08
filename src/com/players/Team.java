package com.players;

public class Team {

    private String team;

    public Team(String team){
        this.team = team;
    }


    @Override
    public String toString() {
        return "Team{" +
                "team='" + team + '\'' +
                '}';
    }

    public String getTeam() {   return team;    }
    public void setTeam(String team) {  this.team = team;  }
}
