package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Entity that represents the health thresholds of a health metric */
public class MicrosoftTunnelHealthThreshold extends Entity implements Parsable {
    /** The threshold for being healthy based on default health status metrics: CPU usage healthy < 50%, Memory usage healthy < 50%, Disk space healthy > 5GB, Latency healthy < 10ms, health metrics can be customized. Read-only. */
    private Long _defaultHealthyThreshold;
    /** The threshold for being unhealthy based on default health status metrics: CPU usage unhealthy > 75%, Memory usage unhealthy > 75%, Disk space < 3GB, Latency unhealthy > 20ms, health metrics can be customized. Read-only. */
    private Long _defaultUnhealthyThreshold;
    /** The threshold for being healthy based on default health status metrics: CPU usage healthy < 50%, Memory usage healthy < 50%, Disk space healthy > 5GB, Latency healthy < 10ms, health metrics can be customized. */
    private Long _healthyThreshold;
    /** The threshold for being unhealthy based on default health status metrics: CPU usage unhealthy > 75%, Memory usage unhealthy > 75%, Disk space < 3GB, Latency Unhealthy > 20ms, health metrics can be customized. */
    private Long _unhealthyThreshold;
    /**
     * Instantiates a new microsoftTunnelHealthThreshold and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MicrosoftTunnelHealthThreshold() {
        super();
        this.setOdataType("#microsoft.graph.microsoftTunnelHealthThreshold");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a microsoftTunnelHealthThreshold
     */
    @javax.annotation.Nonnull
    public static MicrosoftTunnelHealthThreshold createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftTunnelHealthThreshold();
    }
    /**
     * Gets the defaultHealthyThreshold property value. The threshold for being healthy based on default health status metrics: CPU usage healthy < 50%, Memory usage healthy < 50%, Disk space healthy > 5GB, Latency healthy < 10ms, health metrics can be customized. Read-only.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getDefaultHealthyThreshold() {
        return this._defaultHealthyThreshold;
    }
    /**
     * Gets the defaultUnhealthyThreshold property value. The threshold for being unhealthy based on default health status metrics: CPU usage unhealthy > 75%, Memory usage unhealthy > 75%, Disk space < 3GB, Latency unhealthy > 20ms, health metrics can be customized. Read-only.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getDefaultUnhealthyThreshold() {
        return this._defaultUnhealthyThreshold;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MicrosoftTunnelHealthThreshold currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("defaultHealthyThreshold", (n) -> { currentObject.setDefaultHealthyThreshold(n.getLongValue()); });
            this.put("defaultUnhealthyThreshold", (n) -> { currentObject.setDefaultUnhealthyThreshold(n.getLongValue()); });
            this.put("healthyThreshold", (n) -> { currentObject.setHealthyThreshold(n.getLongValue()); });
            this.put("unhealthyThreshold", (n) -> { currentObject.setUnhealthyThreshold(n.getLongValue()); });
        }};
    }
    /**
     * Gets the healthyThreshold property value. The threshold for being healthy based on default health status metrics: CPU usage healthy < 50%, Memory usage healthy < 50%, Disk space healthy > 5GB, Latency healthy < 10ms, health metrics can be customized.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getHealthyThreshold() {
        return this._healthyThreshold;
    }
    /**
     * Gets the unhealthyThreshold property value. The threshold for being unhealthy based on default health status metrics: CPU usage unhealthy > 75%, Memory usage unhealthy > 75%, Disk space < 3GB, Latency Unhealthy > 20ms, health metrics can be customized.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getUnhealthyThreshold() {
        return this._unhealthyThreshold;
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
        writer.writeLongValue("defaultHealthyThreshold", this.getDefaultHealthyThreshold());
        writer.writeLongValue("defaultUnhealthyThreshold", this.getDefaultUnhealthyThreshold());
        writer.writeLongValue("healthyThreshold", this.getHealthyThreshold());
        writer.writeLongValue("unhealthyThreshold", this.getUnhealthyThreshold());
    }
    /**
     * Sets the defaultHealthyThreshold property value. The threshold for being healthy based on default health status metrics: CPU usage healthy < 50%, Memory usage healthy < 50%, Disk space healthy > 5GB, Latency healthy < 10ms, health metrics can be customized. Read-only.
     * @param value Value to set for the defaultHealthyThreshold property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultHealthyThreshold(@javax.annotation.Nullable final Long value) {
        this._defaultHealthyThreshold = value;
    }
    /**
     * Sets the defaultUnhealthyThreshold property value. The threshold for being unhealthy based on default health status metrics: CPU usage unhealthy > 75%, Memory usage unhealthy > 75%, Disk space < 3GB, Latency unhealthy > 20ms, health metrics can be customized. Read-only.
     * @param value Value to set for the defaultUnhealthyThreshold property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultUnhealthyThreshold(@javax.annotation.Nullable final Long value) {
        this._defaultUnhealthyThreshold = value;
    }
    /**
     * Sets the healthyThreshold property value. The threshold for being healthy based on default health status metrics: CPU usage healthy < 50%, Memory usage healthy < 50%, Disk space healthy > 5GB, Latency healthy < 10ms, health metrics can be customized.
     * @param value Value to set for the healthyThreshold property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHealthyThreshold(@javax.annotation.Nullable final Long value) {
        this._healthyThreshold = value;
    }
    /**
     * Sets the unhealthyThreshold property value. The threshold for being unhealthy based on default health status metrics: CPU usage unhealthy > 75%, Memory usage unhealthy > 75%, Disk space < 3GB, Latency Unhealthy > 20ms, health metrics can be customized.
     * @param value Value to set for the unhealthyThreshold property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnhealthyThreshold(@javax.annotation.Nullable final Long value) {
        this._unhealthyThreshold = value;
    }
}
