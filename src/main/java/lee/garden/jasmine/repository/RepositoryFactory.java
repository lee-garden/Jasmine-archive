package lee.garden.jasmine.repository;

import org.springframework.stereotype.Component;

@Component
public class RepositoryFactory {

    public JasmineRepository createRepository(Class<?> repositoryClazz) {
        return JasmineRepository.of();
    }
}
