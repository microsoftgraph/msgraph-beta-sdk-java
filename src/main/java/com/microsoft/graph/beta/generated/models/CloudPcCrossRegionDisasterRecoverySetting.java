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
public class CloudPcCrossRegionDisasterRecoverySetting implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudPcCrossRegionDisasterRecoverySetting} and sets the default values.
     */
    public CloudPcCrossRegionDisasterRecoverySetting() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcCrossRegionDisasterRecoverySetting}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcCrossRegionDisasterRecoverySetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcCrossRegionDisasterRecoverySetting();
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
     * Gets the crossRegionDisasterRecoveryEnabled property value. True if an end user is allowed to set up cross-region disaster recovery for Cloud PC; otherwise, false. The default value is false. This property is deprecated and will no longer be supported effective February 11, 2025. For scenarios where crossRegionDisasterRecoveryEnabled is true, set disasterRecoveryType to crossRegion. For scenarios where crossRegionDisasterRecoveryEnabled is false,  set disasterRecoveryType to notconfigured.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCrossRegionDisasterRecoveryEnabled() {
        return this.backingStore.get("crossRegionDisasterRecoveryEnabled");
    }
    /**
     * Gets the disasterRecoveryNetworkSetting property value. Indicates the network settings of the Cloud PC during a cross-region disaster recovery operation.
     * @return a {@link CloudPcDisasterRecoveryNetworkSetting}
     */
    @jakarta.annotation.Nullable
    public CloudPcDisasterRecoveryNetworkSetting getDisasterRecoveryNetworkSetting() {
        return this.backingStore.get("disasterRecoveryNetworkSetting");
    }
    /**
     * Gets the disasterRecoveryType property value. Indicates the type of disaster recovery to perform when a disaster occurs on the user&apos;s Cloud PC. The possible values are: notConfigured, crossRegion, premium, unknownFutureValue. The default value is notConfigured.
     * @return a {@link CloudPcDisasterRecoveryType}
     */
    @jakarta.annotation.Nullable
    public CloudPcDisasterRecoveryType getDisasterRecoveryType() {
        return this.backingStore.get("disasterRecoveryType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("crossRegionDisasterRecoveryEnabled", (n) -> { this.setCrossRegionDisasterRecoveryEnabled(n.getBooleanValue()); });
        deserializerMap.put("disasterRecoveryNetworkSetting", (n) -> { this.setDisasterRecoveryNetworkSetting(n.getObjectValue(CloudPcDisasterRecoveryNetworkSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("disasterRecoveryType", (n) -> { this.setDisasterRecoveryType(n.getEnumValue(CloudPcDisasterRecoveryType::forValue)); });
        deserializerMap.put("maintainCrossRegionRestorePointEnabled", (n) -> { this.setMaintainCrossRegionRestorePointEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("userInitiatedDisasterRecoveryAllowed", (n) -> { this.setUserInitiatedDisasterRecoveryAllowed(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maintainCrossRegionRestorePointEnabled property value. Indicates whether Windows 365 maintain the cross-region disaster recovery function generated restore points. If true, the Windows 365 stored restore points; false indicates that Windows 365 doesn&apos;t generate or keep the restore point from the original Cloud PC. If a disaster occurs, the new Cloud PC can only be provisioned using the initial image. This limitation can result in the loss of some user data on the original Cloud PC. The default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMaintainCrossRegionRestorePointEnabled() {
        return this.backingStore.get("maintainCrossRegionRestorePointEnabled");
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
     * Gets the userInitiatedDisasterRecoveryAllowed property value. Indicates whether the client allows the end user to initiate a disaster recovery activation. True indicates that the client includes the option for the end user to activate Backup Cloud PC. When false, the end user doesn&apos;t have the option to activate disaster recovery. The default value is false. Currently, only premium disaster recovery is supported.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUserInitiatedDisasterRecoveryAllowed() {
        return this.backingStore.get("userInitiatedDisasterRecoveryAllowed");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("crossRegionDisasterRecoveryEnabled", this.getCrossRegionDisasterRecoveryEnabled());
        writer.writeObjectValue("disasterRecoveryNetworkSetting", this.getDisasterRecoveryNetworkSetting());
        writer.writeEnumValue("disasterRecoveryType", this.getDisasterRecoveryType());
        writer.writeBooleanValue("maintainCrossRegionRestorePointEnabled", this.getMaintainCrossRegionRestorePointEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("userInitiatedDisasterRecoveryAllowed", this.getUserInitiatedDisasterRecoveryAllowed());
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
     * Sets the crossRegionDisasterRecoveryEnabled property value. True if an end user is allowed to set up cross-region disaster recovery for Cloud PC; otherwise, false. The default value is false. This property is deprecated and will no longer be supported effective February 11, 2025. For scenarios where crossRegionDisasterRecoveryEnabled is true, set disasterRecoveryType to crossRegion. For scenarios where crossRegionDisasterRecoveryEnabled is false,  set disasterRecoveryType to notconfigured.
     * @param value Value to set for the crossRegionDisasterRecoveryEnabled property.
     */
    public void setCrossRegionDisasterRecoveryEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("crossRegionDisasterRecoveryEnabled", value);
    }
    /**
     * Sets the disasterRecoveryNetworkSetting property value. Indicates the network settings of the Cloud PC during a cross-region disaster recovery operation.
     * @param value Value to set for the disasterRecoveryNetworkSetting property.
     */
    public void setDisasterRecoveryNetworkSetting(@jakarta.annotation.Nullable final CloudPcDisasterRecoveryNetworkSetting value) {
        this.backingStore.set("disasterRecoveryNetworkSetting", value);
    }
    /**
     * Sets the disasterRecoveryType property value. Indicates the type of disaster recovery to perform when a disaster occurs on the user&apos;s Cloud PC. The possible values are: notConfigured, crossRegion, premium, unknownFutureValue. The default value is notConfigured.
     * @param value Value to set for the disasterRecoveryType property.
     */
    public void setDisasterRecoveryType(@jakarta.annotation.Nullable final CloudPcDisasterRecoveryType value) {
        this.backingStore.set("disasterRecoveryType", value);
    }
    /**
     * Sets the maintainCrossRegionRestorePointEnabled property value. Indicates whether Windows 365 maintain the cross-region disaster recovery function generated restore points. If true, the Windows 365 stored restore points; false indicates that Windows 365 doesn&apos;t generate or keep the restore point from the original Cloud PC. If a disaster occurs, the new Cloud PC can only be provisioned using the initial image. This limitation can result in the loss of some user data on the original Cloud PC. The default value is false.
     * @param value Value to set for the maintainCrossRegionRestorePointEnabled property.
     */
    public void setMaintainCrossRegionRestorePointEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("maintainCrossRegionRestorePointEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the userInitiatedDisasterRecoveryAllowed property value. Indicates whether the client allows the end user to initiate a disaster recovery activation. True indicates that the client includes the option for the end user to activate Backup Cloud PC. When false, the end user doesn&apos;t have the option to activate disaster recovery. The default value is false. Currently, only premium disaster recovery is supported.
     * @param value Value to set for the userInitiatedDisasterRecoveryAllowed property.
     */
    public void setUserInitiatedDisasterRecoveryAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("userInitiatedDisasterRecoveryAllowed", value);
    }
}
