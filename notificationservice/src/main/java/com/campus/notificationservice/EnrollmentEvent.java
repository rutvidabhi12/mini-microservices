package com.campus.notificationservice;

public record EnrollmentEvent(Long courseId, Long studentId, String studentName) { }