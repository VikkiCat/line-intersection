package com.epam.rd.autotasks.intersection;

public class Line {
    int k;
    int b;

    public Line(int k, int b) {
        this.b = b;
        this.k = k;
    }

    public Point intersection(Line other) {
        int x,y;
        if(this.k == other.k){
            return null;
        }
        System.out.println(this.k+";"+this.b);
        System.out.println(other.k+";"+other.b);
        x = (other.b - this.b)/(this.k- other.k);
        y = this.k * x + this.b;

        return new Point(x,y);

    }

}
