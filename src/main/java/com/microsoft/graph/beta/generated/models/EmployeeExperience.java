package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a container that exposes navigation properties for employee experience resources.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmployeeExperience extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EmployeeExperience} and sets the default values.
     */
    public EmployeeExperience() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EmployeeExperience}
     */
    @jakarta.annotation.Nonnull
    public static EmployeeExperience createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmployeeExperience();
    }
    /**
     * Gets the communities property value. A collection of communities in Viva Engage.
     * @return a {@link java.util.List<Community>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Community> getCommunities() {
        return this.backingStore.get("communities");
    }
    /**
     * Gets the engagementAsyncOperations property value. A collection of long-running, asynchronous operations related to Viva Engage.
     * @return a {@link java.util.List<EngagementAsyncOperation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EngagementAsyncOperation> getEngagementAsyncOperations() {
        return this.backingStore.get("engagementAsyncOperations");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("communities", (n) -> { this.setCommunities(n.getCollectionOfObjectValues(Community::createFromDiscriminatorValue)); });
        deserializerMap.put("engagementAsyncOperations", (n) -> { this.setEngagementAsyncOperations(n.getCollectionOfObjectValues(EngagementAsyncOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("goals", (n) -> { this.setGoals(n.getObjectValue(Goals::createFromDiscriminatorValue)); });
        deserializerMap.put("learningCourseActivities", (n) -> { this.setLearningCourseActivities(n.getCollectionOfObjectValues(LearningCourseActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("learningProviders", (n) -> { this.setLearningProviders(n.getCollectionOfObjectValues(LearningProvider::createFromDiscriminatorValue)); });
        deserializerMap.put("roles", (n) -> { this.setRoles(n.getCollectionOfObjectValues(EngagementRole::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the goals property value. Represents a collection of goals in a Viva Goals organization.
     * @return a {@link Goals}
     */
    @jakarta.annotation.Nullable
    public Goals getGoals() {
        return this.backingStore.get("goals");
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
     * Gets the learningProviders property value. A collection of learning providers.
     * @return a {@link java.util.List<LearningProvider>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LearningProvider> getLearningProviders() {
        return this.backingStore.get("learningProviders");
    }
    /**
     * Gets the roles property value. A collection of roles in Viva Engage.
     * @return a {@link java.util.List<EngagementRole>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EngagementRole> getRoles() {
        return this.backingStore.get("roles");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("communities", this.getCommunities());
        writer.writeCollectionOfObjectValues("engagementAsyncOperations", this.getEngagementAsyncOperations());
        writer.writeObjectValue("goals", this.getGoals());
        writer.writeCollectionOfObjectValues("learningCourseActivities", this.getLearningCourseActivities());
        writer.writeCollectionOfObjectValues("learningProviders", this.getLearningProviders());
        writer.writeCollectionOfObjectValues("roles", this.getRoles());
    }
    /**
     * Sets the communities property value. A collection of communities in Viva Engage.
     * @param value Value to set for the communities property.
     */
    public void setCommunities(@jakarta.annotation.Nullable final java.util.List<Community> value) {
        this.backingStore.set("communities", value);
    }
    /**
     * Sets the engagementAsyncOperations property value. A collection of long-running, asynchronous operations related to Viva Engage.
     * @param value Value to set for the engagementAsyncOperations property.
     */
    public void setEngagementAsyncOperations(@jakarta.annotation.Nullable final java.util.List<EngagementAsyncOperation> value) {
        this.backingStore.set("engagementAsyncOperations", value);
    }
    /**
     * Sets the goals property value. Represents a collection of goals in a Viva Goals organization.
     * @param value Value to set for the goals property.
     */
    public void setGoals(@jakarta.annotation.Nullable final Goals value) {
        this.backingStore.set("goals", value);
    }
    /**
     * Sets the learningCourseActivities property value. The learningCourseActivities property
     * @param value Value to set for the learningCourseActivities property.
     */
    public void setLearningCourseActivities(@jakarta.annotation.Nullable final java.util.List<LearningCourseActivity> value) {
        this.backingStore.set("learningCourseActivities", value);
    }
    /**
     * Sets the learningProviders property value. A collection of learning providers.
     * @param value Value to set for the learningProviders property.
     */
    public void setLearningProviders(@jakarta.annotation.Nullable final java.util.List<LearningProvider> value) {
        this.backingStore.set("learningProviders", value);
    }
    /**
     * Sets the roles property value. A collection of roles in Viva Engage.
     * @param value Value to set for the roles property.
     */
    public void setRoles(@jakarta.annotation.Nullable final java.util.List<EngagementRole> value) {
        this.backingStore.set("roles", value);
    }
}
