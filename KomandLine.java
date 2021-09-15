package org.itstep;

public class KomandLine {
    public static void main(String[] args) {
        // В параметрах командной строки задаются два числа
        // Программа выводит их сумму
        int summ = 0;

        for (int i = 0; i < args.length; i++){
            summ = Integer.parseInt(args [i]);

        }
        System.out.println(summ);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = a + b;
        System.out.println(c);
    }
}
