package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * The entity describes all of the information about a single group policy.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupPolicyDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new {@link GroupPolicyDefinition} and sets the default values.
     */
    public GroupPolicyDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GroupPolicyDefinition}
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyDefinition();
    }
    /**
     * Gets the category property value. The group policy category associated with the definition.
     * @return a {@link GroupPolicyCategory}
     */
    @jakarta.annotation.Nullable
    public GroupPolicyCategory getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * Gets the categoryPath property value. The localized full category path for the policy.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryPath() {
        return this.backingStore.get("categoryPath");
    }
    /**
     * Gets the classType property value. Group Policy Definition Class Type.
     * @return a {@link GroupPolicyDefinitionClassType}
     */
    @jakarta.annotation.Nullable
    public GroupPolicyDefinitionClassType getClassType() {
        return this.backingStore.get("classType");
    }
    /**
     * Gets the definitionFile property value. The group policy file associated with the definition.
     * @return a {@link GroupPolicyDefinitionFile}
     */
    @jakarta.annotation.Nullable
    public GroupPolicyDefinitionFile getDefinitionFile() {
        return this.backingStore.get("definitionFile");
    }
    /**
     * Gets the displayName property value. The localized policy name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the explainText property value. The localized explanation or help text associated with the policy. The default value is empty.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExplainText() {
        return this.backingStore.get("explainText");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("category", (n) -> { this.setCategory(n.getObjectValue(GroupPolicyCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("categoryPath", (n) -> { this.setCategoryPath(n.getStringValue()); });
        deserializerMap.put("classType", (n) -> { this.setClassType(n.getEnumValue(GroupPolicyDefinitionClassType::forValue)); });
        deserializerMap.put("definitionFile", (n) -> { this.setDefinitionFile(n.getObjectValue(GroupPolicyDefinitionFile::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("explainText", (n) -> { this.setExplainText(n.getStringValue()); });
        deserializerMap.put("groupPolicyCategoryId", (n) -> { this.setGroupPolicyCategoryId(n.getUUIDValue()); });
        deserializerMap.put("hasRelatedDefinitions", (n) -> { this.setHasRelatedDefinitions(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("minDeviceCspVersion", (n) -> { this.setMinDeviceCspVersion(n.getStringValue()); });
        deserializerMap.put("minUserCspVersion", (n) -> { this.setMinUserCspVersion(n.getStringValue()); });
        deserializerMap.put("nextVersionDefinition", (n) -> { this.setNextVersionDefinition(n.getObjectValue(GroupPolicyDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("policyType", (n) -> { this.setPolicyType(n.getEnumValue(GroupPolicyType::forValue)); });
        deserializerMap.put("presentations", (n) -> { this.setPresentations(n.getCollectionOfObjectValues(GroupPolicyPresentation::createFromDiscriminatorValue)); });
        deserializerMap.put("previousVersionDefinition", (n) -> { this.setPreviousVersionDefinition(n.getObjectValue(GroupPolicyDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("supportedOn", (n) -> { this.setSupportedOn(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupPolicyCategoryId property value. The category id of the parent category
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getGroupPolicyCategoryId() {
        return this.backingStore.get("groupPolicyCategoryId");
    }
    /**
     * Gets the hasRelatedDefinitions property value. Signifies whether or not there are related definitions to this definition
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasRelatedDefinitions() {
        return this.backingStore.get("hasRelatedDefinitions");
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
     * Gets the minDeviceCspVersion property value. Minimum required CSP version for device configuration in this definition
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMinDeviceCspVersion() {
        return this.backingStore.get("minDeviceCspVersion");
    }
    /**
     * Gets the minUserCspVersion property value. Minimum required CSP version for user configuration in this definition
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMinUserCspVersion() {
        return this.backingStore.get("minUserCspVersion");
    }
    /**
     * Gets the nextVersionDefinition property value. Definition of the next version of this definition
     * @return a {@link GroupPolicyDefinition}
     */
    @jakarta.annotation.Nullable
    public GroupPolicyDefinition getNextVersionDefinition() {
        return this.backingStore.get("nextVersionDefinition");
    }
    /**
     * Gets the policyType property value. Type of Group Policy File or Definition.
     * @return a {@link GroupPolicyType}
     */
    @jakarta.annotation.Nullable
    public GroupPolicyType getPolicyType() {
        return this.backingStore.get("policyType");
    }
    /**
     * Gets the presentations property value. The group policy presentations associated with the definition.
     * @return a {@link java.util.List<GroupPolicyPresentation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyPresentation> getPresentations() {
        return this.backingStore.get("presentations");
    }
    /**
     * Gets the previousVersionDefinition property value. Definition of the previous version of this definition
     * @return a {@link GroupPolicyDefinition}
     */
    @jakarta.annotation.Nullable
    public GroupPolicyDefinition getPreviousVersionDefinition() {
        return this.backingStore.get("previousVersionDefinition");
    }
    /**
     * Gets the supportedOn property value. Localized string used to specify what operating system or application version is affected by the policy.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSupportedOn() {
        return this.backingStore.get("supportedOn");
    }
    /**
     * Gets the version property value. Setting definition version
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("category", this.getCategory());
        writer.writeStringValue("categoryPath", this.getCategoryPath());
        writer.writeEnumValue("classType", this.getClassType());
        writer.writeObjectValue("definitionFile", this.getDefinitionFile());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("explainText", this.getExplainText());
        writer.writeUUIDValue("groupPolicyCategoryId", this.getGroupPolicyCategoryId());
        writer.writeBooleanValue("hasRelatedDefinitions", this.getHasRelatedDefinitions());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("minDeviceCspVersion", this.getMinDeviceCspVersion());
        writer.writeStringValue("minUserCspVersion", this.getMinUserCspVersion());
        writer.writeObjectValue("nextVersionDefinition", this.getNextVersionDefinition());
        writer.writeEnumValue("policyType", this.getPolicyType());
        writer.writeCollectionOfObjectValues("presentations", this.getPresentations());
        writer.writeObjectValue("previousVersionDefinition", this.getPreviousVersionDefinition());
        writer.writeStringValue("supportedOn", this.getSupportedOn());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the category property value. The group policy category associated with the definition.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final GroupPolicyCategory value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the categoryPath property value. The localized full category path for the policy.
     * @param value Value to set for the categoryPath property.
     */
    public void setCategoryPath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("categoryPath", value);
    }
    /**
     * Sets the classType property value. Group Policy Definition Class Type.
     * @param value Value to set for the classType property.
     */
    public void setClassType(@jakarta.annotation.Nullable final GroupPolicyDefinitionClassType value) {
        this.backingStore.set("classType", value);
    }
    /**
     * Sets the definitionFile property value. The group policy file associated with the definition.
     * @param value Value to set for the definitionFile property.
     */
    public void setDefinitionFile(@jakarta.annotation.Nullable final GroupPolicyDefinitionFile value) {
        this.backingStore.set("definitionFile", value);
    }
    /**
     * Sets the displayName property value. The localized policy name.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the explainText property value. The localized explanation or help text associated with the policy. The default value is empty.
     * @param value Value to set for the explainText property.
     */
    public void setExplainText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("explainText", value);
    }
    /**
     * Sets the groupPolicyCategoryId property value. The category id of the parent category
     * @param value Value to set for the groupPolicyCategoryId property.
     */
    public void setGroupPolicyCategoryId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("groupPolicyCategoryId", value);
    }
    /**
     * Sets the hasRelatedDefinitions property value. Signifies whether or not there are related definitions to this definition
     * @param value Value to set for the hasRelatedDefinitions property.
     */
    public void setHasRelatedDefinitions(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasRelatedDefinitions", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the minDeviceCspVersion property value. Minimum required CSP version for device configuration in this definition
     * @param value Value to set for the minDeviceCspVersion property.
     */
    public void setMinDeviceCspVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minDeviceCspVersion", value);
    }
    /**
     * Sets the minUserCspVersion property value. Minimum required CSP version for user configuration in this definition
     * @param value Value to set for the minUserCspVersion property.
     */
    public void setMinUserCspVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minUserCspVersion", value);
    }
    /**
     * Sets the nextVersionDefinition property value. Definition of the next version of this definition
     * @param value Value to set for the nextVersionDefinition property.
     */
    public void setNextVersionDefinition(@jakarta.annotation.Nullable final GroupPolicyDefinition value) {
        this.backingStore.set("nextVersionDefinition", value);
    }
    /**
     * Sets the policyType property value. Type of Group Policy File or Definition.
     * @param value Value to set for the policyType property.
     */
    public void setPolicyType(@jakarta.annotation.Nullable final GroupPolicyType value) {
        this.backingStore.set("policyType", value);
    }
    /**
     * Sets the presentations property value. The group policy presentations associated with the definition.
     * @param value Value to set for the presentations property.
     */
    public void setPresentations(@jakarta.annotation.Nullable final java.util.List<GroupPolicyPresentation> value) {
        this.backingStore.set("presentations", value);
    }
    /**
     * Sets the previousVersionDefinition property value. Definition of the previous version of this definition
     * @param value Value to set for the previousVersionDefinition property.
     */
    public void setPreviousVersionDefinition(@jakarta.annotation.Nullable final GroupPolicyDefinition value) {
        this.backingStore.set("previousVersionDefinition", value);
    }
    /**
     * Sets the supportedOn property value. Localized string used to specify what operating system or application version is affected by the policy.
     * @param value Value to set for the supportedOn property.
     */
    public void setSupportedOn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("supportedOn", value);
    }
    /**
     * Sets the version property value. Setting definition version
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
