package seminar4.controller;

import seminar4.data.Teacher;
import seminar4.service.TeacherService;
import seminar4.view.TeacherView;

import java.time.LocalDate;

public class TeacherController implements UserController<Teacher>{
    private final TeacherView teacherView = new TeacherView();
    private final TeacherService teacherService = new TeacherService();

    @Override
    public void create(String firstName, String secondName, String lastName, LocalDate dateOfBirth) {
        teacherService.create(firstName, secondName, lastName, dateOfBirth);
    }
    public void changeInfoAboutTeacherFromTeachersList(String firstName, String secondName, String changeProp, String changeValue){
        teacherService.changeInfoAboutTeacher(firstName, secondName, changeProp, changeValue);

    }
    public void printAllTeachers(){
        teacherView.sendOnConsole(teacherService.getAll());
    }

}