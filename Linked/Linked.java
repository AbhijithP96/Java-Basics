public class Linked {

    Node head;

    Linked(){

        head = null;
    }

    int size(){

        if(head == null){

            return 0;
        }

        else{

            int count = 0;
            Node current = head;

            while(current != null){

                count++;
                current = current.getNext();
            }

            return count;
        }

    }

    void add(Node p){

        if(head == null){

            head = p;
        }

        else{

            Node current = head;

            while(current.getNext() != null){

                current = current.getNext();
            }

            current.setNext(p);
        }
    }

    void addAtIndex(Node p, int index){

        if(index >= size()){

            System.out.println("Index is larger than size!!");
        }
        
        else if(index == size()-1){

            add(p);
        }

        else if(head == null){

            head = p;
        }

        else{

            int pos = index;
            Node current = head;

            while(pos > 1){

                current=current.getNext();
                pos--;
            }
        
            Node new_node = current.getNext();
            current.setNext(p);
            p.setNext(new_node);

        }
        
    }

    void print(){

        if(head == null){
            System.out.println("No list found");
        }

        else{

            String output = "Head";

            Node current = head;

            while(current!=null){

                output = output + "->" + current.getData();
                current= current.getNext();
            }

            System.out.println("List : \n " + output);
        }
    }
    
}
