package org.example;

// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Main {
    public static void main(String[] args) {
//        Circle c =new Circle(10);
//        Circle c2 =new Circle();
//        c2.setI(11);
//        System.out.println(c.compareTo(c2));

        Circle c =new Circle(20);
        Circle c2 =new Circle(20);

        CircleCompar k =new CircleCompar();
        int i = k.compare(c,c2);
        System.out.println(i);
        }
    }
