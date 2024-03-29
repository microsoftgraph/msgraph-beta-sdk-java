package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The entity represents an ADMX (Administrative Template) XML file uploaded by Administrator. The ADMX file contains a collection of group policy definitions and their locations by category path. The group policy definition file also contains the languages supported as determined by the language dependent ADML (Administrative Template) language files.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupPolicyUploadedDefinitionFile extends GroupPolicyDefinitionFile implements Parsable {
    /**
     * Instantiates a new {@link GroupPolicyUploadedDefinitionFile} and sets the default values.
     */
    public GroupPolicyUploadedDefinitionFile() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyUploadedDefinitionFile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GroupPolicyUploadedDefinitionFile}
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyUploadedDefinitionFile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyUploadedDefinitionFile();
    }
    /**
     * Gets the content property value. The contents of the uploaded ADMX file.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the defaultLanguageCode property value. The default language of the uploaded ADMX file.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultLanguageCode() {
        return this.backingStore.get("defaultLanguageCode");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("defaultLanguageCode", (n) -> { this.setDefaultLanguageCode(n.getStringValue()); });
        deserializerMap.put("groupPolicyOperations", (n) -> { this.setGroupPolicyOperations(n.getCollectionOfObjectValues(GroupPolicyOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("groupPolicyUploadedLanguageFiles", (n) -> { this.setGroupPolicyUploadedLanguageFiles(n.getCollectionOfObjectValues(GroupPolicyUploadedLanguageFile::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(GroupPolicyUploadedDefinitionFileStatus::forValue)); });
        deserializerMap.put("uploadDateTime", (n) -> { this.setUploadDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupPolicyOperations property value. The list of operations on the uploaded ADMX file.
     * @return a {@link java.util.List<GroupPolicyOperation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyOperation> getGroupPolicyOperations() {
        return this.backingStore.get("groupPolicyOperations");
    }
    /**
     * Gets the groupPolicyUploadedLanguageFiles property value. The list of ADML files associated with the uploaded ADMX file.
     * @return a {@link java.util.List<GroupPolicyUploadedLanguageFile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyUploadedLanguageFile> getGroupPolicyUploadedLanguageFiles() {
        return this.backingStore.get("groupPolicyUploadedLanguageFiles");
    }
    /**
     * Gets the status property value. Type of Group Policy uploaded definition file status.
     * @return a {@link GroupPolicyUploadedDefinitionFileStatus}
     */
    @jakarta.annotation.Nullable
    public GroupPolicyUploadedDefinitionFileStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the uploadDateTime property value. The uploaded time of the uploaded ADMX file.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUploadDateTime() {
        return this.backingStore.get("uploadDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setContent(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the defaultLanguageCode property value. The default language of the uploaded ADMX file.
     * @param value Value to set for the defaultLanguageCode property.
     */
    public void setDefaultLanguageCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultLanguageCode", value);
    }
    /**
     * Sets the groupPolicyOperations property value. The list of operations on the uploaded ADMX file.
     * @param value Value to set for the groupPolicyOperations property.
     */
    public void setGroupPolicyOperations(@jakarta.annotation.Nullable final java.util.List<GroupPolicyOperation> value) {
        this.backingStore.set("groupPolicyOperations", value);
    }
    /**
     * Sets the groupPolicyUploadedLanguageFiles property value. The list of ADML files associated with the uploaded ADMX file.
     * @param value Value to set for the groupPolicyUploadedLanguageFiles property.
     */
    public void setGroupPolicyUploadedLanguageFiles(@jakarta.annotation.Nullable final java.util.List<GroupPolicyUploadedLanguageFile> value) {
        this.backingStore.set("groupPolicyUploadedLanguageFiles", value);
    }
    /**
     * Sets the status property value. Type of Group Policy uploaded definition file status.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final GroupPolicyUploadedDefinitionFileStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the uploadDateTime property value. The uploaded time of the uploaded ADMX file.
     * @param value Value to set for the uploadDateTime property.
     */
    public void setUploadDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("uploadDateTime", value);
    }
}
