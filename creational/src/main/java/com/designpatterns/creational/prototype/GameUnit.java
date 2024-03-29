package com.designpatterns.creational.prototype;

import javafx.geometry.Point3D;

public abstract class GameUnit implements Cloneable {

    private Point3D position;

    public GameUnit() {
        position = Point3D.ZERO;
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        //shallow copy
        GameUnit gameUnit = (GameUnit) super.clone();
        gameUnit.initialize();
        return gameUnit;
    }

    protected void initialize() {
        this.position = Point3D.ZERO;
        reset();
    }

    protected abstract void reset();

    public GameUnit(float x, float y, float z) {
        this.position = new Point3D(x, y, z);
    }

    public void move(Point3D direction, float distance) {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

    public Point3D getPosition() {
        return position;
    }

    public void setPosition(Point3D position) {
        this.position = position;
    }
}
