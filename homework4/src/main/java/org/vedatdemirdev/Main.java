package org.vedatdemirdev;

import org.vedatdemirdev.entity.Student;
import org.vedatdemirdev.services.JsonService;
import org.vedatdemirdev.services.StudentService;
import org.vedatdemirdev.thread.ReadingThread;
import org.vedatdemirdev.thread.WritingThread;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        StudentService studentService = new StudentService(new JsonService());

        Thread writingThread = new Thread(new WritingThread(studentService));

        Thread readingThread = new Thread(new ReadingThread(studentService));


        readingThread.start(); //starting reading
        writingThread.start(); //starting writing
        readingThread.join(); // Normally threads runs parallel but if we join threads they run ordinal
        writingThread.join(); // Normally threads runs parallel but if we join threads they run ordinal




    }
}