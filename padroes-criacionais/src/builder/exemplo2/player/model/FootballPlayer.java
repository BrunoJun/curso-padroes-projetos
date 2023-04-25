package builder.exemplo2.player.model;

public class FootballPlayer {

    private String name, currentTeam;
    private int number;
    private double height;

    public FootballPlayer(String name, String currentTeam, int number, double height) {

        this.name = name;
        this.currentTeam = currentTeam;
        this.number = number;
        this.height = height;
    }

    public String getName() {

        return name;
    }

    public String getCurrentTeam() {

        return currentTeam;
    }

    public int getNumber() {

        return number;
    }

    public double getHeight() {

        return height;
    }

    @Override
    public String toString() {

        return "FootballPlayer {" +
                "name='" + name + '\'' +
                ", currentTeam='" + currentTeam + '\'' +
                ", number=" + number +
                ", height=" + height +
                '}';
    }
}
