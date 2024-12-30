package org.horgwats;

import java.util.Scanner;

public class SortingHat {
    public void sort() {
        String question1 = "Ты предпочитаешь работать в команде? (Да/Нет)";
        String question2 = "Ты любишь разгадывать головоломки? (Да/Нет)";
        String question3 = "Ты идешь на риск, чтобы достичь своей цели? (Да/Нет)";
        String question4 = "Ты проявляешь заботу к существам и природе? (Да/Нет)";
        Scanner scanner = new Scanner(System.in);

        System.out.println(question1);
        String answer1 = scanner.nextLine();
        System.out.println(question2);
        String answer2 = scanner.nextLine();
        System.out.println(question3);
        String answer3 = scanner.nextLine();
        System.out.println(question4);
        String answer4 = scanner.nextLine();

        if (answer1.equalsIgnoreCase("Да")) {
            if (answer3.equalsIgnoreCase("Да")) {
                System.out.println("Гриффиндор");

            } else if (answer4.equalsIgnoreCase("Да")) {
                System.out.println("Пуффендуй");
            }
        } else if (answer2.equalsIgnoreCase("Да")) {
            if (answer1.equalsIgnoreCase("Да")) {
                System.out.println("Когтевран");
            } else if (answer3.equalsIgnoreCase("Да")) {
                System.out.println("Когтевран");
            } else {
                System.out.println("Слизерин");
            }
        }
        else if (answer3.equalsIgnoreCase("Да")) {
            System.out.println("Слизерин");
        } else {
            System.out.println("Пуффендуй");
        }
    }
}
