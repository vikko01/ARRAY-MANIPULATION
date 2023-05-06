import java.util.Scanner;

public class RepetationInArray {

    static int firstOccurence(int arr[]){

        int n = arr.length;

        int ans = 0;

        for ( int i = 0 ; i < arr.length ; i ++){

            for ( int j = i+1 ; j < arr.length ; j++){

                if ( arr[i] == arr[j] ){

                    ans++;

                 }

                 else{
                    return -1 ;
                 }
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the size of the array ");

        int n = sc.nextInt();

        System.out.println(" enter the " + n + " elements of the array ");

        int arr[] = new int [n];

        for ( int i = 0 ; i < arr.length ; i++){

            arr[i] = sc.nextInt();

        }

        System.out.println(" FIRST OCCURENCE IN THE ATRRAY " + " = " + firstOccurence(arr));
    }
    
}
