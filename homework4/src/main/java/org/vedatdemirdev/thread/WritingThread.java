package org.vedatdemirdev.thread;

import org.vedatdemirdev.services.StudentService;

public class WritingThread implements Runnable{

    StudentService studentService;

    public WritingThread(StudentService studentService){
        this.studentService=studentService;
    }

    @Override
    public void run() {
        int i = 1;
        try {
            Thread.sleep(1000);
            System.out.println(i++);
            Thread.sleep(1000);
            System.out.println(i++);
            Thread.sleep(1000);
            System.out.println(i++);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        studentService.getAll().forEach(student -> System.out.println(student.getName()));
    }


}
