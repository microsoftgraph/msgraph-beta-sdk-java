package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationSynchronizationCustomizations extends EducationSynchronizationCustomizationsBase implements Parsable {
    /** Customizations for School entities. */
    private EducationSynchronizationCustomization _school;
    /** Customizations for Section entities. */
    private EducationSynchronizationCustomization _section;
    /** Customizations for Student entities. */
    private EducationSynchronizationCustomization _student;
    /** Customizations for Student Enrollments. */
    private EducationSynchronizationCustomization _studentEnrollment;
    /** Customizations for Teacher entities. */
    private EducationSynchronizationCustomization _teacher;
    /** Customizations for Teacher Rosters. */
    private EducationSynchronizationCustomization _teacherRoster;
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationSynchronizationCustomizations currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("school", (n) -> { currentObject.setSchool(n.getObjectValue(EducationSynchronizationCustomization::createFromDiscriminatorValue)); });
        deserializerMap.put("section", (n) -> { currentObject.setSection(n.getObjectValue(EducationSynchronizationCustomization::createFromDiscriminatorValue)); });
        deserializerMap.put("student", (n) -> { currentObject.setStudent(n.getObjectValue(EducationSynchronizationCustomization::createFromDiscriminatorValue)); });
        deserializerMap.put("studentEnrollment", (n) -> { currentObject.setStudentEnrollment(n.getObjectValue(EducationSynchronizationCustomization::createFromDiscriminatorValue)); });
        deserializerMap.put("teacher", (n) -> { currentObject.setTeacher(n.getObjectValue(EducationSynchronizationCustomization::createFromDiscriminatorValue)); });
        deserializerMap.put("teacherRoster", (n) -> { currentObject.setTeacherRoster(n.getObjectValue(EducationSynchronizationCustomization::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the school property value. Customizations for School entities.
     * @return a educationSynchronizationCustomization
     */
    @javax.annotation.Nullable
    public EducationSynchronizationCustomization getSchool() {
        return this._school;
    }
    /**
     * Gets the section property value. Customizations for Section entities.
     * @return a educationSynchronizationCustomization
     */
    @javax.annotation.Nullable
    public EducationSynchronizationCustomization getSection() {
        return this._section;
    }
    /**
     * Gets the student property value. Customizations for Student entities.
     * @return a educationSynchronizationCustomization
     */
    @javax.annotation.Nullable
    public EducationSynchronizationCustomization getStudent() {
        return this._student;
    }
    /**
     * Gets the studentEnrollment property value. Customizations for Student Enrollments.
     * @return a educationSynchronizationCustomization
     */
    @javax.annotation.Nullable
    public EducationSynchronizationCustomization getStudentEnrollment() {
        return this._studentEnrollment;
    }
    /**
     * Gets the teacher property value. Customizations for Teacher entities.
     * @return a educationSynchronizationCustomization
     */
    @javax.annotation.Nullable
    public EducationSynchronizationCustomization getTeacher() {
        return this._teacher;
    }
    /**
     * Gets the teacherRoster property value. Customizations for Teacher Rosters.
     * @return a educationSynchronizationCustomization
     */
    @javax.annotation.Nullable
    public EducationSynchronizationCustomization getTeacherRoster() {
        return this._teacherRoster;
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
        this._school = value;
    }
    /**
     * Sets the section property value. Customizations for Section entities.
     * @param value Value to set for the section property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSection(@javax.annotation.Nullable final EducationSynchronizationCustomization value) {
        this._section = value;
    }
    /**
     * Sets the student property value. Customizations for Student entities.
     * @param value Value to set for the student property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStudent(@javax.annotation.Nullable final EducationSynchronizationCustomization value) {
        this._student = value;
    }
    /**
     * Sets the studentEnrollment property value. Customizations for Student Enrollments.
     * @param value Value to set for the studentEnrollment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStudentEnrollment(@javax.annotation.Nullable final EducationSynchronizationCustomization value) {
        this._studentEnrollment = value;
    }
    /**
     * Sets the teacher property value. Customizations for Teacher entities.
     * @param value Value to set for the teacher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeacher(@javax.annotation.Nullable final EducationSynchronizationCustomization value) {
        this._teacher = value;
    }
    /**
     * Sets the teacherRoster property value. Customizations for Teacher Rosters.
     * @param value Value to set for the teacherRoster property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeacherRoster(@javax.annotation.Nullable final EducationSynchronizationCustomization value) {
        this._teacherRoster = value;
    }
}
