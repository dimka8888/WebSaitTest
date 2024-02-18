package by.itacademy.ivanchikov.Colrction;

import java.util.HashMap;
import java.util.Map;

public class MyMapMain2 {
    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("Дмитрий", "посвящённый богине Деметре»");
        names.put("Viktor", "champion");
        names.put("Константин", "постоянный, стойкий");
        System.out.println(names.get("Viktor"));
        names.put("Viktor", "Чемпион");
        System.out.println(names.get("Viktor"));
    }
}
