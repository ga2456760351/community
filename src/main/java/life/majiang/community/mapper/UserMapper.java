package life.majiang.community.mapper;

import life.majiang.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert("insert into user (name,accountid,token,gmtcreate,gmtmodified) values (#{name},#{accountid},#{token},#{gmtcreate},#{gmtmodified})")
    public void insert(User user);
}
