package com.microsoft.graph.models;

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
public class PolicySet extends Entity implements Parsable {
    /**
     * Assignments of the PolicySet.
     */
    private java.util.List<PolicySetAssignment> assignments;
    /**
     * Creation time of the PolicySet.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Description of the PolicySet.
     */
    private String description;
    /**
     * DisplayName of the PolicySet.
     */
    private String displayName;
    /**
     * The errorCode property
     */
    private ErrorCode errorCode;
    /**
     * Tags of the guided deployment
     */
    private java.util.List<String> guidedDeploymentTags;
    /**
     * Items of the PolicySet with maximum count 100.
     */
    private java.util.List<PolicySetItem> items;
    /**
     * Last modified time of the PolicySet.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * RoleScopeTags of the PolicySet
     */
    private java.util.List<String> roleScopeTags;
    /**
     * The enum to specify the status of PolicySet.
     */
    private PolicySetStatus status;
    /**
     * Instantiates a new policySet and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public PolicySet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a policySet
     */
    @jakarta.annotation.Nonnull
    public static PolicySet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PolicySet();
    }
    /**
     * Gets the assignments property value. Assignments of the PolicySet.
     * @return a policySetAssignment
     */
    @jakarta.annotation.Nullable
    public java.util.List<PolicySetAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the createdDateTime property value. Creation time of the PolicySet.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. Description of the PolicySet.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. DisplayName of the PolicySet.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the errorCode property value. The errorCode property
     * @return a errorCode
     */
    @jakarta.annotation.Nullable
    public ErrorCode getErrorCode() {
        return this.errorCode;
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
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getEnumValue(ErrorCode.class)); });
        deserializerMap.put("guidedDeploymentTags", (n) -> { this.setGuidedDeploymentTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(PolicySetItem::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("roleScopeTags", (n) -> { this.setRoleScopeTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(PolicySetStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the guidedDeploymentTags property value. Tags of the guided deployment
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getGuidedDeploymentTags() {
        return this.guidedDeploymentTags;
    }
    /**
     * Gets the items property value. Items of the PolicySet with maximum count 100.
     * @return a policySetItem
     */
    @jakarta.annotation.Nullable
    public java.util.List<PolicySetItem> getItems() {
        return this.items;
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modified time of the PolicySet.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the roleScopeTags property value. RoleScopeTags of the PolicySet
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTags() {
        return this.roleScopeTags;
    }
    /**
     * Gets the status property value. The enum to specify the status of PolicySet.
     * @return a policySetStatus
     */
    @jakarta.annotation.Nullable
    public PolicySetStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<PolicySetAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the createdDateTime property value. Creation time of the PolicySet.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. Description of the PolicySet.
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. DisplayName of the PolicySet.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the errorCode property value. The errorCode property
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setErrorCode(@jakarta.annotation.Nullable final ErrorCode value) {
        this.errorCode = value;
    }
    /**
     * Sets the guidedDeploymentTags property value. Tags of the guided deployment
     * @param value Value to set for the guidedDeploymentTags property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setGuidedDeploymentTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.guidedDeploymentTags = value;
    }
    /**
     * Sets the items property value. Items of the PolicySet with maximum count 100.
     * @param value Value to set for the items property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setItems(@jakarta.annotation.Nullable final java.util.List<PolicySetItem> value) {
        this.items = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modified time of the PolicySet.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the roleScopeTags property value. RoleScopeTags of the PolicySet
     * @param value Value to set for the roleScopeTags property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRoleScopeTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTags = value;
    }
    /**
     * Sets the status property value. The enum to specify the status of PolicySet.
     * @param value Value to set for the status property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStatus(@jakarta.annotation.Nullable final PolicySetStatus value) {
        this.status = value;
    }
}
