package com.stephany;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

public class ThirdParty {
    public static void main(String[] args) {
        String name = "mUSA MUGo";
        System.out.println(StringUtils.isBlank(name));
        System.out.println(StringUtils.capitalize(name));
        System.out.println(StringUtils.difference("kenya","Kenya"));
        System.out.println(StringUtils.swapCase(name));
        System.out.println(StringUtils.abbreviate(name, 4));

        System.out.println(RandomStringUtils.random(5));

        System.out.println(RandomStringUtils.randomAlphabetic(5));
    }

}
