package com.microsoft.graph.models.security;

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
public class ClassificationResult implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new ClassificationResult and sets the default values.
     */
    public ClassificationResult() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ClassificationResult
     */
    @jakarta.annotation.Nonnull
    public static ClassificationResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClassificationResult();
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
     * Gets the confidenceLevel property value. The confidence level, 0 to 100, of the result.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConfidenceLevel() {
        return this.BackingStore.get("confidenceLevel");
    }
    /**
     * Gets the count property value. The number of instances of the specific information type in the input.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCount() {
        return this.BackingStore.get("count");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("confidenceLevel", (n) -> { this.setConfidenceLevel(n.getIntegerValue()); });
        deserializerMap.put("count", (n) -> { this.setCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sensitiveTypeId", (n) -> { this.setSensitiveTypeId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the sensitiveTypeId property value. The GUID of the discovered sensitive information type.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSensitiveTypeId() {
        return this.BackingStore.get("sensitiveTypeId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("confidenceLevel", this.getConfidenceLevel());
        writer.writeIntegerValue("count", this.getCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sensitiveTypeId", this.getSensitiveTypeId());
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
     * Sets the confidenceLevel property value. The confidence level, 0 to 100, of the result.
     * @param value Value to set for the confidenceLevel property.
     */
    public void setConfidenceLevel(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("confidenceLevel", value);
    }
    /**
     * Sets the count property value. The number of instances of the specific information type in the input.
     * @param value Value to set for the count property.
     */
    public void setCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("count", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the sensitiveTypeId property value. The GUID of the discovered sensitive information type.
     * @param value Value to set for the sensitiveTypeId property.
     */
    public void setSensitiveTypeId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("sensitiveTypeId", value);
    }
}
