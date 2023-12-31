// // Code: Search word in Trie
// // Send Feedback
// // Implement the function Search for the Trie class.
// // For a Trie, write the function for searching a word. Return true if the word is found successfully, otherwise return false.
// // Note : main function is given for your reference which we are using internally to test the code.
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class Runner {

// 	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
	
// 	public static void main(String[] args) throws IOException{
// 		Trie t = new Trie();
//         String[] string = br.readLine().split("\\s");
//         int choice = Integer.parseInt(string[0]);
//         String word = "Null";
//         if (string.length!=1)        
//         {
//             word = string[1];
//         }
        		
// 		while(choice != -1) {
// 			switch(choice) {
// 				case 1 : // insert
// 					t.add(word);
// 					break;
// 				case 2 : // search
// 					System.out.println(t.search(word));
// 					break;
// 				default :
// 						return;
// 			}
//             string = br.readLine().split("\\s");
//             choice = Integer.parseInt(string[0]);
//             if (string.length!=1)
//             {
//                 word = string[1];
//             }
// 		}
// 	}

// }

class TrieNode{

	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}


public class Trie {

	private TrieNode root;
	public int count;
	public Trie() {
		root = new TrieNode('\0');
	}

	public boolean search(String word){
        return search(root,word);
    }
    private boolean search(TrieNode root,String word){
        if(word.length()==0)
        {
            if(root.isTerminating==true)
                return true;
            else
                return false;
        }
        boolean ans=false;
        int childIndex=word.charAt(0)-'a';
        TrieNode child=root.children[childIndex];
        // if(child==null)
        //     return false;
        if(child!=null)
            ans=search(child,word.substring(1));
        return ans;
    }


	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));

	}

	public void add(String word){
		add(root, word);
	}
}