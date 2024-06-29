public class Trie {

    static int letters =26;

    class TrieNode {

        TrieNode[] children = new TrieNode[letters];
        boolean isEndOfWord;

        TrieNode() {

            isEndOfWord = false;
            for (int i = 0; i < letters; i++)
                children[i] = null;

        }
    }

    TrieNode root;

    public void insert(String str) {

        int len= str.length();
        int i,index;

        TrieNode curr = root;
      
        for (i = 0; i < len; i++)
        {
            index = str.charAt(i) - 'a';
            if (curr.children[index] == null)
                curr.children[index] = new TrieNode();
      
            curr = curr.children[index];
        }
      
        curr.isEndOfWord = true;
    }


    public boolean search(String str)
    {
        int len = str.length();
        int i,index;
        TrieNode curr = root;
      
        for (i = 0; i < len; i++)
        {
            index = str.charAt(i) - 'a';
      
            if (curr.children[index] == null)
                return false;
      
            curr = curr.children[index];
        }
      
        return (curr.isEndOfWord);
    }
}


  