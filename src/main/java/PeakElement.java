public class PeakElement {
    //    Part 2 Algorithms 10. Написать алгоритм PeakElement,  который принимает на вход массив целых чисел
//    и возвращает значения пиковых элементов (элементы, которые больше своих соседей).
    public int[] peakElement(int[] a) {
        if (a.length > 2) {
            int counter = 0;
            int p = 0;
            int max = a[0];
            if (a[0] > a[1]) {
                counter++;
            }
            for (int i = 1; i < a.length; i++) {

                if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                    counter++;
                }
            }
            if (a[a.length - 1] > a[a.length - 2]) {
                counter++;
            }
            int[] massive = new int[counter];
            if (a[0] > a[1]) {
                massive[p] = a[0];
                p++;
            }
            if (a[a.length - 1] > a[a.length - 2]) {
                massive[p] = a[a.length - 1];
                p++;
            }
            for (int i = 1; i < a.length; i++) {

                if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                    massive[p] = a[i];
                    p++;
                }
            }
            return massive;
        } else if (a.length == 2) {
            int[] massive = new int[1];
            massive[0] = Math.max(a[0], a[1]);
            return massive;
        } else {
            return a;
        }
    }
}
