public class Main {

    public static void main(String[] args) {
        position mgr = new manager();
        position vp = new vicePresident();
        position p = new president();
        mgr.setSuccessor(vp);
        vp.setSuccessor(p);
        p.setSuccessor(null);
        mgr.requestHandler(Request.task);
        mgr.requestHandler(Request.vacation);
    }
}
