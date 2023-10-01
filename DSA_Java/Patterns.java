import java.util.*;

class Patterns {
    public static void main(String args[]){

        //--------- Star pyramid pattern ----------------

        // long start = System.nanoTime();
        // for(int i=1;i<500;i++){
        //     for(int k=0;k<i;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // long end = System.nanoTime();
        // long totalTime = (end-start)/1000000;
        // System.out.println(totalTime + "ms");

        // ------------ square pattern ----------------

        // for(int i = 1; i<5; i++){
         
        //         for(int k=1;k<5;k++){
                    
        //             if(i==1 || k==1 || (k==4) || i==4){
        //                 System.out.print("*");
        //             }
        //             else{
        //                 System.out.print(" ");
        //             }
        //         }
        //         System.out.println();
        // }
        

        //-------------- Half pyramid at right side --------------------

        // int n = 7;
        
        // for(int i = 1;i<=n;i++){
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // ---------- Pyramid ---------------------------
        // int n = 7;
        
        // for(int i = 1;i<=n;i++){
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print(" ");
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // -------------- Flyod's Traingle ----------------
        // // 1
        // // 2 3
        // // 4 5 6
        // // 7 8 9 10
        // // 11 12 13 14 15
        // int n =5;
        // int count =0;
        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=i;k++){
        //         count = count + 1;
        //         System.out.print(count);
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        // ----------- 0 - 1 Traingle ------------------
        // int binary = 1;
        // for(int i =0;i<6;i++){
        //     for(int k=0;k<i;k++){
        //         if(binary ==1){
        //             System.out.print(1);
        //             binary = 0;
        //         }
        //         else{
        //             System.out.print(0);
        //             binary =1;
        //         }
        //     }
        //     System.out.println();
        // }

        // ------------ Butter fly pattern ---------------

        // int n =4;
        // for(int i=1;i<=2*n;i++){
        //     System.out.println();
        // }

        
        // ----------- 2D Array ----------------
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Matrix dimensions : (rows) :");
        // int rows =  sc.nextInt();
        // System.out.print("(Columns) :");
        // int col =  sc.nextInt();

        // int[][] matrix2DArray = new int[rows][col];
        // for(int r=0;r<rows;r++){

        //     for(int c=0;c<col;c++){
        //         int r1 = r+1;
        //         int c1 = c+1;
        //         System.out.println("Enter element " + r1 +"," + c1 + " :");
        //         int inpt = sc.nextInt();
        //         matrix2DArray[r][c] = inpt;
        //     }
        // }
        // System.out.println();
        // System.out.println(Arrays.deepToString(matrix2DArray));
        // System.out.println();
        // System.out.println("Search index of number : ");
        // int search = sc.nextInt();
        // for(int r=0;r<rows;r++){
        //     for(int c=0;c<col;c++){
        //         if(search == matrix2DArray[r][c]){
        //             int r1 = r+1;
        //             int c1 = c+1;
        //             System.out.println("Index of the given number is : "+ r1+ "," + c1);
        //         }
        //     }
        // }

        

    }
}