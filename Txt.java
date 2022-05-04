package com.company;
import java.util.*;

public class Txt {
     public static int menu (){
         int pole;
         Scanner in = new Scanner(System.in);
         do {
            System.out.print("\n\nМЕНЮ\n1.Детали;\n2.Краска;\n3.Учет;\n0.Exit;\nВаш вибір: ");
             pole = in.nextInt();
             if (pole >=0 && pole <= 3)
                 return pole;
             System.out.println("Уведіть корректні дані!");
         } while (true);
    }
}