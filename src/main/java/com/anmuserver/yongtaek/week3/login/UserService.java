package com.anmuserver.yongtaek.week3.login;

public class UserService implements Login{
    Login login;

    public UserService(Login login){
        this.login = login;
    }

    @Override
    public void login() {
        login.login();
    }
}
