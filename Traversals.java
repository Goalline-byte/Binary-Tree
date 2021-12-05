import java.io.*;
import java.util.Stack;

public class Traversals{
    public Traversals() {
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

    public static void traversal(Traversals.Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data + "in preorder"); //euler left-> pre
        traversal(root.left);
        System.out.println(root.data + "in inorder"); //euler between-> in
        traversal(root.right);
        System.out.println(root.data + "in postorder"); //euler right-> post
    }
        

    public static void main(String[] args, InputStream n) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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

        traversal(root);
    }

    private static Traversals.Node construct(Integer[] arr) {
        return null;
    }

    
     
}


