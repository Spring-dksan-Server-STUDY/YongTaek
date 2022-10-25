package com.anmuserver.yongtaek.assingment1;

public interface TteokbokkiInterface {
    String NAME = "Dongdaemun Yupdduk";

    void introduce(String name, String spiceLevel);

    default void getSideMenuInfo(String sideMenu) {
        System.out.println(sideMenu + " 추가할게요 수저포크x");
    }

    static void introduceYupdduck() {
        System.out.println("Very Very Delicious");
    }
}
