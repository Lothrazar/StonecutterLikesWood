package com.lothrazar.stonecutterlikeswood;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.neoforged.neoforge.common.conditions.ICondition;

public class ConfigBooleanCondition implements ICondition {

  public static final MapCodec<ConfigBooleanCondition> CODEC = RecordCodecBuilder.mapCodec(inst ->
      inst.group(
          Codec.STRING.fieldOf("config").forGetter(c -> c.group)
      ).apply(inst, ConfigBooleanCondition::new)
  );

  private String group;

  public ConfigBooleanCondition(String config) {
    this.group = config;
  }

  @Override
  public String toString() {
    return "config(\"" + group + "\")";
  }

  @Override
  public MapCodec<? extends ICondition> codec() {
    return CODEC;
  }

  @Override
  public boolean test(IContext context) {
    try {
      var key = StonecutterGrouping.valueOf(group.toUpperCase());
      return ConfigManager.CONFIG_GROUP.get(key).get();
    }
    catch (Exception e) {
      ModMain.LOGGER.error("Bad config entry ", group);
    }
    return false;
  }
}
