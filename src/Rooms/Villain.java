package Rooms;

import People.Person;

public class Villain extends Room {
    public Villain(int x, int y) {
        super(x, y);

    }
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You have met have been struck by a goon." + "\n" + "-10 Health");
    }
}