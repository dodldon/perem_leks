package pag4;

/**
 * Переменные,Преобразование и приведение типов<br>
 * 1,Явное-автоматическое преобразование типов выполняется в Java при сохранении
 * целочисленной константы в переменных типа byte,short,long,char 2,Неявное-для
 * несовместимых типов данных, называется Приведение - неявное преобразование
 * типов<br>
 * имя цепевой переменной=(тип цепевой переменной) имя приведённой переменной,
 *
 */
public class P4s {

    public static void main(String args[]) {
        double d = 3.14;
        int i = 257;
        short s = 25;
        byte b = 2;
        float f = 2.3f;
        char ch='a';
        
        System.out.println("ПРИМЕРЫ");
        System.out.println("Преобразовать int в byte остаток от деления 257%256");
        b = (byte) i;
        System.out.println(i + "   " + b);
        System.out.println("Преобразовать short в byte");
        b = (byte) s;
        System.out.println(s + "   " + b);
        System.out.println("Преобразовать int в double");
        i = (int) d;
        System.out.println(i + "   " + d);
        System.out.println("Преобразовать double в int");
        System.out.println(d + "   " + i);
        System.out.println("Преобразовать float в int");
        i = (int) f;
        System.out.println(f + "   " + i);
        System.out.println("Преобразовать byte в int");
        i = (int) b;
        System.out.println(b + "   " + i);
         System.out.println("Преобразовать char в int");
        i = (int) ch;
        System.out.println(i + "   " + ch);
    }

}
