class TrieNode {
    List<String> data;
    TrieNode children[];
    boolean isEnd;

    TrieNode(){
        data = new ArrayList<>();
        children = new TrieNode[26];
        isEnd = false;
    }
}

class Solution {
    static TrieNode root;
    List<List<String>> ans;
    public List<List<String>> groupAnagrams(String[] strs) {
        ans = new ArrayList<>();
        
        root = new TrieNode();

        for(String word: strs){
            build(word);
        }
        
        dfs(root);
        
        return ans;
    }
    
    public void build(String s){
        TrieNode temp = root;
        char[] word = s.toCharArray();
        Arrays.sort(word);
        for(char c: word){
            TrieNode child = temp.children[c-'a'];
            if(child == null) temp.children[c-'a'] = new TrieNode();
            temp = temp.children[c-'a'];
        }
        temp.isEnd = true;
        temp.data.add(s);
    }
    
    public void dfs(TrieNode rt){
        if(rt.isEnd){
            ans.add(rt.data);
        }
        
        for(int i = 0; i < 26; i++){
            if(rt.children[i] != null) dfs(rt.children[i]);
        }
    }
}
