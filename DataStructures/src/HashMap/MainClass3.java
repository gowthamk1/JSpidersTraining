package HashMap;

class QuadratiProbing {
	int[] hashTable;
	int capacity;
	int size = 0;

	public QuadratiProbing(int size) {
		hashTable = new int[size];
		capacity = size;
		for (int i = 0; i < hashTable.length; i++) {
			hashTable[i] = -1;
		}
	}

	public void insertKey(int key) {
		if (size == capacity) {
			System.out.println("Table is Full");
			return;
		}

		int hashValue = key % capacity;
		int index = 1;

		while (hashTable[hashValue] != -1) {
			hashValue = (hashValue + (index * index)) % capacity;
			index++;
		}

		hashTable[hashValue] = key;
		size++;
		System.out.println("The value " + key + " is stored in the place " + hashValue);
	}

	public void searching(int key) {
		int hashValue = key % capacity;
		int index = 1;

		while (hashTable[hashValue] != -1) {
			if (hashTable[hashValue] == key) {
				System.out.println("The value is present in the place of: " + hashValue);
				return;
			} else {
				hashValue = (hashValue + (index * index)) % capacity;
				index++;
			}
		}
		System.out.println("The value is not present");
	}

	public void deleting(int key) {
		int hashValue = key % capacity;
		int index = 1;

		while (hashTable[hashValue] != -1) {
			if (hashTable[hashValue] == key) {
				hashTable[hashValue] = -1;
				System.out.println("The value is deleted");
				return;
			} else {
				hashValue = (hashValue + (index * index)) % capacity;
				index++;
			}
		}
		System.out.println("The value is not present");
	}

	public void display() {
		for (int i = 0; i < hashTable.length; i++) {
			System.out.println(i + " " + hashTable[i]);
		}
	}

}

public class MainClass3 {

	public static void main(String[] args) {
		QuadratiProbing qp = new QuadratiProbing(10);
		qp.insertKey(33);
		qp.insertKey(45);
		qp.insertKey(64);
		qp.insertKey(27);
		qp.insertKey(98);
		qp.insertKey(51);
		qp.insertKey(90);
		qp.insertKey(100);
		qp.insertKey(13);
		qp.insertKey(72);
		qp.insertKey(9);

		qp.display();
	}

}
