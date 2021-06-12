package wraith.waystones.registries;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.registry.Registry;
import wraith.waystones.Utils;
import wraith.waystones.block.WaystoneBlock;
import wraith.waystones.Config;

public final class BlockRegistry {

    public static final Block WAYSTONE = new WaystoneBlock(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, Config.getInstance().getMiningLevel()).strength(Config.getInstance().getHardness(), 3600000));

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, Utils.ID("waystone"), WAYSTONE);
    }

}
