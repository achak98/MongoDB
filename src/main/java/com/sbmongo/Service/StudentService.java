//part of service layer in a spring web app, responsible for carrying out business logic

package com.sbmongo.Service;

import com.sbmongo.DAO.StudentDAO;
import com.sbmongo.Entity.Student;
import com.sbmongo.Entity.StudentUpdatePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public Student createStudent (Student student){
        return  studentDAO.createStudent(student);
    }
    public Collection<Student> getStudents(){
        return studentDAO.getStudents();
    }
    public Optional<Student> getStudentById (int id){
        return studentDAO.getStudentById(id);
    }

    public Optional<Student> delStudentById(int id) {
        return studentDAO.delStudentById(id);
    }

    public Optional<Student> updateStudentById(int id, StudentUpdatePayload studentUpdatePayload) {
        return studentDAO.updateStudentByid(id, studentUpdatePayload);
    }

}
