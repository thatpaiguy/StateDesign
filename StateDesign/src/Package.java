public class Package {
    private State orderedState;
    private State inTransitState;
    private State deliveredState;
    private String name;
    private State state;

    /**
     * each package is initialized with 3 state attributes
     */
    public Package(String contents){
        orderedState = new OrderedState(this);
        inTransitState = new InTransitState(this);
        deliveredState = new DeliveredState(this);
        this.name = contents;
    }

    /**
     *methods that set the state to each State attribute and displays the message for that state
     */
    public void order(){
        this.setState(orderedState);
        state.displayStatus();
        state.displayETA();
    }
    public void mail(){
        this.setState(inTransitState);
        state.displayStatus();
        state.displayETA();
    }
    public void received(){
        this.setState(deliveredState);
        state.displayStatus();
        state.displayETA();
    }

    /**
     * setter for state that is not called in the driver but can be
     */
    public void setState(State state){
        this.state = state;
    }

    /**
     * getter
     */
    public String getName(){
        return name;
    }
}
