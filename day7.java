public class day7 {
    public static void main(String[] args){
        //for each loop
        // int arr[] = {2,3,5,3,8,6};
        // for(int i : arr){
        //     System.out.print(i+" ");
        // }
    
        //2D array
        int arr[][]={{1,2,3},{4,5,6}};
        int row=arr.length;
        int col=arr[0].length;
        System.out.println(+row+" "+col);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
