package pag1;
/**
 * Переменные строковые, общие сведения, обьекты класса String
 */
public class Ss {

    public static void main(String[] args) {
        String myStr = "Строка";
        String myStr1 = "Это" + " строка";//знак + служит для сцепления строк
        System.out.println(myStr);
        System.out.println(myStr1);
        //обьект args из метода main
        //for (int i = 0; i < args.length; i++) {
        //System.out.println("args[" + args[i] + "]"); 
        args[0] = "ноль";
        args[1] = "один";
        args[2] = "два";
        System.out.println(args[0]);
        //System.out.println("args[" + args[0] + "]");

    }

}
