package selectionsort;

/**
 *
 * @author marck
 * This is a simple algorithm to order an array of numbers
 */
public class SelectionSort {
   //Main method
   public static void main(String[] args) {
      //This first array has all the non sorted integers the method soSelectionSort will need
      int[] arr1 = {10,34,2,56,7,67,88,42};
      //This array will receive the ordered sequence
      int[] arr2 = SelectionSort(arr1);
      
      System.out.println("Original numbers: ");
      //This 'for' loop prints the original and non ordered sequence
      for(int i:arr1){
         System.out.print(i);
         System.out.print(", ");
      }
      //This 'for' loop prints the new ordered sequence
      System.out.println("Ordered numbers: ");
      for(int i:arr2){
         System.out.print(i);
         System.out.print(", ");
      }
   }
   
   public static int[] SelectionSort(int[] arr){
      for (int i = 0; i < arr.length - 1; i++){
         int index = i;
         for (int j = i + 1; j < arr.length; j++)
            if (arr[j] < arr[index]) 
               index = j;
               int smallerNumber = arr[index];  
               arr[index] = arr[i];
               arr[i] = smallerNumber;
         }
         return arr;
   }
}