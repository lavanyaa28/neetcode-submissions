class Solution {
    public int countComponents(int n, int[][] edges) {
        if(n==0)
        {
            return 0;
        }
        if(edges.length == 0 && n>0)
        {
            return n;
        }

        boolean[] vis = new boolean[n];
        ArrayList<List<Integer>> edge= new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            edge.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            edge.get(edges[i][0]).add(edges[i][1]);
            edge.get(edges[i][1]).add(edges[i][0]);
        }
        int count=0;

        for(int i=0;i<n;i++)
        {
            if(vis[i]==false)
            {
                dfs(i, edge, vis);
                count++;
            }
            
        }

        return count;

    }

    public void dfs(int node, ArrayList<List<Integer>> edge, boolean[] vis)
    {
        Queue<Integer> q= new LinkedList<>();
        q.add(node);
        vis[node]=true;

        while(!q.isEmpty())
        {
            int curr=q.poll();
            for(int i=0;i<edge.get(curr).size();i++)
            {
                int neigh= edge.get(curr).get(i);
                if(vis[neigh]!=true)
                {
                    vis[neigh]=true;
                    q.add(neigh);
                }
            }
        }
    }
}
