class Trie {
    class TrieNode{
        TrieNode[] trie=new TrieNode[26];
        boolean isEnd=false;
    }
    TrieNode root;
    public Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
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
        TrieNode current=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(current.trie[index]==null){
                return false;
            }
            current=current.trie[index];
        }
        return current.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode current=root;
        for(int i=0;i<prefix.length();i++){
            int index=prefix.charAt(i)-'a';
            if(current.trie[index]==null){
                return false;
            }
            current=current.trie[index];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */