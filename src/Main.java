import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача №1
        int[] massiv = new int[3];
        massiv[0] = 1;
        massiv[1] = 2;
        massiv[2] = 3;

        double[] massiv2 = {1.57, 7.654, 9.986};

        String[] massiv3 = new String[]{"Hello", "my", "teacher!"}; // С вашего позволения 2 в 1

        // Задача №2
        System.out.println(Arrays.toString(massiv));
        System.out.println(Arrays.toString(massiv2));
        System.out.println(Arrays.toString(massiv3));

        // Задача №3
        //for (int i = massiv.length - 1; i >= 0; i--) {
        //System.out.print(massiv[i]); // не понимаю как поставить запятые , если добавлю "," то в конце будет запятая
        //}// еще думал использовать реверс  но что то статей нету
        System.out.println(massiv[2] + ", " + massiv[1] + ", " + massiv[0]);
        System.out.println(massiv2[2] + ", " + massiv2[1] + ", " + massiv2[0]);
        System.out.println(massiv3[2] + ", " + massiv3[1] + ", " + massiv3[0]);

        // Задача №4
        int i;
        for (i = 0; i < 3; i++) {
            if (i % 2 != 0) {
                massiv[i] = i + 1;
                break;
            }
        }
        System.out.println(massiv[i]);
    }
}