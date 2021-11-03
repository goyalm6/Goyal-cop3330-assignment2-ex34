/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 34
 *  Copyright 2021 Mayank Goyal
 */

package ex34;

import java.util.Scanner;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] EmployeeArr = getEmployees();
        printEmployeeList(EmployeeArr);

        System.out.println("Enter an employee name to remove: ");
        String nameToRemove = scanner.nextLine();

        String[] newEmployeeList = removeEmployee(EmployeeArr, nameToRemove);
        printEmployeeList(newEmployeeList);
    }

    static void printEmployeeList(String[] namesArr) {
        System.out.print("There are " + namesArr.length + " employees:" + "\n");
        for(int i=0; i< namesArr.length; i++){
            System.out.print(namesArr[i] + "\n");
        }
    }

    static String[] removeEmployee(String[] namesArr, String nameToRemove) {
        String[] copy = new String[4];
        for (int i = 0, j = 0; i < 5; i++)
        {
            if(!namesArr[i].equals(nameToRemove))
            {
                copy[j++] = namesArr[i];
            }
        }
        return copy;
    }

    static String[] getEmployees() {
        String[] namesArr = new String[5];
        namesArr[0] = "John Smith";
        namesArr[1] = "Jackie Jackson";
        namesArr[2] = "Chris Jones";
        namesArr[3] = "Amanda Cullen";
        namesArr[4] = "Jeremy Goodwin";
        return namesArr;
    }
}
