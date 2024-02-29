public class Binary_Tree {
    Object root;
    Binary_Tree left, right;
    Binary_Tree(Object root){
        this.root= root;
    }
    Binary_Tree(Object root, Binary_Tree left, Binary_Tree right){
        this.root= root;
        this.left= left;
        this.right= right;
    }
    public Object getRoot(){
        return root;
    }
    public Binary_Tree getLeft(){
        return left;
    }
    public Binary_Tree getRight(){
         return  left;
    }
     public Object setRoot(Object root){
        Object temp=this.root;
        this.root= root;
        return temp;
    }
    public Binary_Tree setLeft(Binary_Tree left){
         Binary_Tree temp= this.left;
         this.left= left;
         return temp;
    }
    public Binary_Tree setRight(Binary_Tree right){
        Binary_Tree temp= this.right;
        this.right= right;
        return right;
    }
// inorder
    public String toString(){
        StringBuffer buff=new StringBuffer(" ");
        if(left!=null) {
            buff.append(left+" ,");
        }
            buff.append(root);
        if(right!=null)
            buff.append(","+ right);
        return buff+" ";
    }
    // PreOrder
    public String preOrder(){
         StringBuffer buffer= new StringBuffer(" ");
         buffer.append(root);
         if(left!=null){
             buffer.append(left.preOrder()+ " ");
         }
         if (right!=null){
             buffer.append(","+ right.preOrder());
         }
         return  buffer+ " ";

    }
    // PostOrder
    public String postOrer(){
        StringBuffer buffer= new StringBuffer(" ");

        if(left!=null){
            buffer.append(left.postOrer()+ " ");
        }
        if (right!=null){
            buffer.append(","+ right.postOrer());
        }
        buffer.append(root);
        return  buffer+ " ";
    }

public boolean isLeaf(){
    boolean check= false;
        if (right==null && left==null){
            check= true;
        }
        return check;
}
    public int size(){
        int count=1;
        if(left!=null){
            count+= left.size();
        }
        if(right!=null){
            count+= right.size();
        }
        return count;
    }

    public int height(Binary_Tree root){
        if (root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;

    }
    public boolean search(Object obj){
        if(root.equals(obj)){
            return true;
        }
        if (left != null && left.search(obj)) {
            return true;
        }
        if (right != null && right.search(obj)) {
            return true;
        }

        return false;
    }


        public static void main(String[] args) {
        Binary_Tree d= new Binary_Tree(" D");
        Binary_Tree e= new Binary_Tree(" E");
        Binary_Tree f= new Binary_Tree(" F");
        Binary_Tree b= new Binary_Tree("B",d,null);
        Binary_Tree c= new Binary_Tree("C",e,f);
        Binary_Tree a= new Binary_Tree("A",b,c);
        System.out.print(" Inorder :");
        System.out.println(a);
        System.out.println(" PreOrder: ");
        System.out.println(a.preOrder());
        System.out.println(" PostOrder :");
        System.out.println(a.postOrer());
        System.out.println(d.isLeaf());
        System.out.println(" Size of binary tree :"+ a.size());
        System.out.println("height of tree : "+ a.height(a));
            System.out.println(" Search  the element in tree : "+ a.search(" D") );
    }
}
