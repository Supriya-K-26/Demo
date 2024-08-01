import java.util.Arrays;
import java.util.Scanner;

public class SortTheArray {

    public static void main(String []args)
    {
        //Scanner input=new Scanner(System.in);
        /*int n= input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int elements=input.nextInt();
            arr[i]=elements;
        }
        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }*/
        //String theWord= input.nextLine();
        reverseTheWord("Music is life");
    }

    public static void reverseTheWord(String value)
    {
        String arr[]=value.split(" ");
        for(String res:arr)
        {
            System.out.println(res);
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }

}
