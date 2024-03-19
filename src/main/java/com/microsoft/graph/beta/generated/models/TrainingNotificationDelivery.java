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
public class TrainingNotificationDelivery implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link TrainingNotificationDelivery} and sets the default values.
     */
    public TrainingNotificationDelivery() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TrainingNotificationDelivery}
     */
    @jakarta.annotation.Nonnull
    public static TrainingNotificationDelivery createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrainingNotificationDelivery();
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
     * Gets the failedMessageDeliveryCount property value. The failedMessageDeliveryCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedMessageDeliveryCount() {
        return this.backingStore.get("failedMessageDeliveryCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("failedMessageDeliveryCount", (n) -> { this.setFailedMessageDeliveryCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("resolvedTargetsCount", (n) -> { this.setResolvedTargetsCount(n.getIntegerValue()); });
        deserializerMap.put("successfulMessageDeliveryCount", (n) -> { this.setSuccessfulMessageDeliveryCount(n.getIntegerValue()); });
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
     * Gets the resolvedTargetsCount property value. The resolvedTargetsCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getResolvedTargetsCount() {
        return this.backingStore.get("resolvedTargetsCount");
    }
    /**
     * Gets the successfulMessageDeliveryCount property value. The successfulMessageDeliveryCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulMessageDeliveryCount() {
        return this.backingStore.get("successfulMessageDeliveryCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("failedMessageDeliveryCount", this.getFailedMessageDeliveryCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("resolvedTargetsCount", this.getResolvedTargetsCount());
        writer.writeIntegerValue("successfulMessageDeliveryCount", this.getSuccessfulMessageDeliveryCount());
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
     * Sets the failedMessageDeliveryCount property value. The failedMessageDeliveryCount property
     * @param value Value to set for the failedMessageDeliveryCount property.
     */
    public void setFailedMessageDeliveryCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedMessageDeliveryCount", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the resolvedTargetsCount property value. The resolvedTargetsCount property
     * @param value Value to set for the resolvedTargetsCount property.
     */
    public void setResolvedTargetsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("resolvedTargetsCount", value);
    }
    /**
     * Sets the successfulMessageDeliveryCount property value. The successfulMessageDeliveryCount property
     * @param value Value to set for the successfulMessageDeliveryCount property.
     */
    public void setSuccessfulMessageDeliveryCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("successfulMessageDeliveryCount", value);
    }
}
