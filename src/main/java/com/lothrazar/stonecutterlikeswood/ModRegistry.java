package com.lothrazar.stonecutterlikeswood;

import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModRegistry {

  public static final ConfigBooleanCondition.Serializer CONFIG_CHECKER = new ConfigBooleanCondition.Serializer();

  @SubscribeEvent
  public static void onRegistry(RegisterEvent event) {
    event.register(ForgeRegistries.Keys.RECIPE_SERIALIZERS,
        helper -> CraftingHelper.register(CONFIG_CHECKER));
  }
}
