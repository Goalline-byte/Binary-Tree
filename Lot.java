import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;


public class Lot{
    public Lot() {
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

    public static void levelOrder(Node node){
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);

        while(mq.size() > 0){
            int count = mq.size();
            for(int i = 0; i < count; i++){
                node = mq.remove();
                System.out.print(node.data + " ");

                if(node.left != null){
                    mq.add(node.left);
                }

                if(node.right != null){
                    mq.add(node.right);
                }
            }
            System.out.println();
        }
    }
        

    public static void main(String[] args, InputStream n) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[a];
        String[] values = br.readLine().split(" ");
        for(int i = 0; i < a; i++){
            if(values[i].equals("a") == false){
                arr[i] = Integer.parseInt(values[i]);
            } else{
                arr[i] = null;
            }
        }
        Node root = construct(arr);

        levelOrder(root);
    }

    private static Lot.Node construct(Integer[] arr) {
        return null;
    }

    
     
}


