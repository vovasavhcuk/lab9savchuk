package com.company;

public class Paralelopiped {
    double a;
    double b;
    double c;
    double pl;

    public double getPl() {
        return a*b + b*c + c*a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String PrintInfo() {
        return "(" + a + "," + b + "," + c  + ") - " + pl ;
    }
}
