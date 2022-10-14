package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GroupPolicyUploadedDefinitionFile extends GroupPolicyDefinitionFile implements Parsable {
    /** The contents of the uploaded ADMX file. */
    private byte[] _content;
    /** The default language of the uploaded ADMX file. */
    private String _defaultLanguageCode;
    /** The list of operations on the uploaded ADMX file. */
    private java.util.List<GroupPolicyOperation> _groupPolicyOperations;
    /** The list of ADML files associated with the uploaded ADMX file. */
    private java.util.List<GroupPolicyUploadedLanguageFile> _groupPolicyUploadedLanguageFiles;
    /** Type of Group Policy uploaded definition file status. */
    private GroupPolicyUploadedDefinitionFileStatus _status;
    /** The uploaded time of the uploaded ADMX file. */
    private OffsetDateTime _uploadDateTime;
    /**
     * Instantiates a new GroupPolicyUploadedDefinitionFile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GroupPolicyUploadedDefinitionFile() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyUploadedDefinitionFile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupPolicyUploadedDefinitionFile
     */
    @javax.annotation.Nonnull
    public static GroupPolicyUploadedDefinitionFile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyUploadedDefinitionFile();
    }
    /**
     * Gets the content property value. The contents of the uploaded ADMX file.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getContent() {
        return this._content;
    }
    /**
     * Gets the defaultLanguageCode property value. The default language of the uploaded ADMX file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultLanguageCode() {
        return this._defaultLanguageCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GroupPolicyUploadedDefinitionFile currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("content", (n) -> { currentObject.setContent(n.getByteArrayValue()); });
            this.put("defaultLanguageCode", (n) -> { currentObject.setDefaultLanguageCode(n.getStringValue()); });
            this.put("groupPolicyOperations", (n) -> { currentObject.setGroupPolicyOperations(n.getCollectionOfObjectValues(GroupPolicyOperation::createFromDiscriminatorValue)); });
            this.put("groupPolicyUploadedLanguageFiles", (n) -> { currentObject.setGroupPolicyUploadedLanguageFiles(n.getCollectionOfObjectValues(GroupPolicyUploadedLanguageFile::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(GroupPolicyUploadedDefinitionFileStatus.class)); });
            this.put("uploadDateTime", (n) -> { currentObject.setUploadDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the groupPolicyOperations property value. The list of operations on the uploaded ADMX file.
     * @return a groupPolicyOperation
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyOperation> getGroupPolicyOperations() {
        return this._groupPolicyOperations;
    }
    /**
     * Gets the groupPolicyUploadedLanguageFiles property value. The list of ADML files associated with the uploaded ADMX file.
     * @return a groupPolicyUploadedLanguageFile
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyUploadedLanguageFile> getGroupPolicyUploadedLanguageFiles() {
        return this._groupPolicyUploadedLanguageFiles;
    }
    /**
     * Gets the status property value. Type of Group Policy uploaded definition file status.
     * @return a groupPolicyUploadedDefinitionFileStatus
     */
    @javax.annotation.Nullable
    public GroupPolicyUploadedDefinitionFileStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the uploadDateTime property value. The uploaded time of the uploaded ADMX file.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getUploadDateTime() {
        return this._uploadDateTime;
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
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeStringValue("defaultLanguageCode", this.getDefaultLanguageCode());
        writer.writeCollectionOfObjectValues("groupPolicyOperations", this.getGroupPolicyOperations());
        writer.writeCollectionOfObjectValues("groupPolicyUploadedLanguageFiles", this.getGroupPolicyUploadedLanguageFiles());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeOffsetDateTimeValue("uploadDateTime", this.getUploadDateTime());
    }
    /**
     * Sets the content property value. The contents of the uploaded ADMX file.
     * @param value Value to set for the content property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContent(@javax.annotation.Nullable final byte[] value) {
        this._content = value;
    }
    /**
     * Sets the defaultLanguageCode property value. The default language of the uploaded ADMX file.
     * @param value Value to set for the defaultLanguageCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultLanguageCode(@javax.annotation.Nullable final String value) {
        this._defaultLanguageCode = value;
    }
    /**
     * Sets the groupPolicyOperations property value. The list of operations on the uploaded ADMX file.
     * @param value Value to set for the groupPolicyOperations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicyOperations(@javax.annotation.Nullable final java.util.List<GroupPolicyOperation> value) {
        this._groupPolicyOperations = value;
    }
    /**
     * Sets the groupPolicyUploadedLanguageFiles property value. The list of ADML files associated with the uploaded ADMX file.
     * @param value Value to set for the groupPolicyUploadedLanguageFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicyUploadedLanguageFiles(@javax.annotation.Nullable final java.util.List<GroupPolicyUploadedLanguageFile> value) {
        this._groupPolicyUploadedLanguageFiles = value;
    }
    /**
     * Sets the status property value. Type of Group Policy uploaded definition file status.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final GroupPolicyUploadedDefinitionFileStatus value) {
        this._status = value;
    }
    /**
     * Sets the uploadDateTime property value. The uploaded time of the uploaded ADMX file.
     * @param value Value to set for the uploadDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUploadDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._uploadDateTime = value;
    }
}
