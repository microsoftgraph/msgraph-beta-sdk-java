package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a container that exposes navigation properties for employee experience user resources.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmployeeExperienceUser extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EmployeeExperienceUser} and sets the default values.
     */
    public EmployeeExperienceUser() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EmployeeExperienceUser}
     */
    @jakarta.annotation.Nonnull
    public static EmployeeExperienceUser createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmployeeExperienceUser();
    }
    /**
     * Gets the assignedRoles property value. Represents the collection of Viva Engage roles assigned to a user.
     * @return a {@link java.util.List<EngagementRole>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EngagementRole> getAssignedRoles() {
        return this.backingStore.get("assignedRoles");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedRoles", (n) -> { this.setAssignedRoles(n.getCollectionOfObjectValues(EngagementRole::createFromDiscriminatorValue)); });
        deserializerMap.put("learningCourseActivities", (n) -> { this.setLearningCourseActivities(n.getCollectionOfObjectValues(LearningCourseActivity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the learningCourseActivities property value. The learningCourseActivities property
     * @return a {@link java.util.List<LearningCourseActivity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LearningCourseActivity> getLearningCourseActivities() {
        return this.backingStore.get("learningCourseActivities");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignedRoles", this.getAssignedRoles());
        writer.writeCollectionOfObjectValues("learningCourseActivities", this.getLearningCourseActivities());
    }
    /**
     * Sets the assignedRoles property value. Represents the collection of Viva Engage roles assigned to a user.
     * @param value Value to set for the assignedRoles property.
     */
    public void setAssignedRoles(@jakarta.annotation.Nullable final java.util.List<EngagementRole> value) {
        this.backingStore.set("assignedRoles", value);
    }
    /**
     * Sets the learningCourseActivities property value. The learningCourseActivities property
     * @param value Value to set for the learningCourseActivities property.
     */
    public void setLearningCourseActivities(@jakarta.annotation.Nullable final java.util.List<LearningCourseActivity> value) {
        this.backingStore.set("learningCourseActivities", value);
    }
}
