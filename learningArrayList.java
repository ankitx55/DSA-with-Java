import java.util.ArrayList;
import java.util.Arrays;

public class learningArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(5);
        arr1.add(555);
        arr1.add(11111);
        arr1.set(2,55555);
        System.out.println(arr1);

        int sizeOfArr1 = arr1.size();
        Integer arr2[] = new Integer[arr1.size()];
        arr2 = arr1.toArray(arr2);

        System.out.println(Arrays.toString(arr2));

        System.out.println(arr1.get(2));


    }
}
