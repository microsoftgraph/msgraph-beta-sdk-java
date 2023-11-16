package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The entity represents an ADMX (Administrative Template) XML file. The ADMX file contains a collection of group policy definitions and their locations by category path. The group policy definition file also contains the languages supported as determined by the language dependent ADML (Administrative Template) language files.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupPolicyDefinitionFile extends Entity implements Parsable {
    /**
     * Instantiates a new GroupPolicyDefinitionFile and sets the default values.
     */
    public GroupPolicyDefinitionFile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupPolicyDefinitionFile
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyDefinitionFile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.groupPolicyUploadedDefinitionFile": return new GroupPolicyUploadedDefinitionFile();
            }
        }
        return new GroupPolicyDefinitionFile();
    }
    /**
     * Gets the definitions property value. The group policy definitions associated with the file.
     * @return a java.util.List<GroupPolicyDefinition>
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyDefinition> getDefinitions() {
        return this.BackingStore.get("definitions");
    }
    /**
     * Gets the description property value. The localized description of the policy settings in the ADMX file. The default value is empty.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the displayName property value. The localized friendly name of the ADMX file.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("definitions", (n) -> { this.setDefinitions(n.getCollectionOfObjectValues(GroupPolicyDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("languageCodes", (n) -> { this.setLanguageCodes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("policyType", (n) -> { this.setPolicyType(n.getEnumValue(GroupPolicyType.class)); });
        deserializerMap.put("revision", (n) -> { this.setRevision(n.getStringValue()); });
        deserializerMap.put("targetNamespace", (n) -> { this.setTargetNamespace(n.getStringValue()); });
        deserializerMap.put("targetPrefix", (n) -> { this.setTargetPrefix(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. The file name of the ADMX file without the path. For example: edge.admx
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.BackingStore.get("fileName");
    }
    /**
     * Gets the languageCodes property value. The supported language codes for the ADMX file.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getLanguageCodes() {
        return this.BackingStore.get("languageCodes");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.BackingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the policyType property value. Type of Group Policy File or Definition.
     * @return a GroupPolicyType
     */
    @jakarta.annotation.Nullable
    public GroupPolicyType getPolicyType() {
        return this.BackingStore.get("policyType");
    }
    /**
     * Gets the revision property value. The revision version associated with the file.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRevision() {
        return this.BackingStore.get("revision");
    }
    /**
     * Gets the targetNamespace property value. Specifies the URI used to identify the namespace within the ADMX file.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetNamespace() {
        return this.BackingStore.get("targetNamespace");
    }
    /**
     * Gets the targetPrefix property value. Specifies the logical name that refers to the namespace within the ADMX file.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetPrefix() {
        return this.BackingStore.get("targetPrefix");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("definitions", this.getDefinitions());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeCollectionOfPrimitiveValues("languageCodes", this.getLanguageCodes());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("policyType", this.getPolicyType());
        writer.writeStringValue("revision", this.getRevision());
        writer.writeStringValue("targetNamespace", this.getTargetNamespace());
        writer.writeStringValue("targetPrefix", this.getTargetPrefix());
    }
    /**
     * Sets the definitions property value. The group policy definitions associated with the file.
     * @param value Value to set for the definitions property.
     */
    public void setDefinitions(@jakarta.annotation.Nullable final java.util.List<GroupPolicyDefinition> value) {
        this.BackingStore.set("definitions", value);
    }
    /**
     * Sets the description property value. The localized description of the policy settings in the ADMX file. The default value is empty.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The localized friendly name of the ADMX file.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the fileName property value. The file name of the ADMX file without the path. For example: edge.admx
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("fileName", value);
    }
    /**
     * Sets the languageCodes property value. The supported language codes for the ADMX file.
     * @param value Value to set for the languageCodes property.
     */
    public void setLanguageCodes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("languageCodes", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the policyType property value. Type of Group Policy File or Definition.
     * @param value Value to set for the policyType property.
     */
    public void setPolicyType(@jakarta.annotation.Nullable final GroupPolicyType value) {
        this.BackingStore.set("policyType", value);
    }
    /**
     * Sets the revision property value. The revision version associated with the file.
     * @param value Value to set for the revision property.
     */
    public void setRevision(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("revision", value);
    }
    /**
     * Sets the targetNamespace property value. Specifies the URI used to identify the namespace within the ADMX file.
     * @param value Value to set for the targetNamespace property.
     */
    public void setTargetNamespace(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("targetNamespace", value);
    }
    /**
     * Sets the targetPrefix property value. Specifies the logical name that refers to the namespace within the ADMX file.
     * @param value Value to set for the targetPrefix property.
     */
    public void setTargetPrefix(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("targetPrefix", value);
    }
}
