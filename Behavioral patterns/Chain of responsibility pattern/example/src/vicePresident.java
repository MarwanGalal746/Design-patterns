public class vicePresident extends position{
    @Override
    public void requestHandler(Request req) {
        if(req==Request.vacation){
            System.out.println("approved by vice president");
        } else{
            getSuccessor().requestHandler(req);
        }
    }
}
