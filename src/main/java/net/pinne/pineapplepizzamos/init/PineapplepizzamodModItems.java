package net.pinne.pineapplepizzamos.init;

import net.pinne.pineapplepizzamos.item.SausageItem;
import net.pinne.pineapplepizzamos.item.PizzaItem;
import net.pinne.pineapplepizzamos.item.PizzaDowItem;
import net.pinne.pineapplepizzamos.item.PineapplePizzaItem;
import net.pinne.pineapplepizzamos.item.PieceOfpineappleItem;
import net.pinne.pineapplepizzamos.item.CheeseItem;
import net.pinne.pineapplepizzamos.PineapplepizzamodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class PineapplepizzamodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PineapplepizzamodMod.MODID);
	public static final RegistryObject<Item> PIECE_OFPINEAPPLE = REGISTRY.register("piece_ofpineapple", () -> new PieceOfpineappleItem());
	public static final RegistryObject<Item> PINEAPPLE = block(PineapplepizzamodModBlocks.PINEAPPLE);
	public static final RegistryObject<Item> PIZZA = REGISTRY.register("pizza", () -> new PizzaItem());
	public static final RegistryObject<Item> PIZZA_DOW = REGISTRY.register("pizza_dow", () -> new PizzaDowItem());
	public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese", () -> new CheeseItem());
	public static final RegistryObject<Item> SAUSAGE = REGISTRY.register("sausage", () -> new SausageItem());
	public static final RegistryObject<Item> PINEAPPLE_PIZZA = REGISTRY.register("pineapple_pizza", () -> new PineapplePizzaItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
