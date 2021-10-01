package lee.garden.jasmine.metadata;

public class JasmineField {
    private String name;
    private Class<?> type;

    private JasmineField() {}

    public static JasmineField of(String name, Class<?> type) {
        JasmineField jasmineField = new JasmineField();
        jasmineField.name = name;
        jasmineField.type = type;
        return jasmineField;
    }

    public String getName() {
        return name;
    }

    public Class<?> getType() {
        return type;
    }
}
