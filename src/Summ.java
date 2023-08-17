import java.util.Arrays;

public class Summ {
    public static void main(String[] args) {
//        int sex = recursiveCounter(1,4,6);
//        System.out.println(sex);

        int[] array1 = {1, 3,5,87,2,34,67,89,34,12};
        Arrays.sort(array1);
        System.out.println("\nОтсортированный массив: ");
        for (int num : array1) {
            System.out.print(num + " ");
        }
    }
//    public static Integer summnumber(int x){
//        int a = 0;
//        for (int i = 0; i <= x; i++) {
//            a = a+i;
//        }
//        return a;
//    }

    private static int recursiveCounter(int depth, int maxDepth, int faces) {
        //max = 4, faces = 6 // count = 214 * 6 = 1296
        // 1 1 1 1
        int count = 0;
        int qwe = 0;
        for (int i = 1; i <= faces; i++) {
            qwe++;
            if (depth == maxDepth) {
                count++;
            } else {
                count += recursiveCounter(depth + 1, maxDepth, faces);
            }
            System.out.println(qwe);
        }
        return count;
    }

}