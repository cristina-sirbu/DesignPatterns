package com.cristina.CreationalPatterns.builder;

public class LunchOrderDemo {
    public static void main(String[] args) {
//      1. Builder using Beans

//        LunchOrderBean lunchOrderBean = new LunchOrderBean();
//        lunchOrderBean.setBread("Wheat");
//        lunchOrderBean.setCondiments("Lettuce");
//        lunchOrderBean.setDressing("Mustard");
//        lunchOrderBean.setMeat("Ham");

//      2. Builder using telescopic constructors
//        LunchOrderTele lunchOrder = new LunchOrderTele("Wheat", "Lettuce", "Mustard","Ham");

//      3. True Builder Pattern
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Mustard").meat("Ham");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
