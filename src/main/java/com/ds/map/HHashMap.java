package com.ds.map;

public class HHashMap<K,V> {
	
	private Entry[] table ;
	public HHashMap() {
		table = new Entry[10];
	}
	
	static class Entry<K,V>{
		protected K key;
		protected V value;
		private Entry<K,V> next;
		public Entry(K key,V value){
			this.key = key;
			this.value = value;
		}
		public Entry<K, V> getNext() {
			return next;
		}
		public void setNext(Entry<K, V> next) {
			this.next = next;
		}
		
	}
	
	public void put(K key,V value) {
		int location =  hash(key.hashCode());
		Entry<K,V> entry =  table[location];
		if(null == entry) {
			table[location] = new Entry<K, V>(key, value);
		}else {
			Entry<K, V> currentEntry = entry;
			while(null != currentEntry) {
				if(entry.key.equals(key)) {
					entry.value = value;
					return;
				}else if(null != currentEntry.next){
					currentEntry = entry.next;
				}else {
					currentEntry.setNext(new Entry<K, V>(key, value));
					return;
				}
			}
		}
	}
	
	public V get(K key) {
		int location =  hash(key.hashCode());
		Entry<K,V> entry =  table[location];
		if(null != entry) {
			Entry<K,V> currenEntry = entry;
			while(null != currenEntry.next) {
				if(currenEntry.key.equals(key)) {
					return currenEntry.value;
				}
				currenEntry = currenEntry.next;
			}
			if(currenEntry.key.equals(key)) {
				return currenEntry.value;
			}else {
				return null;
			}
		}else {
			return null;
		}
		
	}
	
	
	private int hash(int h) {
		int hash = h%10;
		return hash;
		
	}

}
