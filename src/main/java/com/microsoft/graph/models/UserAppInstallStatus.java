package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties for the installation status for a user. */
public class UserAppInstallStatus extends Entity implements Parsable {
    /** The navigation link to the mobile app. */
    private MobileApp _app;
    /** The install state of the app on devices. */
    private java.util.List<MobileAppInstallStatus> _deviceStatuses;
    /** Failed Device Count. */
    private Integer _failedDeviceCount;
    /** Installed Device Count. */
    private Integer _installedDeviceCount;
    /** Not installed device count. */
    private Integer _notInstalledDeviceCount;
    /** User name. */
    private String _userName;
    /** User Principal Name. */
    private String _userPrincipalName;
    /**
     * Instantiates a new userAppInstallStatus and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserAppInstallStatus() {
        super();
        this.setOdataType("#microsoft.graph.userAppInstallStatus");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userAppInstallStatus
     */
    @javax.annotation.Nonnull
    public static UserAppInstallStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserAppInstallStatus();
    }
    /**
     * Gets the app property value. The navigation link to the mobile app.
     * @return a mobileApp
     */
    @javax.annotation.Nullable
    public MobileApp getApp() {
        return this._app;
    }
    /**
     * Gets the deviceStatuses property value. The install state of the app on devices.
     * @return a mobileAppInstallStatus
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppInstallStatus> getDeviceStatuses() {
        return this._deviceStatuses;
    }
    /**
     * Gets the failedDeviceCount property value. Failed Device Count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedDeviceCount() {
        return this._failedDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserAppInstallStatus currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("app", (n) -> { currentObject.setApp(n.getObjectValue(MobileApp::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceStatuses", (n) -> { currentObject.setDeviceStatuses(n.getCollectionOfObjectValues(MobileAppInstallStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("failedDeviceCount", (n) -> { currentObject.setFailedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("installedDeviceCount", (n) -> { currentObject.setInstalledDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("notInstalledDeviceCount", (n) -> { currentObject.setNotInstalledDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("userName", (n) -> { currentObject.setUserName(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installedDeviceCount property value. Installed Device Count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInstalledDeviceCount() {
        return this._installedDeviceCount;
    }
    /**
     * Gets the notInstalledDeviceCount property value. Not installed device count.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotInstalledDeviceCount() {
        return this._notInstalledDeviceCount;
    }
    /**
     * Gets the userName property value. User name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this._userName;
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApp(@javax.annotation.Nullable final MobileApp value) {
        this._app = value;
    }
    /**
     * Sets the deviceStatuses property value. The install state of the app on devices.
     * @param value Value to set for the deviceStatuses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceStatuses(@javax.annotation.Nullable final java.util.List<MobileAppInstallStatus> value) {
        this._deviceStatuses = value;
    }
    /**
     * Sets the failedDeviceCount property value. Failed Device Count.
     * @param value Value to set for the failedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._failedDeviceCount = value;
    }
    /**
     * Sets the installedDeviceCount property value. Installed Device Count.
     * @param value Value to set for the installedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstalledDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._installedDeviceCount = value;
    }
    /**
     * Sets the notInstalledDeviceCount property value. Not installed device count.
     * @param value Value to set for the notInstalledDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotInstalledDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._notInstalledDeviceCount = value;
    }
    /**
     * Sets the userName property value. User name.
     * @param value Value to set for the userName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserName(@javax.annotation.Nullable final String value) {
        this._userName = value;
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
