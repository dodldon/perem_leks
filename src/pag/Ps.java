package pag;

/**
 * Переменные,именованая ячейка памяти:<br> тип имя;<br>
 * должна обьявляться в начале кода<br>
 * если иницилизирована то инициализация переменной будет повторяться при каждом вхождении в блок кода,
 * Переменные являются примитивными и бывают,целочисленные,действительные,символьные,
 *
 */
public class Ps {

    public static void main(String args[]) {
        long l = 1000000;
        int i = 10;
        short s = 5;
        byte b = 2;
        float f = 3.14f;  //требуется указывать f или F
        double d = 3.1416;
        char ch = 88;
        char ch1 = 'Y';
        char ch2;
        ch2 = ch1;
        ch2++;
        boolean bt = true;
        boolean bf = false;
        //Пример
        int num;
        num = 100;
        System.out.println("num = " + num);
        num *= 2;
        System.out.println("(num * 2) = " + num);
        System.out.println("long=" + l);
        System.out.println("int=" + i);
        System.out.println("short=" + s);
        System.out.println("byte=" + b);
        System.out.println("float=" + f);
        System.out.println("double=" + d);
        System.out.println("char=" + ch + "," + ch1 + "," + ch2);
        System.out.println("boolean=" + bt+ "," + bf);
       
    }

}
