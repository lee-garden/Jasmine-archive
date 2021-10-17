package lee.garden.jasmine.metadata;

import lee.garden.jasmine.repository.RepositoryFactory;
import lee.garden.jasmine.testdata.TestEntity;
import lee.garden.jasmine.testdata.TestRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class JasmineEntityMetaTest {

    private RepositoryFactory repositoryFactory = new RepositoryFactory(Mockito.mock(ApplicationContext.class));

    @Test
    public void setEntityMetaTest() {
        JasmineEntityMeta actual = JasmineEntityMeta.of(TestEntity.class, repositoryFactory.createRepository(TestEntity.class, TestRepository.class));

        assertEquals("TestEntity", actual.getEntityName());
        assertEquals(TestEntity.class, actual.getEntityClazz());
        assertEquals(2, actual.getFields().size());
    }

}