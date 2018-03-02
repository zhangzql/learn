package com.facebank.springbootmybatis.mapper;

import com.facebank.springbootmybatis.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User映射接口
 */
@Component
@Mapper
public interface UserMapper {

    /**
     * 通过姓名查询对应用户
     * @param name
     * @return
     */
    @Select("SELECT * FROM T_USER WHERE NAME = #{name}")
    User findUserByName(@Param("name") String name);


    /**
     * 查询所有
     * @return
     */
    @Select("SELECT * FROM T_USER")
    List<User> selectAll();

    /**
     * 插入/新增新用户
     * @param name
     * @param age
     * @return
     */
    @Insert("INSERT INTO T_USER(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") String age);

}
