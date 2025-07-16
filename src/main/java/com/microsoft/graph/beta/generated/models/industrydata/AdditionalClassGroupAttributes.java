package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AdditionalClassGroupAttributes implements ValuedEnum {
    CourseTitle("courseTitle"),
    CourseCode("courseCode"),
    CourseSubject("courseSubject"),
    CourseGradeLevel("courseGradeLevel"),
    CourseExternalId("courseExternalId"),
    AcademicSessionTitle("academicSessionTitle"),
    AcademicSessionExternalId("academicSessionExternalId"),
    ClassCode("classCode"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AdditionalClassGroupAttributes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AdditionalClassGroupAttributes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "courseTitle": return CourseTitle;
            case "courseCode": return CourseCode;
            case "courseSubject": return CourseSubject;
            case "courseGradeLevel": return CourseGradeLevel;
            case "courseExternalId": return CourseExternalId;
            case "academicSessionTitle": return AcademicSessionTitle;
            case "academicSessionExternalId": return AcademicSessionExternalId;
            case "classCode": return ClassCode;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
