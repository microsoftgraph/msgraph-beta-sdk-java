package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows device health monitoring configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsHealthMonitoringConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new WindowsHealthMonitoringConfiguration and sets the default values.
     */
    public WindowsHealthMonitoringConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsHealthMonitoringConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsHealthMonitoringConfiguration
     */
    @jakarta.annotation.Nonnull
    public static WindowsHealthMonitoringConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsHealthMonitoringConfiguration();
    }
    /**
     * Gets the allowDeviceHealthMonitoring property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getAllowDeviceHealthMonitoring() {
        return this.backingStore.get("allowDeviceHealthMonitoring");
    }
    /**
     * Gets the configDeviceHealthMonitoringCustomScope property value. Specifies custom set of events collected from the device where health monitoring is enabled
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConfigDeviceHealthMonitoringCustomScope() {
        return this.backingStore.get("configDeviceHealthMonitoringCustomScope");
    }
    /**
     * Gets the configDeviceHealthMonitoringScope property value. Device health monitoring scope
     * @return a EnumSet<WindowsHealthMonitoringScope>
     */
    @jakarta.annotation.Nullable
    public EnumSet<WindowsHealthMonitoringScope> getConfigDeviceHealthMonitoringScope() {
        return this.backingStore.get("configDeviceHealthMonitoringScope");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowDeviceHealthMonitoring", (n) -> { this.setAllowDeviceHealthMonitoring(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("configDeviceHealthMonitoringCustomScope", (n) -> { this.setConfigDeviceHealthMonitoringCustomScope(n.getStringValue()); });
        deserializerMap.put("configDeviceHealthMonitoringScope", (n) -> { this.setConfigDeviceHealthMonitoringScope(n.getEnumSetValue(WindowsHealthMonitoringScope.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("allowDeviceHealthMonitoring", this.getAllowDeviceHealthMonitoring());
        writer.writeStringValue("configDeviceHealthMonitoringCustomScope", this.getConfigDeviceHealthMonitoringCustomScope());
        writer.writeEnumSetValue("configDeviceHealthMonitoringScope", this.getConfigDeviceHealthMonitoringScope());
    }
    /**
     * Sets the allowDeviceHealthMonitoring property value. Possible values of a property
     * @param value Value to set for the allowDeviceHealthMonitoring property.
     */
    public void setAllowDeviceHealthMonitoring(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("allowDeviceHealthMonitoring", value);
    }
    /**
     * Sets the configDeviceHealthMonitoringCustomScope property value. Specifies custom set of events collected from the device where health monitoring is enabled
     * @param value Value to set for the configDeviceHealthMonitoringCustomScope property.
     */
    public void setConfigDeviceHealthMonitoringCustomScope(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("configDeviceHealthMonitoringCustomScope", value);
    }
    /**
     * Sets the configDeviceHealthMonitoringScope property value. Device health monitoring scope
     * @param value Value to set for the configDeviceHealthMonitoringScope property.
     */
    public void setConfigDeviceHealthMonitoringScope(@jakarta.annotation.Nullable final EnumSet<WindowsHealthMonitoringScope> value) {
        this.backingStore.set("configDeviceHealthMonitoringScope", value);
    }
}
