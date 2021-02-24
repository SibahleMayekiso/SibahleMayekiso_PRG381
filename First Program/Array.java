public class Array {
    public static void main(String[] args) {
        ///Array declaration

        //int intArray[];
        //intArray = new int[20];

        //int[] intArray;
        //int[] intArray = new int[10];

        int intArray[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("The array length is: ");
        System.out.print(intArray.length);

        //
        int[] arr;

        arr = new int[5];

        arr[0] = 10;
        arr[1] = 30;
        arr[2] = 40;
        arr[3] = 50;
        arr[4] = 60;

        for(int i = 0 ; i < arr.length; i++){
            System.out.println("Element " + "i : " + arr[i]);
        }

    }
}
