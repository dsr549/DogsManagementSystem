package com.sudheerClasses.DMS.repository;

import org.springframework.data.repository.CrudRepository;


import com.sudheerClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {

}
