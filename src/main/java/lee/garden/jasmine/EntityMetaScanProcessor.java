package lee.garden.jasmine;

import lee.garden.jasmine.metadata.MetaFactory;
import lee.garden.jasmine.repository.RepositoryFactory;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class EntityMetaScanProcessor {

    private final JasmineRegistry jasmineRegistry;
    private final EntityMetaStore entityMetaStore;

    private final MetaFactory metaFactory;
    private final RepositoryFactory repositoryFactory;

    public EntityMetaScanProcessor(
            JasmineRegistry jasmineRegistry,
            EntityMetaStore entityMetaStore,
            MetaFactory metaFactory,
            RepositoryFactory repositoryFactory)
    {
        this.jasmineRegistry = jasmineRegistry;
        this.entityMetaStore = entityMetaStore;
        this.metaFactory = metaFactory;
        this.repositoryFactory = repositoryFactory;
    }

    @PostConstruct
    public void process() {
        List<Pair<Class<?>, Class<?>>> entityList = jasmineRegistry.getEntities();

        entityList.forEach(entityPair -> {
            Class<?> entityClazz = entityPair.getFirst();
            Class<?> repositoryClazz = entityPair.getSecond();

            // TODO : entity processing and save as JasminEntityMeta
            entityMetaStore.addEntityMeta(metaFactory.createEntityMeta(entityClazz, repositoryClazz));
        });
    }

}
