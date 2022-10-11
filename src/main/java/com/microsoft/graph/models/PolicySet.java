package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PolicySet extends Entity implements Parsable {
    /** Assignments of the PolicySet. */
    private java.util.List<PolicySetAssignment> _assignments;
    /** Creation time of the PolicySet. */
    private OffsetDateTime _createdDateTime;
    /** Description of the PolicySet. */
    private String _description;
    /** DisplayName of the PolicySet. */
    private String _displayName;
    /** The errorCode property */
    private ErrorCode _errorCode;
    /** Tags of the guided deployment */
    private java.util.List<String> _guidedDeploymentTags;
    /** Items of the PolicySet with maximum count 100. */
    private java.util.List<PolicySetItem> _items;
    /** Last modified time of the PolicySet. */
    private OffsetDateTime _lastModifiedDateTime;
    /** RoleScopeTags of the PolicySet */
    private java.util.List<String> _roleScopeTags;
    /** The enum to specify the status of PolicySet. */
    private PolicySetStatus _status;
    /**
     * Instantiates a new PolicySet and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PolicySet() {
        super();
        this.setOdataType("#microsoft.graph.policySet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PolicySet
     */
    @javax.annotation.Nonnull
    public static PolicySet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PolicySet();
    }
    /**
     * Gets the assignments property value. Assignments of the PolicySet.
     * @return a policySetAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<PolicySetAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the createdDateTime property value. Creation time of the PolicySet.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Description of the PolicySet.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. DisplayName of the PolicySet.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the errorCode property value. The errorCode property
     * @return a errorCode
     */
    @javax.annotation.Nullable
    public ErrorCode getErrorCode() {
        return this._errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PolicySet currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(PolicySetAssignment::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("errorCode", (n) -> { currentObject.setErrorCode(n.getEnumValue(ErrorCode.class)); });
            this.put("guidedDeploymentTags", (n) -> { currentObject.setGuidedDeploymentTags(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("items", (n) -> { currentObject.setItems(n.getCollectionOfObjectValues(PolicySetItem::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("roleScopeTags", (n) -> { currentObject.setRoleScopeTags(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(PolicySetStatus.class)); });
        }};
    }
    /**
     * Gets the guidedDeploymentTags property value. Tags of the guided deployment
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getGuidedDeploymentTags() {
        return this._guidedDeploymentTags;
    }
    /**
     * Gets the items property value. Items of the PolicySet with maximum count 100.
     * @return a policySetItem
     */
    @javax.annotation.Nullable
    public java.util.List<PolicySetItem> getItems() {
        return this._items;
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modified time of the PolicySet.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the roleScopeTags property value. RoleScopeTags of the PolicySet
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTags() {
        return this._roleScopeTags;
    }
    /**
     * Gets the status property value. The enum to specify the status of PolicySet.
     * @return a policySetStatus
     */
    @javax.annotation.Nullable
    public PolicySetStatus getStatus() {
        return this._status;
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
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<PolicySetAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the createdDateTime property value. Creation time of the PolicySet.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Description of the PolicySet.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. DisplayName of the PolicySet.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the errorCode property value. The errorCode property
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorCode(@javax.annotation.Nullable final ErrorCode value) {
        this._errorCode = value;
    }
    /**
     * Sets the guidedDeploymentTags property value. Tags of the guided deployment
     * @param value Value to set for the guidedDeploymentTags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGuidedDeploymentTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._guidedDeploymentTags = value;
    }
    /**
     * Sets the items property value. Items of the PolicySet with maximum count 100.
     * @param value Value to set for the items property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItems(@javax.annotation.Nullable final java.util.List<PolicySetItem> value) {
        this._items = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modified time of the PolicySet.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the roleScopeTags property value. RoleScopeTags of the PolicySet
     * @param value Value to set for the roleScopeTags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTags = value;
    }
    /**
     * Sets the status property value. The enum to specify the status of PolicySet.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final PolicySetStatus value) {
        this._status = value;
    }
}
