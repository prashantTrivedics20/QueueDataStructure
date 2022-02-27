import java.util.ArrayList;
import java.util.Scanner;
public class RowMajorColumnMajor {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        System.out.println("Enter the row and column");
        int n=readme.nextInt();
        int m=readme.nextInt();
        int arr[][]=new int[n][m];
        ArrayList<Integer> al1=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=readme.nextInt();
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            int s=0;
            int k=0;
            for (int j = 0; j < arr[i].length; j++) {
                s = s + arr[i][j];
                k = k + arr[j][i];
            }
                if(s>=k)
                {
                    al1.add(s);
                }
                else
                {
                    al1.add(k);
                }
            }

        System.out.println(al1);
    }
}
