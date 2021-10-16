package lee.garden.jasmine.metadata;

import lee.garden.jasmine.testdata.TestEntity;
import lee.garden.jasmine.testdata.TestRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JasmineEntityMetaTest {

    @Test
    public void setEntityMetaTest() {
        JasmineEntityMeta actual = JasmineEntityMeta.of(TestEntity.class, TestRepository.class);

        assertEquals("TestEntity", actual.getEntityName());
        assertEquals(TestEntity.class, actual.getEntityClazz());
        assertEquals(TestRepository.class, actual.getRepositoryClazz());
        assertEquals(2, actual.getFields().size());
    }

}