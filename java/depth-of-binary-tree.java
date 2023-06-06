public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        int depth = 0;
        while(!que.isEmpty()) {
            int size = que.size();
            while(size > 0) {
                TreeNode current = que.poll();
                if(current.left != null) que.offer(current.left);
                if(current.right != null) que.offer(current.right);
                size--;
            }
            depth++;
        }
        return depth;
    }
