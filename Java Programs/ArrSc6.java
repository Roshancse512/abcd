import java.util.Scanner;

public class ArrSc6 {

    public static void main(String[] args) {

      // Inseraton
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Enter the position at which the element should be inserted:");
        int location = scan.nextInt();

        System.out.println("Enter Value of the element ");
        int value = scan.nextInt();
        for(int i=array.length-1;i>location;i--)
        {
            array[i]=array[i-1];

        }
        array[location]=value;
        for(int x : array)
        {
          System.out.println(x);
        }
      }
    }

