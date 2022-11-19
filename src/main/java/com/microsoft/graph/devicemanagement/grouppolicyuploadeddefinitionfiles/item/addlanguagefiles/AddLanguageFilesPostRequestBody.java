package com.microsoft.graph.devicemanagement.grouppolicyuploadeddefinitionfiles.item.addlanguagefiles;

import com.microsoft.graph.models.GroupPolicyUploadedLanguageFile;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the addLanguageFiles method. */
public class AddLanguageFilesPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The groupPolicyUploadedLanguageFiles property */
    private java.util.List<GroupPolicyUploadedLanguageFile> _groupPolicyUploadedLanguageFiles;
    /**
     * Instantiates a new addLanguageFilesPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AddLanguageFilesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a addLanguageFilesPostRequestBody
     */
    @javax.annotation.Nonnull
    public static AddLanguageFilesPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddLanguageFilesPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AddLanguageFilesPostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(1);
        deserializerMap.put("groupPolicyUploadedLanguageFiles", (n) -> { currentObject.setGroupPolicyUploadedLanguageFiles(n.getCollectionOfObjectValues(GroupPolicyUploadedLanguageFile::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupPolicyUploadedLanguageFiles property value. The groupPolicyUploadedLanguageFiles property
     * @return a groupPolicyUploadedLanguageFile
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyUploadedLanguageFile> getGroupPolicyUploadedLanguageFiles() {
        return this._groupPolicyUploadedLanguageFiles;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
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
        this._additionalData = value;
    }
    /**
     * Sets the groupPolicyUploadedLanguageFiles property value. The groupPolicyUploadedLanguageFiles property
     * @param value Value to set for the groupPolicyUploadedLanguageFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicyUploadedLanguageFiles(@javax.annotation.Nullable final java.util.List<GroupPolicyUploadedLanguageFile> value) {
        this._groupPolicyUploadedLanguageFiles = value;
    }
}
