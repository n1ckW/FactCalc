package main;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import data.Item;
import data.ItemData;

public class Launcher {
	
	/**
	 *set true for full materials list, including intermediate products, set false for raw materials only
	 */
	public static final boolean FULLINFO = true;

	public static void main(String[] args) {
		ItemData.init();
		testRun();
	}

	private static void testRun() {
		HashMap<Item, Float> testMap = new HashMap<Item, Float>();
//		testMap.put(data.ItemData.AutomationSciencePack, 1f);
//		testMap.put(data.ItemData.LogisticSciencePack, 1f);
//		testMap.put(data.ItemData.MilitarySciencePack, 1f);
//		testMap.put(data.ItemData.ChemicalSciencePack, 1f);
//		testMap.put(data.ItemData.ProductionSciencePack, 1f);
//		testMap.put(data.ItemData.UtilitySciencePack, 1f);
//		testMap.put(data.ItemData.RocketSciencePack, 1f);
//		testMap.put(data.ItemData.ProcessingUnit, 1f);
		testMap.put(data.ItemData.Module_3, 1f);

		HashMap<Item, Float> testResultMap = MaterialsListGenerator.generateMaterialsList(testMap);
		
		Set<Entry<Item, Float>> entries = testResultMap.entrySet();
		for (Entry<Item, Float> e: entries) {
			if (e.getKey().isRawMaterial() || FULLINFO)
				System.out.println(e.getKey().getName() + ": " + e.getValue());
		}
		
	}
	
}
