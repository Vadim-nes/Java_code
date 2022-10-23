public class OddIndexes {

//    Part 1 Algorithms/ Task 2.Написать алгоритм OddIndices, который принимает массив целых чисел,
//    и возвращает массив значений нечетных индексов
//    Test Data:
//    Input = {-45, 590, 234, 985, 12, 68}
//    Expected Result =  {590, 985, 68}


    public int[] oddIndexes(int[] a) {
        int p = 0;
        int count = 0;
        for (int i = 1; i < a.length; i += 2) {
            count++;
        }

        int[] massive = new int[count];
        for (int i = 1; i < a.length; i += 2) {
            if (i % 2 == 1) {
                massive[p] = a[i];
                p++;
            }
        }
        return massive;
    }
}
