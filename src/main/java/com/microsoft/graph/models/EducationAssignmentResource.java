package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationAssignmentResource extends Entity implements Parsable {
    /**
     * Instantiates a new EducationAssignmentResource and sets the default values.
     */
    public EducationAssignmentResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationAssignmentResource
     */
    @jakarta.annotation.Nonnull
    public static EducationAssignmentResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationAssignmentResource();
    }
    /**
     * Gets the dependentResources property value. The dependentResources property
     * @return a java.util.List<EducationAssignmentResource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationAssignmentResource> getDependentResources() {
        return this.BackingStore.get("dependentResources");
    }
    /**
     * Gets the distributeForStudentWork property value. Indicates whether this resource should be copied to each student submission for modification and submission. Required
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDistributeForStudentWork() {
        return this.BackingStore.get("distributeForStudentWork");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("dependentResources", (n) -> { this.setDependentResources(n.getCollectionOfObjectValues(EducationAssignmentResource::createFromDiscriminatorValue)); });
        deserializerMap.put("distributeForStudentWork", (n) -> { this.setDistributeForStudentWork(n.getBooleanValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(EducationResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resource property value. Resource object that has been associated with this assignment.
     * @return a EducationResource
     */
    @jakarta.annotation.Nullable
    public EducationResource getResource() {
        return this.BackingStore.get("resource");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("dependentResources", this.getDependentResources());
        writer.writeBooleanValue("distributeForStudentWork", this.getDistributeForStudentWork());
        writer.writeObjectValue("resource", this.getResource());
    }
    /**
     * Sets the dependentResources property value. The dependentResources property
     * @param value Value to set for the dependentResources property.
     */
    public void setDependentResources(@jakarta.annotation.Nullable final java.util.List<EducationAssignmentResource> value) {
        this.BackingStore.set("dependentResources", value);
    }
    /**
     * Sets the distributeForStudentWork property value. Indicates whether this resource should be copied to each student submission for modification and submission. Required
     * @param value Value to set for the distributeForStudentWork property.
     */
    public void setDistributeForStudentWork(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("distributeForStudentWork", value);
    }
    /**
     * Sets the resource property value. Resource object that has been associated with this assignment.
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final EducationResource value) {
        this.BackingStore.set("resource", value);
    }
}
