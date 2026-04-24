// PersonInfoApp.java
// Grant Dresser
// 4/24/2026

import java.util.Scanner;

public class personInfoApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter gender: ");
        String gender = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter weight (lbs): ");
        double weight = input.nextDouble();

        System.out.print("Enter height (inches): ");
        double height = input.nextDouble();
        input.nextLine(); // clear buffer

        System.out.print("Enter ethnic group: ");
        String ethnicGroup = input.nextLine();

        System.out.print("Enter religion: ");
        String religion = input.nextLine();

        // create person object
        person person = new person(firstName, lastName, gender, age, weight, height, ethnicGroup, religion);

        // display data
        person.displaydata();

        input.close();
    }
}