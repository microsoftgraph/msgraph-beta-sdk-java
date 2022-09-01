package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementScriptRunSummary extends Entity implements Parsable {
    /** Error device count. */
    private Integer _errorDeviceCount;
    /** Error user count. */
    private Integer _errorUserCount;
    /** Success device count. */
    private Integer _successDeviceCount;
    /** Success user count. */
    private Integer _successUserCount;
    /**
     * Instantiates a new deviceManagementScriptRunSummary and sets the default values.
     * @return a void
     */
    public DeviceManagementScriptRunSummary() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementScriptRunSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementScriptRunSummary
     */
    @javax.annotation.Nonnull
    public static DeviceManagementScriptRunSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementScriptRunSummary();
    }
    /**
     * Gets the errorDeviceCount property value. Error device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorDeviceCount() {
        return this._errorDeviceCount;
    }
    /**
     * Gets the errorUserCount property value. Error user count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorUserCount() {
        return this._errorUserCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementScriptRunSummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("errorDeviceCount", (n) -> { currentObject.setErrorDeviceCount(n.getIntegerValue()); });
            this.put("errorUserCount", (n) -> { currentObject.setErrorUserCount(n.getIntegerValue()); });
            this.put("successDeviceCount", (n) -> { currentObject.setSuccessDeviceCount(n.getIntegerValue()); });
            this.put("successUserCount", (n) -> { currentObject.setSuccessUserCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the successDeviceCount property value. Success device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSuccessDeviceCount() {
        return this._successDeviceCount;
    }
    /**
     * Gets the successUserCount property value. Success user count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSuccessUserCount() {
        return this._successUserCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setErrorDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._errorDeviceCount = value;
    }
    /**
     * Sets the errorUserCount property value. Error user count.
     * @param value Value to set for the errorUserCount property.
     * @return a void
     */
    public void setErrorUserCount(@javax.annotation.Nullable final Integer value) {
        this._errorUserCount = value;
    }
    /**
     * Sets the successDeviceCount property value. Success device count.
     * @param value Value to set for the successDeviceCount property.
     * @return a void
     */
    public void setSuccessDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._successDeviceCount = value;
    }
    /**
     * Sets the successUserCount property value. Success user count.
     * @param value Value to set for the successUserCount property.
     * @return a void
     */
    public void setSuccessUserCount(@javax.annotation.Nullable final Integer value) {
        this._successUserCount = value;
    }
}
