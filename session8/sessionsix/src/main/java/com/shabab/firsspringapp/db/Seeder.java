package com.shabab.firsspringapp.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
public class Seeder implements ApplicationRunner {

    private StudentRepository repository;


    public Seeder(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("seeder start");
        if (repository.count()==0){
            Student s1=new Student();
            s1.setFullName("ali rezaee");
            s1.setAge(26);
            s1.setBirthDate(new Date());

             Student s2=new Student();
            s2.setFullName("ahmad asadi");
            s2.setAge(28);
            s2.setBirthDate(new Date());


          Student savedSt1=  repository.save(s1);

          Student savedSt2=  repository.save(s2);


            System.out.println("st1"+savedSt1.toString());
            System.out.println("st2"+savedSt2.toString());
        }

        System.out.println("seeder finished");


      List<Student> studentList= (List<Student>) repository.findAll();
        System.out.println("all:"+studentList);



      Optional<Student> studentOptional= repository.findById(1l);
      if (studentOptional.isPresent()){
          System.out.println("student exist:"+studentOptional.get());

      }
      else {
          System.out.println("student not exist");
      }

        Pageable firstPageWithTwoElements = PageRequest.of(0, 1);

        Page<Student> all = repository.findAll(firstPageWithTwoElements);

        System.out.println(all.getTotalPages());
        System.out.println(all.getContent());

    }
}
