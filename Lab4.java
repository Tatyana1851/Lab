/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public  class  lab4 {
    public  static  void  main ( String  args []) {
        Система . из . println ();
        Система . из . println ( « Задача №1 » );
        esseFunc ( 7 , « привет, меня зовут Бесси, это мое эссе » );
        Система . из . println ();
        Система . из . println ( " Задача №2 " );
        split ( " () () () " );
        Система . из . println ();
        Система . из . println ( " Задача №3 " );
        Система . из . println (toCamelCase ( " к Camel_case " ));
        Система . из . println (toSnakeCase ( " toSnakeCase " ));
    }
    static  void  esseFunc ( int  stringSize , String  text ) {
        Строка bString = " " ;
        Строка fString = " " ;
        int countOfChars = 0 ;
        int lastSpacePlace = 0 ;
        for ( int i = 0 ; i < text . length (); i ++ ) {
            if ((countOfChars > stringSize)) {
                Система . из . println (fString);
                fString = " " ;
                bString = " " ;
                я = lastSpacePlace + 1 ;
                countOfChars = 0 ;
            }
            if ((text . charAt (i) == '  ' )) {
                lastSpacePlace = я;
                fString = bString;
                bString = bString + текст . charAt (i);
            }
            else {
                bString = bString + текст . charAt (i);
                countOfChars ++ ;
            }
            if (i + 1 == text . length ()) {
                Система . из . println (bString);
            }
        }
    }
    static  void  split ( String  str ) {
        int balance = 0 ;
        Строка bString = " " ;
        for ( int i = 0 ; i < str . length (); i ++ ) {
            if (str . charAt (i) == ' ( ' ) {
                баланс ++ ;
            }
            if (str . charAt (i) == ' ) ' ) {
                баланс - ;
            }
            // System.out.println (баланс);
            bString = bString + str . charAt (i);
            if (balance == 0 ) {
                Система . из . println (bString);
                bString = " " ;
            }
        }
    }
    static  String  toCamelCase ( String  строка ) {
        Строка returnString = " " ;
        Строка loString = строка . toLowerCase ();
        Строка hiString = строка . toUpperCase ();
        for ( int i = 0 ; i < string . length (); i ++ ) {
            if (строка . charAt (i) == ' _ '  | строка . charAt (i) == '  ' ) {
                i ++ ;
                returnString = returnString + hiString . charAt (i);
            }
            else {
                returnString = returnString + loString . charAt (i);
            }
        }
        возврат (returnString);
    }
    static  String  toSnakeCase ( String  строка ) {
        Строка returnString = " " ;
        Строка loString = строка . toLowerCase ();
        Строка hiString = строка . toUpperCase ();
        for ( int i = 0 ; i < string . length (); i ++ ) {
            if (строка . charAt (i) == hiString . charAt (i)) {
                returnString = returnString + " _ " ;
            }
            returnString = returnString + loString . charAt (i);
        }
        возврат (returnString);
    }
}
