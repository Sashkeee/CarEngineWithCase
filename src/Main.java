import javax.xml.transform.Source;
import java.lang.classfile.instruction.SwitchCase;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    List spisok = new ArrayList();
    Scanner scan = new Scanner(System.in);
    int cycle = 0;
        while (cycle==0) {


        System.out.println("Что сделать?");
            System.out.println("1 - Добавить в БД");
            System.out.println("2 - Показать базу данных");
            System.out.println("3 - Очистить базу данных");
            System.out.println("4 - Показать количество значений в БД");
            System.out.println("0 - Выход");
        int size = scan.nextInt();


    switch (size) {
        case 1 -> addToList(spisok);
        case 2 -> showList(spisok);
        case 3 -> clear(spisok);
        case 4 -> countOf(spisok);
        case 0 -> cycle++;

            }
        }
    }
    public static void addToList (List a) {
        Scanner newScaner = new Scanner(System.in);
        System.out.println("Введите обьем: ");
        int newValue = newScaner.nextInt();
        a.add(newValue);

    }
    public static void showList(List list) {
        System.out.println("____________БД_____________");
        for (Object i: list) {
            System.out.println("Значение: " + i);}
                    if (list.isEmpty()) System.out.println("--------Список пуст!-------");
        System.out.println("___________________________\n");

    }
    public static void clear (List list) {
        list.clear();
        System.out.println("___________________________");
        System.out.println("--------БД очищена!--------");
        System.out.println("___________________________\n");
    }
    public static void countOf (List list) {
        System.out.println("___________________________");
        System.out.println("Количество записей в БД: " + list.size() );
        System.out.println("___________________________\n");
    }
}