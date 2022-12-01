package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;



@Document(collection = "STUDENT")
public class StudentModel {
    @Id
    private int student_id;
    private String Hostel_name;
    private int enroll_no;
    private String branch;
    private String name;
    private String father_name;
    private String mother_name;
    private String blood_grp;
    private String disease;
    private String address;
    private String adi_info;
    private int pin_code;
    private String place;
    private String country;
    private int phone;
    private String email;

    public StudentModel(int student_id, String hostel_name, int enroll_no, String branch, String name, String father_name, String mother_name, String blood_grp, String disease, String address, String adi_info, int pin_code, String place, String country, int phone, String email) {
        this.student_id = student_id;
        Hostel_name = hostel_name;
//        this.clg_id = roll_no;
        this.enroll_no = enroll_no;
        this.branch = branch;
        this.name = name;
        this.father_name = father_name;
        this.mother_name = mother_name;
        this.blood_grp = blood_grp;
        this.disease = disease;
        this.address = address;
        this.adi_info = adi_info;
        this.pin_code = pin_code;
        this.place = place;
        this.country = country;
        this.phone = phone;
        this.email = email;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getHostel_name() {
        return Hostel_name;
    }

    public void setHostel_name(String hostel_name) {
        Hostel_name = hostel_name;
    }



    public int getEnroll_no() {
        return enroll_no;
    }

    public void setEnroll_no(int enroll_no) {
        this.enroll_no = enroll_no;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public String getMother_name() {
        return mother_name;
    }

    public void setMother_name(String mother_name) {
        this.mother_name = mother_name;
    }

    public String getBlood_grp() {
        return blood_grp;
    }

    public void setBlood_grp(String blood_grp) {
        this.blood_grp = blood_grp;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdi_info() {
        return adi_info;
    }

    public void setAdi_info(String adi_info) {
        this.adi_info = adi_info;
    }

    public int getPin_code() {
        return pin_code;
    }

    public void setPin_code(int pin_code) {
        this.pin_code = pin_code;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
