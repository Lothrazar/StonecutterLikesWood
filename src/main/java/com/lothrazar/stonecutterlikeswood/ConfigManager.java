package com.lothrazar.stonecutterlikeswood;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.library.config.ConfigTemplate;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;

public class ConfigManager extends ConfigTemplate {

  private static ForgeConfigSpec CONFIG;

  public static Map<StonecutterGrouping, BooleanValue> CONFIG_GROUP = new HashMap<>();
  static {
    final ForgeConfigSpec.Builder BUILDER = builder();
    BUILDER.comment("Mod settings (changes require a game restart)").push(ModMain.MODID);
    BooleanValue logs = BUILDER.comment(" Logs allowed in the stonecutter").define(StonecutterGrouping.LOGS.toString(), true);
    CONFIG_GROUP.put(StonecutterGrouping.LOGS, logs);
    BooleanValue signs = BUILDER.comment(" Signs allowed in the stonecutter").define(StonecutterGrouping.SIGNS.toString(), true);
    CONFIG_GROUP.put(StonecutterGrouping.SIGNS, signs);
    BUILDER.pop(); // one pop for every push
    CONFIG = BUILDER.build();
  }

  public ConfigManager() {
    CONFIG.setConfig(setup(ModMain.MODID));
  }
}
