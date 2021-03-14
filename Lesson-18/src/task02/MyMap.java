package task02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MyMap<K, V> {
	private Map<K, V> myMap = new HashMap<>();

	public MyMap() {
		super();
	}

	public Map<K, V> getMyMap() {
		return myMap;
	}

	public void setMyMap(Map<K, V> myMap) {
		this.myMap = myMap;
	}

	@Override
	public String toString() {
		return "MyMap [myMap=" + myMap + "]";
	}

	public void addToMap(K k, V v) {
		MyEntry<K, V> myEntry = new MyEntry<>(k, v);
		myMap.put(myEntry.getK(), myEntry.getV());
	}

	public void removeFromMapByKey(K k) {
		Iterator<Entry<K, V>> iterator = myMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K, V> key = (Map.Entry<K, V>) iterator.next();
			if (key.getKey().equals(k)) {
				iterator.remove();
			}
		}
	}

	public void removeFromMapByValue(V v) {
		Iterator<Entry<K, V>> iterator = myMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K, V> value = (Map.Entry<K, V>) iterator.next();
			if (value.getValue().equals(v)) {
				iterator.remove();
			}
		}
	}

	public void showAllKeys() {
		Iterator<Entry<K, V>> iterator = myMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K, V> key = (Map.Entry<K, V>) iterator.next();
			System.out.println("Key: " + key.getKey().toString());
		}
	}

	public void showAllValues() {
		Iterator<Entry<K, V>> iterator = myMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K, V> value = (Map.Entry<K, V>) iterator.next();
			System.out.println("Value: " + value.getValue().toString());
		}
	}

	public void showAll() {
		Iterator<Entry<K, V>> iterator = myMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K, V> entry = (Map.Entry<K, V>) iterator.next();
			System.out.println(entry.toString());
		}
	}
}
