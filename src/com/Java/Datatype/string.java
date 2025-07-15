package com.Java.Datatype;

public class string {
    public static void main(String[] args) {
        String message = " Hello World";
        String newMessage = message.replace("Hello","java");
        System.out.println(message);
        System.out.println(".length show the string  value : " + message.length());
        System.out.println(".ToUpperCase show the string in UpperCase : " + message.toUpperCase());
        System.out.println(".ToLowerCase show the string in LowerCase : " + message.toLowerCase());
        System.out.println(".replace it change the value, but not the main value " + newMessage);

    }
}
