package access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(double radius){
        this.radius= radius;
    }
    public double getRadius(){
        return radius;
    }
    public void getArea(double radius){
        System.out.println("dien tich la: "+ (int)(Math.pow(radius,2))*Math.PI);
    }
}
