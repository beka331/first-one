package org.example;


public class Main {

    public static void main(String[] args) {

        //პირველი შეფასებითი საშინაო დავალება

        /*N1 პირველი ამოცანა 2 ქულა - წარმოიდგინეთ, რომ ონლაინ მაღაზიაში ყიდულობთ
        პროდუქტს და დაწერეთ შემდეგი კოდი:
        ● თუ პროდუქტის ფასი 100 ლარის ტოლი ან მეტია, მომხმარებელს გაუკეთებს 10% -იან ფასდაკლებას
        ● სხვა შემთხვევაში პროდუქტის ფასი უცვლელი დარჩება
        ● დაბეჭდავს საბოლოო ფასს.*/

        double price = 180;

        if (price >= 100) {
            System.out.println("თქვენ სარგებლობთ 10%-იანი ფასდაკლებით, გადასახდელია " + price * 0.9 + "₾");
        } else if (price < 100 && price > 0) {
            System.out.println("თქვენ არ სარგებლობთ ფასდაკლებით, გადასახდელია " + price + "₾");
        } else {
            System.out.println("არასწორი მნიშვნელობა");
        };


        /*N2 მეორე ამოცანა 2 ქულა - დაწერეთ კოდი, რომელიც შეამოწმებს მომხმარებლის
        ავტორიზაციის მონაცემებს. წინასწარ განსაზღვრეთ სწორი მომხმარებლის სახელი
        (username) და პაროლი (password). თუ მომხმარებელი ორივე მონაცემს სწორად
        შეიყვანს, დაბეჭდეთ Login successful, თუ რომელიმე მაინც შეეშლება, დაბეჭდეთ Invalid
        username or password.*/

        String correctUsername = "beka331";
        String correctPassword = "randomPass1@";

        String username = "beka331";
        String password = "randomPass1@";

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username or password");
        }


        /* N3 მესამე ამოცანა 2 ქულა - ტესტერმა შეამოწმა კონკრეტული ფუნქციონალი ხუთი
        ტესტ ქეისით. მასივში მოცემულია თითოეული ტესტის შედეგი:
        int[] testResults = {1, 0, 1, 1, 0};
        სადაც 1 არის Passed, ხოლო 0 არის Failed. დაწერეთ კოდი, რომელიც for ციკლის
        გამოყენებით დაითვლის წარმატებით და წარუმატებლად დასრულებული ტესტების
        რაოდენობას და დაბეჭდავს ორივე შედეგს.  */


        int[] testResults = {1, 0, 1, 1, 0};

        int passed = 0;
        int failed = 0;

        for (int i = 0; i < testResults.length; i++) {
            if (testResults[i] == 1) {
                passed++;
            } else if (testResults[i] == 0) {
                failed++;
            }
        }
        System.out.println("წარმატებულია " + passed + " ტესტ-ქეისი");
        System.out.println("წარუმატებელია " + failed + " ტესტ-ქეისი");


        /*N4 მეოთხე ამოცანა 2 ქულა - მომხმარებელმა გამოიწერა პროდუქცია და სტატუსების
        მიხედვით უნდა მიიღოს შეტყობინება. დაწერეთ კოდი, რომელიც switch -ის გამოყენებით
        დაამუშავებს შემდეგ მნიშვნელობებს:
        ● როდესაც შეკვეთა არის ახალი და მისი სტატუსი არის NEW → მომხმარებელმა
        უნდა მიიღოს შეტყობინება Order received
        ● როდესაც შეკვეთას ვამზადებთ და მისი სტატუსი არის PROCESSING →
        მომხმარებელმა უნდა მიიღოს შეტყობინება Order is being prepared
        ● როდესაც გავუგზავნეთ შეკვეთა და სტატუსი არის SHIPPED → მომხმარებელმა
        უნდა მიიღოს შეტყობინება Order is on the way
        ● როდესაც ჩაიბარა პროდუქტი და სტატუსი არის DELIVERED → მომხმარებელმა
        უნდა მიიღოს შეტყობინება Order delivered
        ● თუ ზემოთ ჩამოთვლილი არცერთი სტატუსი არ არის მინიჭებული, მაშინ
        დაიბეჭდოს Unknown status.*/

        String status = "DELIVERED";
        switch (status) {
            case "NEW":
                System.out.println("Order received");
                break;
            case "PROCESSING":
                System.out.println("Order is being prepared");
                break;
            case "SHIPPED":
                System.out.println("Order is on the way");
                break;
            case "DELIVERED":
                System.out.println("Order delivered");
                break;
            default: {
                System.out.println("Unknown status");
            }
        }


        /*N5 მეხუთე ამოცანა 2 ქულა - შექმენით String ტიპის ცვლადი და დაწერეთ კოდი,
        რომელიც:
        ● for ციკლის გამოყენებით დაითვლის სტრინგში ხმოვანი ასოების რაოდენობას და
        დაბეჭდავს
        ● იპოვის სტრინგის სიგრძეს და დაბეჭდავს მას
        ● შეამოწმებს სტრინგის სიგრძე ლუწია თუ კენტი. თუ სიგრძე ლუწი რიცხვია,
        დაბეჭდოს "ლუწი", ხოლო თუ კენტია დაბეჭდავს "კენტი".
         */

        String text = "გადაფიჩინებული";
        int vowelCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            if (letter == 'ა' || letter == 'ე' || letter == 'ი'
                    || letter == 'ო' || letter == 'უ') {
                vowelCount++;
            }
        }

        System.out.println("ხმოვნების რაოდენობა: " + vowelCount);
        System.out.println("სტრინგის სიგრძე: " + text.length());

        if (text.length() % 2 == 0) {
            System.out.println("ლუწი");
        } else {
            System.out.println("კენტი");
        }


        //პირველი საშინაო დავალება, პრიმიტიული ტიპები

       /* byte a = 1;
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

        } */
    }
}