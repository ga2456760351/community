package life.majiang.community.mapper;

import life.majiang.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("insert into user (name,accountid,token,gmtcreate,gmtmodified) values (#{name},#{accountid},#{token},#{gmtcreate},#{gmtmodified})")
    public void insert(User user);

    @Select("select * from user where token=#{token}")
    User findByToken(@Param(value = "token") String token);
}
