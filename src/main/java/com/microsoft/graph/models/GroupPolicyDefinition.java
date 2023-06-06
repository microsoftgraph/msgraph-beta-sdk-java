package com.microsoft.graph.models;

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
public class GroupPolicyDefinition extends Entity implements Parsable {
    /** The group policy category associated with the definition. */
    private GroupPolicyCategory category;
    /** The localized full category path for the policy. */
    private String categoryPath;
    /** Group Policy Definition Class Type. */
    private GroupPolicyDefinitionClassType classType;
    /** The group policy file associated with the definition. */
    private GroupPolicyDefinitionFile definitionFile;
    /** The localized policy name. */
    private String displayName;
    /** The localized explanation or help text associated with the policy. The default value is empty. */
    private String explainText;
    /** The category id of the parent category */
    private UUID groupPolicyCategoryId;
    /** Signifies whether or not there are related definitions to this definition */
    private Boolean hasRelatedDefinitions;
    /** The date and time the entity was last modified. */
    private OffsetDateTime lastModifiedDateTime;
    /** Minimum required CSP version for device configuration in this definition */
    private String minDeviceCspVersion;
    /** Minimum required CSP version for user configuration in this definition */
    private String minUserCspVersion;
    /** Definition of the next version of this definition */
    private GroupPolicyDefinition nextVersionDefinition;
    /** Type of Group Policy File or Definition. */
    private GroupPolicyType policyType;
    /** The group policy presentations associated with the definition. */
    private java.util.List<GroupPolicyPresentation> presentations;
    /** Definition of the previous version of this definition */
    private GroupPolicyDefinition previousVersionDefinition;
    /** Localized string used to specify what operating system or application version is affected by the policy. */
    private String supportedOn;
    /** Setting definition version */
    private String version;
    /**
     * Instantiates a new groupPolicyDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GroupPolicyDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a groupPolicyDefinition
     */
    @javax.annotation.Nonnull
    public static GroupPolicyDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyDefinition();
    }
    /**
     * Gets the category property value. The group policy category associated with the definition.
     * @return a groupPolicyCategory
     */
    @javax.annotation.Nullable
    public GroupPolicyCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the categoryPath property value. The localized full category path for the policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategoryPath() {
        return this.categoryPath;
    }
    /**
     * Gets the classType property value. Group Policy Definition Class Type.
     * @return a groupPolicyDefinitionClassType
     */
    @javax.annotation.Nullable
    public GroupPolicyDefinitionClassType getClassType() {
        return this.classType;
    }
    /**
     * Gets the definitionFile property value. The group policy file associated with the definition.
     * @return a groupPolicyDefinitionFile
     */
    @javax.annotation.Nullable
    public GroupPolicyDefinitionFile getDefinitionFile() {
        return this.definitionFile;
    }
    /**
     * Gets the displayName property value. The localized policy name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the explainText property value. The localized explanation or help text associated with the policy. The default value is empty.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExplainText() {
        return this.explainText;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("category", (n) -> { this.setCategory(n.getObjectValue(GroupPolicyCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("categoryPath", (n) -> { this.setCategoryPath(n.getStringValue()); });
        deserializerMap.put("classType", (n) -> { this.setClassType(n.getEnumValue(GroupPolicyDefinitionClassType.class)); });
        deserializerMap.put("definitionFile", (n) -> { this.setDefinitionFile(n.getObjectValue(GroupPolicyDefinitionFile::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("explainText", (n) -> { this.setExplainText(n.getStringValue()); });
        deserializerMap.put("groupPolicyCategoryId", (n) -> { this.setGroupPolicyCategoryId(n.getUUIDValue()); });
        deserializerMap.put("hasRelatedDefinitions", (n) -> { this.setHasRelatedDefinitions(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("minDeviceCspVersion", (n) -> { this.setMinDeviceCspVersion(n.getStringValue()); });
        deserializerMap.put("minUserCspVersion", (n) -> { this.setMinUserCspVersion(n.getStringValue()); });
        deserializerMap.put("nextVersionDefinition", (n) -> { this.setNextVersionDefinition(n.getObjectValue(GroupPolicyDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("policyType", (n) -> { this.setPolicyType(n.getEnumValue(GroupPolicyType.class)); });
        deserializerMap.put("presentations", (n) -> { this.setPresentations(n.getCollectionOfObjectValues(GroupPolicyPresentation::createFromDiscriminatorValue)); });
        deserializerMap.put("previousVersionDefinition", (n) -> { this.setPreviousVersionDefinition(n.getObjectValue(GroupPolicyDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("supportedOn", (n) -> { this.setSupportedOn(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupPolicyCategoryId property value. The category id of the parent category
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getGroupPolicyCategoryId() {
        return this.groupPolicyCategoryId;
    }
    /**
     * Gets the hasRelatedDefinitions property value. Signifies whether or not there are related definitions to this definition
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasRelatedDefinitions() {
        return this.hasRelatedDefinitions;
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
     * Gets the minDeviceCspVersion property value. Minimum required CSP version for device configuration in this definition
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinDeviceCspVersion() {
        return this.minDeviceCspVersion;
    }
    /**
     * Gets the minUserCspVersion property value. Minimum required CSP version for user configuration in this definition
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinUserCspVersion() {
        return this.minUserCspVersion;
    }
    /**
     * Gets the nextVersionDefinition property value. Definition of the next version of this definition
     * @return a groupPolicyDefinition
     */
    @javax.annotation.Nullable
    public GroupPolicyDefinition getNextVersionDefinition() {
        return this.nextVersionDefinition;
    }
    /**
     * Gets the policyType property value. Type of Group Policy File or Definition.
     * @return a groupPolicyType
     */
    @javax.annotation.Nullable
    public GroupPolicyType getPolicyType() {
        return this.policyType;
    }
    /**
     * Gets the presentations property value. The group policy presentations associated with the definition.
     * @return a groupPolicyPresentation
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyPresentation> getPresentations() {
        return this.presentations;
    }
    /**
     * Gets the previousVersionDefinition property value. Definition of the previous version of this definition
     * @return a groupPolicyDefinition
     */
    @javax.annotation.Nullable
    public GroupPolicyDefinition getPreviousVersionDefinition() {
        return this.previousVersionDefinition;
    }
    /**
     * Gets the supportedOn property value. Localized string used to specify what operating system or application version is affected by the policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSupportedOn() {
        return this.supportedOn;
    }
    /**
     * Gets the version property value. Setting definition version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategory(@javax.annotation.Nullable final GroupPolicyCategory value) {
        this.category = value;
    }
    /**
     * Sets the categoryPath property value. The localized full category path for the policy.
     * @param value Value to set for the categoryPath property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategoryPath(@javax.annotation.Nullable final String value) {
        this.categoryPath = value;
    }
    /**
     * Sets the classType property value. Group Policy Definition Class Type.
     * @param value Value to set for the classType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClassType(@javax.annotation.Nullable final GroupPolicyDefinitionClassType value) {
        this.classType = value;
    }
    /**
     * Sets the definitionFile property value. The group policy file associated with the definition.
     * @param value Value to set for the definitionFile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefinitionFile(@javax.annotation.Nullable final GroupPolicyDefinitionFile value) {
        this.definitionFile = value;
    }
    /**
     * Sets the displayName property value. The localized policy name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the explainText property value. The localized explanation or help text associated with the policy. The default value is empty.
     * @param value Value to set for the explainText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExplainText(@javax.annotation.Nullable final String value) {
        this.explainText = value;
    }
    /**
     * Sets the groupPolicyCategoryId property value. The category id of the parent category
     * @param value Value to set for the groupPolicyCategoryId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicyCategoryId(@javax.annotation.Nullable final UUID value) {
        this.groupPolicyCategoryId = value;
    }
    /**
     * Sets the hasRelatedDefinitions property value. Signifies whether or not there are related definitions to this definition
     * @param value Value to set for the hasRelatedDefinitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasRelatedDefinitions(@javax.annotation.Nullable final Boolean value) {
        this.hasRelatedDefinitions = value;
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
     * Sets the minDeviceCspVersion property value. Minimum required CSP version for device configuration in this definition
     * @param value Value to set for the minDeviceCspVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinDeviceCspVersion(@javax.annotation.Nullable final String value) {
        this.minDeviceCspVersion = value;
    }
    /**
     * Sets the minUserCspVersion property value. Minimum required CSP version for user configuration in this definition
     * @param value Value to set for the minUserCspVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinUserCspVersion(@javax.annotation.Nullable final String value) {
        this.minUserCspVersion = value;
    }
    /**
     * Sets the nextVersionDefinition property value. Definition of the next version of this definition
     * @param value Value to set for the nextVersionDefinition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNextVersionDefinition(@javax.annotation.Nullable final GroupPolicyDefinition value) {
        this.nextVersionDefinition = value;
    }
    /**
     * Sets the policyType property value. Type of Group Policy File or Definition.
     * @param value Value to set for the policyType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyType(@javax.annotation.Nullable final GroupPolicyType value) {
        this.policyType = value;
    }
    /**
     * Sets the presentations property value. The group policy presentations associated with the definition.
     * @param value Value to set for the presentations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPresentations(@javax.annotation.Nullable final java.util.List<GroupPolicyPresentation> value) {
        this.presentations = value;
    }
    /**
     * Sets the previousVersionDefinition property value. Definition of the previous version of this definition
     * @param value Value to set for the previousVersionDefinition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreviousVersionDefinition(@javax.annotation.Nullable final GroupPolicyDefinition value) {
        this.previousVersionDefinition = value;
    }
    /**
     * Sets the supportedOn property value. Localized string used to specify what operating system or application version is affected by the policy.
     * @param value Value to set for the supportedOn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportedOn(@javax.annotation.Nullable final String value) {
        this.supportedOn = value;
    }
    /**
     * Sets the version property value. Setting definition version
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
}
