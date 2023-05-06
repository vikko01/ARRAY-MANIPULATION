import java.util.Scanner;

public class max {

    static int FindMax( int arr []){

        int mx = Integer.MIN_VALUE;

        for( int i = 0 ; i < arr.length ; i++){

            if( arr[i] > mx){

                mx = arr[i];

            }
        }

        return mx;
    }

    static int findSecondMax( int arr[]){

        int mx = FindMax(arr);

        for ( int i = 0 ; i < arr.length ; i++){

            if(arr[i] == mx){

                mx = Integer.MIN_VALUE;
            }
        }

        int Secondmx = FindMax(arr);

        return Secondmx;
    }

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.println(" enter the size of the array ");

        int n = sc.nextInt();
        
        int arr [] = new int[n];

        System.out.println(" enter the " + n + " elements of the array ");

        for ( int i = 0 ; i < arr.length ; i++){

            arr[i] = sc.nextInt();

        }

        System.out.println(" second MAX element " + "  " + findSecondMax(arr));
    }
    
}
