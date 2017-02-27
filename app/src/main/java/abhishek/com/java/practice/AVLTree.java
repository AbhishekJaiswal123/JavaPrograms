package abhishek.com.java.practice;

/**
 * Created by abhishek on 29/11/16.
 */

class Nodes{
    int key,height;
    Nodes left,right;

    Nodes(int data){
        key = data;
        height = 1;
    }
}

public class AVLTree {

    Nodes root;


    int height(Nodes node){
        if(node == null)
            return 0;
        return node.height;
    }

    int getBalance(Nodes node){
        if(node == null)
            return  0;
        return height(node.left) - height(node.right);
    }

    Nodes rotateRight(Nodes y) {
        Nodes x = y.left;
        Nodes T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }
    Nodes rotateLeft(Nodes x){
        Nodes y = x.right;
        Nodes T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        //  Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }

 Nodes insert(Nodes node,int key){

     if(node == null)
         return new Nodes(key);

     if(key < node.key)
         node.left = insert(node.left,key);
     else if(key > node.key)
         node.right = insert(node.right,key);

     node.height = 1 + Math.max(height(node.left),
             height(node.right));

     int balance = getBalance(node);

     // left left

     if(balance > 1 && key < node.left.key){
         return rotateRight(node);
     }

     // right right
     if(balance < -1 && key > node.right.key){
         return rotateLeft(node);
     }
     // left right
     if(balance > 1 && key > node.left.key){
         node.left = rotateLeft(node.left);
         return rotateRight(node);
     }

     //right left
     if(balance < -1 && key < node.right.key){
         node.right = rotateRight(node.right);
         return rotateLeft(node);
     }


     return node;
 }

    void preOrder(Nodes root){
        if(root != null){
            System.out.println(root.key+" height = "+root.height);
            preOrder(root.left);
            preOrder(root.right);
        }

    }

    public static void main(String[] args) {

        AVLTree tree = new AVLTree();
        tree.root = tree.insert(tree.root,10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        System.out.println("Preorder traversal" +
                " of constructed tree is : ");
        tree.preOrder(tree.root);
    }

}
