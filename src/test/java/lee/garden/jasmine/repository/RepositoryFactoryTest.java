package lee.garden.jasmine.repository;

import lee.garden.jasmine.testdata.TestRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryFactoryTest {

    private RepositoryFactory repositoryFactory = new RepositoryFactory();

    @Test
    public void createMetaTest() {
        JasmineRepository repository = repositoryFactory.createRepository(TestRepository.class);

        assertNotNull(repository);
    }

}