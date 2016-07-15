package pag1;
/**
 * Переменные строковые, метод lenght(),определяет длину строки:Синтаксист
 * имя.lenght()
 */
public class Ls {

    public static void main(String args[]) {
        String str = "adgk";
        String str1 = "adgkp";
        String str2 = "zcbmsw";
        String str3[] = {"один", "два", "три"};
        System.out.println("длина строки str  =" + str.length());
        System.out.println("длина строки str1 =" + str1.length());
        System.out.println("длина строки str2 =" + str2.length());
        //с массивом
        System.out.println();
        for (int i = 0; i < str3.length; i++) {
            System.out.println("str3[" + i + "]" + str3[i]);
        }

    }
}
