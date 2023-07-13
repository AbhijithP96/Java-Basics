import java.util.Random;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        
        Linked ob = new Linked();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size");
        int size = sc.nextInt();

        if(size <= 0){

            System.out.println("Enter number greater than zero");
        }

        else{

            System.out.println("Enter lower bound");
            int lb = sc.nextInt();
            System.out.println("Enter upper bound");
            int ub = sc.nextInt();

            Random r = new Random();

            for(int i =0; i<size; i++){

                ob.append(new Node(r.nextInt((ub-lb)+1)+lb));
            }
        }

        System.out.println(ob.size());
        
        ob.print();

        System.out.println("Enter Index");
        int index = sc.nextInt();
        System.out.println("Enter Value");
        int val = sc.nextInt();

        ob.addAtIndex(new Node(val), index);

        System.out.println(ob.size());
        
        ob.print();

        System.out.println("Enter value to Search");
        int search = sc.nextInt();

        if(ob.search(new Node(search)) == -1)
            System.out.println("No element found");
        else
            System.out.println("Element found at Index :" + ob.search(new Node(search)));
        
    }
    
}
