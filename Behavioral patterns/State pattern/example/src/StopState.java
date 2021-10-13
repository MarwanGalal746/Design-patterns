public class StopState extends State{
    public void doAction(Movie movie) {
        System.out.println("In stop state");
        movie.setState(this);
    }

    public String toString(){
        return "Stop State";
    }

}
