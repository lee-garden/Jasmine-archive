package lee.garden.jasmine;

import lee.garden.jasmine.metadata.JasminData;
import lee.garden.jasmine.metadata.JasminEntityMeta;
import org.springframework.stereotype.Component;

@Component
public class EntityMetaStore {

    private JasminData jasminData = new JasminData();

    public void addEntityMeta(JasminEntityMeta entityMeta) {
        jasminData.getJasminEntityMetaList().add(entityMeta);
    }

}
