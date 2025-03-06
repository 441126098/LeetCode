public class Father {


    private void Pri(){
        System.out.println("private方法");
    }

    void Pub(){
        this.Pri();
    }

}
