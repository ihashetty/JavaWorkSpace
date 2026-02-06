public class table {

    String material;
    String color;
    String length;

    public table(String material, String color, String length) {
        this.material = material;
        this.color = color;
        this.length = length;
    }
    public static void main(String[] args) {
        
        table table1 = new table("Wood", "Brown", "5ft");
        System.out.println("Material: " + table1.material);
        System.out.println("Color: " + table1.color);
        System.out.println("Length: " + table1.length);
    }
}