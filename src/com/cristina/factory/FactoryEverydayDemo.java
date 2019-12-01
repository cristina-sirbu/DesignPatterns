package com.cristina.factory;

import java.util.Calendar;

public class FactoryEverydayDemo {
    public static void main(String[] args) {
//        Everyday example =>

//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar);
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site.getPages());
        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site.getPages());
    }
}
