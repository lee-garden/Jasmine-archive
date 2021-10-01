package lee.garden.jasmine.metadata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JasminEntityMeta {

    private String entityName;
    private Class<?> entityClazz;
    private Class<?> repositoryClazz;
    private List<JasminField> fields;

    private JasminEntityMeta() {
    }

    public static JasminEntityMeta of(Class<?> entityClazz, Class<?> repositoryClazz) {
        JasminEntityMeta jasminEntityMeta = new JasminEntityMeta();
        jasminEntityMeta.entityName = entityClazz.getSimpleName();
        jasminEntityMeta.entityClazz = entityClazz;
        jasminEntityMeta.repositoryClazz = repositoryClazz;
        jasminEntityMeta.fields = Arrays.stream(entityClazz.getDeclaredFields()).map(field -> JasminField.of(field.getName(), field.getType())).collect(Collectors.toList());
        return jasminEntityMeta;
    }

    public String getEntityName() {
        return entityName;
    }

    public Class<?> getEntityClazz() {
        return entityClazz;
    }

    public Class<?> getRepositoryClazz() {
        return repositoryClazz;
    }

    public List<JasminField> getFields() {
        return fields;
    }
}
