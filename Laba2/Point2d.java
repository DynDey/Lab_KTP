package com.company;

public class Point2d {
    private double xCoord;
    private double yCoord;

    public Point2d(double x, double y) {
        xCoord = x;
        yCoord = y;
    }
    public Point2d() {
        // Вызов конструктора с 2 параметрами
        this(0,0);
    }
    public double getxCoord()
    {
        return xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

        public void setxCoord(double val) {
        xCoord = val;
    }

    public void setyCoord(double val) {

        yCoord = val;
    }


}

