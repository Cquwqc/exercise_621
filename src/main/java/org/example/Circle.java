package org.example;

public class Circle implements Comparable<Circle> {

    private double i;

    public double getArea() {
        return i * i * Math.PI;//求出圆面积的方法。
    }
    // 例如我们比较对象的半径  或者是 面积 等等

    public Circle() {
    }

    public Circle(double i) {
        this.i = i;
    }
    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    @Override//必须实现compareTo，才算实现了接口Comparable
    public int compareTo(Circle o) {
        // 按照比较面积来举例：
        // 如果当前对象比另一个对象的面积大 则返回1
        // 如果当前对象和另一个对象的面积相等 则返回0
        // 否则当前对象比另一个对象面积小 则返回-1
        if (this.getArea()>o.getArea())
            return 1;
        else if (this.getArea()==o.getArea())
            return 0;
        else return -1 ;
    }
}