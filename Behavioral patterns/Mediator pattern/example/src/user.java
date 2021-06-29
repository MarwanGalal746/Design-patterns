public abstract class user {
    private Group g;
    private String name;

    public user(Group g, String name) {
        this.g = g;
        this.name = name;
    }

    public abstract void receive(String content, String senderName);
    public void send(String content) {
        this.getG().send(content, this);
    }

    public String getName() {
        return name;
    }

    public Group getG() {
        return g;
    }
}
