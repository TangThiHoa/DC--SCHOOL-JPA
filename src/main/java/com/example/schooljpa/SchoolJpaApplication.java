package com.example.schooljpa;

import com.example.schooljpa.daicent.model.Clazz;
import com.example.schooljpa.daicent.model.School;
import com.example.schooljpa.daicent.model.Student;
import com.example.schooljpa.daicent.service.impl.ClazzServiceImpl;
import com.example.schooljpa.daicent.service.impl.SchoolServiceImpl;
import com.example.schooljpa.daicent.service.impl.StudentImpl;
import com.example.schooljpa.daicent.service.impl.UnitServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
@EnableAspectJAutoProxy
@Slf4j
public class SchoolJpaApplication implements CommandLineRunner {
    @Autowired
    SchoolServiceImpl schoolService;
    @Autowired
    UnitServiceImpl unitService;
    @Autowired
    ClazzServiceImpl clazzService;
    @Autowired
    StudentImpl student;

    public static void main(String[] args) throws Exception{
        System.out.println("loi");
        SpringApplication.run(SchoolJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("loi2123");
//        System.out.println( schoolService.findAll());
//        System.out.println(schoolService.findById(2L));
//        School school = new School("TH");
//        schoolService.save(school);
//        schoolService.remove(2L);
        System.out.println(student.findAll());
        student.save(new Student("Trang",new Clazz(1L)));

    }
}
