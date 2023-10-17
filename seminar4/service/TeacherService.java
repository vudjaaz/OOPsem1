package seminar4.service;

import seminar4.data.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TeacherService implements UserService<Teacher>{
    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for(Teacher teacher: teachers){
            if(teacher.getTeacherId() > countMaxId){
                countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        teachers.add(teacher);
    }
    public void changeInfoAboutTeacher(String firstName, String secondName, String changeProp, String changeValue){
        switch (changeProp) {
            case "firstName" -> {
                for (Teacher teacher : teachers) {
                    if (Objects.equals(teacher.getFirstName(), firstName) && Objects.equals(teacher.getSecondName(), secondName)) {
                        teacher.setFirstName(changeValue);
                    }
                }
            }
            case "secondName" -> {
                for (Teacher teacher : teachers) {
                    if (Objects.equals(teacher.getFirstName(), firstName) && Objects.equals(teacher.getSecondName(), secondName)) {
                        teacher.setSecondName(changeValue);
                    }
                }
            }
            case "patronymic" -> {
                for (Teacher teacher : teachers) {
                    if (Objects.equals(teacher.getFirstName(), firstName) && Objects.equals(teacher.getSecondName(), secondName)) {
                        teacher.setPatronymic(changeValue);
                    }
                }
            }
            case "dateOfBirth" -> {
                for (Teacher teacher : teachers) {
                    if (Objects.equals(teacher.getFirstName(), firstName) && Objects.equals(teacher.getSecondName(), secondName)) {
                        LocalDate localDate = LocalDate.parse(changeValue);
                        teacher.setDateOfBirth(localDate);
                    }
                }
            }
            default -> {
                System.out.printf(String.format("Свойство %s не найдено.", changeProp));
            }
        }
    }
}