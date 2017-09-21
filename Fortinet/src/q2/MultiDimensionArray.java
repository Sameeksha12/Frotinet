package q2;
public class MultiDimensionArray {

   // This is a provided function, Assume it works
    public static Long getValue(int... indexOfDimension) {
        //... 
        //return value;
     return 100L;
    }
    // lengthOfDeminsion: each dimension's length, assume it is valid: lengthOfDeminsion[i]>0.
    public static Long sum(MultiDimensionArray mArray, int[] lengthOfDeminsion) { 
   
   // Time complexity: O(n)  
   // Space complexity: O(1)
     
     long sum = 0L;
     int n = lengthOfDeminsion.length - 1;     
     while (n >= 0){      
      do {
       lengthOfDeminsion[n] --;
       sum += getValue(lengthOfDeminsion); 
       //System.out.println(sum);       
      }while (lengthOfDeminsion[n] > 0);      
      n--;
     }     
        return sum;     
    }
     
    public static void main(String args[]){
     int a[] = new int[2];
     a[0] = 3 ;
     a[1] = 2;
     System.out.println("final = " + sum(new MultiDimensionArray(), a));
    }
}