import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Example_2 {
    //Когда перегруженный метод, то действует ранее связывание. То есть "c" относится к Collection

//    Здесь получается, что JVM в таком случае не
// понимает какую реализацию ей брать, и чтобы исключить
// возможность ошибки, создатели JVM ее приравняли типа как
// к статике, т.е. она берет свою реализацию не из реализации справа,
// а из описания слева. ))) Если бы так не сделали, то
// процессор бы завис в бесконечном цикле выбора 1 реализации из трех. )))
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
