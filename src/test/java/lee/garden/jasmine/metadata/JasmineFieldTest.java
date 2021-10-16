package lee.garden.jasmine.metadata;

import lee.garden.jasmine.testdata.TestEntity;
import lee.garden.jasmine.testdata.TestRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JasmineFieldTest {

    @Test
    public void setEntityMetaTest() {
        JasmineEntityMeta actual = JasmineEntityMeta.of(TestEntity.class, TestRepository.class);

        assertTrue(actual.getFields().stream().anyMatch(jasminField -> jasminField.getName().equals("id")));
        assertTrue(actual.getFields().stream().anyMatch(jasminField -> jasminField.getName().equals("name")));
    }

}