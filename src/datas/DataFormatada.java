package datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataFormatada {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        Date data = c.getTime();

        DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Data Brasileira: "+f.format(data));

        f = DateFormat.getTimeInstance(DateFormat.LONG);
        System.out.println("Data média 1: "+ f.format(data));

        f = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("Data curta 1: "+ f.format(data));

        SimpleDateFormat datinha = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Data formatada: " + datinha.format(data));

    }

}
