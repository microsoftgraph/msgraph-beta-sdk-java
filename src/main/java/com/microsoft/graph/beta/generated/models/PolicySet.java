package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A class containing the properties used for PolicySet.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PolicySet extends Entity implements Parsable {
    /**
     * Instantiates a new PolicySet and sets the default values.
     */
    public PolicySet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PolicySet
     */
    @jakarta.annotation.Nonnull
    public static PolicySet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PolicySet();
    }
    /**
     * Gets the assignments property value. Assignments of the PolicySet.
     * @return a java.util.List<PolicySetAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PolicySetAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the createdDateTime property value. Creation time of the PolicySet.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. Description of the PolicySet.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. DisplayName of the PolicySet.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the errorCode property value. The errorCode property
     * @return a ErrorCode
     */
    @jakarta.annotation.Nullable
    public ErrorCode getErrorCode() {
        return this.backingStore.get("errorCode");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(PolicySetAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getEnumValue(ErrorCode::forValue)); });
        deserializerMap.put("guidedDeploymentTags", (n) -> { this.setGuidedDeploymentTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(PolicySetItem::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("roleScopeTags", (n) -> { this.setRoleScopeTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(PolicySetStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the guidedDeploymentTags property value. Tags of the guided deployment
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getGuidedDeploymentTags() {
        return this.backingStore.get("guidedDeploymentTags");
    }
    /**
     * Gets the items property value. Items of the PolicySet with maximum count 100.
     * @return a java.util.List<PolicySetItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PolicySetItem> getItems() {
        return this.backingStore.get("items");
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modified time of the PolicySet.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the roleScopeTags property value. RoleScopeTags of the PolicySet
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTags() {
        return this.backingStore.get("roleScopeTags");
    }
    /**
     * Gets the status property value. The enum to specify the status of PolicySet.
     * @return a PolicySetStatus
     */
    @jakarta.annotation.Nullable
    public PolicySetStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("errorCode", this.getErrorCode());
        writer.writeCollectionOfPrimitiveValues("guidedDeploymentTags", this.getGuidedDeploymentTags());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("roleScopeTags", this.getRoleScopeTags());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the assignments property value. Assignments of the PolicySet.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<PolicySetAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the createdDateTime property value. Creation time of the PolicySet.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. Description of the PolicySet.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. DisplayName of the PolicySet.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the errorCode property value. The errorCode property
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final ErrorCode value) {
        this.backingStore.set("errorCode", value);
    }
    /**
     * Sets the guidedDeploymentTags property value. Tags of the guided deployment
     * @param value Value to set for the guidedDeploymentTags property.
     */
    public void setGuidedDeploymentTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("guidedDeploymentTags", value);
    }
    /**
     * Sets the items property value. Items of the PolicySet with maximum count 100.
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<PolicySetItem> value) {
        this.backingStore.set("items", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modified time of the PolicySet.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the roleScopeTags property value. RoleScopeTags of the PolicySet
     * @param value Value to set for the roleScopeTags property.
     */
    public void setRoleScopeTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTags", value);
    }
    /**
     * Sets the status property value. The enum to specify the status of PolicySet.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final PolicySetStatus value) {
        this.backingStore.set("status", value);
    }
}
