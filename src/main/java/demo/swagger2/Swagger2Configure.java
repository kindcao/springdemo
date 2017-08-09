package demo.swagger2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by kind on 2017/8/8.
 */
@Configuration
@EnableSwagger2
public class Swagger2Configure {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("demo.swagger2.controller")).paths(PathSelectors.any())
                .build();
    }

    //构建 api文档的详细信息函数
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //
                .title("Spring Boot中使用Swagger2 UI构建API文档")
                //
                .license("Apache LICENSE 2.0").licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .termsOfServiceUrl("")
                //创建人
                .contact(new Contact("Kind", "http://www.abc.com", "kindapi@finet.cn"))
                //版本号
                .version("1.0")
                //描述
                .description("API 描述")
                //
                .build();
    }

    @Bean
    public UiConfiguration getUiConfig() {
        return new UiConfiguration(null,// url,暂不用
                "none",       // docExpansion          => none | list
                "alpha",      // apiSorter             => alpha
                "schema",     // defaultModelRendering  => schema | model
                UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS, false,        // enableJsonEditor      => true | false
                true,         // showRequestHeaders    => true | false
                null);
    }
}
