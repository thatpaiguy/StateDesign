public class DeliveredState implements State {
    private Package pkg;
    public DeliveredState(Package pkg){
        this.pkg = pkg;
    }
    /**
     * overridden methods
     */
    public void displayStatus(){
        System.out.println(pkg.getName() + " is here for you.");
    }
    public void displayETA(){
    }
}
