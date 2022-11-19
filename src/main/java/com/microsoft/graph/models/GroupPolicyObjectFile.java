package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The Group Policy Object file uploaded by admin. */
public class GroupPolicyObjectFile extends Entity implements Parsable {
    /** The Group Policy Object file content. */
    private String _content;
    /** The date and time at which the GroupPolicy was first uploaded. */
    private OffsetDateTime _createdDateTime;
    /** The Group Policy Object GUID from GPO Xml content */
    private String _groupPolicyObjectId;
    /** The date and time at which the GroupPolicyObjectFile was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The distinguished name of the OU. */
    private String _ouDistinguishedName;
    /** The list of scope tags for the configuration. */
    private java.util.List<String> _roleScopeTagIds;
    /**
     * Instantiates a new groupPolicyObjectFile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GroupPolicyObjectFile() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyObjectFile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a groupPolicyObjectFile
     */
    @javax.annotation.Nonnull
    public static GroupPolicyObjectFile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyObjectFile();
    }
    /**
     * Gets the content property value. The Group Policy Object file content.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContent() {
        return this._content;
    }
    /**
     * Gets the createdDateTime property value. The date and time at which the GroupPolicy was first uploaded.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GroupPolicyObjectFile currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { currentObject.setContent(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("groupPolicyObjectId", (n) -> { currentObject.setGroupPolicyObjectId(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("ouDistinguishedName", (n) -> { currentObject.setOuDistinguishedName(n.getStringValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the groupPolicyObjectId property value. The Group Policy Object GUID from GPO Xml content
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupPolicyObjectId() {
        return this._groupPolicyObjectId;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time at which the GroupPolicyObjectFile was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the ouDistinguishedName property value. The distinguished name of the OU.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOuDistinguishedName() {
        return this._ouDistinguishedName;
    }
    /**
     * Gets the roleScopeTagIds property value. The list of scope tags for the configuration.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
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
        writer.writeStringValue("content", this.getContent());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("groupPolicyObjectId", this.getGroupPolicyObjectId());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("ouDistinguishedName", this.getOuDistinguishedName());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
    }
    /**
     * Sets the content property value. The Group Policy Object file content.
     * @param value Value to set for the content property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContent(@javax.annotation.Nullable final String value) {
        this._content = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time at which the GroupPolicy was first uploaded.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the groupPolicyObjectId property value. The Group Policy Object GUID from GPO Xml content
     * @param value Value to set for the groupPolicyObjectId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicyObjectId(@javax.annotation.Nullable final String value) {
        this._groupPolicyObjectId = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time at which the GroupPolicyObjectFile was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the ouDistinguishedName property value. The distinguished name of the OU.
     * @param value Value to set for the ouDistinguishedName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOuDistinguishedName(@javax.annotation.Nullable final String value) {
        this._ouDistinguishedName = value;
    }
    /**
     * Sets the roleScopeTagIds property value. The list of scope tags for the configuration.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
}
