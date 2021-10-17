package lee.garden.jasmine.metadata;

import lee.garden.jasmine.repository.JasmineRepository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JasmineEntityMeta {

    private String entityName;
    private Class<?> entityClazz;
    private List<JasmineField> fields;
    private JasmineRepository jasmineRepository;

    public String getEntityName() {
        return entityName;
    }

    public Class<?> getEntityClazz() {
        return entityClazz;
    }

    public JasmineRepository getRepository() { return jasmineRepository; }

    public List<JasmineField> getFields() {
        return fields;
    }

    private JasmineEntityMeta() {}

    public static JasmineEntityMeta of(Class<?> entityClazz, JasmineRepository repository) {
        JasmineEntityMeta jasmineEntityMeta = new JasmineEntityMeta();
        jasmineEntityMeta.entityName = entityClazz.getSimpleName();
        jasmineEntityMeta.entityClazz = entityClazz;
        jasmineEntityMeta.jasmineRepository = repository;
        jasmineEntityMeta.fields = Arrays.stream(entityClazz.getDeclaredFields()).map(JasmineField::from).collect(Collectors.toList());
        return jasmineEntityMeta;
    }
}
