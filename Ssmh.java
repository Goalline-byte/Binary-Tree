import java.io.*;
import java.util.Stack;

public class Ssmh{
    public Ssmh() {
    }

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class pair{
        Node node;
        int state;
        pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }

    public static void display(Node node){
        if(node == null){
            return;
        }
        String str = " ";
        str += node.left == null? "." : node.left.data + "";
        str += "<-" + node.data + "->";
        str += node.right == null? ".": node.right.data +"";
        System.out.println(str);

        display(node.left);
        display(node.right);

    }

    public static int size(Node node){
        if(node == null){
            return 0;
        }
        int ls = size(node.left);
        int rs = size(node.right);
        int ts = ls + rs + 1;
        return ts;
    }

    public static int sum(Node node){
        if(node == null){
            return 0;
        }
        int lsm = sum(node.left);
        int rsm = sum(node.right);
        int tsm = lsm + rsm + node.data;
        return tsm;

    }
    public static int max(Node node){
        if(node == null){
            return Integer.MIN_VALUE;
        }
        int lm = max(node.left);
        int rm = max(node.right);
        int tm = Math.max(node.data, Math.max(lm,rm));
        return tm;
    }
    public static int height(Node node){
        if(node == null){
            return -1; // -1 for edges, 0 for nodes

        }
        int lh = height(node.left);
        int rh = height(node.right);
        int th = Math.max(lh,rh)+1;
        return th;
    }

    public static void main(String[] args, InputStream n) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(n));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            if(values[i].equals("n") == false){
                arr[i] = Integer.parseInt(values[i]);
            } else{
                arr[i] = null;
            }
        }
        Node root = construct(arr);

        int size = size(root);
        int sum = sum(root);
        int max = max(root);
        int ht = height(root);
        System.out.println(size);
        System.out.println(sum);
        System.out.println(max);
        System.out.println(ht);
    }

    private static Ssmh.Node construct(Integer[] arr) {
        return null;
    }
     
}


