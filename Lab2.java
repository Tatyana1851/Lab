/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import  javax.print.attribute.standard.OrientationRequested ;
import  java.util.Arrays ;

public  class  lab2 {
    public  static  void  main ( String  args []) {
        Система . из . println ();
        Система . из . println ( « Задача №1 » );
        Система . из . println (повтор ( " слово " , 3 ));
        Система . из . println ();
        Система . из . println ( " Задача №2 " );
        int [] массив = { 1 , 2 , 3 };
        разницаMaxMin (массив);
        Система . из . println ();
        Система . из . println ( " Задача №3 " );
        Система . из . println ( " Среднее значение целое: " + isAvgWhole (массив));
        Система . из . println ();
        Система . из . println ( « Задача №4 » );
        Система . из . println ( " Итоговый массив:   " + cumulativeSum (array));
        Система . из . println ();
        Система . из . println ( « Задача №5 » );
        Система . из . println ( " Цифр после запятой:   " + getDecimalPlaces ( " 43,000 " ));
    }
    static  String  repeat ( String  word , int  count ) {
        Строка answer = " " ;
        for ( int i = 0 ; i < word . length (); i ++ ) {
            char c = слово . charAt (i);
            for ( int j = 0 ; j < count; j ++ ) {
                ответ = ответ + c;
            }
        }
        возврат (ответ);
    }
    static  void  differenceMaxMin ( int [] numbers ) {
        int max = числа [ 0 ];
        int min = числа [ 0 ];
        for ( int i = 1 ; i < числа . length; i ++ ) {
            if (numbers [i] > = max) {
                макс = числа [я];
            }
            if (числа [i] <= min) {
                min = числа [i];
            }
        }
        Система . из . println ( " Максимальное значение: " + max +  " Минимальное значение: " + min +  " Разница: "  + (max - min));
    }
    статическое  логическое значение  isAvgWhole ( int [] numbers ) {
        двойной средний = 0 ;
        двойная сумма = 0 ;
        for ( int i = 0 ; i < числа . length; i ++ ) {
            сумма + = числа [я];
        }
        avg = сумма / числа . длина;
        if (avg % 1 == 0 ) {
            возврат ( правда );
        }
        else {
            возврат ( ложь );
        }
    }
    static  String  cumulativeSum ( int [] числа ) {
        int sum = 0 ;
        int [] temp = new  int [числа . длина];
        for ( int i = 0 ; i < числа . length; i ++ ) {
            for ( int j = 0 ; j <= i; j ++ ) {
                сумма + = числа [j];
            }
            темп [я] = сумма;
            сумма = 0 ;
        }
        return ( Массивы . toString (temp));
    }
    static  int  getDecimalPlaces ( String  sNumber ) {
        int count = 0 ;
        логический триггер = ложь ;
        for ( int i = 0 ; i < sNumber . length (); i ++ ) {
            if (trigger) {
                count ++ ;
            }
            if (sNumber . charAt (i) == ' . '  | sNumber . charAt (i) == ' , ' ) {
                trigger = true ;
            }
        }
        счетчик возврата ;
    }
}
