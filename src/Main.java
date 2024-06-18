import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        double[] weight1 = {1.59, 7.654, 9.986};
        for (int i = 0; i < weight1.length; i++) ;

        int[] weight2 = {1, 3, 5, 7, 9, 11, 13, 15};
        for (int i = 0; i < weight2.length; i++) ;

        System.out.println("Задание 2");
        System.out.println(Arrays.toString(weight));
        System.out.println(Arrays.toString(weight1));
        System.out.println(Arrays.toString(weight2));

        System.out.println();

        System.out.println("Задание 3");
        weight[2] = 1;
        weight[1] = 2;
        weight[0] = 3;
        for (int i = 3; i < weight.length; i++) {
        }
        System.out.println(Arrays.toString(weight));

        for (int i = weight1.length - 1; i >= 0; i--) {
            System.out.print(weight1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = weight2.length - 1; i >= 0; i--) {
            System.out.print(weight2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Задание 4");
        int[] i = {1, 2, 3};
        for (int a = 0; a <i.length; a++) {
            if (i[a] % 2 != 0) {
                i[a]++;
            }
            if (a != 0) {
                System.out.print(i[a]);
                System.out.print(", ");
            }
        }
    }
}