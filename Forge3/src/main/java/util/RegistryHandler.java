	package util;

import com.example.examplemod.ExampleMod;
import Items.ItemBase;
import blocks.BlockItemBase;
import blocks.ChunkOfStupidityBlock;
import blocks.StupidityBlock;
import net.minecraft.block.Block;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tools.ModItemTier;

public class RegistryHandler {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);
	
	public static void init() {	
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}		
	
//	Items
	public static final RegistryObject<Item> Stupidity = ITEMS.register("stupidity", ItemBase::new);
	
//	Tools
	public static final RegistryObject<SwordItem> STUPIDITY_SWORD = ITEMS.register("stupidity_sword",
			() -> new SwordItem(ModItemTier.STUPIDITY, 2147483647, +2147483647f, new Item.Properties().group(ExampleMod.TAB)));
	
	public static final RegistryObject<PickaxeItem> STUPIDITY_PICKAXE = ITEMS.register("stupidity_pickaxe",
			() -> new PickaxeItem(ModItemTier.STUPIDITY, 2147483647, +2147483647f, new Item.Properties().group(ExampleMod.TAB)));
	
	public static final RegistryObject<AxeItem> STUPIDITY_AXE = ITEMS.register("stupidity_axe",
			() -> new AxeItem(ModItemTier.STUPIDITY, 2147483647, +2147483647f, new Item.Properties().group(ExampleMod.TAB)));
	
	public static final RegistryObject<ShovelItem> STUPIDITY_SHOVEL = ITEMS.register("stupidity_shovel",
			() -> new ShovelItem(ModItemTier.STUPIDITY, 2147483647, +2147483647f, new Item.Properties().group(ExampleMod.TAB)));
	
	public static final RegistryObject<HoeItem> STUPIDITY_HOE = ITEMS.register("stupidity_hoe",
			() -> new HoeItem(ModItemTier.STUPIDITY, 2147483647, +2147483647f, new Item.Properties().group(ExampleMod.TAB)));
	
//	Blocks
	public static final RegistryObject<Block> STUPIDITY_BLOCK = BLOCKS.register("stupidity_block", StupidityBlock::new);
	public static final RegistryObject<Block> CHUNK_OF_STUPIDITY = BLOCKS.register("chunk_of_stupidity", ChunkOfStupidityBlock::new);
	
//	Block Items
	public static final RegistryObject<Item> STUPIDITY_BLOCK_ITEM = ITEMS.register("stupidity_block", () -> new BlockItemBase(STUPIDITY_BLOCK.get()));
	public static final RegistryObject<Item> CHUNK_OF_STUPIDITY_ITEM = ITEMS.register("chunk_of_stupidity",
			() -> new BlockItemBase(CHUNK_OF_STUPIDITY.get()));
	
}
