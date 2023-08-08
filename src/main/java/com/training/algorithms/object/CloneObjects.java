package com.training.algorithms.object;

public class CloneObjects implements Cloneable{

  @Override
  public CloneObjects clone() {
    try {
      return (CloneObjects) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }

}
