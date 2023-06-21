package org.example;

import java.util.Objects;

public class Rectangle extends GeometricObject implements Comparable<Rectangle>{
    double width;
    double height;
    double area;
    Rectangle(double width,double height){
        this.width=width;
        this.height=height;
        this.area=width*height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 && Double.compare(rectangle.height, height) == 0 && Double.compare(rectangle.area, area) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, area);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }



    @Override
    public int compareTo(Rectangle o) {
        if (this.getArea()>o.getArea())
            return 1;
        else if (this.getArea()==o.getArea())
            return 0;
        else return -1 ;
    }
}
