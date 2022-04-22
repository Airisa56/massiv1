package ru.skypro;

public class Main {

    public static void main(String[] args) {
       // Задание 1
         int[] array = new int [30] ;
        for (int i = 0; i < array.length; i++) {
             array[i] = (int) (Math.random()*100000+100000);
            System.out.print( array[i]+ " ");
         }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i] ;

        }
        System.out.println( " Сумма трат за месяц составила " + sum +  " рублей ");

        // Задание
          int min = array[0];
          int max = array[0];
        for (int i = 1; i < array.length ; i++) {
            if( min> array[i]) {
              min=array[i] ;
            }
            if ( max<array[i]) {
                max = array[i] ;
            }




        }
        System.out.println( " Минимальная сумма трат за день составила " + min);
        System.out.println( " Максимальная сумма трат за день составила " + max);

        // Задание 3

        System.out.println( " Средняя сумма трат за месяц составила " + (double) sum/ array.length );

        // Задание 4

        char[] reserseFullName = { 'n', 'a', 'v', 'i', ' ', 'v', 'o', 'n', 'a', 'v','i'};
        for (int i =reserseFullName.length-1; i>=0; i--) {
            System.out.print(reserseFullName[i]);

        }


    }
}
