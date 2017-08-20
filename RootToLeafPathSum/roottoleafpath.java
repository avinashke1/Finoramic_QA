
//  Definition for binary tree
/*  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 */
public class Solution {
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
	    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	    if(root==null){
	        return res;
	    }
	    ArrayList<Integer> arraylist = new ArrayList<Integer>();
	    arraylist.add(root.val);
	    UsingDFS(root,sum-root.val,res,arraylist);
	    return res;
	}
	
	public void UsingDFS(TreeNode tree,int sum,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> arraylist){
	    
	    if(tree.left==null && tree.right==null && sum==0){
	        ArrayList<Integer> temp = new ArrayList<Integer>();
	        temp.addAll(arraylist);
	        res.add(temp);
	    }
	    
	    if(tree.left !=null){
	        arraylist.add(tree.left.val);
	        UsingDFS(tree.left,sum-tree.left.val,res,arraylist);
	        arraylist.remove(arraylist.size()-1);
	    }
	    
	    if(tree.right!=null){
	        arraylist.add(tree.right.val);
	        UsingDFS(tree.right,sum-tree.right.val,res,arraylist);
	        arraylist.remove(arraylist.size()-1);
	    }
	}
}
