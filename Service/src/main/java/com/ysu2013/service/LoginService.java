package com.ysu2013.service;

import com.ysu2013.repo.ColleagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author AaronJiang
 * @version 1.0
 * @date 2018/05/04
 * @mail 1327994105@qq.com
 * @description LoginService
 */

@Service
public class LoginService {

    @Autowired
    private ColleagueRepository colleagueRepository;

    public boolean validName(String name) {
        return Objects.isNull(this.colleagueRepository.findByName(name))?false:true;
    }
}
