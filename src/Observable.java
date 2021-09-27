package observer;

public interface Observable {
    void signUpUser (Observer observer);
    void deleteUser (Observer observer);
    void notifyAllUsers();
}
