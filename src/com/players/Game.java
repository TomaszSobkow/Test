package com.players;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Game {

    public static List<Team> listOfTeams = new ArrayList<>();

    public static void main(String[] args) {

        listOfTeams.add(new Player("Tom",23,"Flash"));
        listOfTeams.add(new Player("John",43,"bum"));
        listOfTeams.add(new Player("Aga",39,"Flash"));

        findTeamMembers(listOfTeams,l -> l.getTeam().equals("bum"));


    }

      public static void findTeamMembers(List<Team> teams, Predicate<Team> teamMembers){
        teams.forEach(a -> {
                                if(teamMembers.test(a)){
                                    System.out.println("Team: "+a.getTeam());
                                    System.out.println("Name: "+((Player)a).getName()+
                                            "\nPoints: " + ((Player)a).getPoints());
                                    }
                                }
                            );
      }

      public static void findPlayer(List<Player> players, Predicate<Team> findPlayer){
        players.forEach(p -> {  if(findPlayer.test(p))
                                System.out.println("Player "+p.getName()); });
      }
}
