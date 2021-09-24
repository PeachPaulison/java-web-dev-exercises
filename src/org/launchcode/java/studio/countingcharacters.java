package org.launchcode.java.studio;

import java.util.HashMap;
import java.util.Map;

public class countingcharacters {
    public static void main(String[] args) {
        String charString = "If the product of two terms is zero then common" +
                " sense says at least one of the two terms has to be zero to start " +
                "with. So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of the " +
                "equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = charString.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : charactersInString) {
            if (!charCount.containsKey(c)) {
                charCount.put(c, 1);
            } else {
                Integer value = charCount.get(c) + 1;
                charCount.replace(c, value);
            }

        }
        for (Map.Entry<Character, Integer> character : charCount.entrySet()) {
            System.out.println(character.getKey() + ":" + character.getValue());
        }
    }
}