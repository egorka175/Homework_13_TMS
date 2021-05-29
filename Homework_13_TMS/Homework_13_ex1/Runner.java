package com.tms.Homework_13_TMS.Homework_13_ex1;

import java.util.Scanner;

public class Runner {
    static Scanner input = new Scanner(System.in);
    static Scanner inputString = new Scanner(System.in);
    static Scanner inputInt = new Scanner(System.in);
    public static void main(String[] args) {
        //Вывод панели задач.
        while (true) {
            System.out.println("--------------------------------------------");
            System.out.println("Выберите:");
            System.out.println("1 - Реверс слова");
            System.out.println("2 - Факториал числа");
            System.out.println("0 - Выход");
            System.out.println("--------------------------------------------");
            int in = input.nextInt();
            System.out.println("--------------------------------------------");
            //Часть кода , которая реверсирует слово.
              if (in == 1) {
                  System.out.println("Введите слово:");
                  String inString = inputString.nextLine();
                  System.out.println("Оригинал: " + inString);
                  FunctionalInterface<String> str=(s) ->{
                      StringBuilder sb= new StringBuilder();
                      String line;
                      for(int i=s.length()-1;i>=0; i--) {
                        line = String.valueOf(s.charAt(i));
                        sb.append(line);
                       }
                    return sb.toString();
                   };
                   System.out.println("--------------------------------------------");
                   System.out.println("Результат: "+str.execute(inString));
                }
                //Часть кода , которая находит факториал введенного с кансоли числа.
                else if (in == 2) {
                System.out.println("Введите число:");
                int inNumber = inputInt.nextInt();
                FunctionalInterface<Integer> str=(s) ->{
                    int result = 1;
                    for (int i = 1; i <= s; i++)
                        result = i * result;
                    return result;
                };
                  System.out.println("--------------------------------------------");
                  System.out.println("Результат: "+str.execute(inNumber));
                } else if (in == 0) {
                    break;
            }
        }
    }
}