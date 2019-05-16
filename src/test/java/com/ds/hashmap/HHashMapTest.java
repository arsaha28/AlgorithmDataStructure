package com.ds.hashmap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ds.map.HHashMap;

public class HHashMapTest {
	
	@Test
	public void put() {
		HHashMap<String,String> map = new HHashMap<String, String>();
		map.put("A", "Arnab");
		map.put("A", "Amit");
		map.put("K", "Kanwardeep");
		map.put("P", "Parimal");
		assertEquals("Amit", map.get("A"));
		assertEquals("Kanwardeep", map.get("K"));
		assertEquals("Parimal", map.get("P"));
	}

}
