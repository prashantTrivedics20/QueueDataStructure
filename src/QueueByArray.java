import java.util.Scanner;

public class QueueByArray {
    int  arr[];
    int head;// or we can say front
    int tail;// or we can say rear
    public QueueByArray(int size)
    {
        arr=new int[size];

        head=tail=-1;
    }
    public boolean isEmpty()
    {
        if(tail==-1)
        {
            return true;
        }
        return false;
    }
    public boolean isFull()
    {
        if(tail==arr.length-1)
        {

            return true;
        }
        else
        {
            return false;
        }
    }
    // enqueue operation
    public  void enqueue(int  val)
    {
        if(isFull())
        {
            System.out.println("overflow");
        }
        else if(isEmpty())
        {
            head=tail=0;
            arr[tail]=val;

        }
        else
        {
            tail++;
            arr[tail]=val;

        }
    }
    // dequeue operation
    public  void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("underflow");
        }
        else
        {
            //System.out.println(head);

            System.out.println(arr[head]);
            arr[head]=0;
            head++;
        }
        if(head>tail)
        {
            head=tail=-1;
        }

    }
    public void display()
    {
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
class test
{
    public static void main(String[] args) {
        QueueByArray obj=new QueueByArray(5);
        Scanner readme=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            obj.enqueue(readme.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            obj.dequeue();
        }
        obj.display();



    }
}
