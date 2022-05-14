import java.util.Arrays;

public class Lesson_3 {

    public static void main(String[] args) {

//Exercise 1
        int[] createArrayOneNull = {0,0,1,0,1,0,0,1,1,1};
        for (int i = 0; i<createArrayOneNull.length;i++) {
            createArrayOneNull[i] = 0;
        }
        System.out.println(Arrays.toString(createArrayOneNull));

//Exercise 2
        int[] createEmptyArray = new int[100];
        for (int i = 0; i<createEmptyArray.length;i++) {
            createEmptyArray[i] = i+1;
        }
        System.out.println(Arrays.toString(createEmptyArray));

//Exercise 3
        int[] createFindLessThanSix = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i<createFindLessThanSix.length; i++) {
            if (createFindLessThanSix[i] < 6) {
                createFindLessThanSix[i] = createFindLessThanSix[i]*2;
            }
        }
        System.out.println(Arrays.toString(createFindLessThanSix));

//Exercise 4
        int[][] squareArray = new int[5][5];
        for (int i = 0; i<squareArray.length;i++) {
            for (int j = 0; j<squareArray[i].length;j++) {
                if (i == j || i+j==4) {
                    squareArray[i][j] = 1;
                }
                System.out.print(squareArray[i][j]);
            }
            System.out.println();
        }

//Exercise 5
        int len = 8;
        int initialValue = 5;
        System.out.println(Arrays.toString(createNewArray(len,initialValue)));

//Exercise 6
        int[] findMaxAndMin = {6,23,19,32,1,66,21,3,3,23,42,18};
        int maxResult = findMaxAndMin[0];
        int minResult = findMaxAndMin[0];
        for (int n = 1; n<findMaxAndMin.length; n++) {
            if (findMaxAndMin[n] > maxResult) {
             maxResult = findMaxAndMin[n];
            }
            if (findMaxAndMin[n]<minResult) {
                minResult = findMaxAndMin[n];
            }
        }
        System.out.println("Максимальное число цикла = "+maxResult + "; а минимальное = "+minResult);

//Exercise 7 and 8
//Чет не понял как победить два последних
}

    public static int[] createNewArray (int len, int initialValue) {
        int[] arr = new int[len];
        for (int i=0; i<len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}

