// import java.util.Arrays;
import java.util.Scanner;
public class day12 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // String s = "Hello   World";
        // String[] words = s.trim().split(" ");
        // System.out.println(Arrays.toString(words)); // Output: ["Hello", "", "", "World"]

        
        // String[] worrds = s.trim().split("\\s+");
        // System.out.println(Arrays.toString(worrds)); // Output: ["Hello", "World"]

        // String[] worrrds = s.split("\\s+"); // ["", "Hello", "World", ""] — 4 elements!
        // System.out.println(Arrays.toString(worrrds)); // Output: ["", "Hello", "World", "

        // String []wordds = s.split(" ");
        // System.out.println(Arrays.toString(wordds)); // Output: ["Hello", "World"]

        // sorting
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // bubble sort
        // for(int i=0;i<n-1;i++){
        //     boolean swapped = false;
        //     for(int j=0;j<n-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp= arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //             swapped = true;
        //         }
        //     }
        //     if(swapped == false){
        //         break;
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+ " ");
        // }


        // selection sort
        // for(int i=0;i<n-1;i++){
        //     int minIndex = i;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]<arr[minIndex]){
        //             minIndex = j;
        //         }
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[minIndex];
        //     arr[minIndex] = temp;
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+ " ");
        // }

        sc.close();
    }
    
}
