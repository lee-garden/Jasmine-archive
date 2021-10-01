package lee.garden.jasmine;

import lee.garden.jasmine.testdata.TestEntity;
import lee.garden.jasmine.testdata.TestRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.util.Pair;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JasmineRegistryTest extends JasmineTestApplication {

    @Autowired
    private JasmineRegistry jasmineRegistry;

    @Test
    public void getRegisteredEntity() {
        List<Pair<Class<?>, Class<?>>> entities = jasmineRegistry.getEntities();

        assertEquals(TestEntity.class, entities.get(0).getFirst());
        assertEquals(TestRepository.class, entities.get(0).getSecond());
    }

}