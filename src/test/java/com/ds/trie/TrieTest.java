package com.ds.trie;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrieTest {

	@Test
	public void search() {
		Trie trie = new Trie();
		trie.insert("BAT");
		trie.insert("BATSMAN");
		trie.insert("BATH");
		assertEquals(true, trie.find("BAT"));
		assertEquals(true, trie.find("BATH"));
		assertEquals(false, trie.find("BALL"));

	}

}
