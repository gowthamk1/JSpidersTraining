package Hashing;

import java.util.LinkedList;

public class Directchaining {
	LinkedList<Integer>[] hashTable;
	public Directchaining(int size) {
		hashTable=new LinkedList[size];
	}
	public void insertKey(int key) {
		int hashValue=key % hashTable.length;
		if(hashTable[hashValue]==null){
			hashTable[hashValue]=new LinkedList<Integer>();	
			hashTable[hashValue].add(key);
		}
		else {
			hashTable[hashValue].add(key);
		}
	}
}
