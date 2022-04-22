//Encapsulation, set, get, this, constructor, static, final
class Cars{
    private String name;
    private String model;
    private String color;
    private int years;
    public final int MILEAGE = 5;
    public static String description;

    public Cars(){
        System.out.println("Not data");
    }
    public Cars(String name){
        this.name = name;
        System.out.println("One step");
    }
    public Cars(String name, String model){
        this.name = name;
        this.model = model;
        System.out.println("Two step");
    }
    public Cars(String name, String model, String color){
        this.name = name;
        this.model = model;
        this.color = color;
        System.out.println("Three step");
    }
    public Cars(String name, String model, String color, int years){
        this.name = name;
        this.model = model;
        this.color = color;
        this.years = years;
        System.out.println("Fourch step");
    }
    public static void showDescript(){
        System.out.println(description);
    }
}

public class ConstructorCar {
    public static void main(String[] args){
        Cars vol = new Cars("Car", "Model", "Color", 123);
        System.out.println(vol.MILEAGE);
        Cars.description = "--------";
        Cars.showDescript();
    }
}
