public class MissingNumber{
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};
        int sum = 0, n=arr.length+1, total;
        for(int i=0;i<arr.length;i++){
           sum += arr[i];
        }
        total =  (n * (n+1)/2)-sum;
        System.out.println("Missing Number is: "+total);
    }
}