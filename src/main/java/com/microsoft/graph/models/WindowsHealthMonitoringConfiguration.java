package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsHealthMonitoringConfiguration extends DeviceConfiguration implements Parsable {
    /** Possible values of a property */
    private Enablement _allowDeviceHealthMonitoring;
    /** Specifies custom set of events collected from the device where health monitoring is enabled */
    private String _configDeviceHealthMonitoringCustomScope;
    /** Device health monitoring scope */
    private WindowsHealthMonitoringScope _configDeviceHealthMonitoringScope;
    /**
     * Instantiates a new WindowsHealthMonitoringConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsHealthMonitoringConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsHealthMonitoringConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsHealthMonitoringConfiguration
     */
    @javax.annotation.Nonnull
    public static WindowsHealthMonitoringConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsHealthMonitoringConfiguration();
    }
    /**
     * Gets the allowDeviceHealthMonitoring property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getAllowDeviceHealthMonitoring() {
        return this._allowDeviceHealthMonitoring;
    }
    /**
     * Gets the configDeviceHealthMonitoringCustomScope property value. Specifies custom set of events collected from the device where health monitoring is enabled
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConfigDeviceHealthMonitoringCustomScope() {
        return this._configDeviceHealthMonitoringCustomScope;
    }
    /**
     * Gets the configDeviceHealthMonitoringScope property value. Device health monitoring scope
     * @return a windowsHealthMonitoringScope
     */
    @javax.annotation.Nullable
    public WindowsHealthMonitoringScope getConfigDeviceHealthMonitoringScope() {
        return this._configDeviceHealthMonitoringScope;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsHealthMonitoringConfiguration currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowDeviceHealthMonitoring", (n) -> { currentObject.setAllowDeviceHealthMonitoring(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("configDeviceHealthMonitoringCustomScope", (n) -> { currentObject.setConfigDeviceHealthMonitoringCustomScope(n.getStringValue()); });
        deserializerMap.put("configDeviceHealthMonitoringScope", (n) -> { currentObject.setConfigDeviceHealthMonitoringScope(n.getEnumValue(WindowsHealthMonitoringScope.class)); });
        return deserializerMap;
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
        writer.writeEnumValue("allowDeviceHealthMonitoring", this.getAllowDeviceHealthMonitoring());
        writer.writeStringValue("configDeviceHealthMonitoringCustomScope", this.getConfigDeviceHealthMonitoringCustomScope());
        writer.writeEnumValue("configDeviceHealthMonitoringScope", this.getConfigDeviceHealthMonitoringScope());
    }
    /**
     * Sets the allowDeviceHealthMonitoring property value. Possible values of a property
     * @param value Value to set for the allowDeviceHealthMonitoring property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowDeviceHealthMonitoring(@javax.annotation.Nullable final Enablement value) {
        this._allowDeviceHealthMonitoring = value;
    }
    /**
     * Sets the configDeviceHealthMonitoringCustomScope property value. Specifies custom set of events collected from the device where health monitoring is enabled
     * @param value Value to set for the configDeviceHealthMonitoringCustomScope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigDeviceHealthMonitoringCustomScope(@javax.annotation.Nullable final String value) {
        this._configDeviceHealthMonitoringCustomScope = value;
    }
    /**
     * Sets the configDeviceHealthMonitoringScope property value. Device health monitoring scope
     * @param value Value to set for the configDeviceHealthMonitoringScope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigDeviceHealthMonitoringScope(@javax.annotation.Nullable final WindowsHealthMonitoringScope value) {
        this._configDeviceHealthMonitoringScope = value;
    }
}
