package edu.epam.api;

import edu.epam.core.Utils;

public class App {
    public static void main(String[] args) {
        Utils utils = new Utils();
        boolean result = utils.isAllPositiveNumbers("12", "79");
        System.out.println(result);
    }
}
