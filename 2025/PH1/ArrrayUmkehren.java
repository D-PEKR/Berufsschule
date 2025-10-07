package PH1;

public class ArrrayUmkehren {

	public static void main(String[] args) {

        double[] original = {1, 2, 3, 4, 5};
        double[] reversed = reverseArray(original);

        for (double num : reversed) {
            System.out.print(num + " ");
        }

    }

    public static double[] reverseArray(double[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            double temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
        return array;
    }
}
