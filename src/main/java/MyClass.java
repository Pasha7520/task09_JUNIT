import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyClass {
    public MyInterfase myInterfase;
    public List<Integer> list = Arrays.asList(3,4,4,5,6,78,9,0,3);

    public MyClass() {
    }

    public MyClass(MyInterfase myInterfase) {
        this.myInterfase = myInterfase;
    }

    public MyInterfase getMyInterfase() {
        return myInterfase;
    }

    public void setMyInterfase(MyInterfase myInterfase) {
        this.myInterfase = myInterfase;
    }

    public double add(double input1, double input2){
        return myInterfase.add(input1,input2);
    }
    public double subtract(double input1, double input2){
        return myInterfase.subtract(input1,input2);
    }
    public double multiply(double input1, double input2){
        return myInterfase.multiply(input1,input2);
    }
    public double divide(double input1, double input2){
        return myInterfase.divide(input1,input2);
    }
    public double bigger(double input1,double input2){
        return myInterfase.bigger(input1,input2);
    }
    public void printList(List<Integer> list) throws Exception {
        for(Integer integer: list){
            System.out.println(integer);
        }
        if(list.isEmpty()){
                throw new Exception();

        }
    }
}
