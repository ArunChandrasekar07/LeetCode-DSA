class WordDictionary {
    class TrieNode{
        TrieNode[] trie=new TrieNode[26];
        boolean isEnd=false;
    }
    TrieNode root;
    public WordDictionary() {
        root=new TrieNode();
    }
    public void addWord(String word) {
        TrieNode current=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(current.trie[index]==null){
                current.trie[index]=new TrieNode();
            }
            current=current.trie[index];
        }
        current.isEnd=true;
    }
    
    public boolean search(String word) {
        return dfs(root, word, 0);
    }
    private boolean dfs(TrieNode node,String word,int index){
        if(word.length()==index){
            return node.isEnd;
        }
        if(word.charAt(index)=='.'){
            for(int i=0;i<26;i++){
                if(node.trie[i]!=null){
                    if(dfs(node.trie[i],word,index+1)){
                        return true;
                    };
                }
            }
            return false;
        }
        int pos=word.charAt(index)-'a';
        if(node.trie[pos]==null){
            return false;
        }
        return dfs(node.trie[pos],word,index+1);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */