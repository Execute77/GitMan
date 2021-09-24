import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

public class Arrays {
    static int i=1;
    public static void main(String args[]){
        Collection<IsPass> collection = new ArrayList<>();
        IsPass isVoter1 = new IsPass("Reema",98);
        IsPass isVoter2 = new IsPass("Raj",71);
        IsPass isVoter3 = new IsPass("Kajol",37);
        IsPass isVoter4 = new IsPass("Ravi",47);
        IsPass isVoter5 = new IsPass("Varun",17);
        collection.add(isVoter1);
        collection.add(isVoter2);
        collection.add(isVoter3);
        collection.add(isVoter4);
        collection.add(isVoter5);
        //removes all the elements which satisfies the Predicate filter
        Predicate<IsPass> pr= (IsPass voter) ->(voter.marks < 45);
        collection.removeIf(pr );
        System.out.println(" People who passed the exam : ");
        for (IsPass xyz : collection ){
            System.out.println(i++ +". "+xyz);
        }


    }
}

class IsPass {
    String name;
    int marks;
    public IsPass(String name, int age) {
        this.name = name;
        this.marks = age;
    }
    public String toString() {
        return this.name + "  has passed the exam with " + this.marks +" marks.";
    }
}
