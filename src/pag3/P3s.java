package pag3;

/**
 * Переменные,Область дествия<br>
 * срок действия переменной ограничивается ее областью действия обьекты из
 * внутреней области не доступны внешеим<br>
 * обьекты из внешней области доступны внешеим<br>
 * во внутреннем блоке кода Нельзя объsвлать переменные с тем же именем,
 * что и во внешней областиасти действия
 *
 */
public class P3s {

    public static void main(String args[]) {
        int a = 1;
        //обьекты из внутреней области не доступны внешеим
        {
            int i = 2;
            System.out.println(i + "и" + a);

        }
        System.out.println(a + " а" + " i вызвать нельзя");

    }

}
