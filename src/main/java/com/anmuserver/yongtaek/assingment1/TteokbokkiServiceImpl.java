package com.anmuserver.yongtaek.assingment1;

public class TteokbokkiServiceImpl implements TteokbokkiInterface {
    @Override
    public void introduce(String name, String spiceLevel){
        System.out.println(name + " 맵: " + spiceLevel);
    }

    @Override
    public void getSideMenuInfo(String sideMenu) {
        System.out.println(sideMenu + " 추가할게요");
    }

    public void introduceYupdduck() {
        TteokbokkiInterface.introduceYupdduck();
    }
}
