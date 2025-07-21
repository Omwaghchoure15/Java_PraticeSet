package com.Java.Datatype;

public class Array {
    public static void main(String[] args) {
        int [] array =new int[] {4,5,7,65,45}; // { 0,1,2,3,4 }
        System.out.println(" Array Length : " +array.length);

        for (int i = 0; i != array.length;i++){
            System.out.println(array[i]);
        }
    }
}
