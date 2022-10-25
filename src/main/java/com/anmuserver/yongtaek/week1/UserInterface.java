package com.anmuserver.yongtaek.week1;

public interface UserInterface {
    // can only use these variable
    String CLUB = "SOPT";

    // forced to be implemented
    void introduce(String name, int age, String mbti);

    // could be implemented, not forced
    default void getInfo(int generation, String part) {
        System.out.println("SOPT " + generation + "기 " + part + " 파트입니다.");
    }

    // can't be implemented
    static void introduceSOPT() {
        System.out.println("Shout Our Passion Together.");
    }
}
