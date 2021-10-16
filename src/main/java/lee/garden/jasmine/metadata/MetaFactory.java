package lee.garden.jasmine.metadata;

import org.springframework.stereotype.Component;

@Component
public class MetaFactory {

    public JasmineEntityMeta createEntityMeta(Class<?> entityClazz, Class<?> repositoryClazz) {
        return JasmineEntityMeta.of(entityClazz, repositoryClazz);
    }

}
