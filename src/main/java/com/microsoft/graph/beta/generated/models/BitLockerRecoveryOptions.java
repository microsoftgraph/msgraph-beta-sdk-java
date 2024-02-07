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
 * BitLocker Recovery Options.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BitLockerRecoveryOptions implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new BitLockerRecoveryOptions and sets the default values.
     */
    public BitLockerRecoveryOptions() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BitLockerRecoveryOptions
     */
    @jakarta.annotation.Nonnull
    public static BitLockerRecoveryOptions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BitLockerRecoveryOptions();
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
     * Gets the blockDataRecoveryAgent property value. Indicates whether to block certificate-based data recovery agent.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockDataRecoveryAgent() {
        return this.backingStore.get("blockDataRecoveryAgent");
    }
    /**
     * Gets the enableBitLockerAfterRecoveryInformationToStore property value. Indicates whether or not to enable BitLocker until recovery information is stored in AD DS.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableBitLockerAfterRecoveryInformationToStore() {
        return this.backingStore.get("enableBitLockerAfterRecoveryInformationToStore");
    }
    /**
     * Gets the enableRecoveryInformationSaveToStore property value. Indicates whether or not to allow BitLocker recovery information to store in AD DS.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableRecoveryInformationSaveToStore() {
        return this.backingStore.get("enableRecoveryInformationSaveToStore");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("blockDataRecoveryAgent", (n) -> { this.setBlockDataRecoveryAgent(n.getBooleanValue()); });
        deserializerMap.put("enableBitLockerAfterRecoveryInformationToStore", (n) -> { this.setEnableBitLockerAfterRecoveryInformationToStore(n.getBooleanValue()); });
        deserializerMap.put("enableRecoveryInformationSaveToStore", (n) -> { this.setEnableRecoveryInformationSaveToStore(n.getBooleanValue()); });
        deserializerMap.put("hideRecoveryOptions", (n) -> { this.setHideRecoveryOptions(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recoveryInformationToStore", (n) -> { this.setRecoveryInformationToStore(n.getEnumValue(BitLockerRecoveryInformationType::forValue)); });
        deserializerMap.put("recoveryKeyUsage", (n) -> { this.setRecoveryKeyUsage(n.getEnumValue(ConfigurationUsage::forValue)); });
        deserializerMap.put("recoveryPasswordUsage", (n) -> { this.setRecoveryPasswordUsage(n.getEnumValue(ConfigurationUsage::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hideRecoveryOptions property value. Indicates whether or not to allow showing recovery options in BitLocker Setup Wizard for fixed or system disk.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHideRecoveryOptions() {
        return this.backingStore.get("hideRecoveryOptions");
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
     * Gets the recoveryInformationToStore property value. BitLockerRecoveryInformationType types
     * @return a BitLockerRecoveryInformationType
     */
    @jakarta.annotation.Nullable
    public BitLockerRecoveryInformationType getRecoveryInformationToStore() {
        return this.backingStore.get("recoveryInformationToStore");
    }
    /**
     * Gets the recoveryKeyUsage property value. Possible values of the ConfigurationUsage list.
     * @return a ConfigurationUsage
     */
    @jakarta.annotation.Nullable
    public ConfigurationUsage getRecoveryKeyUsage() {
        return this.backingStore.get("recoveryKeyUsage");
    }
    /**
     * Gets the recoveryPasswordUsage property value. Possible values of the ConfigurationUsage list.
     * @return a ConfigurationUsage
     */
    @jakarta.annotation.Nullable
    public ConfigurationUsage getRecoveryPasswordUsage() {
        return this.backingStore.get("recoveryPasswordUsage");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("blockDataRecoveryAgent", this.getBlockDataRecoveryAgent());
        writer.writeBooleanValue("enableBitLockerAfterRecoveryInformationToStore", this.getEnableBitLockerAfterRecoveryInformationToStore());
        writer.writeBooleanValue("enableRecoveryInformationSaveToStore", this.getEnableRecoveryInformationSaveToStore());
        writer.writeBooleanValue("hideRecoveryOptions", this.getHideRecoveryOptions());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("recoveryInformationToStore", this.getRecoveryInformationToStore());
        writer.writeEnumValue("recoveryKeyUsage", this.getRecoveryKeyUsage());
        writer.writeEnumValue("recoveryPasswordUsage", this.getRecoveryPasswordUsage());
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
     * Sets the blockDataRecoveryAgent property value. Indicates whether to block certificate-based data recovery agent.
     * @param value Value to set for the blockDataRecoveryAgent property.
     */
    public void setBlockDataRecoveryAgent(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("blockDataRecoveryAgent", value);
    }
    /**
     * Sets the enableBitLockerAfterRecoveryInformationToStore property value. Indicates whether or not to enable BitLocker until recovery information is stored in AD DS.
     * @param value Value to set for the enableBitLockerAfterRecoveryInformationToStore property.
     */
    public void setEnableBitLockerAfterRecoveryInformationToStore(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableBitLockerAfterRecoveryInformationToStore", value);
    }
    /**
     * Sets the enableRecoveryInformationSaveToStore property value. Indicates whether or not to allow BitLocker recovery information to store in AD DS.
     * @param value Value to set for the enableRecoveryInformationSaveToStore property.
     */
    public void setEnableRecoveryInformationSaveToStore(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableRecoveryInformationSaveToStore", value);
    }
    /**
     * Sets the hideRecoveryOptions property value. Indicates whether or not to allow showing recovery options in BitLocker Setup Wizard for fixed or system disk.
     * @param value Value to set for the hideRecoveryOptions property.
     */
    public void setHideRecoveryOptions(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hideRecoveryOptions", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the recoveryInformationToStore property value. BitLockerRecoveryInformationType types
     * @param value Value to set for the recoveryInformationToStore property.
     */
    public void setRecoveryInformationToStore(@jakarta.annotation.Nullable final BitLockerRecoveryInformationType value) {
        this.backingStore.set("recoveryInformationToStore", value);
    }
    /**
     * Sets the recoveryKeyUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the recoveryKeyUsage property.
     */
    public void setRecoveryKeyUsage(@jakarta.annotation.Nullable final ConfigurationUsage value) {
        this.backingStore.set("recoveryKeyUsage", value);
    }
    /**
     * Sets the recoveryPasswordUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the recoveryPasswordUsage property.
     */
    public void setRecoveryPasswordUsage(@jakarta.annotation.Nullable final ConfigurationUsage value) {
        this.backingStore.set("recoveryPasswordUsage", value);
    }
}
