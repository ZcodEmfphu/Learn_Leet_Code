package m06124;

import java.util.*;

public class Day29 {

    public static List<List<Integer>> getAncestors(int n, int[][] edges) {
        // Bước 1: Biểu diễn đồ thị bằng danh sách kề
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
        }

        // Bước 2: Khởi tạo danh sách để lưu tổ tiên của mỗi nút
        List<Set<Integer>> ancestors = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ancestors.add(new HashSet<>());
        }

        // Bước 3: Thực hiện sắp xếp topo để xử lý các nút theo thứ tự đúng
        List<Integer> topoOrder = topologicalSort(graph, n);

        // Bước 4: Đối với mỗi nút trong thứ tự topo, truyền các tổ tiên của nó đến các nút con
        for (int node : topoOrder) {
            for (int neighbor : graph.get(node)) {
                ancestors.get(neighbor).add(node);
                ancestors.get(neighbor).addAll(ancestors.get(node));
            }
        }

        // Chuyển đổi set thành danh sách đã sắp xếp
        List<List<Integer>> result = new ArrayList<>();
        for (Set<Integer> set : ancestors) {
            List<Integer> sortedList = new ArrayList<>(set);
            Collections.sort(sortedList);
            result.add(sortedList);
        }

        return result;
    }

    public List<List<Integer>> getAncestor(int n, int[][] edges) {

        List<List<Integer>> res = new ArrayList<>();

        return res;
    }

    public static List<Integer> topologicalSort(List<List<Integer>> graph, int n) {
        int[] dergee = new int[n];
        for (List<Integer> neighbor : graph) {
            for (int neighbors : neighbor) {
                dergee[neighbors]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (dergee[i] == 0) {
                queue.add(i);
            }
        }

        List<Integer> topoOrder = new ArrayList<>();

        while (!queue.isEmpty()) {
            int node = queue.poll();
            topoOrder.add(node);
            for (int neighbor : graph.get(node)) {
                dergee[neighbor]--;
                if (dergee[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        return topoOrder;
    }

    public static void main(String[] args) {
        int n = 6;
        int[][] edges = {
                {0, 3}, {0, 4}, {1, 3}, {2, 4}, {2, 5}, {3, 5}, {4, 5}
        };
        List<List<Integer>> ancestors = getAncestors(n, edges);
        for (int i = 0; i < ancestors.size(); i++) {
            System.out.println("Tổ tiên của nút " + i + ": " + ancestors.get(i));
        }
    }

}
