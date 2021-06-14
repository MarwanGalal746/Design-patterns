import java.util.ArrayList;

public class youtubeChannel extends Observable {

    public youtubeChannel() {
        super();
    }

    @Override
    public void notifyAllObservers() {
        /*
         * lines of code to upload a video
         */
        for (int i=0 ; i<this.getAllObservers().size() ; i++){
            getAllObservers().get(i).getNotified();
        }
    }
}
