package MediatorChat;

public interface IMediator {
    void send(String message, User sender);
    void addUser(User user);
}