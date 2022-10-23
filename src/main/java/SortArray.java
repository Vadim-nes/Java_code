public class SortArray {
    //    12.	Написать алгоритм SortArray, который принимает на вход массив целых чисел,
//    и сортирует элементы массива в порядке возрастания.
//    Test Data:
//    {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
    public static int[] sortArray(int[] a) {
        int max = Integer.MIN_VALUE;
        int p = a.length - 1;
        int maxindex = 0;
        int[] mintomax = new int[a.length];

        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length; i++) {
                if (max < a[i] && p >= 0) {
                    max = a[i];
                    maxindex = i;
                }
            }
            mintomax[p] = max;
            p--;
            a[maxindex] = Integer.MIN_VALUE;
            max = Integer.MIN_VALUE;

        }
        return mintomax;
    }

}

