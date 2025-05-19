public class Main {
    static class Node{
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value=value;
        }
    }

    static int maxDepth=0;

    static int dfs(Node root,int depth) {
        if (root == null) {
            return;
        }
        maxDepth=Math.max(maxDepth, depth);
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
        System.out.println("노드 번호 : "+root.value+", 깊이 : "+depth);
        return maxDepth;
    }


    public static void main(String[] args) {

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        System.out.println(dfs(root,1));

    }
}