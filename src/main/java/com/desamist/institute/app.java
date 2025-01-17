package com.desamist.institute;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("  Welcome to Desamist Institute!");
        System.out.println("======================================");
        System.out.println("Empowering minds through quality education and innovation.");
        System.out.println();

        String[] programs = {
            "1. Computer Science and IT",
            "2. Business Administration",
            "3. Engineering and Technology",
            "4. Arts and Humanities",
            "5. Health and Medical Sciences"
        };

        System.out.println("Our Top Programs:");
        for (String program : programs) {
            System.out.println(program);
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the program you'd like to know more about: ");
        int choice = scanner.nextInt();

        System.out.println();
        switch (choice) {
            case 1:
                System.out.println("Computer Science and IT:");
                System.out.println("- Specializations in AI, Cybersecurity, and Web Development.");
                System.out.println("- Hands-on projects and industry partnerships.");
                break;
            case 2:
                System.out.println("Business Administration:");
                System.out.println("- Focus on leadership, entrepreneurship, and global markets.");
                System.out.println("- Internship opportunities with top companies.");
                break;
            case 3:
                System.out.println("Engineering and Technology:");
                System.out.println("- Cutting-edge labs and experienced faculty.");
                System.out.println("- Programs in Mechanical, Civil, and Electrical Engineering.");
                break;
            case 4:
                System.out.println("Arts and Humanities:");
                System.out.println("- Courses in Literature, History, and Fine Arts.");
                System.out.println("- Dedicated cultural exchange programs.");
                break;
            case 5:
                System.out.println("Health and Medical Sciences:");
                System.out.println("- Training in Nursing, Pharmacy, and Public Health.");
                System.out.println("- Modern facilities and community health initiatives.");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid program number.");
        }

        System.out.println();
        System.out.println("Visit our website or contact us for more details:");
        System.out.println("Website: www.desamistinstitute.edu");
        System.out.println("Email: info@desamistinstitute.edu");
        System.out.println("Phone: +4389284597");
        System.out.println("======================================");
    }
}

