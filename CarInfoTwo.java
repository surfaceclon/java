// Class, methods
import java.util.Scanner;

class CarTwo{

    void carname(String name){
        System.out.println("Name: " + name);
    }
    void carcolor(String color){
        System.out.println("Color: " + color);
    }
    void caryear(int year){
        System.out.println("Year: " + year);
    }
    void carweight(int weight){
        System.out.println("Weight: " + weight);
    }
    void carspeed(int speed){
        System.out.println("Speed: " + speed);
    }
}

public class CarInfoTwo {
    public static void main(String args[]){
        Scanner info = new Scanner(System.in);
        CarTwo car = new CarTwo();

        String name;
        String color;
        int year;
        int weight;
        int speed;

        System.out.println("Enter name: ");
        name = info.nextLine();
        System.out.println("Enter color: ");
        color = info.nextLine();
        System.out.println("Enter year: ");
        year = info.nextInt();
        System.out.println("Enter weight: ");
        weight = info.nextInt();
        System.out.println("Enter speed: ");
        speed = info.nextInt();

        car.carname(name);
        car.carcolor(color);
        car.caryear(year);
        car.carweight(weight);
        car.carspeed(speed);
    }
}
