package pag5;

/**
 *
 * Переменные,автоматическое продвижение типов при вычмсленях в выражениях<br>
 * Сначала все значения типа byte,short,char продвигаются к типу int, Затем тип
 * всего выражения продвигается к типу long, если один из его операндов
 * относится к типу long, Если же один из операндов относится к типу float, то
 * тип всего выражения продвигается к типу float, А если любой из операндов
 * относится к типу douЫe, то и результат вычисления всего выражения относится к
 * типу douЫe
 */
public class P5s {

    public static void main(String args[]) {
        byte Ь = 42;
        char с = 'а';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * Ь) + (i / с) - (d * s); //продвигает к float=int+double
        System.out.println((f * Ь) + " + " + (i / с) + " - " + (d * s)); //
        System.out.println("result=" + result); //продвигает к double
    }

}
