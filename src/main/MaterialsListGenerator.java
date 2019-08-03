package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import data.Item;

public class MaterialsListGenerator {
	
	public static HashMap<Item,Float> generateMaterialsList(HashMap<Item,Float> inputMap) {
		Set<Entry<Item, Float>> entries;
		Iterator<Entry<Item, Float>> entryIterator;
		HashMap<Item, Float> outputMap = new HashMap<Item, Float>();
		
		entries = inputMap.entrySet();		
		entryIterator = entries.iterator();
		
		while (entryIterator.hasNext()) {
			Entry<Item, Float> e = entryIterator.next();
			inputMap.remove(e.getKey());
			
			addEntryToMap(e, outputMap);
			//System.out.println("Adding " + e.getValue() + " " + e.getKey().getName() + " to outputMap");
			
			if (!e.getKey().isRawMaterial()) {				
				HashMap<Item, Float> subMap = new HashMap<Item, Float>();
				subMap.putAll(e.getKey().getCraftingMaterials());
				multiplyMapEntries(subMap, (e.getValue() / e.getKey().getCraftingAmount()));
				Iterator<Entry<Item, Float>> subIterator = subMap.entrySet().iterator();
				while (subIterator.hasNext()) {
					Entry<Item, Float> se = subIterator.next();
					addEntryToMap (se, inputMap);
					//System.out.println("Adding " + se.getValue() + " " + se.getKey().getName() + " to inputMap");
				}
			}
			
			entries = inputMap.entrySet();		
			entryIterator = entries.iterator();
		}
		
		return outputMap;
	}
	
	private static void addEntryToMap(Entry<Item, Float> entry, HashMap<Item, Float> map) {
		if (map.containsKey(entry.getKey())) {
			map.put(entry.getKey(), (entry.getValue() + map.get(entry.getKey()))) ;
		} else {
			map.put(entry.getKey(), entry.getValue());
		}
	}
	
	private static void multiplyMapEntries(HashMap<Item, Float> map, Float multiplier) {
		Iterator<Item> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			Item i = iterator.next();
			map.put(i, map.get(i) * multiplier);
		}
	}
	
}
