package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience analytics battery health device app impact entity contains battery usage related information at an app level for a given device. */
public class UserExperienceAnalyticsBatteryHealthDeviceAppImpact extends Entity implements Parsable {
    /** User friendly display name for the app. Eg: Outlook */
    private String _appDisplayName;
    /** App name. Eg: oltk.exe */
    private String _appName;
    /** App publisher. Eg: Microsoft Corporation */
    private String _appPublisher;
    /** The percent of total battery power used by this application when the device was not plugged into AC power, over 14 days. Unit in percentage. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _batteryUsagePercentage;
    /** The unique identifier of the device, Intune DeviceID or SCCM device id. */
    private String _deviceId;
    /** true if the user had active interaction with the app. */
    private Boolean _isForegroundApp;
    /**
     * Instantiates a new userExperienceAnalyticsBatteryHealthDeviceAppImpact and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsBatteryHealthDeviceAppImpact() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsBatteryHealthDeviceAppImpact
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsBatteryHealthDeviceAppImpact createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsBatteryHealthDeviceAppImpact();
    }
    /**
     * Gets the appDisplayName property value. User friendly display name for the app. Eg: Outlook
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppDisplayName() {
        return this._appDisplayName;
    }
    /**
     * Gets the appName property value. App name. Eg: oltk.exe
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppName() {
        return this._appName;
    }
    /**
     * Gets the appPublisher property value. App publisher. Eg: Microsoft Corporation
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppPublisher() {
        return this._appPublisher;
    }
    /**
     * Gets the batteryUsagePercentage property value. The percent of total battery power used by this application when the device was not plugged into AC power, over 14 days. Unit in percentage. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getBatteryUsagePercentage() {
        return this._batteryUsagePercentage;
    }
    /**
     * Gets the deviceId property value. The unique identifier of the device, Intune DeviceID or SCCM device id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("appName", (n) -> { this.setAppName(n.getStringValue()); });
        deserializerMap.put("appPublisher", (n) -> { this.setAppPublisher(n.getStringValue()); });
        deserializerMap.put("batteryUsagePercentage", (n) -> { this.setBatteryUsagePercentage(n.getDoubleValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("isForegroundApp", (n) -> { this.setIsForegroundApp(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isForegroundApp property value. true if the user had active interaction with the app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsForegroundApp() {
        return this._isForegroundApp;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appName", this.getAppName());
        writer.writeStringValue("appPublisher", this.getAppPublisher());
        writer.writeDoubleValue("batteryUsagePercentage", this.getBatteryUsagePercentage());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeBooleanValue("isForegroundApp", this.getIsForegroundApp());
    }
    /**
     * Sets the appDisplayName property value. User friendly display name for the app. Eg: Outlook
     * @param value Value to set for the appDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppDisplayName(@javax.annotation.Nullable final String value) {
        this._appDisplayName = value;
    }
    /**
     * Sets the appName property value. App name. Eg: oltk.exe
     * @param value Value to set for the appName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppName(@javax.annotation.Nullable final String value) {
        this._appName = value;
    }
    /**
     * Sets the appPublisher property value. App publisher. Eg: Microsoft Corporation
     * @param value Value to set for the appPublisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppPublisher(@javax.annotation.Nullable final String value) {
        this._appPublisher = value;
    }
    /**
     * Sets the batteryUsagePercentage property value. The percent of total battery power used by this application when the device was not plugged into AC power, over 14 days. Unit in percentage. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the batteryUsagePercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBatteryUsagePercentage(@javax.annotation.Nullable final Double value) {
        this._batteryUsagePercentage = value;
    }
    /**
     * Sets the deviceId property value. The unique identifier of the device, Intune DeviceID or SCCM device id.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the isForegroundApp property value. true if the user had active interaction with the app.
     * @param value Value to set for the isForegroundApp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsForegroundApp(@javax.annotation.Nullable final Boolean value) {
        this._isForegroundApp = value;
    }
}
