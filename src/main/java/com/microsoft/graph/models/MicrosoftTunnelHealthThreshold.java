package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity that represents the health thresholds of a health metric
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftTunnelHealthThreshold extends Entity implements Parsable {
    /**
     * The threshold for being healthy based on default health status metrics: CPU usage healthy < 50%, Memory usage healthy < 50%, Disk space healthy > 5GB, Latency healthy < 10ms, health metrics can be customized. Read-only.
     */
    private Long defaultHealthyThreshold;
    /**
     * The threshold for being unhealthy based on default health status metrics: CPU usage unhealthy > 75%, Memory usage unhealthy > 75%, Disk space < 3GB, Latency unhealthy > 20ms, health metrics can be customized. Read-only.
     */
    private Long defaultUnhealthyThreshold;
    /**
     * The threshold for being healthy based on default health status metrics: CPU usage healthy < 50%, Memory usage healthy < 50%, Disk space healthy > 5GB, Latency healthy < 10ms, health metrics can be customized.
     */
    private Long healthyThreshold;
    /**
     * The threshold for being unhealthy based on default health status metrics: CPU usage unhealthy > 75%, Memory usage unhealthy > 75%, Disk space < 3GB, Latency Unhealthy > 20ms, health metrics can be customized.
     */
    private Long unhealthyThreshold;
    /**
     * Instantiates a new microsoftTunnelHealthThreshold and sets the default values.
     */
    public MicrosoftTunnelHealthThreshold() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a microsoftTunnelHealthThreshold
     */
    @jakarta.annotation.Nonnull
    public static MicrosoftTunnelHealthThreshold createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftTunnelHealthThreshold();
    }
    /**
     * Gets the defaultHealthyThreshold property value. The threshold for being healthy based on default health status metrics: CPU usage healthy < 50%, Memory usage healthy < 50%, Disk space healthy > 5GB, Latency healthy < 10ms, health metrics can be customized. Read-only.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getDefaultHealthyThreshold() {
        return this.defaultHealthyThreshold;
    }
    /**
     * Gets the defaultUnhealthyThreshold property value. The threshold for being unhealthy based on default health status metrics: CPU usage unhealthy > 75%, Memory usage unhealthy > 75%, Disk space < 3GB, Latency unhealthy > 20ms, health metrics can be customized. Read-only.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getDefaultUnhealthyThreshold() {
        return this.defaultUnhealthyThreshold;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultHealthyThreshold", (n) -> { this.setDefaultHealthyThreshold(n.getLongValue()); });
        deserializerMap.put("defaultUnhealthyThreshold", (n) -> { this.setDefaultUnhealthyThreshold(n.getLongValue()); });
        deserializerMap.put("healthyThreshold", (n) -> { this.setHealthyThreshold(n.getLongValue()); });
        deserializerMap.put("unhealthyThreshold", (n) -> { this.setUnhealthyThreshold(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthyThreshold property value. The threshold for being healthy based on default health status metrics: CPU usage healthy < 50%, Memory usage healthy < 50%, Disk space healthy > 5GB, Latency healthy < 10ms, health metrics can be customized.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getHealthyThreshold() {
        return this.healthyThreshold;
    }
    /**
     * Gets the unhealthyThreshold property value. The threshold for being unhealthy based on default health status metrics: CPU usage unhealthy > 75%, Memory usage unhealthy > 75%, Disk space < 3GB, Latency Unhealthy > 20ms, health metrics can be customized.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setDefaultHealthyThreshold(@jakarta.annotation.Nullable final Long value) {
        this.defaultHealthyThreshold = value;
    }
    /**
     * Sets the defaultUnhealthyThreshold property value. The threshold for being unhealthy based on default health status metrics: CPU usage unhealthy > 75%, Memory usage unhealthy > 75%, Disk space < 3GB, Latency unhealthy > 20ms, health metrics can be customized. Read-only.
     * @param value Value to set for the defaultUnhealthyThreshold property.
     */
    public void setDefaultUnhealthyThreshold(@jakarta.annotation.Nullable final Long value) {
        this.defaultUnhealthyThreshold = value;
    }
    /**
     * Sets the healthyThreshold property value. The threshold for being healthy based on default health status metrics: CPU usage healthy < 50%, Memory usage healthy < 50%, Disk space healthy > 5GB, Latency healthy < 10ms, health metrics can be customized.
     * @param value Value to set for the healthyThreshold property.
     */
    public void setHealthyThreshold(@jakarta.annotation.Nullable final Long value) {
        this.healthyThreshold = value;
    }
    /**
     * Sets the unhealthyThreshold property value. The threshold for being unhealthy based on default health status metrics: CPU usage unhealthy > 75%, Memory usage unhealthy > 75%, Disk space < 3GB, Latency Unhealthy > 20ms, health metrics can be customized.
     * @param value Value to set for the unhealthyThreshold property.
     */
    public void setUnhealthyThreshold(@jakarta.annotation.Nullable final Long value) {
        this.unhealthyThreshold = value;
    }
}
