package classes;

public class Queue {

    private Node front, rear;

    //constructor initialize both nodes as null
    public Queue() { front = rear = null;}

    public boolean isEmpty() {

        return front == null && rear == null;

    }

    public void enqueue (int data){

        Node newNode = new Node(data);

        //In case of an empty queue, the new node is both front and rear
        if (rear == null){
            front = rear = newNode;
        }

        //Before changing the queue's rear, we point it using rear.next for example
        //(1,2). when we enqueue 3 it looks like 2 -> 3.
        //and as it is connected to the queue we change rear's value to match the new data.
        rear.next = newNode;
        rear = newNode;
    }

    public void dequeue() throws Exception{

        if (isEmpty()){throw new Exception("Empty queue.");}

        Node aux = front;
        front = front.next;

        //if there's only one element left in the queue, we simply attribute null to rear
        // since front already is null.
        if (front == null){
            rear = null;
        }
    }

    public int getFront() throws Exception{

        if (isEmpty()){
            throw new Exception("Empty queue.");
        }

        return front.data;
    }

    public int getRear() throws Exception {

        if (isEmpty()){
            throw new Exception("Empty queue.");
        }

        return rear.data;
    }
}
