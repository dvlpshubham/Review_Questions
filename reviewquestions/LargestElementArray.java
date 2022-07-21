package reviewquestions;

public class LargestElementArray {
    public static void main(String[] args) {
        int[] arr = new int[]{23,14,56,41,36};
                int max=arr[0];

        for (int i=0; i<arr.length; i++) {
            if (arr[i]>max)
                max = arr[i];

        }
        System.out.println("Largest Element present in the array :" + max);
    }
}
