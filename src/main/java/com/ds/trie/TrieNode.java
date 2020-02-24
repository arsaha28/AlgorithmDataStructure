package com.ds.trie;

import java.util.HashMap;

public class TrieNode {
	
	public TrieNode(String content ) {
		this.content = content;
	}
	private HashMap<Character,TrieNode> children = new HashMap<Character, TrieNode>();
	private String content;
	private boolean isWord;

	
	public HashMap<Character, TrieNode> getChildren() {
		return children;
	}
	public void setChildren(HashMap<Character, TrieNode> children) {
		this.children = children;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isWord() {
		return isWord;
	}
	public void setWord(boolean isWord) {
		this.isWord = isWord;
	}

}
