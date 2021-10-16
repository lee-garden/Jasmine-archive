package lee.garden.jasmine.metadata;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JasmineField {
    private List<JasmineAnnotation> annotations = List.of();
    private String name;
    private Class<?> type;

    public static JasmineField from(Field field) {
        JasmineField jasmineField = new JasmineField();
        jasmineField.name = field.getName();
        jasmineField.type = field.getType();
        jasmineField.annotations = Arrays.stream(field.getAnnotations()).map(JasmineAnnotation::from).collect(Collectors.toList());
        return jasmineField;
    }

    public String getName() {
        return name;
    }

    public Class<?> getType() {
        return type;
    }

    public List<JasmineAnnotation> getAnnotations() {
        return annotations;
    }

    private JasmineField() {}
}
