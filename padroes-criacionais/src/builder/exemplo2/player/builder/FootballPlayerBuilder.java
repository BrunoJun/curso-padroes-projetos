package builder.exemplo2.player.builder;

import builder.exemplo2.player.model.FootballPlayer;

public class FootballPlayerBuilder {

    private String name, currentTeam;
    private int number;
    private double height;

    public FootballPlayerBuilder setName(String name){

        this.name = name;

        return this;
    }

    public FootballPlayerBuilder setCurrentTeam(String team){

        this.currentTeam = team;

        return this;
    }

    public FootballPlayerBuilder setNumber(int number){

        this.number = number;

        return this;
    }

    public FootballPlayerBuilder setHeight(double height){

        this.height = height;

        return this;
    }

    public FootballPlayer getPlayer(){

        return new FootballPlayer(name, currentTeam, number, height);
    }
}
