import java.util.Scanner;
public class day4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean binary = true;
        for (int i=1;i<=n;i++){
            for (int j=1;j<i-1;j++){
                if (binary){
                    System.out.print("1");
                    binary = false;
                }
                else{
                    System.out.print("0");
                    binary = true;
                }
            }
            System.out.println();
        }

        
        // for(int i=1;i<=n;i++){
        //     if (i%2==1){
        //         for (int j=1;j<=i;j++){
        //             if (j%2==1){
        //                 System.out.print("1");
        //             }
        //             else{
        //                 System.out.print("0");
        //             }
        //         }
        //     }
        //     else{
        //         for (int j=1;j<=i;j++){
        //             if (j%2==0){
        //                 System.out.print("1");
        //             }
        //             else{
        //                 System.out.print("0");
        //             }
        //         }      
        //     }
        //     System.out.println();
        // }


        
        // for(int i=1;i<=n;i++){
        //     for (int j=i;j<=n-1;j++){
        //         System.out.print(j);
        // }
        // System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=i;j<=n;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // int count =1;
        // for (int i=1;i<=n;i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print(count+ " ");
        //         count++;
        //     }
        //     System.out.println();
        // }

        // square pattern
    //     for (int i=1;i<=n;i++){
    //         if (i==1 || i==n){
    //             for (int j=1;j<=n;j++){
    //                 System.out.print("* ");
    //             }
    //         }
    //         else{
    //             for (int j=1;j<=n;j++){
    //                 if (j==1 || j==n){
    //                     System.out.print("* ");
    //                 }
    //                 else{
    //                     System.out.print("  ");
    //                 }
    //         }
    //     }
    //     System.out.println();
    // }
    }
}
