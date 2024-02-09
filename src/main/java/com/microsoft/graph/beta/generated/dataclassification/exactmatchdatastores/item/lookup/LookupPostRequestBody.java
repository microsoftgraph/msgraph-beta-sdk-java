package com.microsoft.graph.beta.dataclassification.exactmatchdatastores.item.lookup;

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
public class LookupPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link LookupPostRequestBody} and sets the default values.
     */
    public LookupPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LookupPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static LookupPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LookupPostRequestBody();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("key", (n) -> { this.setKey(n.getStringValue()); });
        deserializerMap.put("resultColumnNames", (n) -> { this.setResultColumnNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the key property value. The key property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKey() {
        return this.backingStore.get("key");
    }
    /**
     * Gets the resultColumnNames property value. The resultColumnNames property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResultColumnNames() {
        return this.backingStore.get("resultColumnNames");
    }
    /**
     * Gets the values property value. The values property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getValues() {
        return this.backingStore.get("values");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("key", this.getKey());
        writer.writeCollectionOfPrimitiveValues("resultColumnNames", this.getResultColumnNames());
        writer.writeCollectionOfPrimitiveValues("values", this.getValues());
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
     * Sets the key property value. The key property
     * @param value Value to set for the key property.
     */
    public void setKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("key", value);
    }
    /**
     * Sets the resultColumnNames property value. The resultColumnNames property
     * @param value Value to set for the resultColumnNames property.
     */
    public void setResultColumnNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("resultColumnNames", value);
    }
    /**
     * Sets the values property value. The values property
     * @param value Value to set for the values property.
     */
    public void setValues(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("values", value);
    }
}
