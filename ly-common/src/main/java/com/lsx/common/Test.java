package com.lsx.common;

import com.fasterxml.jackson.core.type.TypeReference;
import com.lsx.common.utils.JsonUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

public class Test {
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class User{
        String name;
        Integer age;
    }

    public static void main(String[] args) {

//        User user = new User("lsx",23);
//        String Json = JsonUtils.toString(user);
//        System.out.println("Json:"+Json);
//
//        User user1 = JsonUtils.toBean(Json,User.class);
//        System.out.println("user1:"+user1);
//
//        String Json="[20,15,-18,28]";
//        List<Integer> list=JsonUtils.toList(Json,Integer.class);
//        System.out.println("list="+list);

//        String json="{\"name\": \"lsx\", \"age\":\"18\"}";
//        Map<String, String> map = JsonUtils.toMap(json, String.class, String.class);
//        System.out.println("map:"+map);

        String json="[{\"name\": \"lsx\", \"age\":\"18\"},{\"name\": \"lim\", \"age\":\"11\"},{\"name\": \"ls1x\", \"age\":\"16\"}]";
        List<Map<String, String>> maps = JsonUtils.nativeRead(json, new TypeReference<List<Map<String, String>>>() {
        });
        for (Map<String, String> map : maps) {
            System.out.println("map:"+map);
        }

    }
}
