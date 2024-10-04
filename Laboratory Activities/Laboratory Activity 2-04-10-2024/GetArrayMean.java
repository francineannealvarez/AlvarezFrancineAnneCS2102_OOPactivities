import java.util.Scanner;

public class GetArrayMean {
    public static float getArrayMean (int[] arr){
        if (arr.length == 0){
            return 0;
        }
        
        else{
            float sum = 0;
            for (int i = 0; i < arr.length; i++){
                sum += arr[i];
            }
            float mean = sum/arr.length;
            return mean;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] integers = new int [n];

        for (int i = 0; i < n; i++){
            System.out.print("Enter number: ");
            integers [i] = input.nextInt();
        }

        float mean = getArrayMean(integers);
        System.out.printf("Mean of array is: %.2f%n", mean);

        input.close();
    }
}
