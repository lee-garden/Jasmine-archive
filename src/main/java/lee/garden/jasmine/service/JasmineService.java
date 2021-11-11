package lee.garden.jasmine.service;

import lee.garden.jasmine.core.EntityMetaStore;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class JasmineService {

    private final EntityMetaStore entityMetaStore;

    public JasmineService(EntityMetaStore entityMetaStore) {
        this.entityMetaStore = entityMetaStore;
    }

}
