package chapters.chapter2.chapter2Exercises;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder:");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();
        double pi = (22/7);
        double area = radius * radius * pi;
        double volume = area * length;
        System.out.println(area);
        System.out.println(volume);
    }
}
