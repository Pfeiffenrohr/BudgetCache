package com.lechner.budgetcache.repository;

import com.lechner.budgetcache.entities.Tmpplanningjob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TmpPlanningJobRepository  extends JpaRepository<Tmpplanningjob, Long>, JpaSpecificationExecutor<Tmpplanningjob> {
}
