//Data Access Student

package com.sbmongo.DAO;
import com.sbmongo.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sbmongo.Entity.StudentUpdatePayload;

import java.util.Collection;
import java.util.Optional;

@Component
public class StudentDAO {

    @Autowired
    private StudentRepository repository;

    public Collection<Student> getStudents(){
        return repository.findAll();
    }

    public Student createStudent(Student student) {
        return repository.insert(student);
    }

    public Optional<Student> getStudentById(int id) {
        return repository.findById(id);
    }

    public Optional<Student> delStudentById(int id) {
        Optional<Student> std = repository.findById(id);
        std.ifPresent(s -> repository.delete(s));
        return std;
    }

    public Optional<Student> updateStudentByid(int id, StudentUpdatePayload studentUpdatePayload) {
        Optional<Student> std = repository.findById(id);
        std.ifPresent(s -> s.setfName(studentUpdatePayload.getFirstName()));
        std.ifPresent(s -> s.setlName(studentUpdatePayload.getLastName()));
        std.ifPresent(s -> s.setSchoolName(studentUpdatePayload.getSchoolName()));
        std.ifPresent(s -> s.setMarks(studentUpdatePayload.getMarks()));
        std.ifPresent(s -> repository.save(s));
        return std;
    }
}
