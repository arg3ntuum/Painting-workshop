package com.company;
import java.util.*;

public class Virob {
    public static String[] arguments = new String[] {" "};
    private static float norma_alk = 1.3f;
    private static float norma_em = 1.2f;
    private static float norma_kleev = 1.5f;
    private static float norma_silk = 1.0f;
    private static int nomer = 1;
    private static int maxSize = 6;
    private static int kilkist = (int)(java.lang.Math.random()*(maxSize - 1));
    private static int kilkist_izn = kilkist;
    public static void virob_menu (){
        Scanner in = new Scanner(System.in);
        int vibor;
        if (kilkist_izn == kilkist)
            System.out.print("У вас " + kilkist + " новых товаров на заводе! Нужно отправить их красить!");
        do {
            System.out.print("\nМеню виробів\n1.Разрисовать изделия\n2.Узнать количество разрисованных\n0.Exit\nВаш выбор: ");
            vibor = in.nextInt();
            if (vibor == 0)
                Main.main(arguments);
            else if (vibor == 1 && kilkist > 0)
                risovat();
            else if (vibor == 2)
            {
                System.out.print("Количество разрисованных деталей равно " + (kilkist_izn - kilkist) + "!");
            }
            else if(kilkist <= 0)
                System.out.print("Количество деталей равно нулю!");
        }while (true);
    }
    public static void risovat(){
        Scanner in = new Scanner(System.in);
        int vibor_ris;
        do {
            System.out.print("\nВыберите форму изделия!\n1.Шар;\n2.Лист;\n3.Сложная форма;\n0.Exit\nВаш выбор: ");
            vibor_ris = in.nextInt();
            if (vibor_ris == 0)
                virob_menu();
            else if (vibor_ris == 1 && kilkist > 0)
                risov_shar();
            else if (vibor_ris == 2 && kilkist > 0)
                risov_list();
            else if (vibor_ris == 3 && kilkist > 0)
                risov_skladna();
            else if(kilkist <= 0)
            {
                System.out.print("Количество деталей равно нулю!");
                virob_menu();
            }
        }while (true);
    }
    public static void risov_shar(){
        Uchet uchet = new Uchet(0, "0", "0", "0",0);
        Scanner in = new Scanner(System.in);
        float formula, r, pi = 3.14f, vitracheno, normu = 0;
        System.out.print("Зарисуем шар! Введите радіус: ");
        r = in.nextFloat();
        if (r <= 0) {
            System.out.print("Некоректное значение радіуса!");
            return;
        }
        formula = 4 * r * r * pi;
        System.out.print("S = 4*Pi*R*R = 4 * " + pi + " * " + r + " * " + r + " = " + formula + ".");
        int vibor_farb;
        do {
            System.out.print("\nВыберите вид краски для покраски:" +
                    "\n1.Эмульсионные краски;" +
                    "\n2.Алкидные краски;" +
                    "\n3.Клеевые краски; " +
                    "\n4.Силикатные краски;" +
                    "\nВаш выбор: ");
            vibor_farb = in.nextInt();
            if (vibor_farb == 1 || vibor_farb == 2 || vibor_farb == 3 || vibor_farb == 4)
                break;
        }while (true);
        if (vibor_farb == 1)
             normu = norma_em;
        else if (vibor_farb == 2)
            normu = norma_alk;
        else if (vibor_farb == 3)
            normu = norma_kleev;
        else if (vibor_farb == 4)
            normu = norma_silk;
        vitracheno = formula * normu;
        if (vibor_farb == 1)
            uchet.push(Uchet.num_oper++, "Вироб номер " + nomer, "CastleDwania", "Эмульсионные краски", vitracheno);
        else if (vibor_farb == 2)
            uchet.push(Uchet.num_oper++, "Вироб номер " + nomer, "CastleDwania", "Алкидные краски", vitracheno);
        else if (vibor_farb == 3)
            uchet.push(Uchet.num_oper++, "Вироб номер " + nomer, "CastleDwania", "Клеевые краски", vitracheno);
        else if (vibor_farb == 4)
            uchet.push(Uchet.num_oper++, "Вироб номер " + nomer, "CastleDwania", "Силикатные краски", vitracheno);
        nomer++;
        kilkist--;
    }
    public static void risov_list() {
        Uchet uchet = new Uchet(0, "0", "0", "0",0);
        float a, b, s, vitracheno, normu = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Зарисуем листы! Введите 1 сторону: ");
        a = in.nextFloat();
        System.out.print("Зарисуем листы! Введите 2 сторону: ");
        b = in.nextFloat();
        if (a <= 0 || b <= 0) {
            System.out.print("Некоректное значение радіуса!");
            return;
        }
        s= a * b;
        System.out.print("S = a * b = " + a + " * " + b + " = " + s + ".");
        int vibor_farb;
        do {
            System.out.print("\nВыберите вид краски для покраски:" +
                    "\n1.Эмульсионные краски;" +
                    "\n2.Алкидные краски;" +
                    "\n3.Клеевые краски; " +
                    "\n4.Силикатные краски;" +
                    "\nВаш выбор: ");
            vibor_farb = in.nextInt();
            if (vibor_farb == 1 || vibor_farb == 2 || vibor_farb == 3 || vibor_farb == 4)
                break;
        }while (true);
        if (vibor_farb == 1)
            normu = norma_em;
        else if (vibor_farb == 2)
            normu = norma_alk;
        else if (vibor_farb == 3)
            normu = norma_kleev;
        else if (vibor_farb == 4)
            normu = norma_silk;
        vitracheno = s * normu;
        if (vibor_farb == 1)
            uchet.push(Uchet.num_oper++, "Вироб номер " + nomer, "CastleDwania", "Эмульсионные краски", vitracheno);
        else if (vibor_farb == 2)
            uchet.push(Uchet.num_oper++, "Вироб номер " + nomer, "CastleDwania", "Алкидные краски", vitracheno);
        else if (vibor_farb == 3)
            uchet.push(Uchet.num_oper++, "Вироб номер " + nomer, "CastleDwania", "Клеевые краски", vitracheno);
        else if (vibor_farb == 4)
            uchet.push(Uchet.num_oper++, "Вироб номер " + nomer, "CastleDwania", "Силикатные краски", vitracheno);
        nomer++;
        kilkist--;
    }
    public static void risov_skladna() {
        Uchet uchet = new Uchet(0, "0", "0", "0",0);
        Scanner in = new Scanner(System.in);
        System.out.print("Зарисуем деталь сложной формы! Введите площадь, что указанна в документации: ");
        float s = in.nextFloat(), vitracheno, normu = 0;
        int vibor_farb;
        do {
            System.out.print("\nВыберите вид краски для покраски:" +
                    "\n1.Эмульсионные краски;" +
                    "\n2.Алкидные краски;" +
                    "\n3.Клеевые краски; " +
                    "\n4.Силикатные краски;" +
                    "\nВаш выбор: ");
            vibor_farb = in.nextInt();
            if (vibor_farb == 1 || vibor_farb == 2 || vibor_farb == 3 || vibor_farb == 4)
                break;
        }while (true);
        if (vibor_farb == 1)
            normu = norma_em;
        else if (vibor_farb == 2)
            normu = norma_alk;
        else if (vibor_farb == 3)
            normu = norma_kleev;
        else if (vibor_farb == 4)
            normu = norma_silk;
        vitracheno = s * normu;
        if (vibor_farb == 1)
            uchet.push(Uchet.num_oper++, "Вироб номер " + nomer, "CastleDwania", "Эмульсионные краски", vitracheno);
        else if (vibor_farb == 2)
            uchet.push(Uchet.num_oper++, "Вироб номер " + nomer, "CastleDwania", "Алкидные краски", vitracheno);
        else if (vibor_farb == 3)
            uchet.push(Uchet.num_oper++, "Вироб номер " + nomer, "CastleDwania", "Клеевые краски", vitracheno);
        else if (vibor_farb == 4)
            uchet.push(Uchet.num_oper++, "Вироб номер " + nomer, "CastleDwania", "Силикатные краски", vitracheno);
        nomer++;
        kilkist--;
    }
}
