public class Lambda {

    public static void main(String[] args) {
       int num=10;

       Myfunc var = (n -> {
           int m = n+num;
           return m;
       });

        System.out.println("the nuber is "+ var.func(7));
        System.out.println(Integer.compare(9, 7));
    }
}

interface Myfunc{
    int func(int n);
}
