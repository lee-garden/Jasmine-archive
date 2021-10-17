package lee.garden.jasmine.repository;

import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public class RepositoryFactory {

    private final ApplicationContext applicationContext;

    public RepositoryFactory(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public JasmineRepository createRepository(Class<?> entityType, Class<?> repositoryClazz) {
        JpaRepository<Object, Long> jpaRepository =(JpaRepository)applicationContext.getBean(repositoryClazz);
        return JasmineRepository.of(entityType, jpaRepository);
    }
}
