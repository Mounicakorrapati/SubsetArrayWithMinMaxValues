import java.util.*;

public class Subsets {
  public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
              arr[i] = scan.nextInt();
            }
            int count = 0;
            int temp[]=new int[n];
            int subArr[];
              for (int i = 0; i < (1<<n); i++)
                  {
              for (int j = 0; j < n; j++){
                  if ((i & (1 << j)) > 0){
                    temp[count]=arr[j]; 
                     count++;
                  }
               
              }
              subArr = new int[nonZeroArraySize(temp)];
            subArr = removeZeroes(temp);
            //System.out.println(Arrays.toString(subArr));
            if(subArr.length>=2 && maxArr(subArr)== 9 && minArr(subArr)==2){
              System.out.println("Desired arrays:"+Arrays.toString(subArr));
            }
            temp=new int[n];
            count = 0;
         }
      }
  
  public static int maxArr(int[] arr){
    int value =0;
  for (int i = 0; i < arr.length; i++) {
          if (arr[i] > value) 
              value = arr[i]; 
  }
      return value;  
  }
  public static int minArr(int[] arr)
  {
    int value = maxArr(arr);
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < value) 
          value = arr[i]; 
    }
    return value; 
  }
  
   public static int nonZeroArraySize(int[] arr){
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
          if(arr[i]!=0){
            count++;
          }
  }
    return count;  
  }
  public static int[] removeZeroes(int[] arr){
    int count = 0;
    int[] temp=new int[nonZeroArraySize(arr)];
    for (int i = 0; i < arr.length; i++) {
          if(arr[i]!=0){
            temp[count]=arr[i];
            count++;
          }
  }
    return temp;  
  }
  }
  
