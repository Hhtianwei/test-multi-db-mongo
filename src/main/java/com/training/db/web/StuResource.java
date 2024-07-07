package com.training.db.web;

import com.training.db.service.StuService;
import com.training.tian.util.RandomName;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : tianwei
 * @date : 2024-07-07 20:19
 * @description:
 */
@RestController
@RequestMapping("/stu")
public class StuResource {


    @Resource
    private StuService stuService;

    @GetMapping
    public String save(){

        String randomName = RandomName.getRandomName();
        stuService.saveStu(randomName);
        return randomName;
    }


}
