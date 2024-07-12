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
public class CloudPcDisasterRecoveryCapability implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudPcDisasterRecoveryCapability} and sets the default values.
     */
    public CloudPcDisasterRecoveryCapability() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcDisasterRecoveryCapability}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcDisasterRecoveryCapability createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcDisasterRecoveryCapability();
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
     * Gets the capabilityType property value. The disaster recovery action that can be performed for the Cloud PC. The possible values are: none, failover, failback, unknownFutureValue.
     * @return a {@link CloudPcDisasterRecoveryCapabilityType}
     */
    @jakarta.annotation.Nullable
    public CloudPcDisasterRecoveryCapabilityType getCapabilityType() {
        return this.backingStore.get("capabilityType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("capabilityType", (n) -> { this.setCapabilityType(n.getEnumValue(CloudPcDisasterRecoveryCapabilityType::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("primaryRegion", (n) -> { this.setPrimaryRegion(n.getStringValue()); });
        deserializerMap.put("secondaryRegion", (n) -> { this.setSecondaryRegion(n.getStringValue()); });
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
     * Gets the primaryRegion property value. The primary and mainly used region where the Cloud PC is located.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrimaryRegion() {
        return this.backingStore.get("primaryRegion");
    }
    /**
     * Gets the secondaryRegion property value. The secondary region to which the Cloud PC can be failed over during a regional outage.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecondaryRegion() {
        return this.backingStore.get("secondaryRegion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("capabilityType", this.getCapabilityType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("primaryRegion", this.getPrimaryRegion());
        writer.writeStringValue("secondaryRegion", this.getSecondaryRegion());
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
     * Sets the capabilityType property value. The disaster recovery action that can be performed for the Cloud PC. The possible values are: none, failover, failback, unknownFutureValue.
     * @param value Value to set for the capabilityType property.
     */
    public void setCapabilityType(@jakarta.annotation.Nullable final CloudPcDisasterRecoveryCapabilityType value) {
        this.backingStore.set("capabilityType", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the primaryRegion property value. The primary and mainly used region where the Cloud PC is located.
     * @param value Value to set for the primaryRegion property.
     */
    public void setPrimaryRegion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("primaryRegion", value);
    }
    /**
     * Sets the secondaryRegion property value. The secondary region to which the Cloud PC can be failed over during a regional outage.
     * @param value Value to set for the secondaryRegion property.
     */
    public void setSecondaryRegion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("secondaryRegion", value);
    }
}
