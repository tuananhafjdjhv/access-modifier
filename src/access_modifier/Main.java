package access_modifier;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ban kinh vao day: ");
        double radius = sc.nextDouble();
        Circle cc = new Circle(radius);
        System.out.println(cc.getRadius());
        cc.getArea(radius);
    }
}
