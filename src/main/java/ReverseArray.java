public class ReverseArray {
//    Part 2 Algorithms 11.	 Написать алгоритм ReverseArray, который принимает на вход массив целых чисел,
//    и возвращает “перевернутый” массив.
//    Test Data:
//    {2, 7, 3, 10} → {10, 3, 7, 2}
    public int[] reverseArray (int[] a) {
        int p = 0;
        int[] reverse = new int[a.length];
        for (int i = a.length-1; i >= 0; i--) {
            reverse[p] = a[i];
            p++;
        }
        return reverse;
    }

}
