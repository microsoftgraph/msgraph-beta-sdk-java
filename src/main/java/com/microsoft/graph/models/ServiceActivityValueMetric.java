package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceActivityValueMetric implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new ServiceActivityValueMetric and sets the default values.
     */
    public ServiceActivityValueMetric() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceActivityValueMetric
     */
    @jakarta.annotation.Nonnull
    public static ServiceActivityValueMetric createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceActivityValueMetric();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("intervalStartDateTime", (n) -> { this.setIntervalStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the intervalStartDateTime property value. The starting date and time (UTC) of the interval.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getIntervalStartDateTime() {
        return this.BackingStore.get("intervalStartDateTime");
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
     * Gets the value property value. The aggregated value over the given aggregation interval starting from the intervalStartDateTime. The value is caculated at the minute level. The value at the starting minute of the intervalStartDateTime is included. The value at the last minute of the given interval is excluded. For example, if intervalStartDateTime is 2023-09-20T18:00:00Z and aggregation interval is 5 minutes, then the value is aggregated from 2023-09-20T18:00:00Z(inclusive) to 2023-09-20T18:05:00Z(exclusive).
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getValue() {
        return this.BackingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("intervalStartDateTime", this.getIntervalStartDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("value", this.getValue());
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
     * Sets the intervalStartDateTime property value. The starting date and time (UTC) of the interval.
     * @param value Value to set for the intervalStartDateTime property.
     */
    public void setIntervalStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("intervalStartDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the value property value. The aggregated value over the given aggregation interval starting from the intervalStartDateTime. The value is caculated at the minute level. The value at the starting minute of the intervalStartDateTime is included. The value at the last minute of the given interval is excluded. For example, if intervalStartDateTime is 2023-09-20T18:00:00Z and aggregation interval is 5 minutes, then the value is aggregated from 2023-09-20T18:00:00Z(inclusive) to 2023-09-20T18:05:00Z(exclusive).
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("value", value);
    }
}
