package lee.garden.jasmine.metadata;

import lee.garden.jasmine.testdata.TestEntity;
import lee.garden.jasmine.testdata.TestRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetaFactoryTest {

    private MetaFactory metaFactory = new MetaFactory();

    @Test
    public void createMetaTest() {
        JasmineEntityMeta entityMeta = metaFactory.createEntityMeta(TestEntity.class, TestRepository.class);

        assertNotNull(entityMeta);
    }

}