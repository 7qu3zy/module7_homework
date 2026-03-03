package MediatorChat;

public class Main {

    public static void main(String[] args){

        IMediator chat = new ChatRoom();

        User u1 = new User("Алексей", chat);
        User u2 = new User("Амир", chat);

        chat.addUser(u1);
        chat.addUser(u2);

        u1.send("Привет всем!");
    }
}