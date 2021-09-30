package lee.garden.jasmine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class JasmineRegistry {

    private static final Logger logger = LoggerFactory.getLogger(JasmineRegistry.class.getName());

    private final List<Pair<Object, Object>> entities = new ArrayList<>();

    public void registerEntity(Object entityClazz, Object repositoryClazz) {
        // TODO: check entity and repository type or annotation
        entities.add(Pair.of(entityClazz, repositoryClazz));
        logger.info("Jasmine registers entity : " + entityClazz);
    }

    public static JasmineRegistry create() {
        return new JasmineRegistry();
    }

    private JasmineRegistry() {
    }
}
