public class MyStack{


    int[]value = new int[1000];
    int loc=0;
    int min = Integer.MAX_VALUE;

    public void push(int x) {
        this.value[loc++] = x;
        if (x<min)
            this.min = x;
    }

    public int pop() {
         return this.value[--loc];
    }

    public int min(){
        return this.min;
    }

}
