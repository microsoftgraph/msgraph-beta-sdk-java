package com.microsoft.graph.beta.models.security.casemanagement;

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
public class IncidentSeverityCounts implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link IncidentSeverityCounts} and sets the default values.
     */
    public IncidentSeverityCounts() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IncidentSeverityCounts}
     */
    @jakarta.annotation.Nonnull
    public static IncidentSeverityCounts createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IncidentSeverityCounts();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("high", (n) -> { this.setHigh(n.getIntegerValue()); });
        deserializerMap.put("informational", (n) -> { this.setInformational(n.getIntegerValue()); });
        deserializerMap.put("low", (n) -> { this.setLow(n.getIntegerValue()); });
        deserializerMap.put("medium", (n) -> { this.setMedium(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("unknown", (n) -> { this.setUnknown(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the high property value. The number of alerts with high severity.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getHigh() {
        return this.backingStore.get("high");
    }
    /**
     * Gets the informational property value. The number of alerts with informational severity.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getInformational() {
        return this.backingStore.get("informational");
    }
    /**
     * Gets the low property value. The number of alerts with low severity.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLow() {
        return this.backingStore.get("low");
    }
    /**
     * Gets the medium property value. The number of alerts with medium severity.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMedium() {
        return this.backingStore.get("medium");
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
     * Gets the unknown property value. The number of alerts with unknown severity.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUnknown() {
        return this.backingStore.get("unknown");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("high", this.getHigh());
        writer.writeIntegerValue("informational", this.getInformational());
        writer.writeIntegerValue("low", this.getLow());
        writer.writeIntegerValue("medium", this.getMedium());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("unknown", this.getUnknown());
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
     * Sets the high property value. The number of alerts with high severity.
     * @param value Value to set for the high property.
     */
    public void setHigh(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("high", value);
    }
    /**
     * Sets the informational property value. The number of alerts with informational severity.
     * @param value Value to set for the informational property.
     */
    public void setInformational(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("informational", value);
    }
    /**
     * Sets the low property value. The number of alerts with low severity.
     * @param value Value to set for the low property.
     */
    public void setLow(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("low", value);
    }
    /**
     * Sets the medium property value. The number of alerts with medium severity.
     * @param value Value to set for the medium property.
     */
    public void setMedium(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("medium", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the unknown property value. The number of alerts with unknown severity.
     * @param value Value to set for the unknown property.
     */
    public void setUnknown(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("unknown", value);
    }
}
