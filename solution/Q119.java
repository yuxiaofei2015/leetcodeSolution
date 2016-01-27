package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yuxiaofei on 2016/1/27.
 */
public class Q119 {
    public static void main(String[] args) {
        new Q119().getRow(13);
    }

    public List<Integer> getRow(int rowIndex) {
        Integer[] array = new Integer[rowIndex + 1];
        for(int i=0;i<array.length;i++){
            array[i]=new Integer(0);
        }
        array[0] = 1;

        for (int i = 0; i <= rowIndex; i++) {
            for (int j = i; j > 0; j--) {
                array[j] = array[j] + array[j - 1];
            }
        }
        return Arrays.asList(array) ;
    }
}
