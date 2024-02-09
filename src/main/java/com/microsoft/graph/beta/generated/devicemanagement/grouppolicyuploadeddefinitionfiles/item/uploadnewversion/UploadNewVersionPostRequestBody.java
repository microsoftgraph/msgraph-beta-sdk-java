package com.microsoft.graph.beta.devicemanagement.grouppolicyuploadeddefinitionfiles.item.uploadnewversion;

import com.microsoft.graph.beta.models.GroupPolicyUploadedLanguageFile;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UploadNewVersionPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link UploadNewVersionPostRequestBody} and sets the default values.
     */
    public UploadNewVersionPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UploadNewVersionPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static UploadNewVersionPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UploadNewVersionPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the content property value. The content property
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getContent() {
        return this.backingStore.get("content");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("groupPolicyUploadedLanguageFiles", (n) -> { this.setGroupPolicyUploadedLanguageFiles(n.getCollectionOfObjectValues(GroupPolicyUploadedLanguageFile::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupPolicyUploadedLanguageFiles property value. The groupPolicyUploadedLanguageFiles property
     * @return a {@link java.util.List<GroupPolicyUploadedLanguageFile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyUploadedLanguageFile> getGroupPolicyUploadedLanguageFiles() {
        return this.backingStore.get("groupPolicyUploadedLanguageFiles");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeCollectionOfObjectValues("groupPolicyUploadedLanguageFiles", this.getGroupPolicyUploadedLanguageFiles());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the groupPolicyUploadedLanguageFiles property value. The groupPolicyUploadedLanguageFiles property
     * @param value Value to set for the groupPolicyUploadedLanguageFiles property.
     */
    public void setGroupPolicyUploadedLanguageFiles(@jakarta.annotation.Nullable final java.util.List<GroupPolicyUploadedLanguageFile> value) {
        this.backingStore.set("groupPolicyUploadedLanguageFiles", value);
    }
}
