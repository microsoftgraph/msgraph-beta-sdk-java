package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DriverUpdateDeviceStatus extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DriverUpdateDeviceStatus} and sets the default values.
     */
    public DriverUpdateDeviceStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DriverUpdateDeviceStatus}
     */
    @jakarta.annotation.Nonnull
    public static DriverUpdateDeviceStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DriverUpdateDeviceStatus();
    }
    /**
     * Gets the aadDeviceId property value. The Microsoft Entra identifier of the device. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAadDeviceId() {
        return this.backingStore.get("aadDeviceId");
    }
    /**
     * Gets the clientState property value. The clientState property
     * @return a {@link DeviceClientState}
     */
    @jakarta.annotation.Nullable
    public DeviceClientState getClientState() {
        return this.backingStore.get("clientState");
    }
    /**
     * Gets the clientSubstate property value. The clientSubstate property
     * @return a {@link DeviceClientSubstate}
     */
    @jakarta.annotation.Nullable
    public DeviceClientSubstate getClientSubstate() {
        return this.backingStore.get("clientSubstate");
    }
    /**
     * Gets the deviceName property value. The device name. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("aadDeviceId", (n) -> { this.setAadDeviceId(n.getStringValue()); });
        deserializerMap.put("clientState", (n) -> { this.setClientState(n.getEnumValue(DeviceClientState::forValue)); });
        deserializerMap.put("clientSubstate", (n) -> { this.setClientSubstate(n.getEnumValue(DeviceClientSubstate::forValue)); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("lastEventDateTime", (n) -> { this.setLastEventDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getStringValue()); });
        deserializerMap.put("policyName", (n) -> { this.setPolicyName(n.getStringValue()); });
        deserializerMap.put("ringId", (n) -> { this.setRingId(n.getStringValue()); });
        deserializerMap.put("ringName", (n) -> { this.setRingName(n.getStringValue()); });
        deserializerMap.put("serviceState", (n) -> { this.setServiceState(n.getEnumValue(DeviceServiceState::forValue)); });
        deserializerMap.put("serviceSubstate", (n) -> { this.setServiceSubstate(n.getEnumValue(DeviceServiceSubstate::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastEventDateTime property value. The date and time of the latest status event. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastEventDateTime() {
        return this.backingStore.get("lastEventDateTime");
    }
    /**
     * Gets the policyId property value. The identifier of the driver update policy. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyId() {
        return this.backingStore.get("policyId");
    }
    /**
     * Gets the policyName property value. The display name of the driver update policy. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyName() {
        return this.backingStore.get("policyName");
    }
    /**
     * Gets the ringId property value. The identifier of the Windows Autopatch ring. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRingId() {
        return this.backingStore.get("ringId");
    }
    /**
     * Gets the ringName property value. The display name of the Windows Autopatch ring. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRingName() {
        return this.backingStore.get("ringName");
    }
    /**
     * Gets the serviceState property value. The serviceState property
     * @return a {@link DeviceServiceState}
     */
    @jakarta.annotation.Nullable
    public DeviceServiceState getServiceState() {
        return this.backingStore.get("serviceState");
    }
    /**
     * Gets the serviceSubstate property value. The serviceSubstate property
     * @return a {@link DeviceServiceSubstate}
     */
    @jakarta.annotation.Nullable
    public DeviceServiceSubstate getServiceSubstate() {
        return this.backingStore.get("serviceSubstate");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("clientState", this.getClientState());
        writer.writeEnumValue("clientSubstate", this.getClientSubstate());
        writer.writeEnumValue("serviceState", this.getServiceState());
        writer.writeEnumValue("serviceSubstate", this.getServiceSubstate());
    }
    /**
     * Sets the aadDeviceId property value. The Microsoft Entra identifier of the device. Read-only.
     * @param value Value to set for the aadDeviceId property.
     */
    public void setAadDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("aadDeviceId", value);
    }
    /**
     * Sets the clientState property value. The clientState property
     * @param value Value to set for the clientState property.
     */
    public void setClientState(@jakarta.annotation.Nullable final DeviceClientState value) {
        this.backingStore.set("clientState", value);
    }
    /**
     * Sets the clientSubstate property value. The clientSubstate property
     * @param value Value to set for the clientSubstate property.
     */
    public void setClientSubstate(@jakarta.annotation.Nullable final DeviceClientSubstate value) {
        this.backingStore.set("clientSubstate", value);
    }
    /**
     * Sets the deviceName property value. The device name. Read-only.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the lastEventDateTime property value. The date and time of the latest status event. Read-only.
     * @param value Value to set for the lastEventDateTime property.
     */
    public void setLastEventDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastEventDateTime", value);
    }
    /**
     * Sets the policyId property value. The identifier of the driver update policy. Read-only.
     * @param value Value to set for the policyId property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyId", value);
    }
    /**
     * Sets the policyName property value. The display name of the driver update policy. Read-only.
     * @param value Value to set for the policyName property.
     */
    public void setPolicyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyName", value);
    }
    /**
     * Sets the ringId property value. The identifier of the Windows Autopatch ring. Read-only.
     * @param value Value to set for the ringId property.
     */
    public void setRingId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ringId", value);
    }
    /**
     * Sets the ringName property value. The display name of the Windows Autopatch ring. Read-only.
     * @param value Value to set for the ringName property.
     */
    public void setRingName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ringName", value);
    }
    /**
     * Sets the serviceState property value. The serviceState property
     * @param value Value to set for the serviceState property.
     */
    public void setServiceState(@jakarta.annotation.Nullable final DeviceServiceState value) {
        this.backingStore.set("serviceState", value);
    }
    /**
     * Sets the serviceSubstate property value. The serviceSubstate property
     * @param value Value to set for the serviceSubstate property.
     */
    public void setServiceSubstate(@jakarta.annotation.Nullable final DeviceServiceSubstate value) {
        this.backingStore.set("serviceSubstate", value);
    }
}
