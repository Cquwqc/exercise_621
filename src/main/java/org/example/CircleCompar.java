package org.example;

import java.util.Comparator;

public class CircleCompar implements Comparator<Circle>{


    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getI()>o2.getI()){
            return 1;
        }else if (o1.getI() == o2.getI()){
            return 0;
        }else
            return -1;
    }
}

