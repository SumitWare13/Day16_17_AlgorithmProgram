package com.bridgelabz;

import java.util.Scanner;

public class algorithmProgramMain {

    public static void main(String[] args){
        System.out.println("\n Welcome To Insertion Sort Program");
        String[] string = {"Welcome","To","Insertion","Sort","Program"};
        insertionSort Sort = new insertionSort();
        System.out.println("\n Order of word before insertion sort");
        for(String i :string){
            System.out.print(i+" ");
        }
        Sort.insertionOfNumber(string);
    }
}
