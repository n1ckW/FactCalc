package data;

import java.util.HashMap;

//TODO: read crafting data from file instead of manual entry

public class ItemData {
	public static Item 	
			//raw materials
			IronPlate = new Item("IronPlate", true, null, 0f),
			CopperPlate = new Item("CopperPlate", true, null, 0f),
			Coal = new Item("Coal", true, null, 0f),
			PetroleumGas = new Item("PetroleumGas", true, null, 0f),
			Lubricant = new Item("Lubricant", true, null, 0f),
			SolidFuel = new Item("SolidFuel", true, null, 0f),
			Stone = new Item("Stone", true, null, 0f),
			
			//crafting products
			Plastic, Sulfur, IronGearWheel, IronStick, Motor, ElectricMotor, StoneBrick, StoneTablet, Sand, 
			Glass, Concrete, CopperCable, ElectronicCircuit, AdvancedCircuit, ProcessingUnit, 
			BurnerInserter, Inserter, StoneFurnace, SteelFurnace, ElectricFurnace, TransportBelt, 
			SteelPlate, FirearmsMagazine, PiercingRoundsMagazine, Grenade, StoneWall, Pipe, EngineUnit, 
			ElectricEngineUnit, Rail, HeatShield, Module_1, Module_2, Module_3, SulfuricAcid, Battery,
			FlyingRobotFrame, LowDensityStructure, RocketFuel, AutomationSciencePack, LogisticSciencePack,
			MilitarySciencePack, ChemicalSciencePack, ProductionSciencePack, UtilitySciencePack, RocketSciencePack;
			
	
	public static void init() {		
		
			//crafting recipes		
			HashMap<Item,Float> Sulfur_Map = new HashMap<Item, Float>();
			Sulfur_Map.put(PetroleumGas, 30f);
			Sulfur = new Item("Sulfur", false, Sulfur_Map, 2f);	
			
			HashMap<Item,Float> Plastic_Map = new HashMap<Item, Float>();
			Plastic_Map.put(Coal, 1f);
			Plastic_Map.put(PetroleumGas, 20f);
			Plastic = new Item("Plastic", false, Plastic_Map, 2f);	
		
			HashMap<Item, Float> IronGearWheelMap = new HashMap<Item, Float>();
			IronGearWheelMap.put(IronPlate, 2f);
			IronGearWheel = new Item("IronGearWheel", false, IronGearWheelMap, 1f);
		
			HashMap<Item, Float> MotorMap = new HashMap<Item, Float>();
			MotorMap.put(IronPlate, 1f);
			MotorMap.put(IronGearWheel, 1f);
			Motor = new Item("Motor", false, MotorMap, 1f);
		
			HashMap<Item, Float> TransportBeltMap = new HashMap<Item,Float>();
			TransportBeltMap.put(IronPlate, 1f);
			TransportBeltMap.put(Motor, 1f);
			TransportBelt = new Item("TransportBelt", false, TransportBeltMap, 2f);
		
			HashMap<Item,Float> CopperCable_Map = new HashMap<Item, Float>();
			CopperCable_Map.put(CopperPlate, 1f);
			CopperCable = new Item("CopperCable", false, CopperCable_Map, 2f);
		
			HashMap<Item,Float> ElectricMotor_Map = new HashMap<Item, Float>();
			ElectricMotor_Map.put(Motor, 1f);
			ElectricMotor_Map.put(CopperCable, 6f);
			ElectricMotor = new Item("ElectricMotor", false, ElectricMotor_Map, 1f);
			
			HashMap<Item,Float> Sand_Map = new HashMap<Item, Float>();
			Sand_Map.put(Stone, 1f);
			Sand = new Item("Sand", false, Sand_Map, 2f);
			
			HashMap<Item,Float> Glass_Map = new HashMap<Item, Float>();
			Glass_Map.put(Sand, 4f);
			Glass = new Item("Glass", false, Glass_Map, 1f);	
		
			HashMap<Item,Float> IronStick_Map = new HashMap<Item, Float>();
			IronStick_Map.put(IronPlate, 1f);
			IronStick = new Item("IronStick", false, IronStick_Map, 2f);

			HashMap<Item,Float> BurnerInserter_Map = new HashMap<Item, Float>();
			BurnerInserter_Map.put(IronStick, 2f);
			BurnerInserter_Map.put(Motor, 1f);
			BurnerInserter = new Item("BurnerInserter", false, BurnerInserter_Map, 1f);
			
			HashMap<Item,Float> Inserter_Map = new HashMap<Item, Float>();
			Inserter_Map.put(BurnerInserter, 1f);
			Inserter_Map.put(ElectricMotor, 1f);
			Inserter = new Item("Inserter", false, Inserter_Map, 1f);	
			
			HashMap<Item,Float> FirearmsMagazine_Map = new HashMap<Item, Float>();
			FirearmsMagazine_Map.put(IronPlate, 4f);
			FirearmsMagazine = new Item("FirearmsMagazine", false, FirearmsMagazine_Map, 1f);	
			
			HashMap<Item,Float> SteelPlate_Map = new HashMap<Item, Float>();
			SteelPlate_Map.put(IronPlate, 5f);
			SteelPlate = new Item("SteelPlate", false, SteelPlate_Map, 1f);	
			
			HashMap<Item,Float> PiercingRoundsMagazine_Map = new HashMap<Item, Float>();
			PiercingRoundsMagazine_Map.put(FirearmsMagazine, 1f);
			PiercingRoundsMagazine_Map.put(SteelPlate, 1f);
			PiercingRoundsMagazine_Map.put(CopperPlate, 5f);
			PiercingRoundsMagazine = new Item("PiercingRoundsMagazine", false, PiercingRoundsMagazine_Map, 1f);	
			
			HashMap<Item,Float> Grenade_Map = new HashMap<Item, Float>();
			Grenade_Map.put(Coal, 10f);
			Grenade_Map.put(IronPlate, 5f);
			Grenade = new Item("Grenade", false, Grenade_Map, 1f);	
			
			HashMap<Item,Float> StoneBrick_Map = new HashMap<Item, Float>();
			StoneBrick_Map.put(Stone, 2f);
			StoneBrick = new Item("StoneBrick", false, StoneBrick_Map, 1f);	
			
			HashMap<Item,Float> StoneWall_Map = new HashMap<Item, Float>();
			StoneWall_Map.put(StoneBrick, 5f);
			StoneWall = new Item("StoneWall", false, StoneWall_Map, 1f);	
			
			HashMap<Item,Float> StoneTablet_Map = new HashMap<Item, Float>();
			StoneTablet_Map.put(StoneBrick, 1f);
			StoneTablet = new Item("StoneTablet", false, StoneTablet_Map, 4f);	

			HashMap<Item,Float> Circuit_Map = new HashMap<Item, Float>();
			Circuit_Map.put(StoneTablet, 1f);
			Circuit_Map.put(CopperCable, 3f);
			ElectronicCircuit = new Item("Circuit", false, Circuit_Map, 1f);	
			
			HashMap<Item,Float> AdvancedCircuit_Map = new HashMap<Item, Float>();
			AdvancedCircuit_Map.put(Plastic, 2f);
			AdvancedCircuit_Map.put(CopperCable, 4f);
			AdvancedCircuit_Map.put(ElectronicCircuit, 2f);
			AdvancedCircuit = new Item("AdvancedCircuit", false, AdvancedCircuit_Map, 1f);	
			
			HashMap<Item,Float> Pipe_Map = new HashMap<Item, Float>();
			Pipe_Map.put(IronPlate, 1f);
			Pipe = new Item("Pipe", false, Pipe_Map, 1f);	
			
			HashMap<Item,Float> EngineUnit_Map = new HashMap<Item, Float>();
			EngineUnit_Map.put(SteelPlate, 2f);
			EngineUnit_Map.put(IronGearWheel, 2f);
			EngineUnit_Map.put(Motor, 1f);
			EngineUnit_Map.put(Pipe, 2f);
			EngineUnit = new Item("EngineUnit", false, EngineUnit_Map, 1f);	
		
			HashMap<Item,Float> Rail_Map = new HashMap<Item, Float>();
			Rail_Map.put(Stone, 1f);
			Rail_Map.put(SteelPlate, 1f);
			Rail_Map.put(IronStick, 1f);
			Rail = new Item("Rail", false, Rail_Map, 2f);	
			
			HashMap<Item,Float> HeatShield_Map = new HashMap<Item, Float>();
			HeatShield_Map.put(StoneTablet, 20f);
			HeatShield_Map.put(SteelPlate, 2f);
			HeatShield_Map.put(Sulfur, 8f);
			HeatShield = new Item("HeatShield", false, HeatShield_Map, 1f);	
			
			HashMap<Item,Float> StoneFurnace_Map = new HashMap<Item, Float>();
			StoneFurnace_Map.put(Stone, 5f);
			StoneFurnace = new Item("StoneFurnace", false, StoneFurnace_Map, 1f);	
			
			HashMap<Item,Float> SteelFurnace_Map = new HashMap<Item, Float>();
			SteelFurnace_Map.put(StoneFurnace, 1f);
			SteelFurnace_Map.put(SteelPlate, 6f);
			SteelFurnace_Map.put(StoneBrick, 6f);
			SteelFurnace = new Item("SteelFurnace", false, SteelFurnace_Map, 1f);	
			
			HashMap<Item,Float> ElectricFurnace_Map = new HashMap<Item, Float>();
			ElectricFurnace_Map.put(SteelPlate, 5f);
			ElectricFurnace_Map.put(AdvancedCircuit, 5f);
			ElectricFurnace_Map.put(HeatShield, 2f);
			ElectricFurnace_Map.put(SteelFurnace, 1f);
			ElectricFurnace = new Item("ElectricFurnace", false, ElectricFurnace_Map, 1f);	
			
			HashMap<Item,Float> module_1_map = new HashMap<Item, Float>();
			module_1_map.put(ElectronicCircuit, 5f);
			module_1_map.put(AdvancedCircuit, 5f);
			Module_1 = new Item("Module1", false, module_1_map, 1f);	
			
			HashMap<Item,Float> SulfuricAcid_Map = new HashMap<Item, Float>();
			SulfuricAcid_Map.put(Sulfur, 5f);
			SulfuricAcid_Map.put(IronPlate, 1f);
			SulfuricAcid = new Item("SulfuricAcid", false, SulfuricAcid_Map, 50f);	
			
			HashMap<Item,Float> ProcessingUnit_Map = new HashMap<Item, Float>();
			ProcessingUnit_Map.put(ElectronicCircuit, 20f);			
			ProcessingUnit_Map.put(AdvancedCircuit, 2f);
			ProcessingUnit_Map.put(SulfuricAcid, 5f);
			ProcessingUnit = new Item("ProcessingUnit", false, ProcessingUnit_Map, 1f);	
			
			HashMap<Item,Float> Battery_Map = new HashMap<Item, Float>();
			Battery_Map.put(IronPlate, 1f);
			Battery_Map.put(CopperPlate, 1f);
			Battery_Map.put(SulfuricAcid, 20f);
			Battery = new Item("Battery", false, Battery_Map, 1f);	
			
			HashMap<Item,Float> ElectricEngineUnit_Map = new HashMap<Item, Float>();
			ElectricEngineUnit_Map.put(ElectronicCircuit, 1f);
			ElectricEngineUnit_Map.put(EngineUnit, 1f);
			ElectricEngineUnit_Map.put(ElectricMotor, 1f);
			ElectricEngineUnit_Map.put(Lubricant, 40f);
			ElectricEngineUnit = new Item("ElectricEngineUnit", false, ElectricEngineUnit_Map, 1f);	
			
			HashMap<Item,Float> FlyingRobotFrame_Map = new HashMap<Item, Float>();
			FlyingRobotFrame_Map.put(SteelPlate, 4f);
			FlyingRobotFrame_Map.put(Battery, 4f);
			FlyingRobotFrame_Map.put(ElectricEngineUnit, 4f);
			FlyingRobotFrame_Map.put(ElectronicCircuit, 4f);
			FlyingRobotFrame = new Item("FlyingRobotFrame", false, FlyingRobotFrame_Map, 1f);	
			
			HashMap<Item,Float> RocketFuel_Map = new HashMap<Item, Float>();
			RocketFuel_Map.put(SolidFuel, 10f);
			RocketFuel = new Item("RocketFuel", false, RocketFuel_Map, 1f);	
			
			HashMap<Item,Float> LowDensityStructure_Map = new HashMap<Item, Float>();
			LowDensityStructure_Map.put(Glass, 10f);
			LowDensityStructure_Map.put(CopperPlate, 10f);
			LowDensityStructure_Map.put(Plastic, 10f);
			LowDensityStructure_Map.put(SteelPlate, 10f);
			LowDensityStructure = new Item("LowDensityStructure", false, LowDensityStructure_Map, 1f);	
			
			HashMap<Item,Float> AutomationSciencePack_Map = new HashMap<Item, Float>();
			AutomationSciencePack_Map.put(CopperPlate, 1f);
			AutomationSciencePack_Map.put(IronGearWheel, 1f);
			AutomationSciencePack = new Item("AutomationSciencePack", false, AutomationSciencePack_Map, 1f);	
			
			HashMap<Item,Float> LogisticSciencePack_Map = new HashMap<Item, Float>();			
			LogisticSciencePack_Map.put(TransportBelt, 2f);
			LogisticSciencePack_Map.put(Inserter, 1f);
			LogisticSciencePack = new Item("LogisticSciencePack", false, LogisticSciencePack_Map, 2f);	
			
			HashMap<Item,Float> MilitarySciencePack_Map = new HashMap<Item, Float>();
			MilitarySciencePack_Map.put(PiercingRoundsMagazine, 1f);
			MilitarySciencePack_Map.put(Grenade, 1f);
			MilitarySciencePack_Map.put(StoneWall, 2f);
			MilitarySciencePack = new Item("MilitarySciencePack", false, MilitarySciencePack_Map, 2f);	
			
			HashMap<Item,Float> ChemicalSciencePack_Map = new HashMap<Item, Float>();
			ChemicalSciencePack_Map.put(SolidFuel, 1f);
			ChemicalSciencePack_Map.put(AdvancedCircuit, 3f);
			ChemicalSciencePack_Map.put(EngineUnit, 2f);
			ChemicalSciencePack = new Item("ChemicalSciencePack", false, ChemicalSciencePack_Map, 2f);	
			
			HashMap<Item,Float> ProductionSciencePack_Map = new HashMap<Item, Float>();
			ProductionSciencePack_Map.put(Rail, 30f);
			ProductionSciencePack_Map.put(ElectricFurnace, 1f);
			ProductionSciencePack_Map.put(Module_1, 1f);
			ProductionSciencePack = new Item("ProductionSciencePack", false, ProductionSciencePack_Map, 3f);	
			
			HashMap<Item,Float> UtilitySciencePack_Map = new HashMap<Item, Float>();
			UtilitySciencePack_Map.put(ProcessingUnit, 3f);
			UtilitySciencePack_Map.put(FlyingRobotFrame, 1f);
			UtilitySciencePack_Map.put(LowDensityStructure, 3f);
			UtilitySciencePack = new Item("UtilitySciencePack", false, UtilitySciencePack_Map, 5f);	
			
			HashMap<Item,Float> RocketSciencePack_Map = new HashMap<Item, Float>();
			RocketSciencePack_Map.put(Battery, 5f);
			RocketSciencePack_Map.put(ProcessingUnit, 1f);
			RocketSciencePack_Map.put(HeatShield, 1f);
			RocketSciencePack_Map.put(LowDensityStructure, 1f);
			RocketSciencePack_Map.put(RocketFuel, 2f);
			RocketSciencePack = new Item("RocketSciencePack", false, RocketSciencePack_Map, 3f);	
			
			HashMap<Item,Float> module_2_map = new HashMap<Item, Float>();;
			module_2_map.put(AdvancedCircuit, 5f);
			module_2_map.put(ProcessingUnit, 5f);
			module_2_map.put(Module_1, 3f);
			Module_2 = new Item("Module2", false, module_2_map, 1f);	
			
			HashMap<Item,Float> module_3_map = new HashMap<Item, Float>();;
			module_3_map.put(AdvancedCircuit, 5f);
			module_3_map.put(ProcessingUnit, 5f);
			module_3_map.put(Module_2, 3f);
			Module_3 = new Item("Module3", false, module_3_map, 1f);	
			
//			HashMap<Item,Float> XXX_Map = new HashMap<Item, Float>();
//			XXX_Map.put(YYY, 1f);
//			XXX = new Item("XXX", false, XXX_Map, 1f);	
	}
}
