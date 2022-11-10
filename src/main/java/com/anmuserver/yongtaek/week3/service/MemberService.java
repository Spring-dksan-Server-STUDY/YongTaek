package com.anmuserver.yongtaek.week3.service;

import com.anmuserver.yongtaek.week3.model.Member;
import com.anmuserver.yongtaek.week3.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @GetMapping("")
    @ResponseBody
    public List<Member> getAllMembers(){
        return memberRepository.findAll();
    }
}