package com.ysu2013.repo;

import com.ysu2013.entity.Colleague;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author AaronJiang
 * @version 1.0
 * @date 2018/05/05
 * @mail 1327994105@qq.com
 * @description ColleagueRepository
 */
public interface ColleagueRepository extends JpaRepository<Colleague,Integer>{

    /**
     * 根据名字查找Colleague
     * @param name
     * @return
     */
    Colleague findByName(String name);
}
