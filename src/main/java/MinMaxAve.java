public class MinMaxAve {
    //    Part 2 Algorithms 8.	Написать алгоритм MinMaxAve, который принимает массив чисел int[]
//    и 2 значения индексов. Алгоритм возвращает массив, который содержит минимальное значение,
//    максимальное значение,  и среднее среди всех значений между 2-мя индексами.
//
//    Test Data:
//            ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
    public int[] minMaxAve(int[] a, int one, int two) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;
        if (one >= 0 && two >= 0) {
            for (int i = 0; i < a.length; i++) {
                if (one <= two && i >= one && i <= two) {
                    max = Math.max(max, a[i]);
                    min = Math.min(min, a[i]);
                    count++;
                    sum += a[i];
                } else if (one > two && i <= one && i >= two) {
                    max = Math.max(max, a[i]);
                    min = Math.min(min, a[i]);
                    count++;
                    sum += a[i];
                }
            }
            int[] massive = {min, max, sum / count};
            return massive;
        } else {
            return new int[0];
        }
    }
}
