package lee.garden.jasmine.metadata;

import lee.garden.jasmine.repository.RepositoryFactory;
import lee.garden.jasmine.testdata.TestEntity;
import lee.garden.jasmine.testdata.TestRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class MetaFactoryTest {

    private MetaFactory metaFactory = new MetaFactory();
    private RepositoryFactory repositoryFactory = new RepositoryFactory(Mockito.mock(ApplicationContext.class));

    @Test
    public void createMetaTest() {
        JasmineEntityMeta entityMeta = JasmineEntityMeta.of(TestEntity.class, repositoryFactory.createRepository(TestEntity.class, TestRepository.class));

        assertNotNull(entityMeta);
    }

}