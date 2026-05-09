package com.lothrazar.stonecutterlikeswood;

import java.util.HashMap;
import java.util.Map;

import net.neoforged.neoforge.common.ModConfigSpec;
import net.neoforged.neoforge.common.ModConfigSpec.*;

public class ConfigManager  {

  static ModConfigSpec CONFIG;

  public static Map<StonecutterGrouping, BooleanValue> CONFIG_GROUP = new HashMap<>();
  static {
    final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    BUILDER.comment("Set to false to disable a recipe group (changes require a game restart)").push(ModMain.MODID);
    BooleanValue slabs = BUILDER.comment(" Slabs can be made in the stonecutter").define(StonecutterGrouping.SLABS.toString(), true);
    CONFIG_GROUP.put(StonecutterGrouping.SLABS, slabs);
    BooleanValue stairs = BUILDER.comment(" Stairs can be made in the stonecutter").define(StonecutterGrouping.STAIRS.toString(), true);
    CONFIG_GROUP.put(StonecutterGrouping.STAIRS, stairs);
    BooleanValue logs = BUILDER.comment(" Logs can be made in the stonecutter").define(StonecutterGrouping.LOGS.toString(), true);
    CONFIG_GROUP.put(StonecutterGrouping.LOGS, logs);
    BooleanValue signs = BUILDER.comment(" Signs can be made in the stonecutter").define(StonecutterGrouping.SIGNS.toString(), true);
    CONFIG_GROUP.put(StonecutterGrouping.SIGNS, signs);
    BooleanValue buttons = BUILDER.comment(" Buttons can be made in the stonecutter").define(StonecutterGrouping.BUTTONS.toString(), true);
    CONFIG_GROUP.put(StonecutterGrouping.BUTTONS, buttons);
    BooleanValue pl = BUILDER.comment(" Pressure plates can be made in the stonecutter").define(StonecutterGrouping.PLATES.toString(), true);
    CONFIG_GROUP.put(StonecutterGrouping.PLATES, pl);
    BooleanValue fences = BUILDER.comment(" Fences and gates can be made in the stonecutter").define(StonecutterGrouping.FENCES.toString(), true);
    CONFIG_GROUP.put(StonecutterGrouping.FENCES, fences);
    BooleanValue doors = BUILDER.comment(" Doors can be made in the stonecutter").define(StonecutterGrouping.DOORS.toString(), true);
    CONFIG_GROUP.put(StonecutterGrouping.DOORS, doors);
    BooleanValue trapdoors = BUILDER.comment(" Trapdoors can be made in the stonecutter").define(StonecutterGrouping.TRAPDOORS.toString(), true);
    CONFIG_GROUP.put(StonecutterGrouping.TRAPDOORS, trapdoors);
    BooleanValue boats = BUILDER.comment(" Boats can be made in the stonecutter").define(StonecutterGrouping.BOATS.toString(), true);
    CONFIG_GROUP.put(StonecutterGrouping.BOATS, boats);
    BooleanValue sticks = BUILDER.comment(" Sticks can be made in the stonecutter").define(StonecutterGrouping.STICKS.toString(), true);
    CONFIG_GROUP.put(StonecutterGrouping.STICKS, sticks);
    BUILDER.pop(); // one pop for every push
    CONFIG = BUILDER.build();
  }

//  public ConfigManager() {
//    CONFIG.setConfig(setup(ModMain.MODID));
//  }
}
