package pl.malpiszon.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCompare {
    public static void main(String[] args) {
        Player p1 = new Player("A", 30, 60);
        Player p2 = new Player("B", 32, 60);
        Player p3 = new Player("A", 32, 60);

        List<Player> players = Arrays.asList(p1, p2, p3);

        Comparator comparator = Comparator.comparing(Player::getRanking)
                .thenComparing(Player::getAge)
                .thenComparing(Player::getName);
        Collections.sort(players, comparator);
        System.out.println(players);
    }
}
