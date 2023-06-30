package javaAdvance.generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator.PartyU;

public class Team <T extends Participant> {
    private String name;
    public List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.println("We add new member - " + participant + " in the " + name + " Team");
    }

    public void playWith(Team<T> team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winnerName = this.name;
        } else
            winnerName = team.name;
        System.out.println("The game win the " + winnerName + " Team");
    }
}
