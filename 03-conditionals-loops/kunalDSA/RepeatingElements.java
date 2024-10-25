package kunalDSA;

import java.util.Scanner;
import java.util.Arrays;

public class RepeatingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input for the second array
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Find and print repeating elements in sorted order
        System.out.println("Repeating elements in sorted order are:");
        int[] repeatingElements = findRepeatingElements(array1, array2);
        Arrays.sort(repeatingElements);
        for (int num : repeatingElements) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    public static int[] findRepeatingElements(int[] array1, int[] array2) {
        int[] temp = new int[Math.min(array1.length, array2.length)];
        int index = 0;

        for (int i = 0; i < array1.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (array1[i] == array1[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                for (int k = 0; k < array2.length; k++) {
                    if (array1[i] == array2[k]) {
                        temp[index++] = array1[i];
                        break;
                    }
                }
            }
        }

        // Copy the found elements to a new array of the correct size
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}

