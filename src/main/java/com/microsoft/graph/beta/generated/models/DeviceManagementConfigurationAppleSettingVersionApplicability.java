package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents the applicable versions for an Apple setting.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationAppleSettingVersionApplicability implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DeviceManagementConfigurationAppleSettingVersionApplicability} and sets the default values.
     */
    public DeviceManagementConfigurationAppleSettingVersionApplicability() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationAppleSettingVersionApplicability}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationAppleSettingVersionApplicability createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationAppleSettingVersionApplicability();
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
     * Gets the constraints property value. Indicates the supported channel types for an Apple setting.
     * @return a {@link EnumSet<DeviceManagementConfigurationAppleApplicabilityConstraint>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<DeviceManagementConfigurationAppleApplicabilityConstraint> getConstraints() {
        return this.backingStore.get("constraints");
    }
    /**
     * Gets the deviceType property value. Indicates the supported device type for an apple setting.
     * @return a {@link EnumSet<DeviceManagementConfigurationAppleApplicabilityDeviceType>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<DeviceManagementConfigurationAppleApplicabilityDeviceType> getDeviceType() {
        return this.backingStore.get("deviceType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("constraints", (n) -> { this.setConstraints(n.getEnumSetValue(DeviceManagementConfigurationAppleApplicabilityConstraint::forValue)); });
        deserializerMap.put("deviceType", (n) -> { this.setDeviceType(n.getEnumSetValue(DeviceManagementConfigurationAppleApplicabilityDeviceType::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("supportedVersions", (n) -> { this.setSupportedVersions(n.getObjectValue(DeviceManagementConfigurationAppleOSSupportedVersions::createFromDiscriminatorValue)); });
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
     * Gets the supportedVersions property value. Indicates the version range for an apple setting.
     * @return a {@link DeviceManagementConfigurationAppleOSSupportedVersions}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationAppleOSSupportedVersions getSupportedVersions() {
        return this.backingStore.get("supportedVersions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("constraints", this.getConstraints());
        writer.writeEnumSetValue("deviceType", this.getDeviceType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("supportedVersions", this.getSupportedVersions());
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
     * Sets the constraints property value. Indicates the supported channel types for an Apple setting.
     * @param value Value to set for the constraints property.
     */
    public void setConstraints(@jakarta.annotation.Nullable final EnumSet<DeviceManagementConfigurationAppleApplicabilityConstraint> value) {
        this.backingStore.set("constraints", value);
    }
    /**
     * Sets the deviceType property value. Indicates the supported device type for an apple setting.
     * @param value Value to set for the deviceType property.
     */
    public void setDeviceType(@jakarta.annotation.Nullable final EnumSet<DeviceManagementConfigurationAppleApplicabilityDeviceType> value) {
        this.backingStore.set("deviceType", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the supportedVersions property value. Indicates the version range for an apple setting.
     * @param value Value to set for the supportedVersions property.
     */
    public void setSupportedVersions(@jakarta.annotation.Nullable final DeviceManagementConfigurationAppleOSSupportedVersions value) {
        this.backingStore.set("supportedVersions", value);
    }
}
