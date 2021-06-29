import java.util.ArrayList;

public abstract class Group {
    abstract void send(String content, user u);
    abstract void addUser(user u);
}
