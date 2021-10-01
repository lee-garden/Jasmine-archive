package lee.garden.jasmine.metadata;

public class JasminField {
    private String name;
    private Class<?> type;

    private JasminField() {}

    public static JasminField of(String name, Class<?> type) {
        JasminField jasminField = new JasminField();
        jasminField.name = name;
        jasminField.type = type;
        return jasminField;
    }

    public String getName() {
        return name;
    }

    public Class<?> getType() {
        return type;
    }
}
