package com;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class TestHashing {
    @Test
    void testIntegerHashing_CachedRange() {
        Integer a = 45;
        Integer b = 45;
        Integer c = new Integer(45);
        int hashValue = Integer.hashCode(45);
        log.info("Hash code Value for object is: " + hashValue);

        log.info("Hashcode of a = {}, b = {}, c = {}", a.hashCode(), b.hashCode(), c.hashCode());
        log.info("Hashcode of a == b -> {}, b == c -> {}", (a == b), (b == c));

    }

    @Test
    void testIntegerHashing_NonCachedRange() {
        Integer a = 4500;
        Integer b = 4500;
        Integer c = new Integer(4500);
        int hashValue = Integer.hashCode(4500);
        log.info("Hash code Value for object is: " + hashValue);

        log.info("Hashcode of a = {}, b = {}, c = {}", a.hashCode(), b.hashCode(), c.hashCode());
        log.info("Hashcode of a == b -> {}, b == c -> {}", a == b, b == c);

    }

    @Test
    void testStringHashing() {
        String a = "45";
        String b = "45";
        String c = new String("45");

        log.info("Hashcode of a = {}, b = {}, c = {}", a.hashCode(), b.hashCode(), c.hashCode());
        log.info("Hashcode of a == b -> {}, b == c - {}", (a == b), (b == c));

    }

}
