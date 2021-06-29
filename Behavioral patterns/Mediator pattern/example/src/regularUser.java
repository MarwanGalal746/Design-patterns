public class regularUser extends user{
    public regularUser(Group g, String name) {
        super(g, name);
    }

    @Override
    public void receive(String content, String senderName) {
        System.out.println("The user whose name is "+ this.getName() + " receive \"" + content
                +"\" from "+senderName);
    }

}
