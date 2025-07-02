import java.util.Scanner;

public class Ps4 {
    public static void main(String[] args) {
        //Q1();
        //Q2();
        //Q3();
        //Q4();
        Q5();
    }

    private static void Q1() {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];
        boolean AllPassed = true;
        for ( int i = 0; i < marks.length; i++) {
            System.out.print(" Enter Your Marks of Subject " +(i+1)+ " : ");
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i< marks.length;i++) {
            if (marks[i] >=33){
                System.out.println("Your are pass in :" +(i+1));
            } else{
                System.out.println("Your are fail in :" +(i+1));
                AllPassed = false;
            }
        }
        if (AllPassed){ System.out.println("Your are Passed in all Subject :"); }
        else System.out.println("Your are Fail in one or two Subject");
    }
    protected static void Q2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income for calculate income tax in Lakhs :");
        double incomeInLakh = sc.nextDouble();
        double income = incomeInLakh * 100000;
        double tax ;
        if (income<=250000){
            tax = 0;
            System.out.println("NO income tax for You");
        } else if (income<=500000){
            tax =(income-250000)*0.05;
            System.out.println("5% Tax");
        } else if (income<=1000000) {
            tax = (250000*0.05) + ((income-500000)*0.2);
            System.out.println("20% Tax");
        } else {
            tax = (250000 * 0.05) + (500000 * 0.2) + ((income - 1000000) * 0.3);
            System.out.println("30% Tax");
        }
        if (income>250000){ System.out.println("Income Tax to be paid: ₹"+ tax  +" (approx)"); }
    }
    public static void Q3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between (1 to 7): ");
        int a = sc.nextInt();
        switch (a){
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thursday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            case 7: System.out.println("Sunday");break;
            default: System.out.println(a+"not a day in a week");
        }
    }

    public static void Q4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to find out it is a Leap year : ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100!= 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static void Q5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the website URL: ");
        String url = sc.nextLine().toLowerCase();
        if (url.endsWith(".com")) {
            System.out.println("This is a Commercial Website.");
        } else if (url.endsWith(".org")) {
            System.out.println("This is an Organization Website.");
        } else if (url.endsWith(".in")) {
            System.out.println("This is an Indian Website.");
        } else {
            System.out.println("Unknown or Other type of Website.");
        }
        sc.close();
    }

}

