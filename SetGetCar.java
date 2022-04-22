//Encapsulation, set, get, this
import java.util.Scanner;
class InfoCar{
    private String name;
    private String color;
    private int years;
    private int weight;
    private int speed;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setYears(int years){
        this.years = years;
    }
    public int getYears(){
        return years;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setWeight(int waight){
        this.weight = waight;
    }
    public int getWeight(){
        return weight;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }
}

public class SetGetCar {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        InfoCar vol = new InfoCar();

        System.out.print("Name: ");
        String name = ent.nextLine();
        vol.setName(name);
        System.out.println(vol.getName());

        System.out.println("Color: ");
        String color = ent.nextLine();
        vol.setColor(color);
        System.out.println(vol.getColor());

        System.out.println("Year: ");
        int year = ent.nextInt();
        vol.setYears(year);
        System.out.println(vol.getYears());

        System.out.println("Weight: ");
        int weight = ent.nextInt();
        vol.setWeight(weight);
        System.out.println(vol.getWeight());

        System.out.println("Speed: ");
        int speed = ent.nextInt();
        vol.setSpeed(speed);
        System.out.println(vol.getSpeed());

    }
}
