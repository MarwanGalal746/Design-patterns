public class manager extends position{
    @Override
    public void requestHandler(Request req) {
        if(req==Request.task){
            System.out.println("approved by manager");
        } else {
            getSuccessor().requestHandler(req);
        }
    }
}
