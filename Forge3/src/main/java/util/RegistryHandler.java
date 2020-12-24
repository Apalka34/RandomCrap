	package util;

import com.example.examplemod.ExampleMod;
import Items.ItemBase;
import blocks.BlockItemBase;
import blocks.ChunkOfStupidityBlock;
import blocks.StupidityBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);
	
	public static void init() {	
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}		
	
//	My Items
	public static final RegistryObject<Item> Stupidity = ITEMS.register("stupidity", ItemBase::new);
	
//	Blocks
	public static final RegistryObject<Block> STUPIDITY_BLOCK = BLOCKS.register("stupidity_block", StupidityBlock::new);
	public static final RegistryObject<Block> CHUNK_OF_STUPIDITY = BLOCKS.register("chunk_of_stupidity", ChunkOfStupidityBlock::new);
	
//	Block Items
	public static final RegistryObject<Item> STUPIDITY_BLOCK_ITEM = ITEMS.register("stupidity_block", () -> new BlockItemBase(STUPIDITY_BLOCK.get()));
	public static final RegistryObject<Item> CHUNK_OF_STUPIDITY_ITEM = ITEMS.register("chunk_of_stupidity", () -> new BlockItemBase(CHUNK_OF_STUPIDITY.get()));
	
}
