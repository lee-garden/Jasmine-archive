package lee.garden.jasmine.metadata;

import lee.garden.jasmine.repository.RepositoryFactory;
import lee.garden.jasmine.testdata.TestEntity;
import lee.garden.jasmine.testdata.TestRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class JasmineAnnotationTest {

    private RepositoryFactory repositoryFactory = new RepositoryFactory(Mockito.mock(ApplicationContext.class));

    @Test
    public void setEntityMetaTest() {
        JasmineEntityMeta actual = JasmineEntityMeta.of(TestEntity.class, repositoryFactory.createRepository(TestEntity.class, TestRepository.class));

        assertEquals("Id", actual.getFields().get(0).getAnnotations().get(0).getName());
        assertEquals("GeneratedValue", actual.getFields().get(0).getAnnotations().get(1).getName());
    }

}