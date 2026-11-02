package ar.edu.unlp.info.oo1.Ejercicio25;

import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

public class BagCollec<T> extends AbstractCollection<T> implements Bag<T> {
	private final Map<T, Integer> map;
	private int size;
	public BagCollec() { 
		this.map = new HashMap<>();
		this.size = 0;
	}
	@Override 
	public boolean add(T element) { 
		int count = map.getOrDefault(element, 0);
		map.put(element, count +1);
		size++;
		return true;
	}
	@Override
	public int occurrencesOf(T element) {
		
		return map.getOrDefault(element, 0);
	}
	@Override
	public void removeOccurrence(T element) {
		Integer count = map.get(element);
		if (count != null) { 
			if (count == 1) { 
				map.remove(element);
			} else { 
				map.put(element, count -1);
			}
			size--;
		}
		
	}
	@Override
	public void removeAll(T element) {
		Integer count = map.remove(element);
		if (count != null) { 
			size -= count;
		}
		
	}
	@Override
	public int size() {
		return size;
	}
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() { 
			private final Iterator<Entry<T, Integer>> entryIterator = map.entrySet().iterator();
			private Map.Entry<T, Integer> currentEntry = null;
			private int currentCount = 0;
			@Override 
			public boolean hasNext() { 
				return currentCount > 0 || entryIterator.hasNext();
			}
			@Override
			public T next() { 
				if (!hasNext()) { 
					throw new NoSuchElementException();
				}
				if (currentCount == 0) { 
					currentEntry = entryIterator.next();
					currentCount = currentEntry.getValue();
				}
				currentCount--;
				return currentEntry.getKey();
			}
		};
	}
}
