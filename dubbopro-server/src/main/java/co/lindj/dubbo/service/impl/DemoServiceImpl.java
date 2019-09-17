package co.lindj.dubbo.service.impl;

import co.lindj.dubbo.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author lindj
 * @date 2019/9/9 0009
 * @description
 */
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {
    @Override
    public String getName() {
        return "lindj";
    }
}
