public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2; 
        }
        //If you want to print all elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}