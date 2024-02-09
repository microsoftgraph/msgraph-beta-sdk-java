package com.microsoft.graph.beta.trustframework.keysets.item.generatekey;

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
public class GenerateKeyPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link GenerateKeyPostRequestBody} and sets the default values.
     */
    public GenerateKeyPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GenerateKeyPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static GenerateKeyPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GenerateKeyPostRequestBody();
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
     * Gets the exp property value. The exp property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getExp() {
        return this.backingStore.get("exp");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("exp", (n) -> { this.setExp(n.getLongValue()); });
        deserializerMap.put("kty", (n) -> { this.setKty(n.getStringValue()); });
        deserializerMap.put("nbf", (n) -> { this.setNbf(n.getLongValue()); });
        deserializerMap.put("use", (n) -> { this.setUse(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the kty property value. The kty property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKty() {
        return this.backingStore.get("kty");
    }
    /**
     * Gets the nbf property value. The nbf property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getNbf() {
        return this.backingStore.get("nbf");
    }
    /**
     * Gets the use property value. The use property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUse() {
        return this.backingStore.get("use");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("exp", this.getExp());
        writer.writeStringValue("kty", this.getKty());
        writer.writeLongValue("nbf", this.getNbf());
        writer.writeStringValue("use", this.getUse());
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
     * Sets the exp property value. The exp property
     * @param value Value to set for the exp property.
     */
    public void setExp(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("exp", value);
    }
    /**
     * Sets the kty property value. The kty property
     * @param value Value to set for the kty property.
     */
    public void setKty(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("kty", value);
    }
    /**
     * Sets the nbf property value. The nbf property
     * @param value Value to set for the nbf property.
     */
    public void setNbf(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("nbf", value);
    }
    /**
     * Sets the use property value. The use property
     * @param value Value to set for the use property.
     */
    public void setUse(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("use", value);
    }
}
