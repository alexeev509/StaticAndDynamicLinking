import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Example_2 {
    public static void main(String[] args) {
        Collection c=new HashSet();
        print(c);
    }
    public static void print(Collection c){
        System.out.println("Collection");
    }

    public static void print(Set c){
        System.out.println("Set");
    }

    public static void print(HashSet c){
        System.out.println("Hashset");
    }


}
