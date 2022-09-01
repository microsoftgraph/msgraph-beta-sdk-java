package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsManagementAppHealthSummary extends Entity implements Parsable {
    /** Healthy device count. */
    private Integer _healthyDeviceCount;
    /** Unhealthy device count. */
    private Integer _unhealthyDeviceCount;
    /** Unknown device count. */
    private Integer _unknownDeviceCount;
    /**
     * Instantiates a new WindowsManagementAppHealthSummary and sets the default values.
     * @return a void
     */
    public WindowsManagementAppHealthSummary() {
        super();
        this.setOdataType("#microsoft.graph.windowsManagementAppHealthSummary");
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsManagementAppHealthSummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("healthyDeviceCount", (n) -> { currentObject.setHealthyDeviceCount(n.getIntegerValue()); });
            this.put("unhealthyDeviceCount", (n) -> { currentObject.setUnhealthyDeviceCount(n.getIntegerValue()); });
            this.put("unknownDeviceCount", (n) -> { currentObject.setUnknownDeviceCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the healthyDeviceCount property value. Healthy device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getHealthyDeviceCount() {
        return this._healthyDeviceCount;
    }
    /**
     * Gets the unhealthyDeviceCount property value. Unhealthy device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnhealthyDeviceCount() {
        return this._unhealthyDeviceCount;
    }
    /**
     * Gets the unknownDeviceCount property value. Unknown device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnknownDeviceCount() {
        return this._unknownDeviceCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setHealthyDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._healthyDeviceCount = value;
    }
    /**
     * Sets the unhealthyDeviceCount property value. Unhealthy device count.
     * @param value Value to set for the unhealthyDeviceCount property.
     * @return a void
     */
    public void setUnhealthyDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._unhealthyDeviceCount = value;
    }
    /**
     * Sets the unknownDeviceCount property value. Unknown device count.
     * @param value Value to set for the unknownDeviceCount property.
     * @return a void
     */
    public void setUnknownDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._unknownDeviceCount = value;
    }
}
