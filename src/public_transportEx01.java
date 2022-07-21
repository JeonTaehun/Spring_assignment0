import java.util.Scanner;

public class public_transportEx01 {

    public static void main(String[] args) {
        Bus bus;
        Taxi taxi;

        bus = new Bus(0,1000,100, "inoperation");
        taxi = new Taxi(0,100, "Normal", 3000, "");

        while (true){
            System.out.println();
            System.out.println("-------Bus---------");
            System.out.println("1.bus passenger add");
            System.out.println("2.oilchange");
            System.out.println("3.state change");
            System.out.println("-------Taxi---------");
            System.out.println("4.Taxi info");
            System.out.println("5.Taxi passenger add");
            System.out.println("6.aaaaaaaaaaa");
            System.out.println("7.bbbbbbbbbbb");
            System.out.println("8.program end");

            System.out.print("Enter number>>>");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice){
                case 1 :
                    System.out.print("passenger add >>>");

                    int add = sc.nextInt();
                    if (add < 31) {
                        bus.ridePassenger(add);
                        System.out.println("boarding passengers = "+bus.getPassenger());
                        System.out.println("remaining passengers = "+ (30-add));
                        System.out.println("total fee = "+bus.getFee());
                    }else {
                        System.out.println("overcrowding");
                    }
                    break;
                case 2 :
                    System.out.print("oil add >>>");
                    int add1 = sc.nextInt();
                    bus.oilchange(add1);
                    System.out.println("a. oil amount = "+ bus.oilInfo());
                    System.out.println(bus.stateInfo());
                    if (bus.oilInfo() <= 10) {
                        System.out.println("oil warning");
                    }
                    break;
                case 3 :
                    System.out.println(bus.stateInfo());
                    System.out.println("gogarage or inoperation");
                    String race_situation = sc.next();
                    bus.statechange(race_situation);
                    System.out.println(bus.stateInfo());
                    break;
                case 4 :
                    System.out.println("Taxi(0000) info ");
                    System.out.println("oil gauge = "+taxi.oil);
                    System.out.println("taxistateInfo = "+taxi.stateInfo());
                    break;
                case 5 :
                    System.out.print("passenger add >>>");
                    int add2 = sc.nextInt();
                    System.out.print("destination >>>");
                    String add3 = sc.next();
                    taxi.destinationchange(add3);
                    System.out.print("distance to destination >>>");
                    String add4 = sc.next();
                    bus.statechange(add4);
                    if (add2 < 5) {
                        taxi.setPassenger_taxi(add2);
                        System.out.println("now passenger = "+taxi.getPassenger_taxi());
                        System.out.println("remaining seat = "+(4 - add2));
                        System.out.println("base rate = "+taxi.getFee());
                        System.out.println("destination = "+taxi.destinationInfo());
                        System.out.println("base rate = "+taxi.stateInfo());
                    }else {
                        System.out.println("overcrowding");
                    }
                    break;
                case 6 :
                    System.out.println("22222222222");
                    break;
                case 7 :
                    System.out.println("33333333");
                    break;
                case 8 :
                    System.out.println("program end");
                    return;
                default:
                    System.out.println("wrong value");
                    break;
            }
        }
    }
}