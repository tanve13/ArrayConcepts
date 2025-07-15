public class MergedSortedArray{
      public static void main(String[] args) {
          int arr1[]={1,2,3};
           int arr2[]={7,8,9};
           int arrSorted[]= new int[arr1.length+arr2.length];
           int i=0,j=0,k=0;
           while(i<arr1.length && j<arr2.length){
             if(arr1[i]<arr2[j]){
                arrSorted[k++] = arr1[i++];
              }else{
                  arrSorted[k++] = arr2[j++];
               }

            }
            while(i<arr1.length){
              arrSorted[k++] = arr1[i++];
            }
            while(j<arr2.length){
              arrSorted[k++] = arr2[j++];
              
            }
            for(int var: arrSorted){
              System.out.print(var+",");
            }
   }
}