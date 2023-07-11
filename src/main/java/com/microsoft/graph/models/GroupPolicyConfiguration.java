package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The group policy configuration entity contains the configured values for one or more group policy definitions.
 */
public class GroupPolicyConfiguration extends Entity implements Parsable {
    /**
     * The list of group assignments for the configuration.
     */
    private java.util.List<GroupPolicyConfigurationAssignment> assignments;
    /**
     * The date and time the object was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The list of enabled or disabled group policy definition values for the configuration.
     */
    private java.util.List<GroupPolicyDefinitionValue> definitionValues;
    /**
     * User provided description for the resource object.
     */
    private String description;
    /**
     * User provided name for the resource object.
     */
    private String displayName;
    /**
     * The date and time the entity was last modified.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Group Policy Configuration Ingestion Type
     */
    private GroupPolicyConfigurationIngestionType policyConfigurationIngestionType;
    /**
     * The list of scope tags for the configuration.
     */
    private java.util.List<String> roleScopeTagIds;
    /**
     * Instantiates a new groupPolicyConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GroupPolicyConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a groupPolicyConfiguration
     */
    @javax.annotation.Nonnull
    public static GroupPolicyConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyConfiguration();
    }
    /**
     * Gets the assignments property value. The list of group assignments for the configuration.
     * @return a groupPolicyConfigurationAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyConfigurationAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the createdDateTime property value. The date and time the object was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the definitionValues property value. The list of enabled or disabled group policy definition values for the configuration.
     * @return a groupPolicyDefinitionValue
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyDefinitionValue> getDefinitionValues() {
        return this.definitionValues;
    }
    /**
     * Gets the description property value. User provided description for the resource object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. User provided name for the resource object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(GroupPolicyConfigurationAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("definitionValues", (n) -> { this.setDefinitionValues(n.getCollectionOfObjectValues(GroupPolicyDefinitionValue::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("policyConfigurationIngestionType", (n) -> { this.setPolicyConfigurationIngestionType(n.getEnumValue(GroupPolicyConfigurationIngestionType.class)); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the policyConfigurationIngestionType property value. Group Policy Configuration Ingestion Type
     * @return a groupPolicyConfigurationIngestionType
     */
    @javax.annotation.Nullable
    public GroupPolicyConfigurationIngestionType getPolicyConfigurationIngestionType() {
        return this.policyConfigurationIngestionType;
    }
    /**
     * Gets the roleScopeTagIds property value. The list of scope tags for the configuration.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
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
        writer.writeCollectionOfObjectValues("definitionValues", this.getDefinitionValues());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("policyConfigurationIngestionType", this.getPolicyConfigurationIngestionType());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
    }
    /**
     * Sets the assignments property value. The list of group assignments for the configuration.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<GroupPolicyConfigurationAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the object was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the definitionValues property value. The list of enabled or disabled group policy definition values for the configuration.
     * @param value Value to set for the definitionValues property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefinitionValues(@javax.annotation.Nullable final java.util.List<GroupPolicyDefinitionValue> value) {
        this.definitionValues = value;
    }
    /**
     * Sets the description property value. User provided description for the resource object.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. User provided name for the resource object.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the policyConfigurationIngestionType property value. Group Policy Configuration Ingestion Type
     * @param value Value to set for the policyConfigurationIngestionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyConfigurationIngestionType(@javax.annotation.Nullable final GroupPolicyConfigurationIngestionType value) {
        this.policyConfigurationIngestionType = value;
    }
    /**
     * Sets the roleScopeTagIds property value. The list of scope tags for the configuration.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
}
