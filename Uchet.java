package com.company;
import java.util.*;

public class Uchet {
    private static int maxSize = 30;
    public static Uchet[] uchets = new Uchet[maxSize];
    public static int num_oper;
    float kilkist;
    static float kil_alk, kil_em, kil_kleev, kil_sil, stoim_alk = 13.3f, stoim_em = 15.9f, stoim_kleev = 19.2f, stoim_sil = 10.0f;
    String type_operation,type_of_obj, name;
    public static int zapis = 0;
    public Uchet (int num, String t, String name, String tob, float k) {
        super();
        num_oper = num;//номер операции
        type_operation = t;//фарба або деталь
        this.name = name;//клиент или наше предприятие
        type_of_obj = tob;//шар, лист или сложная форма \\\\ Эмульсионные краски;Алкидные краски;Клеевые краски;силикатные краски;
        kilkist = k;//количество потраченой краски
    }
    public void push(int num, String t, String name, String tob, float k) { // Розміщення елемента на вершині стека
        num_oper = num;//номер операции
        type_operation = t;//фарба або деталь
        this.name = name;//клиент или наше предприятие
        type_of_obj = tob;//шар, лист или сложная форма \\\\ Эмульсионные краски;Алкидные краски;Клеевые краски;силикатные краски;
        kilkist = k;//количество потраченой краски
        uchets[++zapis] = new Uchet(num_oper, type_operation, this.name, type_of_obj, kilkist);
    }
    public static String[] arguments = new String[] {" "};
    public static void menu() {
        Scanner in = new Scanner(System.in);
        int vibor_menu_f;
        do {
            System.out.print("\nМЕНЮ УЧЕТА\n1.Вывести все финансовые операции\n0.Exit\nВыберите действие:");
            vibor_menu_f = in.nextInt();
            if ( vibor_menu_f == 0)
                Main.main(arguments);
            else if (vibor_menu_f == 1)
                vivod_ucheta ();
        }while (true);
    }
    public static void vivod_ucheta () {
        for (int i = 1;i < Uchet.maxSize;i++) {
            System.out.println("------------------------------------------------------------------");
            System.out.println(i + ". " + uchets[i].type_operation + " - "
                    + uchets[i].name + " - " + uchets[i].type_of_obj + " - "
                    + uchets[i].kilkist);
            if(uchets[i].type_of_obj == "Эмульсионные краски")
                kil_em += uchets[i].kilkist;
            else if(uchets[i].type_of_obj == "Алкидные краски")
                kil_alk += uchets[i].kilkist;
            else if(uchets[i].type_of_obj == "Клеевые краски")
                kil_kleev += uchets[i].kilkist;
            else if(uchets[i].type_of_obj == "Силикатные краски")
                kil_sil += uchets[i].kilkist;
            if (i == zapis) {
                System.out.println("------------------------------------------------------------------");
                System.out.println("Общая стоимость использованных " + kil_em +"л эмульсионных красок(" + stoim_em+ "грн/л): " +(kil_em * stoim_em) +
                        "\nОбщая стоимость использованных " + kil_alk +"л алкидных красок(" + stoim_alk+ "грн/л): " + (kil_alk * stoim_alk) +
                        "\nОбщая стоимость использованных " + kil_kleev + "л клеевых красок(" + stoim_kleev+ "грн/л): " + (kil_kleev * stoim_kleev) +
                        "\nОбщая стоимость использованных " + kil_sil + "л силикатных красок(" + stoim_sil+ "грн/л): " + (kil_sil * stoim_sil));
                menu();
            }
        }
    }
}
