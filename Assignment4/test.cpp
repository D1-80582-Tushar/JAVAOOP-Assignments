#include <iostream>
#include <vector>
using namespace std;

int main()
{

    vector<vector<int>> levelOrder(TreeNode * root)
    {
        vector<vector<int>> temparr;
        queue<TreeNode *> q;
        q.push(root);
        int counter = 0;
        while (!q.empty())
        {
            int n = q.size();
            for (int i = 0; i < n; i++)
            {
                TreeNode *temp = q.front();
                temparr[counter].push_back(temp);
                if (temp->left)
                    temparr[counter].push_back(temp->left);
                if (temp->right)
                    temparr[counter].push_back(temp->right);
                q.pop();
            }
            counter++;
        }
        return temparr;
    }
}