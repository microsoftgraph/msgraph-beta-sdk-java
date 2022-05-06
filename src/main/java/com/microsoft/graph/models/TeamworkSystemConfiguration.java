package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkSystemConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The date and time configurations for a device.  */
    private TeamworkDateTimeConfiguration _dateTimeConfiguration;
    /** The default password for the device. Write-Only.  */
    private String _defaultPassword;
    /** The device lock timeout in seconds.  */
    private Period _deviceLockTimeout;
    /** True if the device lock is enabled.  */
    private Boolean _isDeviceLockEnabled;
    /** True if logging is enabled.  */
    private Boolean _isLoggingEnabled;
    /** True if power saving is enabled.  */
    private Boolean _isPowerSavingEnabled;
    /** True if screen capture is enabled.  */
    private Boolean _isScreenCaptureEnabled;
    /** True if silent mode is enabled.  */
    private Boolean _isSilentModeEnabled;
    /** The language option for the device.  */
    private String _language;
    /** The pin that unlocks the device. Write-Only.  */
    private String _lockPin;
    /** The logging level for the device.  */
    private String _loggingLevel;
    /** The network configuration for the device.  */
    private TeamworkNetworkConfiguration _networkConfiguration;
    /**
     * Instantiates a new teamworkSystemConfiguration and sets the default values.
     * @return a void
     */
    public TeamworkSystemConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkSystemConfiguration
     */
    @javax.annotation.Nonnull
    public static TeamworkSystemConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkSystemConfiguration();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the dateTimeConfiguration property value. The date and time configurations for a device.
     * @return a teamworkDateTimeConfiguration
     */
    @javax.annotation.Nullable
    public TeamworkDateTimeConfiguration getDateTimeConfiguration() {
        return this._dateTimeConfiguration;
    }
    /**
     * Gets the defaultPassword property value. The default password for the device. Write-Only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultPassword() {
        return this._defaultPassword;
    }
    /**
     * Gets the deviceLockTimeout property value. The device lock timeout in seconds.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getDeviceLockTimeout() {
        return this._deviceLockTimeout;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkSystemConfiguration currentObject = this;
        return new HashMap<>(12) {{
            this.put("dateTimeConfiguration", (n) -> { currentObject.setDateTimeConfiguration(n.getObjectValue(TeamworkDateTimeConfiguration::createFromDiscriminatorValue)); });
            this.put("defaultPassword", (n) -> { currentObject.setDefaultPassword(n.getStringValue()); });
            this.put("deviceLockTimeout", (n) -> { currentObject.setDeviceLockTimeout(n.getPeriodValue()); });
            this.put("isDeviceLockEnabled", (n) -> { currentObject.setIsDeviceLockEnabled(n.getBooleanValue()); });
            this.put("isLoggingEnabled", (n) -> { currentObject.setIsLoggingEnabled(n.getBooleanValue()); });
            this.put("isPowerSavingEnabled", (n) -> { currentObject.setIsPowerSavingEnabled(n.getBooleanValue()); });
            this.put("isScreenCaptureEnabled", (n) -> { currentObject.setIsScreenCaptureEnabled(n.getBooleanValue()); });
            this.put("isSilentModeEnabled", (n) -> { currentObject.setIsSilentModeEnabled(n.getBooleanValue()); });
            this.put("language", (n) -> { currentObject.setLanguage(n.getStringValue()); });
            this.put("lockPin", (n) -> { currentObject.setLockPin(n.getStringValue()); });
            this.put("loggingLevel", (n) -> { currentObject.setLoggingLevel(n.getStringValue()); });
            this.put("networkConfiguration", (n) -> { currentObject.setNetworkConfiguration(n.getObjectValue(TeamworkNetworkConfiguration::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isDeviceLockEnabled property value. True if the device lock is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDeviceLockEnabled() {
        return this._isDeviceLockEnabled;
    }
    /**
     * Gets the isLoggingEnabled property value. True if logging is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsLoggingEnabled() {
        return this._isLoggingEnabled;
    }
    /**
     * Gets the isPowerSavingEnabled property value. True if power saving is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPowerSavingEnabled() {
        return this._isPowerSavingEnabled;
    }
    /**
     * Gets the isScreenCaptureEnabled property value. True if screen capture is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsScreenCaptureEnabled() {
        return this._isScreenCaptureEnabled;
    }
    /**
     * Gets the isSilentModeEnabled property value. True if silent mode is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSilentModeEnabled() {
        return this._isSilentModeEnabled;
    }
    /**
     * Gets the language property value. The language option for the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLanguage() {
        return this._language;
    }
    /**
     * Gets the lockPin property value. The pin that unlocks the device. Write-Only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLockPin() {
        return this._lockPin;
    }
    /**
     * Gets the loggingLevel property value. The logging level for the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLoggingLevel() {
        return this._loggingLevel;
    }
    /**
     * Gets the networkConfiguration property value. The network configuration for the device.
     * @return a teamworkNetworkConfiguration
     */
    @javax.annotation.Nullable
    public TeamworkNetworkConfiguration getNetworkConfiguration() {
        return this._networkConfiguration;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("dateTimeConfiguration", this.getDateTimeConfiguration());
        writer.writeStringValue("defaultPassword", this.getDefaultPassword());
        writer.writePeriodValue("deviceLockTimeout", this.getDeviceLockTimeout());
        writer.writeBooleanValue("isDeviceLockEnabled", this.getIsDeviceLockEnabled());
        writer.writeBooleanValue("isLoggingEnabled", this.getIsLoggingEnabled());
        writer.writeBooleanValue("isPowerSavingEnabled", this.getIsPowerSavingEnabled());
        writer.writeBooleanValue("isScreenCaptureEnabled", this.getIsScreenCaptureEnabled());
        writer.writeBooleanValue("isSilentModeEnabled", this.getIsSilentModeEnabled());
        writer.writeStringValue("language", this.getLanguage());
        writer.writeStringValue("lockPin", this.getLockPin());
        writer.writeStringValue("loggingLevel", this.getLoggingLevel());
        writer.writeObjectValue("networkConfiguration", this.getNetworkConfiguration());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the dateTimeConfiguration property value. The date and time configurations for a device.
     * @param value Value to set for the dateTimeConfiguration property.
     * @return a void
     */
    public void setDateTimeConfiguration(@javax.annotation.Nullable final TeamworkDateTimeConfiguration value) {
        this._dateTimeConfiguration = value;
    }
    /**
     * Sets the defaultPassword property value. The default password for the device. Write-Only.
     * @param value Value to set for the defaultPassword property.
     * @return a void
     */
    public void setDefaultPassword(@javax.annotation.Nullable final String value) {
        this._defaultPassword = value;
    }
    /**
     * Sets the deviceLockTimeout property value. The device lock timeout in seconds.
     * @param value Value to set for the deviceLockTimeout property.
     * @return a void
     */
    public void setDeviceLockTimeout(@javax.annotation.Nullable final Period value) {
        this._deviceLockTimeout = value;
    }
    /**
     * Sets the isDeviceLockEnabled property value. True if the device lock is enabled.
     * @param value Value to set for the isDeviceLockEnabled property.
     * @return a void
     */
    public void setIsDeviceLockEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isDeviceLockEnabled = value;
    }
    /**
     * Sets the isLoggingEnabled property value. True if logging is enabled.
     * @param value Value to set for the isLoggingEnabled property.
     * @return a void
     */
    public void setIsLoggingEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isLoggingEnabled = value;
    }
    /**
     * Sets the isPowerSavingEnabled property value. True if power saving is enabled.
     * @param value Value to set for the isPowerSavingEnabled property.
     * @return a void
     */
    public void setIsPowerSavingEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isPowerSavingEnabled = value;
    }
    /**
     * Sets the isScreenCaptureEnabled property value. True if screen capture is enabled.
     * @param value Value to set for the isScreenCaptureEnabled property.
     * @return a void
     */
    public void setIsScreenCaptureEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isScreenCaptureEnabled = value;
    }
    /**
     * Sets the isSilentModeEnabled property value. True if silent mode is enabled.
     * @param value Value to set for the isSilentModeEnabled property.
     * @return a void
     */
    public void setIsSilentModeEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isSilentModeEnabled = value;
    }
    /**
     * Sets the language property value. The language option for the device.
     * @param value Value to set for the language property.
     * @return a void
     */
    public void setLanguage(@javax.annotation.Nullable final String value) {
        this._language = value;
    }
    /**
     * Sets the lockPin property value. The pin that unlocks the device. Write-Only.
     * @param value Value to set for the lockPin property.
     * @return a void
     */
    public void setLockPin(@javax.annotation.Nullable final String value) {
        this._lockPin = value;
    }
    /**
     * Sets the loggingLevel property value. The logging level for the device.
     * @param value Value to set for the loggingLevel property.
     * @return a void
     */
    public void setLoggingLevel(@javax.annotation.Nullable final String value) {
        this._loggingLevel = value;
    }
    /**
     * Sets the networkConfiguration property value. The network configuration for the device.
     * @param value Value to set for the networkConfiguration property.
     * @return a void
     */
    public void setNetworkConfiguration(@javax.annotation.Nullable final TeamworkNetworkConfiguration value) {
        this._networkConfiguration = value;
    }
}
