/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import  java.util.regex.Matcher ;
import  java.util.regex.Pattern ;

public  class  lab6 {
    public  static  void  main ( String  args []) {
        Система . из . println ();
        Система . из . println ( « Задача №1 » );
        Система . из . println (номер звонка ( 6 ));
        Система . из . println ();
        Система . из . println ( " Задача №2 " );
        Система . из . println (translateWord ( " Крокодил " ));
        Система . из . println (translateWord ( " Яблоко " ));
        Система . из . println (translateSentence ( « Ежедневная вечеринка » ));
        }
    static  int  bellNumber ( int  number ) {
        int [] [] массив = новый  int [число] [число];
        массивный [ 0 ] [ 0 ] = 1 ;
        for ( int i = 1 ; i < number; i ++ ) {
            массив [i] [ 0 ] = массив [i - 1 ] [i - 1 ];
            for ( int j = 1 ; j <= i; j ++ ) {
                массив [i] [j] = массив [i - 1 ] [j - 1 ] + массив [i] [j - 1 ];
            }
        }
        возврат (массив [число - 1 ] [число - 1 ]);
    }
   / * static void translateWord (String string) {
        String regex = "^ [qwrtypsdfghjklzxcvbnm] *";
        Строка subst = "";
        Строка firstPart = "";
        Строка secondPart = "";
        Шаблон шаблон = Pattern.compile (регулярное выражение, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher (строка);
        while (matcher.find ()) {secondPart = matcher.group ();}
        firstPart = matcher.replaceAll (подстановка);
        if (secondPart == "") {System.out.println (firstPart + secondPart + "ура");}
        else {System.out.println (firstPart + secondPart + "ау");}
    } * /
   static  String  translateWord ( String  word ) {
       Строка finword =  " " ;
       Сначала строка = слово . подстрока ( 0 , 1 );
       int up_down = 0 ;
       int sog = 0 ;
       Строка вверх = " " ;
       слово = слово . отделка();
       int por =  1 ;
       String [] glas =  new  String [] { " a " , " e " , " i " , " o " , " u " , " y " };
       String [] soglas =  new  String [] { " b " , " c " , " d " , " f " , " g " , " h " , " j " , " k " , " l " , " m " , « п » , « п » ," д " ,« r » , « s » , « t » , « v » , « w » , « x » , « z » };
       if (first . toUpperCase () == first) {
           up_down = 1 ;
           слово = слово . toLowerCase ();
       } else {
           up_down = 0 ;
       }
       for ( int i =  0 ; i < glas . length; i ++ ) {
           if (glas [i] . equals (word . substring ( 0 , 1 ))) {
               финслово = слово + " ура " ;
           }
       }
       for ( int k =  0 ; k < soglas . length; k ++ ) {
           if (soglas [k] . equals (word . substring (por - 1 , por))) {
               Finword = Finword + слово . подстрока (por - 1 , por);
               por ++ ;
               k = 0 ;
               сог = 1 ;
           }
       }
       if (sog == 1 ) {
           finword = слово . подстрока (por - 1 ) + финслово + « ау » ;
       }
       if (up_down == 1 ) {
           вверх = финслово . подстрока ( 0 , 1 ) . toUpperCase ();
           finword = up + finword . подстрока ( 1 );
       }
       возврат (финслово);
   }
   static  String  translateSentence ( String  first_words ) {
        Строка final_words =  " " ;
        Строка [] слова = первые_слова . разделить ( " \\ s + " );
        for ( int k =  0 ; k < слова . length; k ++ ) {
            слова [k] = слова [k] . replaceAll ( " [^ \\ w] " , " " );
        }
        for ( int i =  0 ; i < слова . length; i ++ ) {
            final_words = final_words + translateWord (слова [я]) +  "  " ;
        }
        возврат (final_words);
   }

}
