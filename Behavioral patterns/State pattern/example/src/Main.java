public class Main {

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        State state1 = new StartState();
        state1.doAction(movie1);
        System.out.println("Current state of the movie: " + movie1.getState().toString());
        State state2 = new StopState();
        state2.doAction(movie1);
        System.out.println("Current state of the movie: " + movie1.getState().toString());
    }
}
