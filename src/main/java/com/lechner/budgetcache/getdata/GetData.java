package com.lechner.budgetcache.getdata;

import com.lechner.budgetcache.entities.Tmpplanningjob;
import com.lechner.budgetcache.repository.TmpPlanningJobRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GetData {
    @Autowired
    private TmpPlanningJobRepository planCacheRepository;
    public Tmpplanningjob getNextPlanningJob() {
        Tmpplanningjob job = planCacheRepository.findById(new Long(123)).orElse(new Tmpplanningjob());
        return job;
    }
}
