import java.util.Random;
import java.util.Scanner;

public class Run {

    static Linked ob = new Linked();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int rc=0;

        do{
           
            System.out.println("Linked List \n Select an Operation to continue");
            System.out.println(" 1.Create a List \n 2.Size of the List \n 3.Insert At Given Index \n 4.Append \n 5.Prepend \n 6.Search \n 7.Delete \n 8.Get Node At index \n 9.Sort \n 10.Print");
            int option = sc.nextInt();

            switch (option) {
                case 1:create();
                    
                    break;
                
                case 2:System.out.println("The Size of the List is : " + ob.size()); 

                    break;

                case 3: insert();

                    break;

                case 4:System.out.println("Enter Value");
                        int val = sc.nextInt();
                        ob.append(new Node(val));
                
                    break;
                
                case 5:System.out.println("Enter Value");
                        int value = sc.nextInt();
                        ob.prepend(new Node(value));
                    
                    break;
                
                case 6:System.out.println("Enter value to Search");
                        int search = sc.nextInt();
        
                        if(ob.search(new Node(search)) == -1)
                            System.out.println("No element found");
                        else
                            System.out.println("Element found at Index :" + ob.search(new Node(search)));

                    break;

                case 7:System.out.println("Enter Value to delete");
                        int del = sc.nextInt();
        
                        ob.delete(new Node(del));
                    
                    break;

                case 8:System.out.println("Enter Index");
                        int index = sc.nextInt();
                        Node p = ob.getNode(index);
                        System.out.println("Value at given Index: " + p.getData());

                    break;
                

                case 9:QuickSort qk = new QuickSort(ob);
                        qk.sort(ob, 0, ob.size()-1);
                        System.out.println("List Sorted");

                    break;
                case 10: ob.print();

                    break;

                default:System.out.println("Wrong Input");
                
            
                
            }

            System.out.println(" Do you want to continue \n 1.Yes \n 2.No");
            rc=sc.nextInt();

        }while(rc==1);
        
        
        
    }

    static void create(){

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

            if(lb>=ub)
                System.out.println("Lower bound is larger than upper bound");
            else{

                Random r = new Random();

                for(int i =0; i<size; i++){

                    ob.append(new Node(r.nextInt((ub-lb)+1)+lb));
                }
            }
        }
    }

    static void insert(){

        System.out.println("Enter Index");
        int index = sc.nextInt();
        System.out.println("Enter Value");
        int val = sc.nextInt();

        ob.insert(new Node(val), index);

    }
    
}
