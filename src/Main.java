package observer;

public class Main {
    public static void main(String[] args) {
        Football transfer = new Football();

        transfer.addPlayer("Cristiano Ronaldo");
        transfer.addPlayer("Erling Haaland");

        User newTeam = new User("Real Madrid");
        transfer.signUpUser(newTeam);

        transfer.addPlayer("Lionel Messi");
        transfer.deletePlayer("Cristiano Ronaldo");

    }
}
