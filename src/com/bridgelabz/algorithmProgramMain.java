package com.bridgelabz;

import java.util.Scanner;

public class algorithmProgramMain {

    public static void main(String[] args){
        String[] array = { "Welcome", "To", "Binary", "Search", "Program" };
        for(String i:array){
            System.out.print(i+" ");
        }
        binarySearch<String>binarySearchOfWord = new binarySearch<String>();
        String index = "Program";
        int result = binarySearchOfWord.binarySearchNumber(array,index);
        if(result == -1){
            System.out.println("word is not present in the compute");
        }
        else{
            System.out.println("\n Word Is Present At "+"index " +result);
        }
    }
}
