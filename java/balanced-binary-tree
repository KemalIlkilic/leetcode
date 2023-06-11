class Solution {
    private int max = 0;
    public boolean isBalanced(TreeNode root) {
        func(root);
        return max > 1 ?  false : true;
    }
    public int func(TreeNode root) {
        if (root == null) return -1;
        int left = func(root.left);
        int right = func(root.right);
        max = Math.max(max,Math.abs(right-left));
        return Math.max(right,left)+1;
    }
}
