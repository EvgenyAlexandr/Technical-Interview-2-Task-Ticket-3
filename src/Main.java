public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Значения массива - Оригинал");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int[] arr2 = reversArr(arr);
        System.out.println("\nЗначения массива - Реверс");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }

    public static int[] reversArr (int[] original) {

        if (original == null) return null;

        int[] revers = new int[original.length];

        for (int i=0; i<original.length; i++) {
            revers[i] = original[original.length-i-1];
        }
        return revers;
    }
}