package com.microsoft.graph.beta.models.cloudlicensing;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdminCloudLicensing extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AdminCloudLicensing} and sets the default values.
     */
    public AdminCloudLicensing() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AdminCloudLicensing}
     */
    @jakarta.annotation.Nonnull
    public static AdminCloudLicensing createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdminCloudLicensing();
    }
    /**
     * Gets the allotments property value. The set of all allotments within the organization. Read-only.
     * @return a {@link java.util.List<Allotment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Allotment> getAllotments() {
        return this.backingStore.get("allotments");
    }
    /**
     * Gets the assignmentErrors property value. The set of all asynchronous allotment assignment errors that affect the organization. Read-only.
     * @return a {@link java.util.List<AssignmentError>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssignmentError> getAssignmentErrors() {
        return this.backingStore.get("assignmentErrors");
    }
    /**
     * Gets the assignments property value. The set of all license assignments within the organization. Not nullable.
     * @return a {@link java.util.List<Assignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Assignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allotments", (n) -> { this.setAllotments(n.getCollectionOfObjectValues(Allotment::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentErrors", (n) -> { this.setAssignmentErrors(n.getCollectionOfObjectValues(AssignmentError::createFromDiscriminatorValue)); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(Assignment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("allotments", this.getAllotments());
        writer.writeCollectionOfObjectValues("assignmentErrors", this.getAssignmentErrors());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
    }
    /**
     * Sets the allotments property value. The set of all allotments within the organization. Read-only.
     * @param value Value to set for the allotments property.
     */
    public void setAllotments(@jakarta.annotation.Nullable final java.util.List<Allotment> value) {
        this.backingStore.set("allotments", value);
    }
    /**
     * Sets the assignmentErrors property value. The set of all asynchronous allotment assignment errors that affect the organization. Read-only.
     * @param value Value to set for the assignmentErrors property.
     */
    public void setAssignmentErrors(@jakarta.annotation.Nullable final java.util.List<AssignmentError> value) {
        this.backingStore.set("assignmentErrors", value);
    }
    /**
     * Sets the assignments property value. The set of all license assignments within the organization. Not nullable.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<Assignment> value) {
        this.backingStore.set("assignments", value);
    }
}
