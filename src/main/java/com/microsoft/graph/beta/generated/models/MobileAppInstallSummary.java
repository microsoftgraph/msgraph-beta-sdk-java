package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for the installation summary of a mobile app. This will be deprecated in May, 2023
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppInstallSummary extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MobileAppInstallSummary} and sets the default values.
     */
    public MobileAppInstallSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MobileAppInstallSummary}
     */
    @jakarta.annotation.Nonnull
    public static MobileAppInstallSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppInstallSummary();
    }
    /**
     * Gets the failedDeviceCount property value. Number of Devices that have failed to install this app.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedDeviceCount() {
        return this.backingStore.get("failedDeviceCount");
    }
    /**
     * Gets the failedUserCount property value. Number of Users that have 1 or more device that failed to install this app.
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
        deserializerMap.put("failedDeviceCount", (n) -> { this.setFailedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("failedUserCount", (n) -> { this.setFailedUserCount(n.getIntegerValue()); });
        deserializerMap.put("installedDeviceCount", (n) -> { this.setInstalledDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("installedUserCount", (n) -> { this.setInstalledUserCount(n.getIntegerValue()); });
        deserializerMap.put("notApplicableDeviceCount", (n) -> { this.setNotApplicableDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("notApplicableUserCount", (n) -> { this.setNotApplicableUserCount(n.getIntegerValue()); });
        deserializerMap.put("notInstalledDeviceCount", (n) -> { this.setNotInstalledDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("notInstalledUserCount", (n) -> { this.setNotInstalledUserCount(n.getIntegerValue()); });
        deserializerMap.put("pendingInstallDeviceCount", (n) -> { this.setPendingInstallDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("pendingInstallUserCount", (n) -> { this.setPendingInstallUserCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installedDeviceCount property value. Number of Devices that have successfully installed this app.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getInstalledDeviceCount() {
        return this.backingStore.get("installedDeviceCount");
    }
    /**
     * Gets the installedUserCount property value. Number of Users whose devices have all succeeded to install this app.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getInstalledUserCount() {
        return this.backingStore.get("installedUserCount");
    }
    /**
     * Gets the notApplicableDeviceCount property value. Number of Devices that are not applicable for this app.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicableDeviceCount() {
        return this.backingStore.get("notApplicableDeviceCount");
    }
    /**
     * Gets the notApplicableUserCount property value. Number of Users whose devices were all not applicable for this app.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicableUserCount() {
        return this.backingStore.get("notApplicableUserCount");
    }
    /**
     * Gets the notInstalledDeviceCount property value. Number of Devices that does not have this app installed.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNotInstalledDeviceCount() {
        return this.backingStore.get("notInstalledDeviceCount");
    }
    /**
     * Gets the notInstalledUserCount property value. Number of Users that have 1 or more devices that did not install this app.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNotInstalledUserCount() {
        return this.backingStore.get("notInstalledUserCount");
    }
    /**
     * Gets the pendingInstallDeviceCount property value. Number of Devices that have been notified to install this app.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPendingInstallDeviceCount() {
        return this.backingStore.get("pendingInstallDeviceCount");
    }
    /**
     * Gets the pendingInstallUserCount property value. Number of Users that have 1 or more device that have been notified to install this app and have 0 devices with failures.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPendingInstallUserCount() {
        return this.backingStore.get("pendingInstallUserCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
    /**
     * Sets the failedDeviceCount property value. Number of Devices that have failed to install this app.
     * @param value Value to set for the failedDeviceCount property.
     */
    public void setFailedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedDeviceCount", value);
    }
    /**
     * Sets the failedUserCount property value. Number of Users that have 1 or more device that failed to install this app.
     * @param value Value to set for the failedUserCount property.
     */
    public void setFailedUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedUserCount", value);
    }
    /**
     * Sets the installedDeviceCount property value. Number of Devices that have successfully installed this app.
     * @param value Value to set for the installedDeviceCount property.
     */
    public void setInstalledDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("installedDeviceCount", value);
    }
    /**
     * Sets the installedUserCount property value. Number of Users whose devices have all succeeded to install this app.
     * @param value Value to set for the installedUserCount property.
     */
    public void setInstalledUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("installedUserCount", value);
    }
    /**
     * Sets the notApplicableDeviceCount property value. Number of Devices that are not applicable for this app.
     * @param value Value to set for the notApplicableDeviceCount property.
     */
    public void setNotApplicableDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("notApplicableDeviceCount", value);
    }
    /**
     * Sets the notApplicableUserCount property value. Number of Users whose devices were all not applicable for this app.
     * @param value Value to set for the notApplicableUserCount property.
     */
    public void setNotApplicableUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("notApplicableUserCount", value);
    }
    /**
     * Sets the notInstalledDeviceCount property value. Number of Devices that does not have this app installed.
     * @param value Value to set for the notInstalledDeviceCount property.
     */
    public void setNotInstalledDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("notInstalledDeviceCount", value);
    }
    /**
     * Sets the notInstalledUserCount property value. Number of Users that have 1 or more devices that did not install this app.
     * @param value Value to set for the notInstalledUserCount property.
     */
    public void setNotInstalledUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("notInstalledUserCount", value);
    }
    /**
     * Sets the pendingInstallDeviceCount property value. Number of Devices that have been notified to install this app.
     * @param value Value to set for the pendingInstallDeviceCount property.
     */
    public void setPendingInstallDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pendingInstallDeviceCount", value);
    }
    /**
     * Sets the pendingInstallUserCount property value. Number of Users that have 1 or more device that have been notified to install this app and have 0 devices with failures.
     * @param value Value to set for the pendingInstallUserCount property.
     */
    public void setPendingInstallUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pendingInstallUserCount", value);
    }
}
