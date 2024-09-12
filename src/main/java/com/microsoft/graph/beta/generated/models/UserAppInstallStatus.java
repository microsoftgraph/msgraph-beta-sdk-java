package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for the installation status for a user. This will be deprecated in May, 2023
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserAppInstallStatus extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UserAppInstallStatus} and sets the default values.
     */
    public UserAppInstallStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserAppInstallStatus}
     */
    @jakarta.annotation.Nonnull
    public static UserAppInstallStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserAppInstallStatus();
    }
    /**
     * Gets the app property value. The navigation link to the mobile app.
     * @return a {@link MobileApp}
     */
    @jakarta.annotation.Nullable
    public MobileApp getApp() {
        return this.backingStore.get("app");
    }
    /**
     * Gets the deviceStatuses property value. The install state of the app on devices.
     * @return a {@link java.util.List<MobileAppInstallStatus>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileAppInstallStatus> getDeviceStatuses() {
        return this.backingStore.get("deviceStatuses");
    }
    /**
     * Gets the failedDeviceCount property value. Failed Device Count.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedDeviceCount() {
        return this.backingStore.get("failedDeviceCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("app", (n) -> { this.setApp(n.getObjectValue(MobileApp::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceStatuses", (n) -> { this.setDeviceStatuses(n.getCollectionOfObjectValues(MobileAppInstallStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("failedDeviceCount", (n) -> { this.setFailedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("installedDeviceCount", (n) -> { this.setInstalledDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("notInstalledDeviceCount", (n) -> { this.setNotInstalledDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installedDeviceCount property value. Installed Device Count.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getInstalledDeviceCount() {
        return this.backingStore.get("installedDeviceCount");
    }
    /**
     * Gets the notInstalledDeviceCount property value. Not installed device count.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNotInstalledDeviceCount() {
        return this.backingStore.get("notInstalledDeviceCount");
    }
    /**
     * Gets the userName property value. User name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserName() {
        return this.backingStore.get("userName");
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("app", this.getApp());
        writer.writeCollectionOfObjectValues("deviceStatuses", this.getDeviceStatuses());
        writer.writeIntegerValue("failedDeviceCount", this.getFailedDeviceCount());
        writer.writeIntegerValue("installedDeviceCount", this.getInstalledDeviceCount());
        writer.writeIntegerValue("notInstalledDeviceCount", this.getNotInstalledDeviceCount());
        writer.writeStringValue("userName", this.getUserName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the app property value. The navigation link to the mobile app.
     * @param value Value to set for the app property.
     */
    public void setApp(@jakarta.annotation.Nullable final MobileApp value) {
        this.backingStore.set("app", value);
    }
    /**
     * Sets the deviceStatuses property value. The install state of the app on devices.
     * @param value Value to set for the deviceStatuses property.
     */
    public void setDeviceStatuses(@jakarta.annotation.Nullable final java.util.List<MobileAppInstallStatus> value) {
        this.backingStore.set("deviceStatuses", value);
    }
    /**
     * Sets the failedDeviceCount property value. Failed Device Count.
     * @param value Value to set for the failedDeviceCount property.
     */
    public void setFailedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedDeviceCount", value);
    }
    /**
     * Sets the installedDeviceCount property value. Installed Device Count.
     * @param value Value to set for the installedDeviceCount property.
     */
    public void setInstalledDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("installedDeviceCount", value);
    }
    /**
     * Sets the notInstalledDeviceCount property value. Not installed device count.
     * @param value Value to set for the notInstalledDeviceCount property.
     */
    public void setNotInstalledDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("notInstalledDeviceCount", value);
    }
    /**
     * Sets the userName property value. User name.
     * @param value Value to set for the userName property.
     */
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userName", value);
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
