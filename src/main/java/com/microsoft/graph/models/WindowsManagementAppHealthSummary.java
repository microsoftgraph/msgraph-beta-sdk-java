package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsManagementAppHealthSummary extends Entity implements Parsable {
    /** Healthy device count. */
    private Integer healthyDeviceCount;
    /** Unhealthy device count. */
    private Integer unhealthyDeviceCount;
    /** Unknown device count. */
    private Integer unknownDeviceCount;
    /**
     * Instantiates a new WindowsManagementAppHealthSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsManagementAppHealthSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsManagementAppHealthSummary
     */
    @javax.annotation.Nonnull
    public static WindowsManagementAppHealthSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsManagementAppHealthSummary();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("healthyDeviceCount", (n) -> { this.setHealthyDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("unhealthyDeviceCount", (n) -> { this.setUnhealthyDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("unknownDeviceCount", (n) -> { this.setUnknownDeviceCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthyDeviceCount property value. Healthy device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getHealthyDeviceCount() {
        return this.healthyDeviceCount;
    }
    /**
     * Gets the unhealthyDeviceCount property value. Unhealthy device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnhealthyDeviceCount() {
        return this.unhealthyDeviceCount;
    }
    /**
     * Gets the unknownDeviceCount property value. Unknown device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnknownDeviceCount() {
        return this.unknownDeviceCount;
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
        writer.writeIntegerValue("healthyDeviceCount", this.getHealthyDeviceCount());
        writer.writeIntegerValue("unhealthyDeviceCount", this.getUnhealthyDeviceCount());
        writer.writeIntegerValue("unknownDeviceCount", this.getUnknownDeviceCount());
    }
    /**
     * Sets the healthyDeviceCount property value. Healthy device count.
     * @param value Value to set for the healthyDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHealthyDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.healthyDeviceCount = value;
    }
    /**
     * Sets the unhealthyDeviceCount property value. Unhealthy device count.
     * @param value Value to set for the unhealthyDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnhealthyDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.unhealthyDeviceCount = value;
    }
    /**
     * Sets the unknownDeviceCount property value. Unknown device count.
     * @param value Value to set for the unknownDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnknownDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.unknownDeviceCount = value;
    }
}
