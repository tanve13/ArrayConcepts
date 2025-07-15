
import java.util.Arrays;

class Data{
    int array[];
}
public class ReplaceArray{
    static void replace(Data d){ 
        d.array = new int[]{10,20,30,40};
    }
    public static void main(String[] args) {
        Data d = new Data();
        d.array = new int[]{1,2,3,4};
        replace(d);
        System.out.println(Arrays.toString(d.array));//Arrays is predefined class and toString is predefined method...
    }
}