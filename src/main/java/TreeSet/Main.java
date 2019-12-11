package TreeSet;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Participant> participants = new TreeSet<>(Arrays.asList(
                new Participant("Adam", 34),
                new Participant("krzyś", 43),
                new Participant("michaś", 12),
                new Participant("zygmunt", 12)));
        participants.add(new Participant("daniel", 50));
        participants.add(new Participant("daniel", 50));


        System.out.println("Lista wszystkich uczestników: ");
        for (Participant participant : participants) {
            System.out.println(participant.toString());
        }

        System.out.println("Participant size: " + participants.size());


    }
}
