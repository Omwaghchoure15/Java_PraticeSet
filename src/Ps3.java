import java.util.Scanner;

public class Ps3 {
    public static void main(String[] args) {
        //Q1();
        //Q2();
        //Q3();
        Q4();
    }
    public static void Q1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number in capital case:");
        String name = sc.next();
        System.out.println("Your name in lower case : "+name.toLowerCase());
    }
    public static void Q2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String name = sc.nextLine();
        System.out.print("Sentence with Underscore : "+name.replace(" ","_"));
    }
    public static void Q3(){
        Scanner sc = new Scanner(System.in);
        String letter = "Dear <|name|>,Trane a lot";
        System.out.print("Enter your name : ");
        System.out.println(letter.replace("<|name|>", sc.nextLine()));
    }
    public static void Q4(){
        String detect = "hello world java";
        if ("   ".contains(detect)){
            System.out.println("Triple  space identify");
        } else if (detect.contains("  ")) {
            System.out.println("Double Space Identify");
        } else System.out.println(" No Space Identify");
    }
    public static void Q5(){

    }
}
