package src.constructor.geometricCube;

import java.util.Scanner;

public class GeometricCuboid {
    private int width;
    private int height;
    private int length;

    public GeometricCuboid(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Cuboid(" +
                "w=" + width +
                ", h=" + height +
                ", l=" + length + ')';
    }

}
