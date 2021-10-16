package lee.garden.jasmine.metadata;

import java.lang.annotation.Annotation;

public class JasmineAnnotation {

    private String name;

    public static JasmineAnnotation from(Annotation annotation) {
        JasmineAnnotation jasmineAnnotation = new JasmineAnnotation();
        jasmineAnnotation.name = annotation.annotationType().getSimpleName();
        return jasmineAnnotation;
    }

    public String getName() {
        return this.name;
    }

    private JasmineAnnotation(){}
}
