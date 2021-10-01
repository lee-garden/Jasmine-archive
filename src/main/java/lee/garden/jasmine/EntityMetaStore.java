package lee.garden.jasmine;

import lee.garden.jasmine.metadata.JasmineData;
import lee.garden.jasmine.metadata.JasmineEntityMeta;
import org.springframework.stereotype.Component;

@Component
public class EntityMetaStore {

    private JasmineData jasminData = new JasmineData();

    public void addEntityMeta(JasmineEntityMeta entityMeta) {
        jasminData.getJasminEntityMetaList().add(entityMeta);
    }

}
