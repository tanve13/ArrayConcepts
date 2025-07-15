import java.util.Arrays;
public class RotateArray{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k = 2;
        int n=arr.length;
        int temp[] = new int[arr.length];
        System.out.println("Original Array is:"+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            temp[(i+k)%n] = arr[i];
                    int result = arr.length;
                 System.out.print(""+Arrays.toString(temp));
             
        }
    }
}