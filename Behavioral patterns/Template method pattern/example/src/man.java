public abstract class man {

    final public void dailyRoutine() {
        wakingUp();
        breakfast();
        working();
        hangingOut();
        sleeping();
    }

    private void wakingUp(){
        System.out.println("Waking up");
    }

    private void breakfast(){
        System.out.println("Breakfast");
    }

    abstract public void working();

    public void hangingOut(){}

    private void sleeping(){
        System.out.println("Sleeping");
    }

}
