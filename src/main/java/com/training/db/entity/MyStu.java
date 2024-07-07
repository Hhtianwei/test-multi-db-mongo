package com.training.db.entity;

import lombok.Data;

/**
 * @author : tianwei
 * @date : 2024-07-07 20:09
 * @description:
 */

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Data
@Document(collection = "my_users")
public class MyStu {

    @Id
    private String id;
    private String name;
    private LocalDateTime createTime;

}
