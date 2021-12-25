package lab_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Dmitry", "+79103553948");
        System.out.println("~Initial person:");
        p1.showInfo();
        System.out.print("\n\n");

        Person p2;
        String name, phoneNumber;
        Scanner in = new Scanner(System.in);
        System.out.print("~New person:\nEnter the name: ");
        name = in.nextLine();
        System.out.print("Enter the phone number (+7/8-XXX-XXXXXXX): ");
        phoneNumber = in.nextLine();
        p2 = Person.create(name, phoneNumber);
        while (!p2.checkPhone()) {
            System.out.print("The number is wrong. Enter again: ");
            phoneNumber = in.nextLine();
            p2.setPhoneNumber(phoneNumber);
        }
        in.close();
        System.out.println();

        System.out.println("~Custom person:");
        p2.showInfo();
        System.out.print("\n\n");

        if(p1.equalNames(p2)) System.out.println("~The names of the persons are equal");
        else System.out.println("~The names of the persons aren't equal");
    }
}
