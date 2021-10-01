package lee.garden.jasmine;

import lee.garden.jasmine.metadata.JasmineEntityMeta;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class EntityMetaScanProcessor {

    private final JasmineRegistry jasmineRegistry;
    private final EntityMetaStore entityMetaStore;

    public EntityMetaScanProcessor(JasmineRegistry jasmineRegistry, EntityMetaStore entityMetaStore) {
        this.jasmineRegistry = jasmineRegistry;
        this.entityMetaStore = entityMetaStore;
    }

    @PostConstruct
    public void process() {
        List<Pair<Class<?>, Class<?>>> entityList = jasmineRegistry.getEntities();

        entityList.forEach(entityPair -> {
            Class<?> entityClazz = entityPair.getFirst();
            Class<?> repositoryClazz = entityPair.getSecond();

            // TODO : entity processing and save as JasminEntityMeta
            entityMetaStore.addEntityMeta(JasmineEntityMeta.of(entityClazz, repositoryClazz));
        });
    }

}
