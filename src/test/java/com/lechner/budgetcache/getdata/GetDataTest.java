package com.lechner.budgetcache.getdata;

import com.lechner.budgetcache.entities.Tmpplanningjob;
import com.lechner.budgetcache.repository.TmpPlanningJobRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GetDataTest {

    @Mock
    TmpPlanningJobRepository tmpPlanningJobRepository;

    @InjectMocks
    GetData getData;

    @Test
    void getDataTest() {
        Tmpplanningjob tmpj = new Tmpplanningjob();
        tmpj.setId(1);
        tmpj.setPrio(4);
        tmpj.setKategorie(2);
        tmpj.setPlanId("4");
    //GetData getData = new GetData();
        when(tmpPlanningJobRepository.findById(new Long(123))).thenReturn(Optional.of(tmpj));
        Tmpplanningjob result = getData.getNextPlanningJob();
        assert (result.getPlan_id().equals("4"));
        assert (result.getId() == 1);
    }
}
