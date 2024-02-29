package net.pinne.pineapplepizzamos.init;

import net.pinne.pineapplepizzamos.PineapplepizzamodMod;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PineapplepizzamodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PineapplepizzamodMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(PineapplepizzamodModItems.PIECE_OFPINEAPPLE.get());
			tabData.accept(PineapplepizzamodModItems.PIZZA.get());
			tabData.accept(PineapplepizzamodModItems.PIZZA_DOW.get());
			tabData.accept(PineapplepizzamodModItems.CHEESE.get());
			tabData.accept(PineapplepizzamodModItems.SAUSAGE.get());
			tabData.accept(PineapplepizzamodModItems.PINEAPPLE_PIZZA.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(PineapplepizzamodModBlocks.PINEAPPLE.get().asItem());
		}
	}
}
