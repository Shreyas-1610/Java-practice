public class StackImpl {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(6);
        s.push(9);
        s.push(12);
        System.out.println("Top of stack is: "+s.top());
        System.out.println("Size of stack: "+s.size());
        System.out.println("The element to be deleted is: "+s.pop());
        System.out.println("Size of stack after deleting: "+s.size());
    }
}
class stack{
    int size = 10000;
    int arr[] = new int[size];
    int top=-1;
    void push(int x){   
        top++;
        arr[top]=x;
    }
    
    int pop(){
        int x = arr[top];
        top--;
        return x;
    }

    int top(){
        return arr[top];
    }

    int size(){
        return top+1;
    }
}
