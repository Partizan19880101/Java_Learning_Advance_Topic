package javaAdvance.multithreading;

import java.lang.ref.PhantomReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;
import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator.PartyU;

public class ExchangerExample {

    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.SCISSORS);
        friend1Action.add(Action.PAPER);
        friend1Action.add(Action.SCISSORS);
        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.PAPER);
        friend2Action.add(Action.STONE);
        friend2Action.add(Action.STONE);
        Thread thread1 = new Thread(new BestFriend("Pavel", friend1Action, exchanger));
        thread1.start();
        Thread thread2 = new Thread(new BestFriend("Uri", friend2Action, exchanger));
        thread2.start();
    }
}
enum Action {
    STONE, PAPER, SCISSORS;
}
class BestFriend extends Thread {
    String name;
    private Exchanger<Action> exchanger;
    private List<Action> myActions;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
    }

    private void whoWins(Action myAction, Action friendsAction) {
        if ((myAction == Action.STONE && friendsAction == Action.SCISSORS)
        || (myAction == Action.SCISSORS && friendsAction == Action.PAPER)
        || (myAction == Action.PAPER && friendsAction == Action.STONE)) {
            System.out.println(name + " WINS!!!");
        }
    }
    public void run() {
        Action reply;
        for (Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}