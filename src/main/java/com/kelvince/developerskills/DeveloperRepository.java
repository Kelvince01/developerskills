package com.kelvince.developerskills;

import org.springframework.data.repository.CrudRepository;

public interface DeveloperRepository extends CrudRepository<Developer, Long> {

    public Developer findOne(Long id);
}
