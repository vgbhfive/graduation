package cn.vgbhfive.graduationproject.repository;

import cn.vgbhfive.graduationproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户信息数据持久操作
 *
 * @time: 2019/1/30
 * @author: Vgbh
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    //List<User> findAllByUsername(String username);

    List<User> findByUsernameIs(String username);

}
