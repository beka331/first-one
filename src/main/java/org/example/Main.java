package org.example;


public class Main {

    public static void main(String[] args) {

        //პირველი საშინაო დავალება, პრიმიტიული ტიპები

        byte a = 1;
        short b = 12;
        int c = 10000;
        long d = 10_000_000_000L;
        float e = 12.5432f;
        double f = 11.12345678;
        boolean g = a == b;
        char h = 'é';
        char j = 'b';

        System.out.println(g);
        System.out.println(h+j);

        //ინკრემენტი, დეკრემენტი (პრეფიქსი, პოსტფიქსი)

        int x = 5;
        int y = x++;
        int z = ++x;

        System.out.println(y);
        System.out.println(z);

        //მეორე საშინაო დავალება, სტრინგის მეთოდები

        String fullName = "Beka Skhulukhia";

        System.out.println(fullName.length());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.indexOf("i"));

        //სტრინგების დადარება, კონკატენაცია

        String name = "Beka";
        String name2 = "Beka";
        System.out.println(name.equals(name2));//მიყვითლებს, რადგან ცხადია რომ ერთნაირია
        System.out.println(name == name2);
        System.out.println(name.concat(name2));

        //მათემატიკური კლასები

        double max = Math.max(1.992,1.991);
        System.out.println(max);

        int min = Math.min(1,2);
        System.out.println(min);

        double sqrt = Math.sqrt(331);
        System.out.println(sqrt);

        double random = Math.random();
        System.out.println(random);

        int random1 = (int)(Math.random()*10);
        System.out.println(random1);

        System.out.println(Math.abs(-331));

        // if else

       int minGrade = 51;
        int realGrade = 90;

        if (minGrade < realGrade){
            System.out.println("თქვენ წარმატებით ჩააბარეთ საგანი \"ალგორითმები და ალგორითმიზაციის საფუძვლები\"");
        }

        else {
            System.out.println("თქვენ ვერ გადალახეთ მინიმალური ზღვარი");
        }


        //  else if

        double currentGPA = 5;

        if (currentGPA>=3.5 && currentGPA<=4.0){
            System.out.println("თქვენი შეფასება არის A ");
        }

        else if (currentGPA>=3.0 && currentGPA<3.5) {
            System.out.println("თქვენი შეფასება არის B ");
        }

        else if (currentGPA>=2.0 && currentGPA<3) {
            System.out.println("თქვენი შეფასება არის C ");
        }

        else if (currentGPA>=1.0 && currentGPA<2) {
            System.out.println("თქვენი შეფასება არის D ");
        }

        else if (currentGPA>=0.5 && currentGPA<1) {
            System.out.println("თქვენი შეფასება არის D ");
        }

        else if (currentGPA>4){
            System.out.println("თქვენი GPA ვერ იქნება 4.0-ზე მეტი");
        }

        else {
            System.out.println("თქვენი შეფასება არის E, ვერ ჩააბარეთ");
        }


        //Ternary Operator

       int minAge = 18;
       int realAge = 19;

        String str = (realAge < minAge) ? "თქვნ არ გაქვთ არჩევნებში მონაწილეობის უფლება" :
                "თქვენ შეგიძლიათ ხმის მიცემა";
        System.out.println(str);



        //switch statement

        int goldFineness = 958;

        switch (goldFineness){
            case 990 :
                System.out.println("თქვენი ოქრო 24 კარატიანია");
                break;
            case 958 :
                System.out.println("თქვენი ოქრო 23 კარატიანია");
                break;
            case 916 :
                System.out.println("თქვენი ოქრო 22 კარატიანია");
                break;
            case 875 :
                System.out.println("თქვენი ოქრო 21 კარატიანია");
                break;
            case 833 :
                System.out.println("თქვენი ოქრო 20 კარატიანია");
                break;
            case 800 :
                System.out.println("თქვენი ოქრო 19,2 კარატიანია");
                break;
            case 792 :
                System.out.println("თქვენი ოქრო 19 კარატიანია");
                break;
            case 750 :
                System.out.println("თქვენი ოქრო 18 კარატიანია");
                break;
            case 625 :
                System.out.println("თქვენი ოქრო 15 კარატიანია");
                break;
            case 585 :
                System.out.println("თქვენი ოქრო 14 კარატიანია");
                break;
            case 500 :
                System.out.println("თქვენი ოქრო 12 კარატიანია");
                break;
            case 417 :
                System.out.println("თქვენი ოქრო 10 კარატიანია");
                break;
            case 375 :
                System.out.println("თქვენი ოქრო 9 კარატიანია");
                break;
            case 333 :
                System.out.println("თქვენი ოქრო 8 კარატიანია");
                break;
            default:
                System.out.println("ბაზაში ასეთი სინჯი არ მოიძებნა");

        }

    }
}



