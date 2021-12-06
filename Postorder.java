import java.util.*;
import java.io.*;
import java.lang.*;

class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
        left=right=null;
    }
}

class Preorder{
    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        preorder(root);
        postorder(root);
    }

    public static void preorder(Node root){
        if(root!=null){
            System.out.print(root.key+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key+" ");
        }
    }
}

