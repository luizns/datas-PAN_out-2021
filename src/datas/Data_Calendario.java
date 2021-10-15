package datas;

import java.util.Calendar;

public class Data_Calendario {
    public static void main(String[] args) {
        Calendar calendario1 = Calendar.getInstance();
        System.out.println(calendario1);
        System.out.println("-------------------------------");
        Calendar calendario2 = Calendar.getInstance();
        Calendar calendario3 = Calendar.getInstance();
        System.out.println("Calendario1 antes " + calendario1.getTime());
        System.out.println("Calendario2 antes " + calendario2.getTime());
        System.out.println("Calendario3 antes " + calendario3.getTime());
        System.out.println("------------------------------------------");
        calendario1.add(2, 2);
        calendario2.add(1, 5);
        calendario3.add(5, 10);
        System.out.println("Calendario1 antes " + calendario1.getTime());
        System.out.println("Calendario2 antes " + calendario2.getTime());
        System.out.println("Calendario3 antes " + calendario3.getTime());
        System.out.println("------------------------------------------");
    }
}
