package lee.garden.jasmine.metadata;

import lee.garden.jasmine.repository.JasmineRepository;
import org.springframework.stereotype.Component;

@Component
public class MetaFactory {

    public JasmineEntityMeta createEntityMeta(Class<?> entityClazz, JasmineRepository repository) {
        return JasmineEntityMeta.of(entityClazz, repository);
    }

}
