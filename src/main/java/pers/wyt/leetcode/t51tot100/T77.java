package pers.wyt.leetcode.t51tot100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: wanyutong
 * @Date: 2019/3/13
 * @Description:
 */
public class T77 {
    public static List<List<Integer>> combine(int n, int k) {
        if (n <= 0 || k <= 0 || n < k) {
            return null;
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (n == k) {
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 1; i <= n; i++) {
                list.add(i);
            }

            res.add(list);
            return res;
        }

        for (int i = 1; i <= n - k + 1; i++) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(i);
            build(res, list, i + 1, n, k - 1);
        }
        return res;
    }

    public static void build(List<List<Integer>> res, List<Integer> curList, int curPos, int n, int left) {
        if (left == 0) {
            res.add(new ArrayList<Integer>(curList));
            return;
        }
        for (int i = curPos; i <= n - left + 1; i++) {
            curList.add(i);
            build(res, curList, i + 1, n, left - 1);
            curList.remove(curList.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<List<Integer>> res = combine(n, k);
            System.out.println(res);

        }
    }
}
