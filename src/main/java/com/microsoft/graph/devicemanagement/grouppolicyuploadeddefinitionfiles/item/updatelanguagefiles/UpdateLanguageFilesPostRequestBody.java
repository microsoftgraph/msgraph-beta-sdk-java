package com.microsoft.graph.devicemanagement.grouppolicyuploadeddefinitionfiles.item.updatelanguagefiles;

import com.microsoft.graph.models.GroupPolicyUploadedLanguageFile;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateLanguageFilesPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The groupPolicyUploadedLanguageFiles property
     */
    private java.util.List<GroupPolicyUploadedLanguageFile> groupPolicyUploadedLanguageFiles;
    /**
     * Instantiates a new updateLanguageFilesPostRequestBody and sets the default values.
     */
    public UpdateLanguageFilesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateLanguageFilesPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static UpdateLanguageFilesPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateLanguageFilesPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("groupPolicyUploadedLanguageFiles", (n) -> { this.setGroupPolicyUploadedLanguageFiles(n.getCollectionOfObjectValues(GroupPolicyUploadedLanguageFile::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupPolicyUploadedLanguageFiles property value. The groupPolicyUploadedLanguageFiles property
     * @return a groupPolicyUploadedLanguageFile
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyUploadedLanguageFile> getGroupPolicyUploadedLanguageFiles() {
        return this.groupPolicyUploadedLanguageFiles;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("groupPolicyUploadedLanguageFiles", this.getGroupPolicyUploadedLanguageFiles());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the groupPolicyUploadedLanguageFiles property value. The groupPolicyUploadedLanguageFiles property
     * @param value Value to set for the groupPolicyUploadedLanguageFiles property.
     */
    public void setGroupPolicyUploadedLanguageFiles(@jakarta.annotation.Nullable final java.util.List<GroupPolicyUploadedLanguageFile> value) {
        this.groupPolicyUploadedLanguageFiles = value;
    }
}
