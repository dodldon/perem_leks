package pag1;
/**
 * Переменные строковые,метод equals() проверяет две строки на равенство
 * значений символов, Cинтаксист: первая строка.equals(вторая строка)
 */
public class Es {

    public static void main(String args[]) {
        String str = "adgk";
        String str1 = "adgkp";
        String str2 = "adgkp";

        if (str.equals(str1)) {
            System.out.println("str==str1");
        } else {
            System.out.println("str!= str1");
        }

        if (str.equals(str2)) {
            System.out.println("str==str2");
        } else {
            System.out.println("str!=str2");
        }
        if (str1.equals(str2)) {
            System.out.println("str1==str2");
        } else {
            System.out.println("str1!=str2");
        }
    }
}
