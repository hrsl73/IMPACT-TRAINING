import java.util.*;
public class day8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        // jagged array
        // int[][] arr = new int[5][];
        // arr[0] = new int[3];
        // arr[1] = new int[4];
        // arr[2] = new int[2];
        // arr[3] = new int[5];
        // arr[4] = new int[1];
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        //     }

        //Searching algorithms
        //1.Lineatr search
        //2.binary search

        //binary search
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        int start = 0;
        int end = arr.length-1;
        boolean found = false;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                found = true;
                break;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        if(found){
            System.out.println("Element found at index: " + (start+end)/2);
        }
        else{
            System.out.println("Element not found");
        }



        

    }
}
