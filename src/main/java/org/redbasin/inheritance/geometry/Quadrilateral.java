package org.redbasin.inheritance.geometry;

public abstract class Quadrilateral extends ConvexShape {
  protected Coordinate northWest;
  protected Coordinate northEast;
  protected Coordinate southEast;
  protected Coordinate southWest;

  public Quadrilateral() {
    numSides = 4;
  }
  public Coordinate getNorthWest() {
    return northWest;
  }
  public Coordinate getNorthEast() {
    return northEast;
  }
  public Coordinate getSouthEast() {
    return southEast;
  }
  public Coordinate getSouthWest() {
    return southWest;
  }
  public int getNumSides() {
    return numSides;
  }
  protected abstract double perimeter();
  protected abstract double area();
}