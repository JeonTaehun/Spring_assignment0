public class public_transport {

    //요소 : 번호(carnumber), 주유량(oiling), 속도(speed), 속도변경(speed_change), 최대 승객수(maximum_passenger)
    //기능 : 운행시작(race_start), 속도변경(speed_change), 상태변경(state_change), 승객탑승(passenger_boarding)
    //기본값 : 주유량:100, 속도=0
    //변수명 = UUID.randomUUID();
    String state;
    int speed;
    int oil;
    public public_transport(){
        //public_transport 객체 생성자 호출
    }
    //기능 메서드
    public void speedUp(int speedUp){
        speed = speed + speedUp;
    }
    public void speedDown(int speedDown){
        speed = speed - speedDown;
    }
    public void stop(){
        speed = 0;
    }
    public int getCarInfo(){
        return speed;
    }
    public void oilchange(int oilchange){
        oil = oil + oilchange;
    }
    public int oilInfo(){
        return oil;
    }
    public String stateInfo(){
        return state;
    }
    public void statechange(String statechange) {
        state = statechange;
    }
}