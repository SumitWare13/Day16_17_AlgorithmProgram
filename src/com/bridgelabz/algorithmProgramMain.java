package com.bridgelabz;

import java.util.Scanner;

public class algorithmProgramMain {

    public static void main(String[] args){
        String arr[] = { "sdg", "rty", "hjk", "qwe", "vbn" };
        BubbleSort<String> sort = new BubbleSort<String>();
        sort.bubbleSort(arr);
        System.out.print("Sorted array : ");
        sort.printArray(arr);
    }
}
