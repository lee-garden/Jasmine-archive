package lee.garden.jasmine.service;

import lee.garden.jasmine.EntityMetaStore;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class JasmineService {

    private final EntityMetaStore entityMetaStore;

    public JasmineService(EntityMetaStore entityMetaStore) {
        this.entityMetaStore = entityMetaStore;
    }

}
