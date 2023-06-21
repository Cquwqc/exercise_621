package org.example;

import javax.xml.crypto.Data;
import java.util.Date;

public class Person implements Cloneable {
    int age;
    double height;
    Date d=new Date(1);//浅克隆不需要再次执行，因此没有创建新的Person.d
    Person(int age,double height){
        this.age=age;
        this.height=height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person p=(Person) super.clone();
        p.d=(Date)d.clone();
        return p;
    }
    //    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }//原生于Object的方法，浅拷贝
}
