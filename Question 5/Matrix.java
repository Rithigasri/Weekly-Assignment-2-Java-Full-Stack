import java.sql.Array;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args)
    {
        int r1,c1,r2,c2;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter row and columns of matrix1: ");
        r1=scan.nextInt();
        c1=scan.nextInt();
        System.out.println("Enter row and column of matrix2: ");
        r2=scan.nextInt();
        c2=scan.nextInt();

        int arr1[][]=new int[r1][c1];
        int arr2[][]=new int[r2][c2];
        int sum[][]=new int[r1][c1];

        System.out.println("Enter matrix1 elements: ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
                arr1[i][j]=scan.nextInt();
        }
        System.out.println("Enter matrix2 elements: ");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
                arr2[i][j]=scan.nextInt();
        }

        if(r1!=r2 && c1!=c2)
            System.out.println("Matrices cannot be added");
        else{
            System.out.println("Addition of two matrices:");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {   sum[i][j]=arr1[i][j]+arr2[i][j];
                    System.out.print(sum[i][j]+" ");
                }
                System.out.println();
            }
        }

        System.out.println("Multiplication of two matrices: ");
        if(r2!=c1)
        {
            System.out.println("Multiplication not possible");
            return;
        }



        int arr3[][] =new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < r2; k++)
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
            }
        }

        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
                System.out.print(arr3[i][j]+" ");
            System.out.println();
        }


    }
}
