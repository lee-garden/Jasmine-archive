package lee.garden.jasmine.metadata;

import java.lang.annotation.Annotation;

public class JasminAnnotation {

    private String name;

    public static JasminAnnotation from(Annotation annotation) {
        JasminAnnotation jasminAnnotation = new JasminAnnotation();
        jasminAnnotation.name = annotation.annotationType().getSimpleName();
        return jasminAnnotation;
    }

    public String getName() {
        return this.name;
    }

    private JasminAnnotation(){}
}
