package lee.garden.jasmine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public class JasmineRepository {

    private JpaRepository jpaRepository;

    private JasmineRepository() {}

    public static JasmineRepository of() {
        return new JasmineRepository();
    }
}
