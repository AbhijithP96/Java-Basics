class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }

    void setData(int d){

        this.data = d;
    }

    void setNext(Node p){

        this.next = p;
    }

    int getData(){

        return this.data;
    }

    Node getNext(){

        return this.next;
    }
}