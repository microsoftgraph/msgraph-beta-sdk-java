package com.microsoft.graph.beta.models;

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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupPolicyConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new {@link GroupPolicyConfiguration} and sets the default values.
     */
    public GroupPolicyConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GroupPolicyConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyConfiguration();
    }
    /**
     * Gets the assignments property value. The list of group assignments for the configuration.
     * @return a {@link java.util.List<GroupPolicyConfigurationAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyConfigurationAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the createdDateTime property value. The date and time the object was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the definitionValues property value. The list of enabled or disabled group policy definition values for the configuration.
     * @return a {@link java.util.List<GroupPolicyDefinitionValue>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyDefinitionValue> getDefinitionValues() {
        return this.backingStore.get("definitionValues");
    }
    /**
     * Gets the description property value. User provided description for the resource object.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. User provided name for the resource object.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(GroupPolicyConfigurationAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("definitionValues", (n) -> { this.setDefinitionValues(n.getCollectionOfObjectValues(GroupPolicyDefinitionValue::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("policyConfigurationIngestionType", (n) -> { this.setPolicyConfigurationIngestionType(n.getEnumValue(GroupPolicyConfigurationIngestionType::forValue)); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the policyConfigurationIngestionType property value. Group Policy Configuration Ingestion Type
     * @return a {@link GroupPolicyConfigurationIngestionType}
     */
    @jakarta.annotation.Nullable
    public GroupPolicyConfigurationIngestionType getPolicyConfigurationIngestionType() {
        return this.backingStore.get("policyConfigurationIngestionType");
    }
    /**
     * Gets the roleScopeTagIds property value. The list of scope tags for the configuration.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.backingStore.get("roleScopeTagIds");
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
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<GroupPolicyConfigurationAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time the object was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the definitionValues property value. The list of enabled or disabled group policy definition values for the configuration.
     * @param value Value to set for the definitionValues property.
     */
    public void setDefinitionValues(@jakarta.annotation.Nullable final java.util.List<GroupPolicyDefinitionValue> value) {
        this.backingStore.set("definitionValues", value);
    }
    /**
     * Sets the description property value. User provided description for the resource object.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. User provided name for the resource object.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the policyConfigurationIngestionType property value. Group Policy Configuration Ingestion Type
     * @param value Value to set for the policyConfigurationIngestionType property.
     */
    public void setPolicyConfigurationIngestionType(@jakarta.annotation.Nullable final GroupPolicyConfigurationIngestionType value) {
        this.backingStore.set("policyConfigurationIngestionType", value);
    }
    /**
     * Sets the roleScopeTagIds property value. The list of scope tags for the configuration.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTagIds", value);
    }
}
