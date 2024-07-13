package com.lothrazar.stonecutterlikeswood;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod;

@Mod(ModMain.MODID)
public class ModMain {

  public static final String MODID = "stonecutterlikeswood";
  public static final Logger LOGGER = LogManager.getLogger();

  public ModMain() {
    new ConfigManager();
  }

}
