package by.itacademy.ivanchikov.Colrction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyMapMain {
    public static void main(String[] args) {
        Map<String,String>headers=new HashMap<>();
        headers.put("content-type1","application/json");
        headers.put("content-type2","application/json");
        System.out.println(headers);
        List<String>users=new ArrayList<>();
        users.add("Vasy");
    }
}
