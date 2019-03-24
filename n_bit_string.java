import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class n_bit_string {
    public  void binary(char arr[],int n)
    {
        if(n<1)
            System.out.println(arr);
        else
        {
            arr[n-1]='0';
            binary(arr,n-1);
            arr[n-1]='1';
            binary(arr,n-1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of inputs in the string");
        int p = sc.nextInt();
        char arr[] = new char[p];
        n_bit_string ob = new n_bit_string();
        ob.binary(arr,p);

    }
}

