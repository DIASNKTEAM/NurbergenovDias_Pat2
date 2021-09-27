package observer;

import java.util.List;

public class User implements Observer{
    private String teamName;

    public User(String teamName){
        this.teamName = teamName;
    }

    @Override
    public void update (List<String> players){
        System.out.println("Dear " + this.teamName + "\nWe introduce our new player in stadium:\n" + players + "\n");
    }
}
