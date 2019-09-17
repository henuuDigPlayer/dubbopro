package co.lindj.dubbo.service.impl;

import co.lindj.dubbo.api.UserService;
import co.lindj.dubbo.mapper.UserMapper;
import co.lindj.dubbo.model.User;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lindj
 * @date 2018/5/4 15:48
 * @description 用户模块操作
 */
@Component
@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 获取用户数量
     *
     * @return User 对象列表
     */
    @Override
    public List<String> getList() {
        return this.userMapper.getList().stream().map(User::getName).collect(Collectors.toList());
    }


}
