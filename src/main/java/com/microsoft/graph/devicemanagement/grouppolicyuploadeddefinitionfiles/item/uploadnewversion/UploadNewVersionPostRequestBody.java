package com.microsoft.graph.devicemanagement.grouppolicyuploadeddefinitionfiles.item.uploadnewversion;

import com.microsoft.graph.models.GroupPolicyUploadedLanguageFile;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UploadNewVersionPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The content property */
    private byte[] content;
    /** The groupPolicyUploadedLanguageFiles property */
    private java.util.List<GroupPolicyUploadedLanguageFile> groupPolicyUploadedLanguageFiles;
    /**
     * Instantiates a new uploadNewVersionPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UploadNewVersionPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a uploadNewVersionPostRequestBody
     */
    @javax.annotation.Nonnull
    public static UploadNewVersionPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UploadNewVersionPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the content property value. The content property
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getContent() {
        return this.content;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("groupPolicyUploadedLanguageFiles", (n) -> { this.setGroupPolicyUploadedLanguageFiles(n.getCollectionOfObjectValues(GroupPolicyUploadedLanguageFile::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupPolicyUploadedLanguageFiles property value. The groupPolicyUploadedLanguageFiles property
     * @return a groupPolicyUploadedLanguageFile
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyUploadedLanguageFile> getGroupPolicyUploadedLanguageFiles() {
        return this.groupPolicyUploadedLanguageFiles;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeCollectionOfObjectValues("groupPolicyUploadedLanguageFiles", this.getGroupPolicyUploadedLanguageFiles());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContent(@javax.annotation.Nullable final byte[] value) {
        this.content = value;
    }
    /**
     * Sets the groupPolicyUploadedLanguageFiles property value. The groupPolicyUploadedLanguageFiles property
     * @param value Value to set for the groupPolicyUploadedLanguageFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicyUploadedLanguageFiles(@javax.annotation.Nullable final java.util.List<GroupPolicyUploadedLanguageFile> value) {
        this.groupPolicyUploadedLanguageFiles = value;
    }
}
