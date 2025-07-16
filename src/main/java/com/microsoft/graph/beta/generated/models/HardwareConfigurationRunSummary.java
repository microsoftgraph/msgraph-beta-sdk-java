package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for the run summary of a hardware configuration script.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HardwareConfigurationRunSummary extends Entity implements Parsable {
    /**
     * Instantiates a new {@link HardwareConfigurationRunSummary} and sets the default values.
     */
    public HardwareConfigurationRunSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HardwareConfigurationRunSummary}
     */
    @jakarta.annotation.Nonnull
    public static HardwareConfigurationRunSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HardwareConfigurationRunSummary();
    }
    /**
     * Gets the errorDeviceCount property value. Number of devices for which hardware configuration state is error
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getErrorDeviceCount() {
        return this.backingStore.get("errorDeviceCount");
    }
    /**
     * Gets the errorUserCount property value. Number of users for which hardware configuration state is error
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getErrorUserCount() {
        return this.backingStore.get("errorUserCount");
    }
    /**
     * Gets the failedDeviceCount property value. Number of devices for which hardware configuration found an issue
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedDeviceCount() {
        return this.backingStore.get("failedDeviceCount");
    }
    /**
     * Gets the failedUserCount property value. Number of users for which hardware configuration found an issue
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedUserCount() {
        return this.backingStore.get("failedUserCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("errorDeviceCount", (n) -> { this.setErrorDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("errorUserCount", (n) -> { this.setErrorUserCount(n.getIntegerValue()); });
        deserializerMap.put("failedDeviceCount", (n) -> { this.setFailedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("failedUserCount", (n) -> { this.setFailedUserCount(n.getIntegerValue()); });
        deserializerMap.put("lastRunDateTime", (n) -> { this.setLastRunDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("notApplicableDeviceCount", (n) -> { this.setNotApplicableDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("notApplicableUserCount", (n) -> { this.setNotApplicableUserCount(n.getIntegerValue()); });
        deserializerMap.put("pendingDeviceCount", (n) -> { this.setPendingDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("pendingUserCount", (n) -> { this.setPendingUserCount(n.getIntegerValue()); });
        deserializerMap.put("successfulDeviceCount", (n) -> { this.setSuccessfulDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("successfulUserCount", (n) -> { this.setSuccessfulUserCount(n.getIntegerValue()); });
        deserializerMap.put("unknownDeviceCount", (n) -> { this.setUnknownDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("unknownUserCount", (n) -> { this.setUnknownUserCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastRunDateTime property value. Last run time for the configuration across all devices
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRunDateTime() {
        return this.backingStore.get("lastRunDateTime");
    }
    /**
     * Gets the notApplicableDeviceCount property value. Number of devices for which hardware configuration state is not applicable
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicableDeviceCount() {
        return this.backingStore.get("notApplicableDeviceCount");
    }
    /**
     * Gets the notApplicableUserCount property value. Number of users for which hardware configuration state is not applicable
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicableUserCount() {
        return this.backingStore.get("notApplicableUserCount");
    }
    /**
     * Gets the pendingDeviceCount property value. Number of devices for which hardware configuration is in pending state
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPendingDeviceCount() {
        return this.backingStore.get("pendingDeviceCount");
    }
    /**
     * Gets the pendingUserCount property value. Number of users for which hardware configuration is in pending state
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPendingUserCount() {
        return this.backingStore.get("pendingUserCount");
    }
    /**
     * Gets the successfulDeviceCount property value. Number of devices for which hardware configured without any issue
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulDeviceCount() {
        return this.backingStore.get("successfulDeviceCount");
    }
    /**
     * Gets the successfulUserCount property value. Number of users for which hardware configured without any issue
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulUserCount() {
        return this.backingStore.get("successfulUserCount");
    }
    /**
     * Gets the unknownDeviceCount property value. Number of devices for which hardware configuration state is unknown
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUnknownDeviceCount() {
        return this.backingStore.get("unknownDeviceCount");
    }
    /**
     * Gets the unknownUserCount property value. Number of users for which hardware configuration state is unknown
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUnknownUserCount() {
        return this.backingStore.get("unknownUserCount");
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
        writer.writeIntegerValue("failedDeviceCount", this.getFailedDeviceCount());
        writer.writeIntegerValue("failedUserCount", this.getFailedUserCount());
        writer.writeOffsetDateTimeValue("lastRunDateTime", this.getLastRunDateTime());
        writer.writeIntegerValue("notApplicableDeviceCount", this.getNotApplicableDeviceCount());
        writer.writeIntegerValue("notApplicableUserCount", this.getNotApplicableUserCount());
        writer.writeIntegerValue("pendingDeviceCount", this.getPendingDeviceCount());
        writer.writeIntegerValue("pendingUserCount", this.getPendingUserCount());
        writer.writeIntegerValue("successfulDeviceCount", this.getSuccessfulDeviceCount());
        writer.writeIntegerValue("successfulUserCount", this.getSuccessfulUserCount());
        writer.writeIntegerValue("unknownDeviceCount", this.getUnknownDeviceCount());
        writer.writeIntegerValue("unknownUserCount", this.getUnknownUserCount());
    }
    /**
     * Sets the errorDeviceCount property value. Number of devices for which hardware configuration state is error
     * @param value Value to set for the errorDeviceCount property.
     */
    public void setErrorDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("errorDeviceCount", value);
    }
    /**
     * Sets the errorUserCount property value. Number of users for which hardware configuration state is error
     * @param value Value to set for the errorUserCount property.
     */
    public void setErrorUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("errorUserCount", value);
    }
    /**
     * Sets the failedDeviceCount property value. Number of devices for which hardware configuration found an issue
     * @param value Value to set for the failedDeviceCount property.
     */
    public void setFailedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedDeviceCount", value);
    }
    /**
     * Sets the failedUserCount property value. Number of users for which hardware configuration found an issue
     * @param value Value to set for the failedUserCount property.
     */
    public void setFailedUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedUserCount", value);
    }
    /**
     * Sets the lastRunDateTime property value. Last run time for the configuration across all devices
     * @param value Value to set for the lastRunDateTime property.
     */
    public void setLastRunDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastRunDateTime", value);
    }
    /**
     * Sets the notApplicableDeviceCount property value. Number of devices for which hardware configuration state is not applicable
     * @param value Value to set for the notApplicableDeviceCount property.
     */
    public void setNotApplicableDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("notApplicableDeviceCount", value);
    }
    /**
     * Sets the notApplicableUserCount property value. Number of users for which hardware configuration state is not applicable
     * @param value Value to set for the notApplicableUserCount property.
     */
    public void setNotApplicableUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("notApplicableUserCount", value);
    }
    /**
     * Sets the pendingDeviceCount property value. Number of devices for which hardware configuration is in pending state
     * @param value Value to set for the pendingDeviceCount property.
     */
    public void setPendingDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pendingDeviceCount", value);
    }
    /**
     * Sets the pendingUserCount property value. Number of users for which hardware configuration is in pending state
     * @param value Value to set for the pendingUserCount property.
     */
    public void setPendingUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pendingUserCount", value);
    }
    /**
     * Sets the successfulDeviceCount property value. Number of devices for which hardware configured without any issue
     * @param value Value to set for the successfulDeviceCount property.
     */
    public void setSuccessfulDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("successfulDeviceCount", value);
    }
    /**
     * Sets the successfulUserCount property value. Number of users for which hardware configured without any issue
     * @param value Value to set for the successfulUserCount property.
     */
    public void setSuccessfulUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("successfulUserCount", value);
    }
    /**
     * Sets the unknownDeviceCount property value. Number of devices for which hardware configuration state is unknown
     * @param value Value to set for the unknownDeviceCount property.
     */
    public void setUnknownDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("unknownDeviceCount", value);
    }
    /**
     * Sets the unknownUserCount property value. Number of users for which hardware configuration state is unknown
     * @param value Value to set for the unknownUserCount property.
     */
    public void setUnknownUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("unknownUserCount", value);
    }
}
