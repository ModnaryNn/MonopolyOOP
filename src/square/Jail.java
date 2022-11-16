package square;

import player.Player;

public class Jail extends Square {
    public Jail(int id) {
        this.id = id;
    }

    @Override
    public void action(Player player) {
        System.out.println("id:" + player.getid() + " name:" + "You are in jail");
        player.setInJail(true);
    }
}
