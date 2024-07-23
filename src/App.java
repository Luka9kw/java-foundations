public class App {
    static String hello = "Luka";
    public static void main(String[] args) {
        String name = add();
        String hello = "Hello" + name + " welcome to World!";
        System.out.println(hello);
    }

  static  String add(){
         return hello;
    }
}
