package lab_001;
class TNode{
	int data;
	TNode left;
	TNode right;
	TNode(int data){
		this.data = data;
		left = null;
		right = null;
	}
}
class BT{
	public TNode createBT(int [] arr, int l, int r) {
		if(l>r) {
			return null;
		}
		int mid = (l+r)/2;
		TNode root = new TNode(arr[mid]);
		root.left = createBT(arr, l, mid-1);
		root.right = createBT(arr,mid+1, r);
		return root;
	}
	public void inorder(TNode root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	public void preorder(TNode root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}
	public void postorder(TNode root) {
		if(root == null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
	}
}
public class BinaryTreeQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4 ,7, 3, 6, 7, 3, 6};
		BT bt = new BT();
		TNode root = bt.createBT(arr,  0, arr.length-1);
		bt.inorder(root);
		System.out.println();
		bt.preorder(root);
		System.out.println();
		bt.postorder(root);
		System.out.println();
	}

}
