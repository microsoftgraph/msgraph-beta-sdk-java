package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivateAccessSensor extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PrivateAccessSensor} and sets the default values.
     */
    public PrivateAccessSensor() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PrivateAccessSensor}
     */
    @jakarta.annotation.Nonnull
    public static PrivateAccessSensor createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivateAccessSensor();
    }
    /**
     * Gets the externalIp property value. The externalIp property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalIp() {
        return this.backingStore.get("externalIp");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("externalIp", (n) -> { this.setExternalIp(n.getStringValue()); });
        deserializerMap.put("isAuditMode", (n) -> { this.setIsAuditMode(n.getBooleanValue()); });
        deserializerMap.put("isBreakglassEnabled", (n) -> { this.setIsBreakglassEnabled(n.getBooleanValue()); });
        deserializerMap.put("machineName", (n) -> { this.setMachineName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SensorStatus::forValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAuditMode property value. The isAuditMode property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAuditMode() {
        return this.backingStore.get("isAuditMode");
    }
    /**
     * Gets the isBreakglassEnabled property value. The isBreakglassEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBreakglassEnabled() {
        return this.backingStore.get("isBreakglassEnabled");
    }
    /**
     * Gets the machineName property value. The machineName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMachineName() {
        return this.backingStore.get("machineName");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link SensorStatus}
     */
    @jakarta.annotation.Nullable
    public SensorStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the version property value. The version property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("externalIp", this.getExternalIp());
        writer.writeBooleanValue("isAuditMode", this.getIsAuditMode());
        writer.writeBooleanValue("isBreakglassEnabled", this.getIsBreakglassEnabled());
        writer.writeStringValue("machineName", this.getMachineName());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the externalIp property value. The externalIp property
     * @param value Value to set for the externalIp property.
     */
    public void setExternalIp(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalIp", value);
    }
    /**
     * Sets the isAuditMode property value. The isAuditMode property
     * @param value Value to set for the isAuditMode property.
     */
    public void setIsAuditMode(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAuditMode", value);
    }
    /**
     * Sets the isBreakglassEnabled property value. The isBreakglassEnabled property
     * @param value Value to set for the isBreakglassEnabled property.
     */
    public void setIsBreakglassEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isBreakglassEnabled", value);
    }
    /**
     * Sets the machineName property value. The machineName property
     * @param value Value to set for the machineName property.
     */
    public void setMachineName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("machineName", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SensorStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
