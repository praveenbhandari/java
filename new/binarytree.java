import java.util.*;

class binarytree{

	static class node{
	int data;
	node left;
	node right;

	node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}

}

	static class tree{
		int index=-1;
		node buildtree(int nodes[]){
			index++;
			if(nodes[index] == -1){
				return null;
			}

			node newnode=new node(nodes[index]);
			newnode.left=buildtree(nodes);
			newnode.right=buildtree(nodes);
			return newnode;
		}

	}
static	void preorder(node root){
		if(root == null){
			return;
		}

		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}


	static void inorder(node root){
		if(root == null){return;}

		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);

	}	
	static void postorder(node root){
		if(root == null){return;}

		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
		

	}

	static void leveloreder(node root){

		// if(root == null){return;}
		Queue<node> q= new LinkedList<>();
		q.add(root);
		q.add(null);

		while(!q.isEmpty()){
			node cur_node=q.remove();
			if(cur_node == null){
				System.out.println();
				if(q.isEmpty()){
					break;
				}
				else{
					q.add(null);
				}
			}else{
				System.out.print(cur_node.data+" ");
				if(cur_node.left != null){
					q.add(cur_node.left);
				}
				if(cur_node.right != null){
					q.add(cur_node.right);
				}

			}


		}
	}
		static int countt(node root){
			if(root == null){
				// System.out.println(0);
				return 0;
			}

			int left=countt(root.left);
			int right=countt(root.right);
			// System.out.println(left+right+1);
			int s=left+right+1;
			return s;
		}
	static int summ(node root){
			if(root == null){
				return 0;
			}

			int left=summ(root.left);
			int right=summ(root.right);

			return left+right+root.data;
		}

public static int heightt(node root){
	if(root == null){
		return 0;
	}
	int l=heightt(root.left);
	int r=heightt(root.right);

	int t=Math.max(l,r)+1;
	// System.out.println(t);
	return t;

}
	public static void main(String[] args) {
		int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		tree binarytree=new tree();
		node root =binarytree.buildtree(nodes);
		preorder(root);
		System.out.println();
		inorder(root);
		System.out.println();
		postorder(root);
		System.out.println();
		leveloreder(root);
		System.out.println();
		System.out.println(countt(root));
		System.out.println();
		System.out.println(summ(root));
		System.out.println();
		System.out.println(heightt(root));
	}
}