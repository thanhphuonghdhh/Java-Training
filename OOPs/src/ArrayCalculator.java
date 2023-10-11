public class ArrayCalculator {
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double sumOfArray(double[] arr) {
        double sum = 0;
        for (int i = 0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int maxOfArray(int[] arr) {
        int m=arr[0];
        for (int i=1;i<arr.length;i++){
            if (m<arr[i]) {
                m=arr[i];
            }
        }
        return m;
    }

    public static double maxOfArray(double[] arr) {
        double m=arr[0];
        for (int i=1;i<arr.length;i++){
            if (m<arr[i]) {
                m=arr[i];
            }
        }
        return m;
    }

    public static int minOfArray(int[] arr) {
        int m=arr[0];
        for (int i=1;i<arr.length;i++){
            if (m>arr[i]) {
                m=arr[i];
            }
        }
        return m;
    }
    public static double minOfArray(double[] arr) {
        double m=arr[0];
        for (int i=1;i<arr.length;i++){
            if (m>arr[i]) {
                m=arr[i];
            }
        }
        return m;
    }
}
class Entr {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 3, 4, 2 };
        double[] arr2 = new double[] { 1.3, 4.2, 6.7 };

        System.out.println(ArrayCalculator.minOfArray(arr1));
        System.out.println(ArrayCalculator.minOfArray(arr2));
        System.out.println(ArrayCalculator.maxOfArray(arr1));
        System.out.println(ArrayCalculator.maxOfArray(arr2));
    }
}