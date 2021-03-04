package com.sbmongo.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.sbmongo.Entity.Student;

public interface StudentRepository extends MongoRepository<Student, Integer> {

}
