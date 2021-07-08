package com.players;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Game {

    public static List<Team> listOfTeams = new ArrayList<>();

    public static void main(String[] args) {

        Team flash = new Player("Tom",23,"Flash");
        Team bum = new Player("John",43,"bum");

        listOfTeams.add(flash);
        listOfTeams.add(bum);

        findTeam(listOfTeams,l -> l.getTeam().equals("Flash"));


    }

      public static void findTeam(List<Team> teams, Predicate<Team> teamMembers){
        teams.forEach(a -> {
                            if(teamMembers.test(a))
                                System.out.println("Team: "+a.getTeam()); });
      }

      public static void findPlayer(List<Player> players, Predicate<Team> findPlayer){
        players.forEach(p -> {  if(findPlayer.test(p))
                                System.out.println("Player "+p.getName()); });
      }
}
