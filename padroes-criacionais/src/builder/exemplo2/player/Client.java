package builder.exemplo2.player;

import builder.exemplo1.meal.builder.FastFoodMealBuilder;
import builder.exemplo2.player.builder.FootballPlayerBuilder;
import builder.exemplo2.player.model.FootballPlayer;

public class Client {
    public static void main(String[] args) {

        FootballPlayer player1 = new FootballPlayerBuilder().setName("Lionel Messi")
                .setCurrentTeam("PSG")
                .setNumber(30)
                .setHeight(1.7)
                .getPlayer();
        System.out.println(player1);

        System.out.println("---------------------------------");

        FootballPlayer player2 = new FootballPlayerBuilder().setName("Cristiano Ronaldo")
                .setCurrentTeam("Al Nassir")
                .setNumber(7)
                .getPlayer();
        System.out.println(player2);

        System.out.println("---------------------------------");

        FootballPlayer player3 = new FootballPlayerBuilder().setName("Heung-Min Son")
                .setCurrentTeam("Tottenham")
                .getPlayer();
        System.out.println(player3);
    }
}
