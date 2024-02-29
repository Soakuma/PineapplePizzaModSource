
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.pinne.pineapplepizzamos.init;

import net.pinne.pineapplepizzamos.block.PineappleBlock;
import net.pinne.pineapplepizzamos.PineapplepizzamodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class PineapplepizzamodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PineapplepizzamodMod.MODID);
	public static final RegistryObject<Block> PINEAPPLE = REGISTRY.register("pineapple", () -> new PineappleBlock());
}
