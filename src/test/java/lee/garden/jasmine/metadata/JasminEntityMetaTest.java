package lee.garden.jasmine.metadata;

import lee.garden.jasmine.testdata.TestEntity;
import lee.garden.jasmine.testdata.TestRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JasminEntityMetaTest {

    @Test
    public void setEntityMetaTest() {
        JasminEntityMeta actual = JasminEntityMeta.of(TestEntity.class, TestRepository.class);

        assertEquals(actual.getEntityName(), "TestEntity");
        assertEquals(actual.getEntityClazz(), TestEntity.class);
        assertEquals(actual.getRepositoryClazz(), TestRepository.class);
        assertEquals(actual.getFields().size(), 2);
        assertTrue(actual.getFields().stream().anyMatch(jasminField -> jasminField.getName().equals("id")));
        assertTrue(actual.getFields().stream().anyMatch(jasminField -> jasminField.getName().equals("name")));
    }

}