package lee.garden.jasmine.repository;

import lee.garden.jasmine.testdata.TestEntity;
import lee.garden.jasmine.testdata.TestRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryFactoryTest {

    private RepositoryFactory repositoryFactory = new RepositoryFactory(Mockito.mock(ApplicationContext.class));

    @Test
    public void createMetaTest() {
        JasmineRepository repository = repositoryFactory.createRepository(TestEntity.class, TestRepository.class);

        assertNotNull(repository);
    }

}