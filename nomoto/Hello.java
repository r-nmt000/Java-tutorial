package nomoto;
import nomoto.ryusuke.*;

class Hello{
    public static void main(String[] args){
        Test test = new Test();
        test.printTest(args[0]);
        Nomo nomo = new Nomo();
        nomo.printNomo(args[0]);

    }
}

class Test{
    public void printTest(String str){
        System.out.println(str);
    }
}
