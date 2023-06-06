public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode now = queue.poll();
            TreeNode right = now.right;
            now.right = now.left;
            now.left = right;
            if(now.left != null) {
                queue.offer(now.left);
            }
            if(now.right != null) {
                queue.offer(now.right);
            }
        }
        return root;
    }
