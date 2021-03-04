//Controllers are a part of web layer in a spring web app

package com.sbmongo.Controller;

import com.sbmongo.Entity.Student;
import com.sbmongo.Entity.StudentUpdatePayload;
import com.sbmongo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/Students")
class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public Collection<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping
    public Student postStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping(value = "/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping(value = "/{id}")
    public Optional<Student> delStudentById(@PathVariable("id") int id) {
        return studentService.delStudentById(id);
    }

    @PutMapping(value = "/{id}")
    public Optional<Student> delStudentById(@PathVariable("id") int id, @RequestBody StudentUpdatePayload
            studentUpdatePayload) {
        return studentService.updateStudentById(id, studentUpdatePayload);
    }

}
