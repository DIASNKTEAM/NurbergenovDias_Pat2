package observer;

import java.util.ArrayList;
import java.util.List;

public class Football implements Observable{

    private List<String> player = new ArrayList<>();
    private List<Observer> players = new ArrayList<>();

    public void addPlayer(String player){
        this.player.add(player);
        notifyAllUsers();
    }

    public void deletePlayer(String player){
        this.player.remove(player);
        notifyAllUsers();
    }



    @Override
    public void signUpUser(Observer observer) {
        this.players.add(observer);
    }

    @Override
    public void deleteUser(Observer observer) {
        this.players.remove(observer);
    }

    @Override
    public void notifyAllUsers() {
        for(Observer observer: players){
            observer.update(this.player);
        }
    }
}
