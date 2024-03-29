package com.microsoft.graph.beta.models;

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
public class AppLogCollectionDownloadDetails implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AppLogCollectionDownloadDetails} and sets the default values.
     */
    public AppLogCollectionDownloadDetails() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AppLogCollectionDownloadDetails}
     */
    @jakarta.annotation.Nonnull
    public static AppLogCollectionDownloadDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppLogCollectionDownloadDetails();
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
     * Gets the appLogDecryptionAlgorithm property value. The appLogDecryptionAlgorithm property
     * @return a {@link AppLogDecryptionAlgorithm}
     */
    @jakarta.annotation.Nullable
    public AppLogDecryptionAlgorithm getAppLogDecryptionAlgorithm() {
        return this.backingStore.get("appLogDecryptionAlgorithm");
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
     * Gets the decryptionKey property value. Decryption key that used to decrypt the log.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDecryptionKey() {
        return this.backingStore.get("decryptionKey");
    }
    /**
     * Gets the downloadUrl property value. Download SAS (Shared Access Signature) Url for completed app log request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDownloadUrl() {
        return this.backingStore.get("downloadUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("appLogDecryptionAlgorithm", (n) -> { this.setAppLogDecryptionAlgorithm(n.getEnumValue(AppLogDecryptionAlgorithm::forValue)); });
        deserializerMap.put("decryptionKey", (n) -> { this.setDecryptionKey(n.getStringValue()); });
        deserializerMap.put("downloadUrl", (n) -> { this.setDownloadUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("appLogDecryptionAlgorithm", this.getAppLogDecryptionAlgorithm());
        writer.writeStringValue("decryptionKey", this.getDecryptionKey());
        writer.writeStringValue("downloadUrl", this.getDownloadUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the appLogDecryptionAlgorithm property value. The appLogDecryptionAlgorithm property
     * @param value Value to set for the appLogDecryptionAlgorithm property.
     */
    public void setAppLogDecryptionAlgorithm(@jakarta.annotation.Nullable final AppLogDecryptionAlgorithm value) {
        this.backingStore.set("appLogDecryptionAlgorithm", value);
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
     * Sets the decryptionKey property value. Decryption key that used to decrypt the log.
     * @param value Value to set for the decryptionKey property.
     */
    public void setDecryptionKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("decryptionKey", value);
    }
    /**
     * Sets the downloadUrl property value. Download SAS (Shared Access Signature) Url for completed app log request.
     * @param value Value to set for the downloadUrl property.
     */
    public void setDownloadUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("downloadUrl", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
