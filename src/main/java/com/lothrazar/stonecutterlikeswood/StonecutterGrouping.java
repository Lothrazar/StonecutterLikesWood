package com.lothrazar.stonecutterlikeswood;

public enum StonecutterGrouping {

  //must match config entry AND the test in ConfigBooleanCondition
  SLABS, STAIRS, LOGS, SIGNS, BUTTONS, PLATES, FENCES, DOORS, TRAPDOORS, BOATS, STICKS;
  //future:
  // GLASS
  // 
  // MOD COMPAT 

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}