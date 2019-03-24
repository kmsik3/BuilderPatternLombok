package com.example.demo.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    public enum RoleEnum {
        STUDENT, TEACHER,;
    }

    private String name;
    private String contact;
    private Integer grade;
    private String subject;
    private RoleEnum role;

    @Builder(buildMethodName = "studentBuild")
    public User(String name, String contact, String address, Integer grade) {
        this.name = name;
        this.contact = contact;
        this.grade = grade;
        this.role = RoleEnum.STUDENT;
    }

    @Builder(buildMethodName = "teacherBuild")
    public User(String name, String contact, String address, String subject) {
        this.name = name;
        this.contact = contact;
        this.subject = subject;
        this.role = RoleEnum.TEACHER;
    }
}
