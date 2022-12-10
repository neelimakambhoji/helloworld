package assgnments.arrays;

public class Example1 {
    public static void main(String[] args) {
        // array, you should initialize with number when you create an array(0 based)
        int[] intArray = new int[100];

        for(int i = 0; i < 100; i++) {
            intArray[i] = i + 1;
        }
        for(int i = 0; i < 100; i++) {
            System.out.println(intArray[i]);
        }

        String[] weeks = new String[7];
        for(int i = 0; i < 7; i++) {
            if (i == 0) {
                weeks[i] = "MONDAY";
            }
            if (i == 1) {
                weeks[i] = "TUESDAY";
            }
            if (i == 2) {
                weeks[i] = "WENESDAY";
            }
            if (i == 3) {
                weeks[i] = "THURSDAY";
            }
            if (i == 4) {
                weeks[i] = "FRIDAY";
            }
            if (i == 5) {
                weeks[i] = "SATURDAY";
            }
            if (i == 6) {
                weeks[i] = "SUNDAY";
            }
        }
        for(int i = 0; i < 7; i++) {
            System.out.println(weeks[i]);
        }
    }
}
