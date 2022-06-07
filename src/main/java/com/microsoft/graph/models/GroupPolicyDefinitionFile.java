package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The entity represents an ADMX (Administrative Template) XML file. The ADMX file contains a collection of group policy definitions and their locations by category path. The group policy definition file also contains the languages supported as determined by the language dependent ADML (Administrative Template) language files. */
public class GroupPolicyDefinitionFile extends Entity implements Parsable {
    /** The group policy definitions associated with the file. */
    private java.util.List<GroupPolicyDefinition> _definitions;
    /** The localized description of the policy settings in the ADMX file. The default value is empty. */
    private String _description;
    /** The localized friendly name of the ADMX file. */
    private String _displayName;
    /** The file name of the ADMX file without the path. For example: edge.admx */
    private String _fileName;
    /** The supported language codes for the ADMX file. */
    private java.util.List<String> _languageCodes;
    /** The date and time the entity was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Specifies the type of group policy. Possible values are: admxBacked, admxIngested. */
    private GroupPolicyType _policyType;
    /** The revision version associated with the file. */
    private String _revision;
    /** Specifies the URI used to identify the namespace within the ADMX file. */
    private String _targetNamespace;
    /** Specifies the logical name that refers to the namespace within the ADMX file. */
    private String _targetPrefix;
    /**
     * Instantiates a new groupPolicyDefinitionFile and sets the default values.
     * @return a void
     */
    public GroupPolicyDefinitionFile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a groupPolicyDefinitionFile
     */
    @javax.annotation.Nonnull
    public static GroupPolicyDefinitionFile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.groupPolicyDefinitionFile": return new GroupPolicyDefinitionFile();
            }
        }
        return new GroupPolicyDefinitionFile();
    }
    /**
     * Gets the definitions property value. The group policy definitions associated with the file.
     * @return a groupPolicyDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyDefinition> getDefinitions() {
        return this._definitions;
    }
    /**
     * Gets the description property value. The localized description of the policy settings in the ADMX file. The default value is empty.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The localized friendly name of the ADMX file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GroupPolicyDefinitionFile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("definitions", (n) -> { currentObject.setDefinitions(n.getCollectionOfObjectValues(GroupPolicyDefinition::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("fileName", (n) -> { currentObject.setFileName(n.getStringValue()); });
            this.put("languageCodes", (n) -> { currentObject.setLanguageCodes(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("policyType", (n) -> { currentObject.setPolicyType(n.getEnumValue(GroupPolicyType.class)); });
            this.put("revision", (n) -> { currentObject.setRevision(n.getStringValue()); });
            this.put("targetNamespace", (n) -> { currentObject.setTargetNamespace(n.getStringValue()); });
            this.put("targetPrefix", (n) -> { currentObject.setTargetPrefix(n.getStringValue()); });
        }};
    }
    /**
     * Gets the fileName property value. The file name of the ADMX file without the path. For example: edge.admx
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileName() {
        return this._fileName;
    }
    /**
     * Gets the languageCodes property value. The supported language codes for the ADMX file.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getLanguageCodes() {
        return this._languageCodes;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the policyType property value. Specifies the type of group policy. Possible values are: admxBacked, admxIngested.
     * @return a groupPolicyType
     */
    @javax.annotation.Nullable
    public GroupPolicyType getPolicyType() {
        return this._policyType;
    }
    /**
     * Gets the revision property value. The revision version associated with the file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRevision() {
        return this._revision;
    }
    /**
     * Gets the targetNamespace property value. Specifies the URI used to identify the namespace within the ADMX file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetNamespace() {
        return this._targetNamespace;
    }
    /**
     * Gets the targetPrefix property value. Specifies the logical name that refers to the namespace within the ADMX file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetPrefix() {
        return this._targetPrefix;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setDefinitions(@javax.annotation.Nullable final java.util.List<GroupPolicyDefinition> value) {
        this._definitions = value;
    }
    /**
     * Sets the description property value. The localized description of the policy settings in the ADMX file. The default value is empty.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The localized friendly name of the ADMX file.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the fileName property value. The file name of the ADMX file without the path. For example: edge.admx
     * @param value Value to set for the fileName property.
     * @return a void
     */
    public void setFileName(@javax.annotation.Nullable final String value) {
        this._fileName = value;
    }
    /**
     * Sets the languageCodes property value. The supported language codes for the ADMX file.
     * @param value Value to set for the languageCodes property.
     * @return a void
     */
    public void setLanguageCodes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._languageCodes = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the policyType property value. Specifies the type of group policy. Possible values are: admxBacked, admxIngested.
     * @param value Value to set for the policyType property.
     * @return a void
     */
    public void setPolicyType(@javax.annotation.Nullable final GroupPolicyType value) {
        this._policyType = value;
    }
    /**
     * Sets the revision property value. The revision version associated with the file.
     * @param value Value to set for the revision property.
     * @return a void
     */
    public void setRevision(@javax.annotation.Nullable final String value) {
        this._revision = value;
    }
    /**
     * Sets the targetNamespace property value. Specifies the URI used to identify the namespace within the ADMX file.
     * @param value Value to set for the targetNamespace property.
     * @return a void
     */
    public void setTargetNamespace(@javax.annotation.Nullable final String value) {
        this._targetNamespace = value;
    }
    /**
     * Sets the targetPrefix property value. Specifies the logical name that refers to the namespace within the ADMX file.
     * @param value Value to set for the targetPrefix property.
     * @return a void
     */
    public void setTargetPrefix(@javax.annotation.Nullable final String value) {
        this._targetPrefix = value;
    }
}
