import java.util.*;
public class CreatingOwnClass {
    public static void main(String[] args) {
        int n = 3;
        Players[] players = new Players[n];
        players[0] = new Players("Alice",99);
        players[1] = new Players("Alison",95);
        players[2] = new Players("Bobe",100);


        for (Players player: players ){
            System.out.println(player.toString());
        }
    }

}

  class Players{
    String name;
    int marks;

    Players(String name , int marks){
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return  name  + "    " + marks;
    }
}
