package com.example.itodoserver.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Description:TODO(实体类，对应数据库中的表)
 */
@TableName(value = "sys_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private LocalDateTime createTime;

}
