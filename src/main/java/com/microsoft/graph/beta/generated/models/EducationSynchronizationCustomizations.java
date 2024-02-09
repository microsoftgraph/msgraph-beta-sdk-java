package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationSynchronizationCustomizations extends EducationSynchronizationCustomizationsBase implements Parsable {
    /**
     * Instantiates a new {@link EducationSynchronizationCustomizations} and sets the default values.
     */
    public EducationSynchronizationCustomizations() {
        super();
        this.setOdataType("#microsoft.graph.educationSynchronizationCustomizations");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationSynchronizationCustomizations}
     */
    @jakarta.annotation.Nonnull
    public static EducationSynchronizationCustomizations createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSynchronizationCustomizations();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
     * @return a {@link EducationSynchronizationCustomization}
     */
    @jakarta.annotation.Nullable
    public EducationSynchronizationCustomization getSchool() {
        return this.backingStore.get("school");
    }
    /**
     * Gets the section property value. Customizations for Section entities.
     * @return a {@link EducationSynchronizationCustomization}
     */
    @jakarta.annotation.Nullable
    public EducationSynchronizationCustomization getSection() {
        return this.backingStore.get("section");
    }
    /**
     * Gets the student property value. Customizations for Student entities.
     * @return a {@link EducationSynchronizationCustomization}
     */
    @jakarta.annotation.Nullable
    public EducationSynchronizationCustomization getStudent() {
        return this.backingStore.get("student");
    }
    /**
     * Gets the studentEnrollment property value. Customizations for Student Enrollments.
     * @return a {@link EducationSynchronizationCustomization}
     */
    @jakarta.annotation.Nullable
    public EducationSynchronizationCustomization getStudentEnrollment() {
        return this.backingStore.get("studentEnrollment");
    }
    /**
     * Gets the teacher property value. Customizations for Teacher entities.
     * @return a {@link EducationSynchronizationCustomization}
     */
    @jakarta.annotation.Nullable
    public EducationSynchronizationCustomization getTeacher() {
        return this.backingStore.get("teacher");
    }
    /**
     * Gets the teacherRoster property value. Customizations for Teacher Rosters.
     * @return a {@link EducationSynchronizationCustomization}
     */
    @jakarta.annotation.Nullable
    public EducationSynchronizationCustomization getTeacherRoster() {
        return this.backingStore.get("teacherRoster");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setSchool(@jakarta.annotation.Nullable final EducationSynchronizationCustomization value) {
        this.backingStore.set("school", value);
    }
    /**
     * Sets the section property value. Customizations for Section entities.
     * @param value Value to set for the section property.
     */
    public void setSection(@jakarta.annotation.Nullable final EducationSynchronizationCustomization value) {
        this.backingStore.set("section", value);
    }
    /**
     * Sets the student property value. Customizations for Student entities.
     * @param value Value to set for the student property.
     */
    public void setStudent(@jakarta.annotation.Nullable final EducationSynchronizationCustomization value) {
        this.backingStore.set("student", value);
    }
    /**
     * Sets the studentEnrollment property value. Customizations for Student Enrollments.
     * @param value Value to set for the studentEnrollment property.
     */
    public void setStudentEnrollment(@jakarta.annotation.Nullable final EducationSynchronizationCustomization value) {
        this.backingStore.set("studentEnrollment", value);
    }
    /**
     * Sets the teacher property value. Customizations for Teacher entities.
     * @param value Value to set for the teacher property.
     */
    public void setTeacher(@jakarta.annotation.Nullable final EducationSynchronizationCustomization value) {
        this.backingStore.set("teacher", value);
    }
    /**
     * Sets the teacherRoster property value. Customizations for Teacher Rosters.
     * @param value Value to set for the teacherRoster property.
     */
    public void setTeacherRoster(@jakarta.annotation.Nullable final EducationSynchronizationCustomization value) {
        this.backingStore.set("teacherRoster", value);
    }
}
