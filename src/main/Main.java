package main;

import player.Player;
import square.Jail;
import square.Square;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player(1, "Player 1");
        Square jail = new Jail(1);
        jail.action(player1);
    }
}