package com.microsoft.graph.beta.groups.item.sites.item.informationprotection.decryptbuffer;

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
public class DecryptBufferPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DecryptBufferPostRequestBody} and sets the default values.
     */
    public DecryptBufferPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DecryptBufferPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static DecryptBufferPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DecryptBufferPostRequestBody();
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
     * Gets the encryptedBuffer property value. The encryptedBuffer property
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getEncryptedBuffer() {
        return this.backingStore.get("encryptedBuffer");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("encryptedBuffer", (n) -> { this.setEncryptedBuffer(n.getByteArrayValue()); });
        deserializerMap.put("publishingLicense", (n) -> { this.setPublishingLicense(n.getByteArrayValue()); });
        return deserializerMap;
    }
    /**
     * Gets the publishingLicense property value. The publishingLicense property
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getPublishingLicense() {
        return this.backingStore.get("publishingLicense");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("encryptedBuffer", this.getEncryptedBuffer());
        writer.writeByteArrayValue("publishingLicense", this.getPublishingLicense());
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
     * Sets the encryptedBuffer property value. The encryptedBuffer property
     * @param value Value to set for the encryptedBuffer property.
     */
    public void setEncryptedBuffer(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("encryptedBuffer", value);
    }
    /**
     * Sets the publishingLicense property value. The publishingLicense property
     * @param value Value to set for the publishingLicense property.
     */
    public void setPublishingLicense(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("publishingLicense", value);
    }
}
