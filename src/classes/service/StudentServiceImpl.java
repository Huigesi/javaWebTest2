package classes.service;

import classes.Business.StudentBusiness;
import classes.entiy.Students;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    @Override
    public List<Students> getAllStudents() {
        return StudentBusiness.getAllStudents();
    }
}
