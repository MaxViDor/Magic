package org.horgwats;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String dumbledore = "Dumbledore";
        String mcgonagall = "Mcgonagall";
        String snape = "Snape";
        String lupin = "Lupin";
        String hugrid = "Hugrid";
        String teachers = "Scool teachers : ";

        int gradle1 = new Random().nextInt(1, 10);
        int gradle2 = new Random().nextInt(1, 10);
        boolean result = gradle1 > 5 && gradle2 > 5;

        int reminder13 = 4199 % 13;
        int reminder14 = 4199 % 14;
        int reminder15 = 4199 % 15;
        int reminder16 = 4199 % 16;
        int reminder17 = 4199 % 17;
        int reminder19 = 4199 % 19;
        int summReminder = reminder13
                + reminder14
                + reminder15
                + reminder16
                + reminder17
                + reminder19;

        int randomNum1 = new Random().nextInt();
        int randomNum2 = new Random().nextInt();
        int randomNum3 = new Random().nextInt();
        int randomNum4 = new Random().nextInt();
        int randomNum5 = new Random().nextInt();

        String num1ToString = String.valueOf(randomNum1);
        String num2ToString = String.valueOf(randomNum2);
        String num3ToString = String.valueOf(randomNum3);
        String num4ToString = String.valueOf(randomNum4);
        String num5ToString = String.valueOf(randomNum5);
        String allNumToString = num1ToString
                + num2ToString
                + num3ToString
                + num4ToString
                + num5ToString;

        String replace1 = allNumToString.replaceAll("1", "i");
        String replace2 = replace1.replaceAll("-", "");
        String replace3 = replace2.replaceAll("0", "O");
        String replace4 = replace3.replaceAll("6", "b");

        String sub = replace4.substring(23);

        int indof = replace4.indexOf("ob");


        System.out.println(teachers);
        System.out.println(dumbledore);
        System.out.println(mcgonagall);
        System.out.println(snape);
        System.out.println(lupin);
        System.out.println(hugrid);

        System.out.println(gradle1);
        System.out.println(gradle2);

        System.out.println(result);
        System.out.println(summReminder);
        System.out.println(allNumToString);
        System.out.println(replace4);
        System.out.println(sub);
        System.out.println(indof);
        System.out.println(replace4.indexOf("ob"));
        castSpell();

        int grade1 = new Random().nextInt();
        int grade2 = new Random().nextInt();
        System.out.println(grade1);
        System.out.println(grade2);

        if (grade1 % 2 == 0 && grade2 % 2 == 0) {
            int grade1Result = grade1 / 2;
            int grade2Result = grade2 / 2;
            int sumGradeResult = grade1Result + grade2Result;
            System.out.println(sumGradeResult);
        } else if (grade1 % 2 == 0) {
            int grade1Result = grade1 / 2;
            System.out.println(grade1Result + grade2);
        } else if (grade2 % 2 == 0) {
            int grade2Result = grade2 / 2;
            System.out.println(grade2Result + grade1);
        } else {
            System.out.println(grade1 + grade2);
        }
        SortingHat sortingHat = new SortingHat();
        sortingHat.sort();

    }


    public static void castSpell() {
        String uppSpell = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";
        int start = new Random().nextInt(0, 50);
        String lowSpell = uppSpell.toLowerCase();
        System.out.println(lowSpell);
        String subLowSpell = lowSpell.substring(start);

        System.out.println(subLowSpell);

        StringBuilder spell = new StringBuilder(subLowSpell);
        StringBuilder revSpell = spell.reverse();
        System.out.println(revSpell);

    }
}