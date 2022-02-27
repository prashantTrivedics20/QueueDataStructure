// question-> asked in amazon (maximum pair,minimum pair of array)
class queByArray{
    ar arr2[];
    int front, rear;
    public queByArray(int size){
        arr2 = new ar[size];
        front = rear =-1;
    }
    public boolean isEmpty(){
        return front==-1;
    }
    public boolean isFull(){
        return rear == arr2.length-1;
    }
    public void enQueue(ar a){
        if (isFull())
            System.out.println("Overflow");

        else if (isEmpty()){
            front = rear =0;
            arr2[rear] = a;
        }

        else {
            rear++;
            arr2[rear]=a;
        }

    }
    public void disp(){
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i].a + "    "+arr2[i].b);
            System.out.println();
        }
    }
}

class ar{
    int a;
    int b;
    ar(int a,int b){
        this.a = a;
        this.b = b;
    }
}
class Array1 {
    public static void main(String[] args) {
        int arr[] = {1,5,3,8,6,4};
        int max=0,min =0,a=0,b=0,c=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                c = arr[i]*arr[j];
                if (c> max){
                    a=arr[i];
                    b=arr[j];
                    max =c;
                }
            }
        }
        queByArray q = new queByArray(2);
        q.enQueue( q.arr2[0] = new ar(a,b));

        // Min pair.
        min = a*b;
        a=0;b=0;c=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                c = arr[i]*arr[j];
                if (c < min){
                    a=arr[i];
                    b=arr[j];
                    min =c;
                }
            }
        }
        q.enQueue( q.arr2[1] = new ar(a,b));
        q.disp();
    }
}