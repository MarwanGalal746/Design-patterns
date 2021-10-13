public class StartState extends State {
    public void doAction(Movie movie) {
        System.out.println("In start state");
        movie.setState(this);
    }

    public String toString(){
        return "Start State";
    }

}
