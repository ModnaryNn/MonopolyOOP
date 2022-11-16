package player;

public class Player {
    public int id;
    public String name;
    public int money = 1500;
    public int position = 1;
    public int railCount = 0;
    public boolean jailCard = false;
    public boolean inJail = false;
    
    
    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getid() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getMoney() {
        return money;
    }
    
    public int getPosition() {
        return position;
    }
    
    public int getRailCount() {
        return railCount;
    }
    
    public boolean getJailCard() {
        return jailCard;
    }
    
    public boolean getInJail() {
        return inJail;
    }
    
    public void setid(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setMoney(int money) {
        this.money = money;
    }
    
    public void setPosition(int position) {
        this.position = position;
    }
    
    public void setRailCount(int railCount) {
        this.railCount = railCount;
    }
    
    public void setJailCard(boolean jailCard) {
        this.jailCard = jailCard;
    }
    
    public void setInJail(boolean inJail) {
        this.inJail = inJail;
    }
    
    public void addMoney(int money) {
        this.money += money;
    }

    public void addRailCount() {
        this.railCount++;
    }

    public void removeRailCount() {
        this.railCount--;
    }
    
    public void movePlayer(int position) {
        this.position = position;
    }
}
