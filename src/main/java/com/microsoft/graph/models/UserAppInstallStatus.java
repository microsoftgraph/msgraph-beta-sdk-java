package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for the installation status for a user. This will be deprecated starting May, 2023 (Intune Release 2305).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserAppInstallStatus extends Entity implements Parsable {
    /**
     * The navigation link to the mobile app.
     */
    private MobileApp app;
    /**
     * The install state of the app on devices.
     */
    private java.util.List<MobileAppInstallStatus> deviceStatuses;
    /**
     * Failed Device Count.
     */
    private Integer failedDeviceCount;
    /**
     * Installed Device Count.
     */
    private Integer installedDeviceCount;
    /**
     * Not installed device count.
     */
    private Integer notInstalledDeviceCount;
    /**
     * User name.
     */
    private String userName;
    /**
     * User Principal Name.
     */
    private String userPrincipalName;
    /**
     * Instantiates a new UserAppInstallStatus and sets the default values.
     */
    public UserAppInstallStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserAppInstallStatus
     */
    @jakarta.annotation.Nonnull
    public static UserAppInstallStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserAppInstallStatus();
    }
    /**
     * Gets the app property value. The navigation link to the mobile app.
     * @return a MobileApp
     */
    @jakarta.annotation.Nullable
    public MobileApp getApp() {
        return this.app;
    }
    /**
     * Gets the deviceStatuses property value. The install state of the app on devices.
     * @return a java.util.List<MobileAppInstallStatus>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileAppInstallStatus> getDeviceStatuses() {
        return this.deviceStatuses;
    }
    /**
     * Gets the failedDeviceCount property value. Failed Device Count.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFailedDeviceCount() {
        return this.failedDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInstalledDeviceCount() {
        return this.installedDeviceCount;
    }
    /**
     * Gets the notInstalledDeviceCount property value. Not installed device count.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNotInstalledDeviceCount() {
        return this.notInstalledDeviceCount;
    }
    /**
     * Gets the userName property value. User name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserName() {
        return this.userName;
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
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
        this.app = value;
    }
    /**
     * Sets the deviceStatuses property value. The install state of the app on devices.
     * @param value Value to set for the deviceStatuses property.
     */
    public void setDeviceStatuses(@jakarta.annotation.Nullable final java.util.List<MobileAppInstallStatus> value) {
        this.deviceStatuses = value;
    }
    /**
     * Sets the failedDeviceCount property value. Failed Device Count.
     * @param value Value to set for the failedDeviceCount property.
     */
    public void setFailedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.failedDeviceCount = value;
    }
    /**
     * Sets the installedDeviceCount property value. Installed Device Count.
     * @param value Value to set for the installedDeviceCount property.
     */
    public void setInstalledDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.installedDeviceCount = value;
    }
    /**
     * Sets the notInstalledDeviceCount property value. Not installed device count.
     * @param value Value to set for the notInstalledDeviceCount property.
     */
    public void setNotInstalledDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.notInstalledDeviceCount = value;
    }
    /**
     * Sets the userName property value. User name.
     * @param value Value to set for the userName property.
     */
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.userName = value;
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
