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
/**
 * One service&apos;s share of reported consumption for one completed UTC day.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CostManagementServiceUsageRecord implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CostManagementServiceUsageRecord} and sets the default values.
     */
    public CostManagementServiceUsageRecord() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CostManagementServiceUsageRecord}
     */
    @jakarta.annotation.Nonnull
    public static CostManagementServiceUsageRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CostManagementServiceUsageRecord();
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
     * Gets the consumedQuantity property value. Consumption attributed to this service for the requested completed UTC day. Read-only.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getConsumedQuantity() {
        return this.backingStore.get("consumedQuantity");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("consumedQuantity", (n) -> { this.setConsumedQuantity(n.getDoubleValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("serviceId", (n) -> { this.setServiceId(n.getStringValue()); });
        deserializerMap.put("unit", (n) -> { this.setUnit(n.getEnumValue(CostManagementUnit::forValue)); });
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
     * Gets the serviceId property value. The governed service identifier, such as cowork or workIQ. Discover valid values from theservice catalog using a category identifier, not the catalog entry&apos;s own id. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServiceId() {
        return this.backingStore.get("serviceId");
    }
    /**
     * Gets the unit property value. Unit in which consumption quantities are expressed. Values are consumption units, not currency.
     * @return a {@link CostManagementUnit}
     */
    @jakarta.annotation.Nullable
    public CostManagementUnit getUnit() {
        return this.backingStore.get("unit");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("unit", this.getUnit());
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
     * Sets the consumedQuantity property value. Consumption attributed to this service for the requested completed UTC day. Read-only.
     * @param value Value to set for the consumedQuantity property.
     */
    public void setConsumedQuantity(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("consumedQuantity", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the serviceId property value. The governed service identifier, such as cowork or workIQ. Discover valid values from theservice catalog using a category identifier, not the catalog entry&apos;s own id. Read-only.
     * @param value Value to set for the serviceId property.
     */
    public void setServiceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serviceId", value);
    }
    /**
     * Sets the unit property value. Unit in which consumption quantities are expressed. Values are consumption units, not currency.
     * @param value Value to set for the unit property.
     */
    public void setUnit(@jakarta.annotation.Nullable final CostManagementUnit value) {
        this.backingStore.set("unit", value);
    }
}
