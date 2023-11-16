package com.microsoft.graph.trustframework.keysets.item.uploadsecret;

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
public class UploadSecretPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new UploadSecretPostRequestBody and sets the default values.
     */
    public UploadSecretPostRequestBody() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UploadSecretPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static UploadSecretPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UploadSecretPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the exp property value. The exp property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getExp() {
        return this.BackingStore.get("exp");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("exp", (n) -> { this.setExp(n.getLongValue()); });
        deserializerMap.put("k", (n) -> { this.setK(n.getStringValue()); });
        deserializerMap.put("nbf", (n) -> { this.setNbf(n.getLongValue()); });
        deserializerMap.put("use", (n) -> { this.setUse(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the k property value. The k property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getK() {
        return this.BackingStore.get("k");
    }
    /**
     * Gets the nbf property value. The nbf property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getNbf() {
        return this.BackingStore.get("nbf");
    }
    /**
     * Gets the use property value. The use property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUse() {
        return this.BackingStore.get("use");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("exp", this.getExp());
        writer.writeStringValue("k", this.getK());
        writer.writeLongValue("nbf", this.getNbf());
        writer.writeStringValue("use", this.getUse());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the exp property value. The exp property
     * @param value Value to set for the exp property.
     */
    public void setExp(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("exp", value);
    }
    /**
     * Sets the k property value. The k property
     * @param value Value to set for the k property.
     */
    public void setK(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("k", value);
    }
    /**
     * Sets the nbf property value. The nbf property
     * @param value Value to set for the nbf property.
     */
    public void setNbf(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("nbf", value);
    }
    /**
     * Sets the use property value. The use property
     * @param value Value to set for the use property.
     */
    public void setUse(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("use", value);
    }
}
