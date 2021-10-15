package datas;

import javax.swing.*;
import java.util.Calendar;

public class Data_Calendario2 {
    public static void main(String[] args) {

        Calendar calendario1 = Calendar.getInstance();

        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de nascimento"));
        int ano_atual = calendario1.get(1);
        int idade = ano_atual - ano;
        System.out.println(idade);

    }
}
