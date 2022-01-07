package com.tutorials.functional.programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

    void solve() {
        List<Account> accountList = Arrays.asList(
                new Account(1, "Pravin", 30),
                new Account(2, "Naresh", 31),
                new Account(3, "Shishir", 32),
                new Account(4, "Niranjan", 28));

        // get accounts whose age is greater than 30
        accountList.stream()
                .filter(account -> account.getAge() >= 30)
                .forEach(account -> System.out.println(account.getName()));
    }

    public static void main(String[] args) {
        FilterExample driver = new FilterExample();
        driver.solve();
    }
}
