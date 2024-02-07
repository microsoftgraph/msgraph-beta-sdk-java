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
public class CloudPcRestorePointSetting implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new CloudPcRestorePointSetting and sets the default values.
     */
    public CloudPcRestorePointSetting() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcRestorePointSetting
     */
    @jakarta.annotation.Nonnull
    public static CloudPcRestorePointSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcRestorePointSetting();
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
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("frequencyInHours", (n) -> { this.setFrequencyInHours(n.getIntegerValue()); });
        deserializerMap.put("frequencyType", (n) -> { this.setFrequencyType(n.getEnumValue(CloudPcRestorePointFrequencyType::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("userRestoreEnabled", (n) -> { this.setUserRestoreEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the frequencyInHours property value. The frequencyInHours property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFrequencyInHours() {
        return this.backingStore.get("frequencyInHours");
    }
    /**
     * Gets the frequencyType property value. The time interval in hours to take snapshots (restore points) of a Cloud PC automatically. Possible values are: default, fourHours, sixHours, twelveHours, sixteenHours, twentyFourHours, unknownFutureValue. The default value is default that indicates that the time interval for automatic capturing of restore point snapshots is set to 12 hours.
     * @return a CloudPcRestorePointFrequencyType
     */
    @jakarta.annotation.Nullable
    public CloudPcRestorePointFrequencyType getFrequencyType() {
        return this.backingStore.get("frequencyType");
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
     * Gets the userRestoreEnabled property value. If true, the user has the ability to use snapshots to restore Cloud PCs. If false, non-admin users can't use snapshots to restore the Cloud PC.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUserRestoreEnabled() {
        return this.backingStore.get("userRestoreEnabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("frequencyInHours", this.getFrequencyInHours());
        writer.writeEnumValue("frequencyType", this.getFrequencyType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("userRestoreEnabled", this.getUserRestoreEnabled());
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
     * Sets the frequencyInHours property value. The frequencyInHours property
     * @param value Value to set for the frequencyInHours property.
     */
    public void setFrequencyInHours(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("frequencyInHours", value);
    }
    /**
     * Sets the frequencyType property value. The time interval in hours to take snapshots (restore points) of a Cloud PC automatically. Possible values are: default, fourHours, sixHours, twelveHours, sixteenHours, twentyFourHours, unknownFutureValue. The default value is default that indicates that the time interval for automatic capturing of restore point snapshots is set to 12 hours.
     * @param value Value to set for the frequencyType property.
     */
    public void setFrequencyType(@jakarta.annotation.Nullable final CloudPcRestorePointFrequencyType value) {
        this.backingStore.set("frequencyType", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the userRestoreEnabled property value. If true, the user has the ability to use snapshots to restore Cloud PCs. If false, non-admin users can't use snapshots to restore the Cloud PC.
     * @param value Value to set for the userRestoreEnabled property.
     */
    public void setUserRestoreEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("userRestoreEnabled", value);
    }
}
