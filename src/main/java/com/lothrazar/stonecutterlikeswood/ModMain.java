package com.lothrazar.stonecutterlikeswood;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@Mod(ModMain.MODID)
public class ModMain {

  public static final String MODID = "stonecutterlikeswood";
  public static final Logger LOGGER = LogManager.getLogger();

  public ModMain(IEventBus bus, ModContainer modContainer) {
    modContainer.registerConfig(ModConfig.Type.COMMON, ConfigManager.CONFIG);
    bus.addListener(ModRegistry::onRegistry);
//    ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigManager.CONFIG);
  }

}
