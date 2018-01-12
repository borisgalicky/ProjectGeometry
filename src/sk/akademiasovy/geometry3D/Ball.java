package sk.akademiasovy.geometry3D;

public class Ball implements Operation {
    private double r;

    private double getR(){
        return r;
    }

    @Override
    public double getSurface() {
        return 0;
    }

    @Override
    private double getVolume(){
        return 0;
    }
}