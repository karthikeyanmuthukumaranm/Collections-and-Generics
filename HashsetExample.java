import java.util.HashSet;

public class HashsetExample {
    public static void main(String[] args){
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("java");
        hashSet.add("python");
        hashSet.add("java");

        System.out.println(hashSet);
    }
}
