public class OddEvenElementsInArray {
    //    3.	В классе OddEvenElementsInArray написать метод createOddEvenArray(),
//    который принимает массив целых случайных чисел, и возвращает двумерный массив
//    (массив четных и массив нечетных чисел)
    public int[][] createOddEvenArray(int[] a) {
        int countodd = 0;
        int counteven = 0;
        int oddnum = 0;
        int evennum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                counteven++;
            } else if (a[i] % 2 == 1) {
                countodd++;
            }
        }
        int[] even = new int[counteven];
        int[] odd = new int[countodd];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && even[evennum] < counteven) {
                even[evennum] = a[i];
                evennum++;
            } else if (a[i] % 2 == 1 && odd[oddnum] < countodd) {
                odd[oddnum] = a[i];
                oddnum++;
            }
        }
        int[][] res = {odd, even};
        return res;
    }
}

