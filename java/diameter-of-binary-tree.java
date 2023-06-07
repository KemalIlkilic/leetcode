class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }
    public int dfs(TreeNode root) {
        if(root == null) return -1;
        int right = dfs(root.right);
        int left = dfs(root.left);
        max = Math.max(max,left + right +2);
        return Math.max(left,right)+1;
    }
}
