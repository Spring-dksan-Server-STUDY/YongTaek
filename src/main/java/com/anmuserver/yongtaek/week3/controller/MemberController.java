package com.anmuserver.yongtaek.week3.controller;

import com.anmuserver.yongtaek.week3.model.Member;

import com.anmuserver.yongtaek.week3.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("members")
public class MemberController {

    private final MemberService memberService;
    @GetMapping("")
    public List<Member> getAllMembers(){
        return memberService.getAllMembers();
    }
}