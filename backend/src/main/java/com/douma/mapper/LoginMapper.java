package com.douma.mapper;

import com.douma.entity.Admin;
import com.douma.entity.Student;
import com.douma.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface LoginMapper {
    @Select("select adminId,adminName,sex,tel,email,cardId,role" +
            " from admin where adminId = #{username} and pwd = #{password}")
    Admin adminLogin(Integer username, String password);

    @Select("select teacherId,teacherName,institute,sex,tel,email,cardId,type,role" +
            " from teacher where teacherId = #{username} and pwd = #{password}")
    Teacher teacherLogin(Integer username, String password);

    @Select("select studentId,studentName,grade,major,clazz,institute,tel," +
            " email,cardId,sex,role from student where studentId = #{username} and pwd = #{password}")
    Student studentLogin(Integer username, String password);

}
