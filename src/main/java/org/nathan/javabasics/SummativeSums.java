package org.nathan.javabasics;

import java.util.Scanner;

public class SummativeSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valuesInput;
        int sum = 0;
        int valueCount = 0;

        System.out.println("Please enter a list of (integer) values, separated by commas, to sum:");
        valuesInput = scanner.nextLine();
        valuesInput += ',';
        char[] valuesCharArray = valuesInput.toCharArray();
        for(char c : valuesCharArray){
            if(c == ','){
                valueCount++;
            }
        }
        int[] valueArray = new int[valueCount];
        String valueString = "";
        int arrayPos = 0;
        for(int i = 0; i < valuesCharArray.length; i++){
            if(valuesCharArray[i] == ',' || (i == valuesCharArray.length - 1 && arrayPos == valueCount - 1)){
                if(!valueString.strip().isEmpty()){
                    valueArray[arrayPos] = Integer.parseInt(valueString.strip());
                }
                valueString = "";
                arrayPos++;
            }else{
                valueString += valuesCharArray[i];
            }
        }
        for (int n : valueArray){
            sum += n;
        }
        System.out.println("Total sum of these " + valueCount + " values is: " + sum);
    }
}
