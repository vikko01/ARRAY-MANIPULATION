import java.util.Scanner;

public class RepeatingNumber {

    static int firstRepeatingNumber ( int arr[]){

        int n = arr.length;

        for( int i = 0 ; i < arr.length ; i++){ // FIRST NUMBER 
        
        for( int j = i+1 ; j < arr.length ; j++){ //SECOND NUMBER

            if( arr[i] == arr[j]){ //FOUND ANSWER

                return arr[i];
            }
        }

        }

        return -1;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the size of the array ");

        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println(" enter the " + n + " " + " elements of the array ");

        for ( int i = 0 ; i < arr.length ; i++){

            arr[i] = sc.nextInt();
        }

        System.out.println(" REPEATED NUMBER IN THE ARRAY " + " = " + firstRepeatingNumber(arr));
    }
    
}
