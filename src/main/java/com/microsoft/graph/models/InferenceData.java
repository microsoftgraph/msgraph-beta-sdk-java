package com.microsoft.graph.models;

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
public class InferenceData implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new InferenceData and sets the default values.
     */
    public InferenceData() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InferenceData
     */
    @jakarta.annotation.Nonnull
    public static InferenceData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InferenceData();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the confidenceScore property value. Confidence score reflecting the accuracy of the data inferred about the user.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getConfidenceScore() {
        return this.backingStore.get("confidenceScore");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("confidenceScore", (n) -> { this.setConfidenceScore(n.getDoubleValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("userHasVerifiedAccuracy", (n) -> { this.setUserHasVerifiedAccuracy(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the userHasVerifiedAccuracy property value. Records if the user has confirmed this inference as being True or False.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUserHasVerifiedAccuracy() {
        return this.backingStore.get("userHasVerifiedAccuracy");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("confidenceScore", this.getConfidenceScore());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("userHasVerifiedAccuracy", this.getUserHasVerifiedAccuracy());
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
     * Sets the confidenceScore property value. Confidence score reflecting the accuracy of the data inferred about the user.
     * @param value Value to set for the confidenceScore property.
     */
    public void setConfidenceScore(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("confidenceScore", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the userHasVerifiedAccuracy property value. Records if the user has confirmed this inference as being True or False.
     * @param value Value to set for the userHasVerifiedAccuracy property.
     */
    public void setUserHasVerifiedAccuracy(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("userHasVerifiedAccuracy", value);
    }
}
