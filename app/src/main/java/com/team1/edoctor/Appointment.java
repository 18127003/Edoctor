package com.team1.edoctor;

public class Appointment {
    String patientId;
    String doctorId;
    String date;
    String time;
    public Appointment(String patientId, String doctorId, String date, String time){
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
        this.time = time;
    }
}
