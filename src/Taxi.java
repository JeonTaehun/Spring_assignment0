class Taxi extends public_transport{
    private int passenger;
    private int fee;
    private String destination;

    public Taxi(int passenger, int oil, String state, int fee,String destination){
        super.oil = oil;
        super.state = state;
        this.passenger = passenger;
        this.fee = fee;
        this.destination = destination;
    }
    public int getPassenger_taxi(){
        return passenger;
    }
    public void setPassenger_taxi(int passenger){
        this.passenger = passenger;
    }
    public  int getFee(){
        return fee;
    }
    public String destinationInfo(){
        return destination;
    }
    public void destinationchange(String destinationchange) {
        state = destinationchange;
    }

}
