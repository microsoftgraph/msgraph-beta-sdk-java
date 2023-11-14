package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for the run summary of a device management script.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementScriptRunSummary extends Entity implements Parsable {
    /**
     * Error device count.
     */
    private Integer errorDeviceCount;
    /**
     * Error user count.
     */
    private Integer errorUserCount;
    /**
     * Success device count.
     */
    private Integer successDeviceCount;
    /**
     * Success user count.
     */
    private Integer successUserCount;
    /**
     * Instantiates a new DeviceManagementScriptRunSummary and sets the default values.
     */
    public DeviceManagementScriptRunSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementScriptRunSummary
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementScriptRunSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementScriptRunSummary();
    }
    /**
     * Gets the errorDeviceCount property value. Error device count.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorDeviceCount() {
        return this.errorDeviceCount;
    }
    /**
     * Gets the errorUserCount property value. Error user count.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorUserCount() {
        return this.errorUserCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("errorDeviceCount", (n) -> { this.setErrorDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("errorUserCount", (n) -> { this.setErrorUserCount(n.getIntegerValue()); });
        deserializerMap.put("successDeviceCount", (n) -> { this.setSuccessDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("successUserCount", (n) -> { this.setSuccessUserCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the successDeviceCount property value. Success device count.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessDeviceCount() {
        return this.successDeviceCount;
    }
    /**
     * Gets the successUserCount property value. Success user count.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessUserCount() {
        return this.successUserCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("errorDeviceCount", this.getErrorDeviceCount());
        writer.writeIntegerValue("errorUserCount", this.getErrorUserCount());
        writer.writeIntegerValue("successDeviceCount", this.getSuccessDeviceCount());
        writer.writeIntegerValue("successUserCount", this.getSuccessUserCount());
    }
    /**
     * Sets the errorDeviceCount property value. Error device count.
     * @param value Value to set for the errorDeviceCount property.
     */
    public void setErrorDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.errorDeviceCount = value;
    }
    /**
     * Sets the errorUserCount property value. Error user count.
     * @param value Value to set for the errorUserCount property.
     */
    public void setErrorUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.errorUserCount = value;
    }
    /**
     * Sets the successDeviceCount property value. Success device count.
     * @param value Value to set for the successDeviceCount property.
     */
    public void setSuccessDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.successDeviceCount = value;
    }
    /**
     * Sets the successUserCount property value. Success user count.
     * @param value Value to set for the successUserCount property.
     */
    public void setSuccessUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.successUserCount = value;
    }
}
