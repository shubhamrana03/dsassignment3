import java.util.*;
public class reverse 
{ 
      
    static void rvereseArray(int arr[], 
                    int start, int end) 
    { 
        int temp; 
           
        while (start < end) 
        { 
            temp = arr[start];  
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; 
            end--; 
        }  
    }      
       
    static void printArray(int arr[],  
                            int size) 
    { 
        for (int i = 0; i < size; i++) 
             System.out.print(arr[i] + " "); 
           
         System.out.println(); 
    }  
  
    public static void main(String args[]) { 
          Scanner in = new Scanner(System.in);
        System.out.println("enter size");

int n1=in.nextInt();
int n2=n1-1;
     
        int arr[] = new int[n1];
for(int i=0;i<n1;i++)
{
 arr[i]=in.nextInt();
 }
        printArray(arr, n1); 
        rvereseArray(arr, 0, n2); 
        System.out.println("Reversed array is \n"); 
        printArray(arr, n1);  
         
    } 
} 
