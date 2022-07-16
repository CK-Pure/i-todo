package com.example.itodoserver.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.itodoserver.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 操作数据库的地方
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
