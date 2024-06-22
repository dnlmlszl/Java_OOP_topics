package TacePao.CircleCalculator;

import java.util.Scanner;


public class AreaCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Add essential values to calculate shape data:");
        
        System.out.println("Add circle radius:");
        int radius = Integer.parseInt(scanner.nextLine());
        Circle circle1 = new Circle("Circle1", radius);
        
        System.out.println("Add another circle radius:");
        int radius2 = Integer.parseInt(scanner.nextLine());
        Circle circle2 = new Circle("Circle2", radius2);
        
        System.out.println("Add first ellipsis radius:");
        int radius3 = Integer.parseInt(scanner.nextLine());
        System.out.println("Add second ellipsis radius:");
        int radius4 = Integer.parseInt(scanner.nextLine());
        Ellipsis ellipsis1 = new Ellipsis("Ellipse1", radius3, radius4);
        
        System.out.println("Add another ellipsis first radius:");
        int radius5 = Integer.parseInt(scanner.nextLine());
        System.out.println("Add another ellipsis second radius:");
        int radius6 = Integer.parseInt(scanner.nextLine());
        Ellipsis ellipsis2 = new Ellipsis("Ellipse2", radius5, radius6);
        
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(ellipsis1);
        System.out.println(ellipsis2);
    }
}
