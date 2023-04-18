package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationSynchronizationCustomizations extends EducationSynchronizationCustomizationsBase implements Parsable {
    /** Customizations for School entities. */
    private EducationSynchronizationCustomization school;
    /** Customizations for Section entities. */
    private EducationSynchronizationCustomization section;
    /** Customizations for Student entities. */
    private EducationSynchronizationCustomization student;
    /** Customizations for Student Enrollments. */
    private EducationSynchronizationCustomization studentEnrollment;
    /** Customizations for Teacher entities. */
    private EducationSynchronizationCustomization teacher;
    /** Customizations for Teacher Rosters. */
    private EducationSynchronizationCustomization teacherRoster;
    /**
     * Instantiates a new EducationSynchronizationCustomizations and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationSynchronizationCustomizations() {
        super();
        this.setOdataType("#microsoft.graph.educationSynchronizationCustomizations");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationSynchronizationCustomizations
     */
    @javax.annotation.Nonnull
    public static EducationSynchronizationCustomizations createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSynchronizationCustomizations();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("school", (n) -> { this.setSchool(n.getObjectValue(EducationSynchronizationCustomization::createFromDiscriminatorValue)); });
        deserializerMap.put("section", (n) -> { this.setSection(n.getObjectValue(EducationSynchronizationCustomization::createFromDiscriminatorValue)); });
        deserializerMap.put("student", (n) -> { this.setStudent(n.getObjectValue(EducationSynchronizationCustomization::createFromDiscriminatorValue)); });
        deserializerMap.put("studentEnrollment", (n) -> { this.setStudentEnrollment(n.getObjectValue(EducationSynchronizationCustomization::createFromDiscriminatorValue)); });
        deserializerMap.put("teacher", (n) -> { this.setTeacher(n.getObjectValue(EducationSynchronizationCustomization::createFromDiscriminatorValue)); });
        deserializerMap.put("teacherRoster", (n) -> { this.setTeacherRoster(n.getObjectValue(EducationSynchronizationCustomization::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the school property value. Customizations for School entities.
     * @return a educationSynchronizationCustomization
     */
    @javax.annotation.Nullable
    public EducationSynchronizationCustomization getSchool() {
        return this.school;
    }
    /**
     * Gets the section property value. Customizations for Section entities.
     * @return a educationSynchronizationCustomization
     */
    @javax.annotation.Nullable
    public EducationSynchronizationCustomization getSection() {
        return this.section;
    }
    /**
     * Gets the student property value. Customizations for Student entities.
     * @return a educationSynchronizationCustomization
     */
    @javax.annotation.Nullable
    public EducationSynchronizationCustomization getStudent() {
        return this.student;
    }
    /**
     * Gets the studentEnrollment property value. Customizations for Student Enrollments.
     * @return a educationSynchronizationCustomization
     */
    @javax.annotation.Nullable
    public EducationSynchronizationCustomization getStudentEnrollment() {
        return this.studentEnrollment;
    }
    /**
     * Gets the teacher property value. Customizations for Teacher entities.
     * @return a educationSynchronizationCustomization
     */
    @javax.annotation.Nullable
    public EducationSynchronizationCustomization getTeacher() {
        return this.teacher;
    }
    /**
     * Gets the teacherRoster property value. Customizations for Teacher Rosters.
     * @return a educationSynchronizationCustomization
     */
    @javax.annotation.Nullable
    public EducationSynchronizationCustomization getTeacherRoster() {
        return this.teacherRoster;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("school", this.getSchool());
        writer.writeObjectValue("section", this.getSection());
        writer.writeObjectValue("student", this.getStudent());
        writer.writeObjectValue("studentEnrollment", this.getStudentEnrollment());
        writer.writeObjectValue("teacher", this.getTeacher());
        writer.writeObjectValue("teacherRoster", this.getTeacherRoster());
    }
    /**
     * Sets the school property value. Customizations for School entities.
     * @param value Value to set for the school property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchool(@javax.annotation.Nullable final EducationSynchronizationCustomization value) {
        this.school = value;
    }
    /**
     * Sets the section property value. Customizations for Section entities.
     * @param value Value to set for the section property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSection(@javax.annotation.Nullable final EducationSynchronizationCustomization value) {
        this.section = value;
    }
    /**
     * Sets the student property value. Customizations for Student entities.
     * @param value Value to set for the student property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStudent(@javax.annotation.Nullable final EducationSynchronizationCustomization value) {
        this.student = value;
    }
    /**
     * Sets the studentEnrollment property value. Customizations for Student Enrollments.
     * @param value Value to set for the studentEnrollment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStudentEnrollment(@javax.annotation.Nullable final EducationSynchronizationCustomization value) {
        this.studentEnrollment = value;
    }
    /**
     * Sets the teacher property value. Customizations for Teacher entities.
     * @param value Value to set for the teacher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeacher(@javax.annotation.Nullable final EducationSynchronizationCustomization value) {
        this.teacher = value;
    }
    /**
     * Sets the teacherRoster property value. Customizations for Teacher Rosters.
     * @param value Value to set for the teacherRoster property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeacherRoster(@javax.annotation.Nullable final EducationSynchronizationCustomization value) {
        this.teacherRoster = value;
    }
}
