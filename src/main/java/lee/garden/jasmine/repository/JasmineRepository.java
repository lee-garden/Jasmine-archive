package lee.garden.jasmine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public class JasmineRepository {

    private Class<?> entityType;
    private JpaRepository jpaRepository;

    private JasmineRepository() {}

    public static JasmineRepository of(Class<?> entityType, JpaRepository jpaRepository) {
        JasmineRepository jasmineRepository = new JasmineRepository();
        jasmineRepository.entityType = entityType;
        jasmineRepository.jpaRepository = jpaRepository;
        return jasmineRepository;
    }
}
