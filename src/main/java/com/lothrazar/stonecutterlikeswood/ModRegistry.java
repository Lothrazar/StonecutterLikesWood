package com.lothrazar.stonecutterlikeswood;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.RegisterEvent;

//@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModRegistry {

//  @SubscribeEvent
  public static void onRegistry(RegisterEvent event) {
    event.register(NeoForgeRegistries.Keys.CONDITION_CODECS,
        helper -> helper.register(
            ResourceLocation.fromNamespaceAndPath(ModMain.MODID, "config"),
            ConfigBooleanCondition.CODEC));
  }
}
