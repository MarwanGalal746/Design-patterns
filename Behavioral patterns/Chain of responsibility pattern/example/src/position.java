public abstract class position {
    private position successor;

    public void setSuccessor(position successor){
        this.successor=successor;
    }

    public position getSuccessor() {
        return successor;
    }

    public abstract void requestHandler(Request req);
}
