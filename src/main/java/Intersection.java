public class Intersection {

//    Part 2 Algorithms 9. 	Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и
//    возвращает массив общих элементов.

public int[] intersection(int[] a, int[] b) {
    int count = 0;
    int p = 0;
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < b.length; j++) {
            if (a[i] == b[j]) {
                count++;
            }
        }
    }
    int[] massive = new int[count];
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < b.length; j++) {
            if (a[i] == b[j]) {
                massive[p] = a[i];
                p++;
            }
        }
    }
    return massive;
}

}
