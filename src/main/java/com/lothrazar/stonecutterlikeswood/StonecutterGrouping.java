package com.lothrazar.stonecutterlikeswood;

public enum StonecutterGrouping {

  //must match config entry AND the test in ConfigBooleanCondition
  LOGS, SIGNS;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}