package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuxiaofei on 2016/1/26.
 */
public class Q118 {
    //横着做
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        List<Integer> preLine = null;
        for (int i = 1; i <= numRows; i++) {
            List<Integer> line = new ArrayList<Integer>();
            if (i == 1) {
                line.add(1);
            } else {
                line.add(1);
                for (int j = 0; j < preLine.size() - 1; j++) {
                    line.add(preLine.get(j) + preLine.get(j + 1));
                }
                line.add(1);
            }
            preLine = line;
            result.add(line);
        }
        return result;
    }
}
