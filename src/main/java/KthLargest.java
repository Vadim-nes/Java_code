public class KthLargest {
    //13. Написать алгоритм KthLargest, который принимает на вход массив целых чисел и число k,
//    и возвращает k-тый максимальный элемент.
//    Test Data:
//    ({4, 3, 7, 13, 5, 2, 9, 4, 12}, 3) → 9
//    (13 и 12 - первый и второй самые большие элементы, а метод возвращает 9,
//    как третий самый большой элемент)
    public static  String kthLargest(int[] a, int k) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        int res = 0;
        if (k >= 0 && k <= a.length) {
            for (int j = 0; j < k ; j++) {

                for (int i = 0; i < a.length; i++) {
                    if (max < a[i]) {
                        max = a[i];
                        index = i;
                    }
                }
                res = max;
                a[index] = Integer.MIN_VALUE;
                max = Integer.MIN_VALUE;
            }
            return String.valueOf(res);
        } else {
            return "Error";
        }
    }
}
