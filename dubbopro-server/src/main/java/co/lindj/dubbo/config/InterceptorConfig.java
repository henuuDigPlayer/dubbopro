package co.lindj.dubbo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author lindj
 * @date 2018/5/9 14:07
 * @description 拦截器配置
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
    }

    @Override
    public MessageCodesResolver getMessageCodesResolver() {
        return null;
    }
}
