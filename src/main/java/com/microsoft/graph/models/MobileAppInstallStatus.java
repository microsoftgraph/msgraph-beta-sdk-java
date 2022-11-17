package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties for the installation state of a mobile app for a device. */
public class MobileAppInstallStatus extends Entity implements Parsable {
    /** The navigation link to the mobile app. */
    private MobileApp _app;
    /** Device ID */
    private String _deviceId;
    /** Device name */
    private String _deviceName;
    /** Human readable version of the application */
    private String _displayVersion;
    /** The error code for install or uninstall failures. */
    private Integer _errorCode;
    /** A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins. */
    private ResultantAppState _installState;
    /** Enum indicating additional details regarding why an application has a particular install state. */
    private ResultantAppStateDetail _installStateDetail;
    /** Last sync date time */
    private OffsetDateTime _lastSyncDateTime;
    /** A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins. */
    private ResultantAppState _mobileAppInstallStatusValue;
    /** OS Description */
    private String _osDescription;
    /** OS Version */
    private String _osVersion;
    /** Device User Name */
    private String _userName;
    /** User Principal Name */
    private String _userPrincipalName;
    /**
     * Instantiates a new mobileAppInstallStatus and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobileAppInstallStatus() {
        super();
        this.setOdataType("#microsoft.graph.mobileAppInstallStatus");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppInstallStatus
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
        return this._app;
    }
    /**
     * Gets the deviceId property value. Device ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the deviceName property value. Device name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * Gets the displayVersion property value. Human readable version of the application
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayVersion() {
        return this._displayVersion;
    }
    /**
     * Gets the errorCode property value. The error code for install or uninstall failures.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorCode() {
        return this._errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MobileAppInstallStatus currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("app", (n) -> { currentObject.setApp(n.getObjectValue(MobileApp::createFromDiscriminatorValue)); });
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("displayVersion", (n) -> { currentObject.setDisplayVersion(n.getStringValue()); });
            this.put("errorCode", (n) -> { currentObject.setErrorCode(n.getIntegerValue()); });
            this.put("installState", (n) -> { currentObject.setInstallState(n.getEnumValue(ResultantAppState.class)); });
            this.put("installStateDetail", (n) -> { currentObject.setInstallStateDetail(n.getEnumValue(ResultantAppStateDetail.class)); });
            this.put("lastSyncDateTime", (n) -> { currentObject.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("mobileAppInstallStatusValue", (n) -> { currentObject.setMobileAppInstallStatusValue(n.getEnumValue(ResultantAppState.class)); });
            this.put("osDescription", (n) -> { currentObject.setOsDescription(n.getStringValue()); });
            this.put("osVersion", (n) -> { currentObject.setOsVersion(n.getStringValue()); });
            this.put("userName", (n) -> { currentObject.setUserName(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the installState property value. A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
     * @return a resultantAppState
     */
    @javax.annotation.Nullable
    public ResultantAppState getInstallState() {
        return this._installState;
    }
    /**
     * Gets the installStateDetail property value. Enum indicating additional details regarding why an application has a particular install state.
     * @return a resultantAppStateDetail
     */
    @javax.annotation.Nullable
    public ResultantAppStateDetail getInstallStateDetail() {
        return this._installStateDetail;
    }
    /**
     * Gets the lastSyncDateTime property value. Last sync date time
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this._lastSyncDateTime;
    }
    /**
     * Gets the mobileAppInstallStatusValue property value. A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
     * @return a resultantAppState
     */
    @javax.annotation.Nullable
    public ResultantAppState getMobileAppInstallStatusValue() {
        return this._mobileAppInstallStatusValue;
    }
    /**
     * Gets the osDescription property value. OS Description
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsDescription() {
        return this._osDescription;
    }
    /**
     * Gets the osVersion property value. OS Version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this._osVersion;
    }
    /**
     * Gets the userName property value. Device User Name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this._userName;
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name
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
        this._app = value;
    }
    /**
     * Sets the deviceId property value. Device ID
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the deviceName property value. Device name
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the displayVersion property value. Human readable version of the application
     * @param value Value to set for the displayVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayVersion(@javax.annotation.Nullable final String value) {
        this._displayVersion = value;
    }
    /**
     * Sets the errorCode property value. The error code for install or uninstall failures.
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorCode(@javax.annotation.Nullable final Integer value) {
        this._errorCode = value;
    }
    /**
     * Sets the installState property value. A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
     * @param value Value to set for the installState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstallState(@javax.annotation.Nullable final ResultantAppState value) {
        this._installState = value;
    }
    /**
     * Sets the installStateDetail property value. Enum indicating additional details regarding why an application has a particular install state.
     * @param value Value to set for the installStateDetail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstallStateDetail(@javax.annotation.Nullable final ResultantAppStateDetail value) {
        this._installStateDetail = value;
    }
    /**
     * Sets the lastSyncDateTime property value. Last sync date time
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSyncDateTime = value;
    }
    /**
     * Sets the mobileAppInstallStatusValue property value. A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
     * @param value Value to set for the mobileAppInstallStatusValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileAppInstallStatusValue(@javax.annotation.Nullable final ResultantAppState value) {
        this._mobileAppInstallStatusValue = value;
    }
    /**
     * Sets the osDescription property value. OS Description
     * @param value Value to set for the osDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsDescription(@javax.annotation.Nullable final String value) {
        this._osDescription = value;
    }
    /**
     * Sets the osVersion property value. OS Version
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this._osVersion = value;
    }
    /**
     * Sets the userName property value. Device User Name
     * @param value Value to set for the userName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserName(@javax.annotation.Nullable final String value) {
        this._userName = value;
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
