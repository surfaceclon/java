// Class, methods

class Car{
    String name;
    String color;
    int year;
    int weight;
    int maxspeed;

    void info(){
        System.out.println(name + " Color: " + color + " Year: " + year + " Weight: " + weight + " MaxSpeed: " + maxspeed);
    }
    void yearsOld(int currentyear){
        int old = currentyear - year;
        System.out.println("Car " + old + " old");
    }
}

public class CarInfo {
    public static void main(String[] args){
        Car volvo = new Car();
        volvo.name = "Volvo";
        volvo.color = "Black";
        volvo.year = 1999;
        volvo.maxspeed = 190;
        volvo.weight = 1200;
        volvo.info();
        volvo.yearsOld(2020);
    }
}
