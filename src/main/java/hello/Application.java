package hello;

import com.google.common.collect.Lists;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
//                    .paths(PathSelectors.any())
                    .paths(PathSelectors.regex("^/greeting$"))
                    .build()
                .globalResponseMessage(RequestMethod.POST,
                    Lists.newArrayList(new ResponseMessageBuilder()
                            .code(HttpStatus.OK.value())
                            .message(HttpStatus.OK.getReasonPhrase())
                            .responseModel(null)
                            .build()));
    }
}
