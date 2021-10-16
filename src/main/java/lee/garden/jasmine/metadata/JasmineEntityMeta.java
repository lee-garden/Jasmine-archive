package lee.garden.jasmine.metadata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JasmineEntityMeta {

    private String entityName;
    private Class<?> entityClazz;
    private Class<?> repositoryClazz;
    private List<JasmineField> fields;

    public String getEntityName() {
        return entityName;
    }

    public Class<?> getEntityClazz() {
        return entityClazz;
    }

    public Class<?> getRepositoryClazz() {
        return repositoryClazz;
    }

    public List<JasmineField> getFields() {
        return fields;
    }

    private JasmineEntityMeta() {}

    public static JasmineEntityMeta of(Class<?> entityClazz, Class<?> repositoryClazz) {
        JasmineEntityMeta jasmineEntityMeta = new JasmineEntityMeta();
        jasmineEntityMeta.entityName = entityClazz.getSimpleName();
        jasmineEntityMeta.entityClazz = entityClazz;
        jasmineEntityMeta.repositoryClazz = repositoryClazz;
        jasmineEntityMeta.fields = Arrays.stream(entityClazz.getDeclaredFields()).map(JasmineField::from).collect(Collectors.toList());
        return jasmineEntityMeta;
    }
}
