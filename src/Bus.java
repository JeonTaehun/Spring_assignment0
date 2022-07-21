class Bus extends public_transport{
    //요소 : 현재 승객 수(passengers_number)
    //기능 : 있을 경우
    //기본값 : 최대 승객 수(maximum_passenger) = 30, 상태(race_situation) = 운행, 요금(fee) = 1000
    //int passengers_number;
    private int passenger;
    private int fee;

    public Bus(int passenger,int fee, int oil, String state){
        super.oil = oil;
        super.state = state;
        this.passenger = passenger;
        this.fee = passenger*fee;
    }

    public int getPassenger(){
        return passenger;
    }
    public void setPassenger(int passenger){
        this.passenger = passenger;
    }
    public  int getFee(){
        return fee;
    }
    public void  setFee(int fee){

        this.fee = fee;
    }
    public void ridePassenger(){
        if(passenger>0){
            passenger++;
            fee+=1000;
        }
    }
    //오버로딩
    public void ridePassenger(int pass){
        passenger+=pass;
        fee+=pass*1000;
    }
}
