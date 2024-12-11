package com.mysite.jump_to_sb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
public class HelloLombok {
    private final String Hello;
    private final int lombok;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("ㅋㅋㅋㅋ",5);



        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}
