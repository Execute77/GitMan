import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StraemsDemo {

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(7);
        ints.add(8);
        ints.add(9);
        ints.add(1);
        ints.add(3);
        ints.add(89);
        ints.add(90);
        
        //This is for develop branch

       Optional<Integer> min = ints.stream().min(Integer::compare);



        List<Integer> abc = ints.stream().sorted().filter(n -> ((n % 2) ==0)).collect(Collectors.toList());
        System.out.println(abc);
    }
}


