public class adminUser extends user{

    public adminUser(Group g, String name) {
        super(g, name);
    }

    @Override
    public void receive(String content, String senderName) {
        System.out.println("The admin whose name is "+ this.getName() + " receive \"" + content
        +"\" from "+senderName);
    }


}
