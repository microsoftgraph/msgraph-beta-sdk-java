package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MobileAppInstallStatus extends Entity implements Parsable {
    /** The navigation link to the mobile app. */
    private MobileApp app;
    /** Device ID */
    private String deviceId;
    /** Device name */
    private String deviceName;
    /** Human readable version of the application */
    private String displayVersion;
    /** The error code for install or uninstall failures. */
    private Integer errorCode;
    /** A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins. */
    private ResultantAppState installState;
    /** Enum indicating additional details regarding why an application has a particular install state. */
    private ResultantAppStateDetail installStateDetail;
    /** Last sync date time */
    private OffsetDateTime lastSyncDateTime;
    /** A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins. */
    private ResultantAppState mobileAppInstallStatusValue;
    /** OS Description */
    private String osDescription;
    /** OS Version */
    private String osVersion;
    /** Device User Name */
    private String userName;
    /** User Principal Name */
    private String userPrincipalName;
    /**
     * Instantiates a new MobileAppInstallStatus and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobileAppInstallStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobileAppInstallStatus
     */
    @javax.annotation.Nonnull
    public static MobileAppInstallStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppInstallStatus();
    }
    /**
     * Gets the app property value. The navigation link to the mobile app.
     * @return a mobileApp
     */
    @javax.annotation.Nullable
    public MobileApp getApp() {
        return this.app;
    }
    /**
     * Gets the deviceId property value. Device ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the deviceName property value. Device name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Gets the displayVersion property value. Human readable version of the application
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayVersion() {
        return this.displayVersion;
    }
    /**
     * Gets the errorCode property value. The error code for install or uninstall failures.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorCode() {
        return this.errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("app", (n) -> { this.setApp(n.getObjectValue(MobileApp::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("displayVersion", (n) -> { this.setDisplayVersion(n.getStringValue()); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getIntegerValue()); });
        deserializerMap.put("installState", (n) -> { this.setInstallState(n.getEnumValue(ResultantAppState.class)); });
        deserializerMap.put("installStateDetail", (n) -> { this.setInstallStateDetail(n.getEnumValue(ResultantAppStateDetail.class)); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("mobileAppInstallStatusValue", (n) -> { this.setMobileAppInstallStatusValue(n.getEnumValue(ResultantAppState.class)); });
        deserializerMap.put("osDescription", (n) -> { this.setOsDescription(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installState property value. A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
     * @return a ResultantAppState
     */
    @javax.annotation.Nullable
    public ResultantAppState getInstallState() {
        return this.installState;
    }
    /**
     * Gets the installStateDetail property value. Enum indicating additional details regarding why an application has a particular install state.
     * @return a ResultantAppStateDetail
     */
    @javax.annotation.Nullable
    public ResultantAppStateDetail getInstallStateDetail() {
        return this.installStateDetail;
    }
    /**
     * Gets the lastSyncDateTime property value. Last sync date time
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.lastSyncDateTime;
    }
    /**
     * Gets the mobileAppInstallStatusValue property value. A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
     * @return a ResultantAppState
     */
    @javax.annotation.Nullable
    public ResultantAppState getMobileAppInstallStatusValue() {
        return this.mobileAppInstallStatusValue;
    }
    /**
     * Gets the osDescription property value. OS Description
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsDescription() {
        return this.osDescription;
    }
    /**
     * Gets the osVersion property value. OS Version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * Gets the userName property value. Device User Name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this.userName;
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
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
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("displayVersion", this.getDisplayVersion());
        writer.writeIntegerValue("errorCode", this.getErrorCode());
        writer.writeEnumValue("installState", this.getInstallState());
        writer.writeEnumValue("installStateDetail", this.getInstallStateDetail());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeEnumValue("mobileAppInstallStatusValue", this.getMobileAppInstallStatusValue());
        writer.writeStringValue("osDescription", this.getOsDescription());
        writer.writeStringValue("osVersion", this.getOsVersion());
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
        this.app = value;
    }
    /**
     * Sets the deviceId property value. Device ID
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the deviceName property value. Device name
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the displayVersion property value. Human readable version of the application
     * @param value Value to set for the displayVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayVersion(@javax.annotation.Nullable final String value) {
        this.displayVersion = value;
    }
    /**
     * Sets the errorCode property value. The error code for install or uninstall failures.
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorCode(@javax.annotation.Nullable final Integer value) {
        this.errorCode = value;
    }
    /**
     * Sets the installState property value. A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
     * @param value Value to set for the installState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstallState(@javax.annotation.Nullable final ResultantAppState value) {
        this.installState = value;
    }
    /**
     * Sets the installStateDetail property value. Enum indicating additional details regarding why an application has a particular install state.
     * @param value Value to set for the installStateDetail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstallStateDetail(@javax.annotation.Nullable final ResultantAppStateDetail value) {
        this.installStateDetail = value;
    }
    /**
     * Sets the lastSyncDateTime property value. Last sync date time
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastSyncDateTime = value;
    }
    /**
     * Sets the mobileAppInstallStatusValue property value. A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
     * @param value Value to set for the mobileAppInstallStatusValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileAppInstallStatusValue(@javax.annotation.Nullable final ResultantAppState value) {
        this.mobileAppInstallStatusValue = value;
    }
    /**
     * Sets the osDescription property value. OS Description
     * @param value Value to set for the osDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsDescription(@javax.annotation.Nullable final String value) {
        this.osDescription = value;
    }
    /**
     * Sets the osVersion property value. OS Version
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this.osVersion = value;
    }
    /**
     * Sets the userName property value. Device User Name
     * @param value Value to set for the userName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserName(@javax.annotation.Nullable final String value) {
        this.userName = value;
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
