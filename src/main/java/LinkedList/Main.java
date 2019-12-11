package LinkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Participant> participants = new LinkedList<>(Arrays.asList(
                new Participant("Adam", 34),
                new Participant("krzyś", 43),
                new Participant("michaś", 12),
                new Participant("zygmunt", 12)));
        participants.add(new Participant("daniel", 50));

        System.out.println("Liczba userów zgłoszonych: ");
        for (Participant participant : participants) {
            System.out.println(participant.toString());
        }
        System.out.print("Participant size() ");
        System.out.println(participants.size());


        for (Iterator<Participant> participantIterator = participants.iterator();
             participantIterator.hasNext(); ) {

            Participant participant = participantIterator.next();
            int participantAge = participant.getAge();
            boolean smallerthan18 = participantAge < 18;

            if (smallerthan18) {
                participantIterator.remove();
            }

        }

        System.out.println("Liczba pełnoletnich userów:");
        for (Participant participant : participants) {
            System.out.println(participant.toString());
        }
        System.out.print("Participant size() ");
        System.out.println(participants.size());


    }
}
