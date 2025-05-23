public class day19 {
    public static void main(String[] args){
        // insertion sort
        int[] arr = {5, 2, 9, 1, 5, 6};
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0&&arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }









        
    }
}
