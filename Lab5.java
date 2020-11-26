/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import  java.util.Arrays ;

public  class  lab5 {
    public  static  void  main ( String  args []) {
        Система . из . println ();
        Система . из . println ( « Задача №1 » );
        encrypt ( " Солнечный свет " );
        int [] array = { 83 , 34 , - 7 , 5 , - 11 , 1 , 5 , - 9 };
        расшифровать (массив);
        Система . из . println ();
        Система . из . println ( " Задача №2 " );
        Система . из . println (canMove ( " король " , " D4 " , " C3 " ));
    }
    static  void  encrypt ( String  string ) {
        int returnArray [] =  новый  int [строка . длина ()];
        int lastCode = строка . charAt ( 0 );
        returnArray [ 0 ] = (lastCode);
        for ( int i = 1 ; i < string . length (); i ++ ) {
            int nextCode = строка . charAt (i);
            returnArray [i] = (nextCode - lastCode);
            lastCode = nextCode;
        }
        Система . из . println ( Массивы . toString (returnArray));
    }
    static  void  decrypt ( int [] array ) {
        Строка returnString = " " ;
        int lastCode = массив [ 0 ];
        returnString = returnString + ( char ) lastCode;
        for ( int i = 1 ; i < array . length; i ++ ) {
            int sum = lastCode + array [i];
            returnString = returnString + ( char ) сумма;
            lastCode = сумма;
        }
        Система . из . println (returnString);
    }
    static  boolean  canMove ( String  figura , String  startPos , String  finishPos ) {
        int startChar = startPos . charAt ( 0 );
        int startNum = startPos . charAt ( 1 );
        int finishChar = finishPos . charAt ( 0 );
        int finishNum = finishPos . charAt ( 1 );
        int charChange = Math . abs (finishChar - startChar);
        int numChange = Math . abs (finishNum - startNum);
        if (figura . toLowerCase () == " пешка " ) {
            return (finishNum - startNum == 1  && finishChar - startChar == 0 );
        }
        else  if (figura . toLowerCase () == " kon " ) {
            return ((numChange == 2  && charChange == 1 ) | (numChange == 1  && charChange == 2 ));
        }
        else  if (figura . toLowerCase () == " slon " ) {
            return (numChange == charChange);
        }
        else  if (figura . toLowerCase () == " ladya " ) {
            return ((numChange > 0  && charChange == 0 ) | (numChange == 0  && charChange > 0 ));
        }
        else  if (figura . toLowerCase () == " ferz " ) {
            return ((numChange > 0  && charChange == 0 ) | (numChange == 0  && charChange > 0 ) | (numChange == charChange));
        }
        else  if (figura . toLowerCase () == " король " ) {
            return (numChange <= 1  && charChange <= 1 );
        }
        else {
            вернуть  ложь ;
        }
    }
}
