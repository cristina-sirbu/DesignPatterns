package com.cristina.builder;

public class LunchOrderDemo {
    public static void main(String[] args) {
//        LunchOrderBean lunchOrderBean = new LunchOrderBean();

//        lunchOrderBean.setBread("Wheat");
//        lunchOrderBean.setCondiments("Lettuce");
//        lunchOrderBean.setDressing("Mustard");
//        lunchOrderBean.setMeat("Ham");

        LunchOrderTele lunchOrder = new LunchOrderTele("Wheat", "Lettuce", "Mustard","Ham");

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
