import java.util.ArrayList;

public class chatGroup extends Group {
    private  ArrayList<user> usrs;

    public chatGroup() {
        this.usrs = new ArrayList<>();
    }

    @Override
    void send(String content, user u) {
        for(int i=0; i<usrs.size(); i++){
            if(u!=usrs.get(i)){
                usrs.get(i).receive(content, u.getName());
            }
        }
    }

    @Override
    void addUser(user u) {
        usrs.add(u);
    }
}
