package LeetCode;

import java.util.LinkedList;

public class UniquePaths {
	public int uniquePaths(int m, int n) {
        if(m == 1 || n == 1){
            return 1;
        }
        LinkedList<Integer[]> q = new LinkedList<Integer[]>();
        int paths = 1;
        Integer[] startPosition = {0,0};
        q.add(startPosition);
        while(!q.isEmpty()){
            int tempPaths = 0;
            Integer[] position = q.poll();
            Integer[] positionN = {position[0],position[1]};
            if(position[0] < m){
                position[0]++;
                tempPaths++;
                q.add(position);
            }
            if(positionN[1] < n){
                positionN[1]++;
                q.add(positionN);
                tempPaths++;
            }
            paths *= tempPaths;
        }
        return paths;
    }
}
