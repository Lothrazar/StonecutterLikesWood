package com.lothrazar.stonecutterlikeswood;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class ConfigBooleanCondition implements ICondition {

  private static final String id = "config";
  private static final ResourceLocation ID = new ResourceLocation(ModMain.MODID, id);
  private String group;

  public ConfigBooleanCondition(String config) {
    this.group = config;
  }

  @Override
  public ResourceLocation getID() {
    return ID;
  }

  @Override
  public String toString() {
    return id + "(\"" + group + "\")";
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

  public static class Serializer implements IConditionSerializer<ConfigBooleanCondition> {

    public static final Serializer INSTANCE = new Serializer();

    @Override
    public void write(JsonObject json, ConfigBooleanCondition value) {
      json.addProperty(id, value.group.toString());
    }

    @Override
    public ConfigBooleanCondition read(JsonObject json) {
      String config = json.get(id).getAsString();
      return new ConfigBooleanCondition(config);
    }

    @Override
    public ResourceLocation getID() {
      return ID;
    }
  }
}
