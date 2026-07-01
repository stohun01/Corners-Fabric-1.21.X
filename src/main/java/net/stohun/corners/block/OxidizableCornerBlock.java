package net.stohun.corners.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class OxidizableCornerBlock extends CornerBlock implements Oxidizable {
    private final Oxidizable.OxidationLevel oxidationLevel;

    public OxidizableCornerBlock(Oxidizable.OxidationLevel oxidationLevel, Settings settings) {
        super(settings);
        this.oxidationLevel = oxidationLevel;
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    @Override
    protected boolean hasRandomTicks(BlockState state) {
        return this.oxidationLevel != Oxidizable.OxidationLevel.OXIDIZED;
    }

    @Override
    public Oxidizable.OxidationLevel getDegradationLevel() {
        return this.oxidationLevel;
    }
}