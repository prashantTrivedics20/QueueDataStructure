import java.util.Scanner;
public class QueueByLinkedList {
    class node
    {
        String data;
        node next;
    }
    class QueueLink
    {
        node front;
        node rear;
        int size;
       public  void  enqueue(String val)
        {
            if (size == 0) {
                node temp = new node();
                temp.data = val;
                temp.next = null;
                front = rear = temp;
                size++;
            } else {
                node temp = new node();
                temp.data = val;
                temp.next = null;
                rear.next = temp;
                rear = temp;
                size++;
            }
        }
        public  void  dequeue()
        {
            if(size==0)
            {
                System.out.println("underflow");
                return;
            }
            else
            {
                System.out.println(front.data+" ");
                front=front.next;
            }
        }
    }
    public static void main(String[] args) {
        QueueByLinkedList obj=new QueueByLinkedList();
        QueueByLinkedList.node Node=obj.new node();
        QueueByLinkedList.QueueLink link=obj.new QueueLink();
        for (int i = 0; i <5 ; i++) {
            String val=args[i];
            String str1="";
            String str2="";
            for (int j = 0; j <val.length(); j++) {
                int check=(int)val.charAt(j);
                if(check%2==0)
                {
                    str1=str1+val.charAt(j);
                }
                else
                {
                    str2=str2+val.charAt(j);
                }

            }
            String str3=str1+str2;
            link.enqueue(str3);
        }
        for (int i = 0; i <5 ; i++) {
            link.dequeue();
        }




    }

}

