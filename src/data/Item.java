package data;

import java.util.HashMap;

public class Item {	
	private final String name;
	private final boolean rawMaterial;
	private final HashMap<Item, Float> craftingMaterials;
	private final Float craftingAmount;
		
	public Item(String name, boolean rawMaterial, HashMap<Item, Float> craftingMaterials, Float craftingAmount) {
		this.name = name;
		this.rawMaterial = rawMaterial;
		this.craftingMaterials = craftingMaterials;
		this.craftingAmount = craftingAmount;
	}

	public  String getName() {
		return name;
	}
	
	public boolean isRawMaterial() {
		return rawMaterial;
	}

	public HashMap<Item, Float> getCraftingMaterials() {
		return craftingMaterials;
	}

	public Float getCraftingAmount() {
		return craftingAmount;
	}	
	
}
