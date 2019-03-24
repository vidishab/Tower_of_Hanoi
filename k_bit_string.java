import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class k_bit_string {
    int arr[];
    public  void binary1(int arr[],int n,int k)
    {
        if(n<1)
            System.out.println(Arrays.toString(arr));
        else
        {
            for (int j=0;j<k;j++)
            {
                arr[n-1]= j;
                binary1(arr,n-1,k);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of inputs in the string");
        int p = sc.nextInt();
        System.out.println("Enter the number of k-array value");
        int q = sc.nextInt();
        int arr[] = new int[p];
        k_bit_string ob = new k_bit_string();
        ob.binary1(arr,p,q);

    }
}

