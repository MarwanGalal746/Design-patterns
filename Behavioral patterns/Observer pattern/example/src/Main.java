public class Main {

    public static void main(String[] args) {

        //two users
        Observer user1 = new subscriber("John");
        Observer user2 = new subscriber("Stephen");

        //creating a youtube channel and attach the two users
        Observable channel = new youtubeChannel();
        channel.attach(user1);
        channel.attach(user2);

        //Channel will upload a video and notify all subscribers
        channel.notifyAllObservers();
    }
}
