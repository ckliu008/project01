package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author liujianfeng
 * @date 2019/12/29 - 16:54
 *
 * 1、IDEA中的代码模板所处位置：File | Settings | Editor | Live Templates
 * 2、常用模板
 */
public class TemplatesTest {

    //模板六：prsf:可生成 private static final
    private static final Customer cust = new Customer();

    //变形：psf
    public static final  int NUM = 1;

    //变形：psfi
    public static final int num = 2;


    //变形：psfs
    public static final String  a="asd";

    //模板一：psvm
    public static void main(String[] args) {


        //模板二：sout
        System.out.println();

        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");//带出形参
        System.out.println("TemplatesTest.main");//带出方法名

        int num1 = 10;
        System.out.println("num1 = " + num1);//带出变量值

        //模板三：fori
        String[] arr =new String[] {"zhangsan","lisi","wangwu","zhaoliu"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        //变形：iter   增强for循环
        for (String s : arr) {
            System.out.println(s);
        }

        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四:list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {
            
        }

        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }

        //变形：list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }


    }

    public void method(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        if (list == null) {

        }

        //变形：
        if (list != null) {

        }

        //变形：xxx.nn  /   xxx.null
        if(list == null){

        }

        if (list != null) {

        }

    }
}
