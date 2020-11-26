/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public  class  lab1 {
    public  static  void  main ( String [] args ) {
        Система . из . println ( « Задача №1 » );
        Система . из . println ( " Остаток от деления равенство: "  + модульноеДеление ( - 34 , 7 ));
        Система . из . println ();
        Система . из . println ( " Задача №2 " );
        Система . из . println ( " Площадь треугольника равна: " + площадьТреугольника ( 5 , 5 ));
        Система . из . println ();
        Система . из . println ( " Задача №3 " );
        Система . из . println ( " У животных всего ног: " + количествоNog ( 1 , 2 , 3 ));
        Система . из . println ();
        Система . из . println ( « Задача №4 » );
        Система . из . println ( " Это выражение: " + profitableGamble ( 0.9 , 1 , 2 ));
        Система . из . println ();
        Система . из . println ( « Задача №5 » );
        Система . из . println ( " Это операция: " + операция ( 11 , 15 , 3 ));
        Система . из . println ();
        Система . из . println ( « Задача №6 » );
        Система . из . println ( " Код символа: " + convertCharToInt ( ' [ ' ));
        Система . из . println ();
        Система . из . println ( « Задача №7 » );
        Система . из . println ( " Сумма: " + addUpTo ( 10 ));
        Система . из . println ();
        Система . из . println ( « Задача №8 » );
        Система . из . println ( " Третья сторона: " + nextEdge ( 5 , 7 ));
        Система . из . println ();
        Система . из . println ( « Задача №9 » );
        Система . из . println ( " Сумма кубов массива чисел: " + sumOfCubes ( 1 , 5 , 9 ));
        Система . из . println ();
        Система . из . println ( « Задача №10 » );
        Система . из . println ( " Может ли делится результат: " + abcMath ( 5 , 2 , 3 ));
    }
    static  int  модульное Деление ( int  delimoe , int  delitel ) {
        delimoe = Математика . абс (делимое);
        delitel = Math . абс (делитель);
        int n = 0 ;
        int temp = 0 ;
        int answer = 0 ;
        do {
            ответ = темп;
            n ++ ;
            temp = delitel * n;
        }
        в то время как (temp <= delimoe);
        возврат (делимое - ответ);
    }
    статическая  двойная  площадьТреугольника ( двойное  основание , двойная  высота ) {
        возврат ( 0,5 * основание * высота);
    }
    static  int  kolichestvoNog ( int  курица , int  корова , int  свинья ) {
        возврат (курица * 2 + корова * 4 + свинья * 4 );
    }
    static  boolean  profitableGamble ( двойная  вероятность , двойной  приз , двойная  выплата ) {
        if ((проблема * приз) > плати) {
            возврат ( правда );
        }
        else {
            возврат ( ложь );
        }
    }
    статическая  операция String  ( int ans , int num1 , int num2 ) {   
        если (ANS == num1 + пит2) {
            return ( " Сложение " );
        }
        еще  если (анс == num1 - num2) {
            return ( " Вычитание " );
        }
        еще  если (анс == num1 * num2) {
            return ( " Умножение " );
        }
        еще  если (анс == num1 / num2) {
            return ( « Деление » );
        }
        else {
            return ( " Ничего " );
        }
    }
    static  int  convertCharToInt ( char  ch ) {
        return (ch);
    }
    static  int  addUpTo ( int  number ) {
        int sum = 0 ;
        for ( int i = 1 ; i <= number; i ++ ) {
            сумма + = я;
        }
        возврат (сумма);
    }
    static  int  nextEdge ( int  edge1 , int  edge2 ) {
        return (edge1 + edge2 - 1 );
    }
    static  int  sumOfCubes ( int ... numbers ) {
        int sum = 0 ;
        for ( int n : числа) {
            сумма + = Мат . pow (n, 3 );
        }
        возврат (сумма);
    }
    static  boolean  abcMath ( int  a , int  b , int  c ) {
        int sum = a;
        for ( int i = 0 ; i < b; i ++ ) {
            сумма + = сумма;
        }
        сумма возврата % c ==  0 ;
    }
}
