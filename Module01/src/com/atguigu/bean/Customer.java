package com.atguigu.bean;

import java.util.ArrayList;

public class Customer extends Person{
    public static void main(String[] args){
        System.out.println("Customer!");

        ArrayList list = new ArrayList();
    }

    public void eat(){
        System.out.println("客户吃饭");
    }
}
