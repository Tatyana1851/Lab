/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public  class  lab3 {
    public  static  void  main ( String  args []) {
        Система . из . println ();
        Система . из . println ( « Задача №1 » );
        решения ( 5 , 3 , 7 );
        Система . из . println ();
        Система . из . println ( " Задача №2 " );
        findWord ( " все zip-файлы заархивированы " , " zip " , 2 );
        findWord ( « все zip-файлы сжаты » , « zip » , 2 );
        Система . из . println ();
        Система . из . println ( " Задача №3 " );
        Система . из . println (checkPerfect ( 28 ));
        Система . из . println ();
        Система . из . println ( « Задача №4 » );
        flipEndChars ( " Ада " );
        Система . из . println ();
        Система . из . println ( « Задача №5 » );
        Система . из . println (isValidHexCode ( " # 6a66A6 " ));
    }
    статические  пустые  решения ( двойные  a , двойные  b , двойные  c ) {
        Двойной  D = b * b - 4 * a * c;
        if ( D > 0 ) {
            Система . из . println ( " Дискриминант больше нуля и уравнение имеет два корня " );
            двойной x1 = ( - b + Math . sqrt ( D )) / ( 2 * a);
            двойной x2 = ( - b - Math . sqrt ( D )) / ( 2 * a);
            Система . из . println ( " Первый корень равенство: " + x1);
            Система . из . println ( " Второй корень равен: " + x2);
        }
        else  if ( D == 0 ) {
            Система . из . println ( " Дискриминант равенство нулю и уравнение имеет один корень " );
            двойной x = ( - b) / ( 2 * a);
            Система . из . println ( " Корень равен: " + x);
        }
        else {
            Система . из . println ( " Дискриминант меньше нуля и уравнение не имеет корней " );
        }
    }
    static  void  findWord ( String  mainString , String  sWord , int  repeatTimes ) {
        int charNumber = 0 ;
        for ( int i = 0 ; i <= mainString . length () - sWord . length (); i ++ ) {
            int count = 0 ;
            for ( int j = 0 ; j < sWord . length (); j ++ ) {
                if (sWord . charAt (j) == mainString . charAt (i + j)) {
                    count ++ ;
                }
            }
            if (sWord . length () == count) {
                repeatTimes - = 1 ;
                if (repeatTimes <= 0 ) {
                    Система . из . println ( " Совпадение найдено: " + i);
                }
            }
        }
        if (repeatTimes > 0 ) {
            Система . из . println ( " Совпадение не найдено: -1 " );
        }
    }
    static  boolean  checkPerfect ( int  number ) {
        int sum = 0 ;
        for ( int i = 1 ; i < number; i ++ ) {
            if (число % (i) == 0 ) {
                сумма + = я;
                Система . из . println (я);
            }
        }
        возврат (число == сумма);
    }
    static  void  flipEndChars ( String  mainString ) {
        if (mainString . length () > = 2 ) {
            char startChar = mainString . charAt ( 0 );
            char endChar = mainString . charAt (mainString . length () - 1 );
            Строка answer = " " ;
            if (startChar == endChar) {
                Система . из . println ( " Два - это пара " );
            }
            else {
                ответ = (ответ + endChar);
                for ( int i = 1 ; i < mainString . length () - 1 ; i ++ ) {
                    ответ + = mainString . charAt (i);
                }
                ответ = (ответ + startChar);
            }
            Система . из . println (ответ);
        }
        else {
            Система . из . println ( " Невозможно " );
        }
    }
    статическое  логическое значение  isValidHexCode ( String  hexCode ) {
        if (hexCode . charAt ( 0 ) == ' # ' ) {
            if (hexCode . length () == 7 ) {
                int код;
                for ( int i = 1 ; i < hexCode . length (); i ++ ) {
                    код = hexCode . charAt (i);
                    if ( ! (( 48 <= код && код <= 57 ) | ( 97 <= код && код <= 102 ) | ( 65 <= код && код <= 70 ))) {
                        Система . из . println ( " Некорректные символы " );
                        вернуть  ложь ;
                    }
                }
                вернуть  истину ;
            }
            else {
                Система . из . println ( " Длина должна быть 6 " );
                вернуть  ложь ;
            }
        }
        else {
            Система . из . println ( " Пропущен '#' " );
            вернуть  ложь ;
        }
    }
}
