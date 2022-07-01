package org.vedatdemirdev.thread;

import org.vedatdemirdev.services.StudentService;

public class ReadingThread implements Runnable {

    StudentService studentService;

   public ReadingThread(StudentService studentService){
       this.studentService = studentService;
   }


    @Override
    public void run() {
        studentService.getAll();
    }


}
