package com.training.db.service;

import com.training.db.entity.MyStu;
import com.training.db.repository.StuRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @author : tianwei
 * @date : 2024-07-07 20:14
 * @description:
 */
@Service
public class StuService {

    @Resource
    private StuRepository stuRepository;

    public void saveStu(String name){
        MyStu stu = new MyStu();
        stu.setName(name);
        stu.setCreateTime(LocalDateTime.now());
        stuRepository.save(stu);
    }

}
