package project_utils;

public class Utils {

    public static void toNumbersWithStep(int start, int end, int step) {

        int startuse = 0;
        if (start != 0 && end != 0 && step > 0 && startuse <= end) {

            for (int i = start; i <= end; i++) {
                if (i % step == 0) {
                    startuse = i;
                    break;
                }
            }
            for (int i = (int) startuse; i <= end; i += step) {
                System.out.println(i);
            }

        } else if (start != 0 && end != 0 && step > 0 && startuse > end) {

            for (int i = start; i >= end; i--) {
                if (i % step == 0) {
                    startuse = i;
                    break;
                }
            }
            for (int i = (int) startuse; i >= end; i -= step) {
                System.out.println(i);
            }
        }
    }
}
