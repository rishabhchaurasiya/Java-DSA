// Palindrome Pair
// Send Feedback
// Given 'n' number of words, you need to find if there exist any two words which can be joined to make a palindrome or any word, which itself is a palindrome.
// The function should return either true or false. You don't have to print anything.
// Input Format :
// The first line of the test case contains an integer value denoting 'n'.

// The following contains 'n' number of words each separated by a single space.
// Output Format :
// The first and only line of output contains true if the conditions described in the task are met and false otherwise.
// Constraints:
// 0 <= n <= 10^5
// Time Limit: 1 sec
// Sample Input 1 :
// 4
// abc def ghi cba
// Sample Output 1 :
// true
// Explanation of Sample Input 1:
// "abc" and "cba" forms a palindrome
// Sample Input 2 :
// 2
// abc def
// Sample Output 2 :
// false
// Explanation of Sample Input 2:
// Neither their exists a pair which forms a palindrome, nor any of the words is a palindrome in itself. Hence, the output is 'false.'

import java.util.ArrayList;
import java.util.*;
import java.lang.*;
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
	private void add(TrieNode root, String word){
		if(word.length() == 0){
			if (!root.isTerminating) {
				root.isTerminating = true;
				return;
			}
            else 
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

	public void add(String word)
    {
		add(root,word);
	}

	public boolean isPalindromePair(ArrayList<String> vect)
    {
       
        
        ArrayList<String> s=new ArrayList<>();
	for(int i=0;i<vect.size();i++)
    {
        String st=vect.get(i);
         add(st);
        String str=reverse(st);
        s.add(str);
    }
        for(int i=0;i<s.size();i++)
        {
           boolean b=search(root,s.get(i));
            if(b==true)
                return true;
        }
        return false;
	}
     public boolean search(TrieNode root,String word)
    {
    if(word.length()==0)
    {
        return true;
    }
        int ci=word.charAt(0)-'a';
        TrieNode chld=root.children[ci];
        if(chld==null)
            return false;
        return search(chld,word.substring(1));
    }
    private String reverse(String i){
        String newstr = "";
        while (i.length() != 0){
            newstr = i.charAt(0) + newstr;
            i = i.substring(1);
        }
        //System.out.println(newstr);
        return newstr;
    }
}

import java.util.ArrayList;
import java.util.*;
import java.lang.*;
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
//M2
public class Trie {

	private TrieNode root;
	public int count;
	public Trie() {
		root = new TrieNode('\0');
	}
	private void add(TrieNode root, String word){
		if(word.length() == 0){
			if (!root.isTerminating) {
				root.isTerminating = true;
				return;
			}
            else 
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

	public void add(String word)
    {
		add(root,word);
	}

	public boolean isPalindromePair(ArrayList<String> vect)
    {
       
        
        ArrayList<String> s=new ArrayList<>();
	for(int i=0;i<vect.size();i++)
    {
        String st=vect.get(i);
         add(st);
        String str=reverse(st);
        s.add(str);
    }
        for(int i=0;i<s.size();i++)
        {
           boolean b=search(root,s.get(i));
            if(b==true)
                return true;
        }
        return false;
	}
     public boolean search(TrieNode root,String word)
    {
    if(word.length()==0)
    {
        return true;
    }
        int ci=word.charAt(0)-'a';
        TrieNode chld=root.children[ci];
        if(chld==null)
            return false;
        return search(chld,word.substring(1));
    }
    private String reverse(String i){
        String newstr = "";
        while (i.length() != 0){
            newstr = i.charAt(0) + newstr;
            i = i.substring(1);
        }
        //System.out.println(newstr);
        return newstr;
    }
}