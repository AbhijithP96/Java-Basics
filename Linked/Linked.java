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

    void append(Node p){

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

    void prepend(Node p){

        if(head == null){

            head = p;
        }

        else{

            Node new_node = head;
            head = p;
            head.setNext(new_node);
        }
    }

    void addAtIndex(Node p, int index){

        if(index > size()){

            System.out.println("Index is larger than size!!");
        }
        
        else if(index == size()){

            append(p);
        }

        else if(head == null){

            head = p;
        }

        else if(index == 0){

            prepend(p);
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

    int search(Node p){

        boolean flag = false;
        int pos = 0;
        if(head == null){

            System.out.println("No List Found");
        }

        else{

            
            
            Node current = head;

            while(current != null){

                if(current.getData() == p.getData()){
                    flag = true;
                    break;
                }

                current = current.getNext();
                pos++;
            }

        }
        if(flag)
            return pos;
        
        return -1;
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
