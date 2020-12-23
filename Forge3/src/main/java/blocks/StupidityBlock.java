package blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class StupidityBlock extends Block {
	
	public StupidityBlock() {
		super(Block.Properties.create(Material.IRON)
				.hardnessAndResistance(100.0f, 100.0f)
				.sound(SoundType.METAL)
				.harvestLevel(3)
				.harvestTool(ToolType.PICKAXE));
	}
}
