package net.cloudkit.ecosystem.enterprises.interfaces.member.remoting.impl;

import net.cloudkit.ecosystem.enterprises.interfaces.member.remoting.MemberRemoteService;
import org.springframework.stereotype.Service;

@Service("memberRemoteService")
public class MemberRemoteServiceImpl implements MemberRemoteService {

    @Override
    public String sayHello() {
        return "Hello World!";
    }
}
