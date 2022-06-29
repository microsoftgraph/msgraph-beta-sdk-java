package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsHealthMonitoringConfiguration extends DeviceConfiguration implements Parsable {
    /** Enables device health monitoring on the device. Possible values are: notConfigured, enabled, disabled. */
    private Enablement _allowDeviceHealthMonitoring;
    /** Specifies custom set of events collected from the device where health monitoring is enabled */
    private String _configDeviceHealthMonitoringCustomScope;
    /** Specifies set of events collected from the device where health monitoring is enabled. Possible values are: undefined, healthMonitoring, bootPerformance, windowsUpdates. */
    private WindowsHealthMonitoringScope _configDeviceHealthMonitoringScope;
    /**
     * Instantiates a new WindowsHealthMonitoringConfiguration and sets the default values.
     * @return a void
     */
    public WindowsHealthMonitoringConfiguration() {
        super();
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
     * Gets the allowDeviceHealthMonitoring property value. Enables device health monitoring on the device. Possible values are: notConfigured, enabled, disabled.
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
     * Gets the configDeviceHealthMonitoringScope property value. Specifies set of events collected from the device where health monitoring is enabled. Possible values are: undefined, healthMonitoring, bootPerformance, windowsUpdates.
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
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowDeviceHealthMonitoring", (n) -> { currentObject.setAllowDeviceHealthMonitoring(n.getEnumValue(Enablement.class)); });
            this.put("configDeviceHealthMonitoringCustomScope", (n) -> { currentObject.setConfigDeviceHealthMonitoringCustomScope(n.getStringValue()); });
            this.put("configDeviceHealthMonitoringScope", (n) -> { currentObject.setConfigDeviceHealthMonitoringScope(n.getEnumValue(WindowsHealthMonitoringScope.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("allowDeviceHealthMonitoring", this.getAllowDeviceHealthMonitoring());
        writer.writeStringValue("configDeviceHealthMonitoringCustomScope", this.getConfigDeviceHealthMonitoringCustomScope());
        writer.writeEnumValue("configDeviceHealthMonitoringScope", this.getConfigDeviceHealthMonitoringScope());
    }
    /**
     * Sets the allowDeviceHealthMonitoring property value. Enables device health monitoring on the device. Possible values are: notConfigured, enabled, disabled.
     * @param value Value to set for the allowDeviceHealthMonitoring property.
     * @return a void
     */
    public void setAllowDeviceHealthMonitoring(@javax.annotation.Nullable final Enablement value) {
        this._allowDeviceHealthMonitoring = value;
    }
    /**
     * Sets the configDeviceHealthMonitoringCustomScope property value. Specifies custom set of events collected from the device where health monitoring is enabled
     * @param value Value to set for the configDeviceHealthMonitoringCustomScope property.
     * @return a void
     */
    public void setConfigDeviceHealthMonitoringCustomScope(@javax.annotation.Nullable final String value) {
        this._configDeviceHealthMonitoringCustomScope = value;
    }
    /**
     * Sets the configDeviceHealthMonitoringScope property value. Specifies set of events collected from the device where health monitoring is enabled. Possible values are: undefined, healthMonitoring, bootPerformance, windowsUpdates.
     * @param value Value to set for the configDeviceHealthMonitoringScope property.
     * @return a void
     */
    public void setConfigDeviceHealthMonitoringScope(@javax.annotation.Nullable final WindowsHealthMonitoringScope value) {
        this._configDeviceHealthMonitoringScope = value;
    }
}
