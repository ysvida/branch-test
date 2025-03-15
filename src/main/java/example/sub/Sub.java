package example.sub;

import example.data.Data;

public class Sub {

    public void sayHello() {
        System.out.println(Data.helloMessage());
    }

    public void sayBye() {
        System.out.println(Data.byeMessage());
    }

    public void sayMerge() {
        // merged
        System.out.println(Data.mergeMessage());
    }

    public void sayRebase() {
        // merged from rebase2
        System.out.println(Data.rebaseMessage());
    }

}
