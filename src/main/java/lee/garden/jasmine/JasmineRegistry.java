package lee.garden.jasmine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class JasmineRegistry {

    private static final Logger logger = LoggerFactory.getLogger(JasmineRegistry.class.getName());

    private final List<Pair<Class<?>, Class<?>>> entities = new ArrayList<>();

    public void registerEntity(Class<?> entityClazz, Class<?> repositoryClazz) {
        // TODO: check entity and repository type or annotation
        entities.add(Pair.of(entityClazz, repositoryClazz));
        logger.info("Jasmine registers entity : " + entityClazz);
    }

    public static JasmineRegistry create() {
        return new JasmineRegistry();
    }

    public List<Pair<Class<?>, Class<?>>> getEntities() {
        return entities;
    }

    private JasmineRegistry() {
    }
}
