package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
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
public class TeamworkSystemConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new TeamworkSystemConfiguration and sets the default values.
     */
    public TeamworkSystemConfiguration() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkSystemConfiguration
     */
    @jakarta.annotation.Nonnull
    public static TeamworkSystemConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkSystemConfiguration();
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
     * Gets the dateTimeConfiguration property value. The date and time configurations for a device.
     * @return a TeamworkDateTimeConfiguration
     */
    @jakarta.annotation.Nullable
    public TeamworkDateTimeConfiguration getDateTimeConfiguration() {
        return this.BackingStore.get("dateTimeConfiguration");
    }
    /**
     * Gets the defaultPassword property value. The default password for the device. Write-Only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefaultPassword() {
        return this.BackingStore.get("defaultPassword");
    }
    /**
     * Gets the deviceLockTimeout property value. The device lock timeout in seconds.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getDeviceLockTimeout() {
        return this.BackingStore.get("deviceLockTimeout");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("dateTimeConfiguration", (n) -> { this.setDateTimeConfiguration(n.getObjectValue(TeamworkDateTimeConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultPassword", (n) -> { this.setDefaultPassword(n.getStringValue()); });
        deserializerMap.put("deviceLockTimeout", (n) -> { this.setDeviceLockTimeout(n.getPeriodAndDurationValue()); });
        deserializerMap.put("isDeviceLockEnabled", (n) -> { this.setIsDeviceLockEnabled(n.getBooleanValue()); });
        deserializerMap.put("isLoggingEnabled", (n) -> { this.setIsLoggingEnabled(n.getBooleanValue()); });
        deserializerMap.put("isPowerSavingEnabled", (n) -> { this.setIsPowerSavingEnabled(n.getBooleanValue()); });
        deserializerMap.put("isScreenCaptureEnabled", (n) -> { this.setIsScreenCaptureEnabled(n.getBooleanValue()); });
        deserializerMap.put("isSilentModeEnabled", (n) -> { this.setIsSilentModeEnabled(n.getBooleanValue()); });
        deserializerMap.put("language", (n) -> { this.setLanguage(n.getStringValue()); });
        deserializerMap.put("lockPin", (n) -> { this.setLockPin(n.getStringValue()); });
        deserializerMap.put("loggingLevel", (n) -> { this.setLoggingLevel(n.getStringValue()); });
        deserializerMap.put("networkConfiguration", (n) -> { this.setNetworkConfiguration(n.getObjectValue(TeamworkNetworkConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDeviceLockEnabled property value. True if the device lock is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDeviceLockEnabled() {
        return this.BackingStore.get("isDeviceLockEnabled");
    }
    /**
     * Gets the isLoggingEnabled property value. True if logging is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsLoggingEnabled() {
        return this.BackingStore.get("isLoggingEnabled");
    }
    /**
     * Gets the isPowerSavingEnabled property value. True if power saving is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPowerSavingEnabled() {
        return this.BackingStore.get("isPowerSavingEnabled");
    }
    /**
     * Gets the isScreenCaptureEnabled property value. True if screen capture is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsScreenCaptureEnabled() {
        return this.BackingStore.get("isScreenCaptureEnabled");
    }
    /**
     * Gets the isSilentModeEnabled property value. True if silent mode is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSilentModeEnabled() {
        return this.BackingStore.get("isSilentModeEnabled");
    }
    /**
     * Gets the language property value. The language option for the device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLanguage() {
        return this.BackingStore.get("language");
    }
    /**
     * Gets the lockPin property value. The pin that unlocks the device. Write-Only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLockPin() {
        return this.BackingStore.get("lockPin");
    }
    /**
     * Gets the loggingLevel property value. The logging level for the device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLoggingLevel() {
        return this.BackingStore.get("loggingLevel");
    }
    /**
     * Gets the networkConfiguration property value. The network configuration for the device.
     * @return a TeamworkNetworkConfiguration
     */
    @jakarta.annotation.Nullable
    public TeamworkNetworkConfiguration getNetworkConfiguration() {
        return this.BackingStore.get("networkConfiguration");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("dateTimeConfiguration", this.getDateTimeConfiguration());
        writer.writeStringValue("defaultPassword", this.getDefaultPassword());
        writer.writePeriodAndDurationValue("deviceLockTimeout", this.getDeviceLockTimeout());
        writer.writeBooleanValue("isDeviceLockEnabled", this.getIsDeviceLockEnabled());
        writer.writeBooleanValue("isLoggingEnabled", this.getIsLoggingEnabled());
        writer.writeBooleanValue("isPowerSavingEnabled", this.getIsPowerSavingEnabled());
        writer.writeBooleanValue("isScreenCaptureEnabled", this.getIsScreenCaptureEnabled());
        writer.writeBooleanValue("isSilentModeEnabled", this.getIsSilentModeEnabled());
        writer.writeStringValue("language", this.getLanguage());
        writer.writeStringValue("lockPin", this.getLockPin());
        writer.writeStringValue("loggingLevel", this.getLoggingLevel());
        writer.writeObjectValue("networkConfiguration", this.getNetworkConfiguration());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the dateTimeConfiguration property value. The date and time configurations for a device.
     * @param value Value to set for the dateTimeConfiguration property.
     */
    public void setDateTimeConfiguration(@jakarta.annotation.Nullable final TeamworkDateTimeConfiguration value) {
        this.BackingStore.set("dateTimeConfiguration", value);
    }
    /**
     * Sets the defaultPassword property value. The default password for the device. Write-Only.
     * @param value Value to set for the defaultPassword property.
     */
    public void setDefaultPassword(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("defaultPassword", value);
    }
    /**
     * Sets the deviceLockTimeout property value. The device lock timeout in seconds.
     * @param value Value to set for the deviceLockTimeout property.
     */
    public void setDeviceLockTimeout(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.BackingStore.set("deviceLockTimeout", value);
    }
    /**
     * Sets the isDeviceLockEnabled property value. True if the device lock is enabled.
     * @param value Value to set for the isDeviceLockEnabled property.
     */
    public void setIsDeviceLockEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isDeviceLockEnabled", value);
    }
    /**
     * Sets the isLoggingEnabled property value. True if logging is enabled.
     * @param value Value to set for the isLoggingEnabled property.
     */
    public void setIsLoggingEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isLoggingEnabled", value);
    }
    /**
     * Sets the isPowerSavingEnabled property value. True if power saving is enabled.
     * @param value Value to set for the isPowerSavingEnabled property.
     */
    public void setIsPowerSavingEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isPowerSavingEnabled", value);
    }
    /**
     * Sets the isScreenCaptureEnabled property value. True if screen capture is enabled.
     * @param value Value to set for the isScreenCaptureEnabled property.
     */
    public void setIsScreenCaptureEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isScreenCaptureEnabled", value);
    }
    /**
     * Sets the isSilentModeEnabled property value. True if silent mode is enabled.
     * @param value Value to set for the isSilentModeEnabled property.
     */
    public void setIsSilentModeEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isSilentModeEnabled", value);
    }
    /**
     * Sets the language property value. The language option for the device.
     * @param value Value to set for the language property.
     */
    public void setLanguage(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("language", value);
    }
    /**
     * Sets the lockPin property value. The pin that unlocks the device. Write-Only.
     * @param value Value to set for the lockPin property.
     */
    public void setLockPin(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("lockPin", value);
    }
    /**
     * Sets the loggingLevel property value. The logging level for the device.
     * @param value Value to set for the loggingLevel property.
     */
    public void setLoggingLevel(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("loggingLevel", value);
    }
    /**
     * Sets the networkConfiguration property value. The network configuration for the device.
     * @param value Value to set for the networkConfiguration property.
     */
    public void setNetworkConfiguration(@jakarta.annotation.Nullable final TeamworkNetworkConfiguration value) {
        this.BackingStore.set("networkConfiguration", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
}
