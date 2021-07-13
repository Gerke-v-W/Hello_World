public class HelloWolrd {
    static public void main(String[] args){
        System.out.println("Hello world");
        System.out.println("Test it again");
        Test test = new Test();
        test.printLine();
        System.out.println(test.multiply(6, 3));
        test.printAnotherLine();
    }
}
