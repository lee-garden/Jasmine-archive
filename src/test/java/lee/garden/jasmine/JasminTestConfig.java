package lee.garden.jasmine;

import lee.garden.jasmine.testdata.TestEntity;
import lee.garden.jasmine.testdata.TestRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JasminTestConfig {

    @Bean
    public JasmineRegistry jasmineRegistry() {
        JasmineRegistry jasmineRegistry = JasmineRegistry.create();
        jasmineRegistry.registerEntity(TestEntity.class, TestRepository.class);
        return jasmineRegistry;
    }
}
