package com.company;
import java.util.*;
import com.company.Uchet;
public class Farba{
    Scanner in = new Scanner(System.in);
    public static String[] arguments = new String[] {" "};
    public static void farb_menu() {
        Scanner in = new Scanner(System.in);
        int vibor_menu_f;
        do {
            System.out.print("\nМЕНЮ КРАСКИ\n1.Продать краску\n0.Exit\nВыберите действие:");
            vibor_menu_f = in.nextInt();
            if ( vibor_menu_f == 0)
                Main.main(arguments);
            else if (vibor_menu_f == 1)
                farb_sell();
        }while (true);
    }
    public static void farb_sell () {
        Scanner in = new Scanner(System.in);
        int vibor_farb;
        do {
            System.out.print("\nВыберите вид краски:" +
                    "\n1.Эмульсионные краски;"+
                    "\n2.Алкидные краски;"+
                    "\n3.Клеевые краски; "+
                    "\n4.Силикатные краски;"+
                    "\nВаш выбор: ");
            vibor_farb = in.nextInt();
            if (vibor_farb == 1)
                farb_sell_emul();
            else if (vibor_farb == 2)
                farb_sell_alk();
            else if (vibor_farb == 3)
                farb_sell_kleev();
            else if (vibor_farb == 4)
                farb_sell_silik();
            else System.out.println("Некорректные данные!");
        }while (true);
    }
    public static void farb_sell_alk () {
        Uchet uchet = new Uchet(0, "0", "0", "0",0);
        Scanner in = new Scanner(System.in);
        float l, cost = 37.9f;
        String name, color;
        System.out.print("\nВведите количество литров краски, что собираетесь купить: ");
        l = in.nextFloat();
        System.out.print("\nВведите имя покупателя: ");
        name = in.next();
        System.out.print("\nВведите цвет: ");
        color = in.next();
        if (l <= 0) {
            System.out.print("Error");
            farb_menu();
        }
        System.out.print("\nОперация проведена успешно!\n"
                + name + " - алкидная " + color + " - " + l + "л - ціна за літр " + cost);
        uchet.push(Uchet.num_oper++, "Фарба", name, "Алкидные краски", l);
        farb_menu();
    }
    public static void farb_sell_emul () {
        Uchet uchet = new Uchet(0, "0", "0", "0",0);
        Scanner in = new Scanner(System.in);
        float l, cost = 34.3f;
        String name, color;
        System.out.print("\nВведите количество литров краски, что собираетесь купить: ");
        l = in.nextFloat();
        System.out.print("\nВведите имя покупателя: ");
        name = in.next();
        System.out.print("\nВведите цвет: ");
        color = in.next();
        if (l <= 0) {
            System.out.print("Error");
            farb_menu();
        }
        System.out.print("\nОперация проведена успешно!\n"
                + name + " - емульсивная " + color + " - " + l + "л - ціна за літр " + cost);
        uchet.push(Uchet.num_oper++, "Фарба", name, "Эмульсионные краски", l);
        farb_menu();
    }
    public static void farb_sell_kleev () {
        Uchet uchet = new Uchet(0, "0", "0", "0",0);
        Scanner in = new Scanner(System.in);
        float l, cost = 25.7f;
        String name, color;
        System.out.print("\nВведите количество литров краски, что собираетесь купить: ");
        l = in.nextFloat();
        System.out.print("\nВведите имя покупателя: ");
        name = in.next();
        System.out.print("\nВведите цвет: ");
        color = in.next();
        if (l <= 0) {
            System.out.print("Error");
            farb_menu();
        }
        System.out.print("\nОперация проведена успешно!\n"
                + name + " - клеевые " + color + " - " + l + "л - ціна за літр " + cost);
        uchet.push(Uchet.num_oper++, "Фарба", name, "Клеевые краски", l);
        farb_menu();
    }
    public static void farb_sell_silik () {
        Uchet uchet = new Uchet(0, "0", "0", "0",0);
        Scanner in = new Scanner(System.in);
        float l, cost = 45.8f;
        String name, color;
        System.out.print("\nВведите количество литров краски, что собираетесь купить: ");
        l = in.nextFloat();
        System.out.print("\nВведите имя покупателя: ");
        name = in.next();
        System.out.print("\nВведите цвет: ");
        color = in.next();
        if (l <= 0) {
            System.out.print("Error");
            farb_menu();
        }
        System.out.print("\nОперация проведена успешно!\n"
                + name + " - силикатная " + color + " - " + l + "л - ціна за літр " + cost);
        uchet.push(Uchet.num_oper++, "Фарба", name, "Силикатные краски", l);
        farb_menu();
    }

}
/*
Окрім того фарбу продають, наливаючи у довільну тару.
Для операції продажу фіксують вид фарби, кількість, та ім’я покупця.
Фарби бувають різного кольору    і різної вартості.
*/