package satisfyu.herbalbrews.blocks;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import satisfyu.herbalbrews.registry.ObjectRegistry;


public class YerbaMateCropBlock extends CropBlock {
    public static final int MAX_AGE = 3;
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 3);

    public YerbaMateCropBlock(Properties settings) {
        super(settings);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ObjectRegistry.YERBA_MATE_LEAF.get();
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}