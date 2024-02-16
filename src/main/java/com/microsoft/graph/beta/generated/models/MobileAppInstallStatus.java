package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for the installation state of a mobile app for a device. This will be deprecated starting May, 2023 (Intune Release 2305).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppInstallStatus extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MobileAppInstallStatus} and sets the default values.
     */
    public MobileAppInstallStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MobileAppInstallStatus}
     */
    @jakarta.annotation.Nonnull
    public static MobileAppInstallStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppInstallStatus();
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
     * Gets the deviceId property value. Device ID
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the deviceName property value. Device name
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * Gets the displayVersion property value. Human readable version of the application
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayVersion() {
        return this.backingStore.get("displayVersion");
    }
    /**
     * Gets the errorCode property value. The error code for install or uninstall failures.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getErrorCode() {
        return this.backingStore.get("errorCode");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("app", (n) -> { this.setApp(n.getObjectValue(MobileApp::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("displayVersion", (n) -> { this.setDisplayVersion(n.getStringValue()); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getIntegerValue()); });
        deserializerMap.put("installState", (n) -> { this.setInstallState(n.getEnumValue(ResultantAppState::forValue)); });
        deserializerMap.put("installStateDetail", (n) -> { this.setInstallStateDetail(n.getEnumValue(ResultantAppStateDetail::forValue)); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("mobileAppInstallStatusValue", (n) -> { this.setMobileAppInstallStatusValue(n.getEnumValue(ResultantAppState::forValue)); });
        deserializerMap.put("osDescription", (n) -> { this.setOsDescription(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installState property value. A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
     * @return a {@link ResultantAppState}
     */
    @jakarta.annotation.Nullable
    public ResultantAppState getInstallState() {
        return this.backingStore.get("installState");
    }
    /**
     * Gets the installStateDetail property value. Enum indicating additional details regarding why an application has a particular install state.
     * @return a {@link ResultantAppStateDetail}
     */
    @jakarta.annotation.Nullable
    public ResultantAppStateDetail getInstallStateDetail() {
        return this.backingStore.get("installStateDetail");
    }
    /**
     * Gets the lastSyncDateTime property value. Last sync date time
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.backingStore.get("lastSyncDateTime");
    }
    /**
     * Gets the mobileAppInstallStatusValue property value. A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
     * @return a {@link ResultantAppState}
     */
    @jakarta.annotation.Nullable
    public ResultantAppState getMobileAppInstallStatusValue() {
        return this.backingStore.get("mobileAppInstallStatusValue");
    }
    /**
     * Gets the osDescription property value. OS Description
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsDescription() {
        return this.backingStore.get("osDescription");
    }
    /**
     * Gets the osVersion property value. OS Version
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.backingStore.get("osVersion");
    }
    /**
     * Gets the userName property value. Device User Name
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserName() {
        return this.backingStore.get("userName");
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name
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
     */
    public void setApp(@jakarta.annotation.Nullable final MobileApp value) {
        this.backingStore.set("app", value);
    }
    /**
     * Sets the deviceId property value. Device ID
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the deviceName property value. Device name
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the displayVersion property value. Human readable version of the application
     * @param value Value to set for the displayVersion property.
     */
    public void setDisplayVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayVersion", value);
    }
    /**
     * Sets the errorCode property value. The error code for install or uninstall failures.
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("errorCode", value);
    }
    /**
     * Sets the installState property value. A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
     * @param value Value to set for the installState property.
     */
    public void setInstallState(@jakarta.annotation.Nullable final ResultantAppState value) {
        this.backingStore.set("installState", value);
    }
    /**
     * Sets the installStateDetail property value. Enum indicating additional details regarding why an application has a particular install state.
     * @param value Value to set for the installStateDetail property.
     */
    public void setInstallStateDetail(@jakarta.annotation.Nullable final ResultantAppStateDetail value) {
        this.backingStore.set("installStateDetail", value);
    }
    /**
     * Sets the lastSyncDateTime property value. Last sync date time
     * @param value Value to set for the lastSyncDateTime property.
     */
    public void setLastSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSyncDateTime", value);
    }
    /**
     * Sets the mobileAppInstallStatusValue property value. A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
     * @param value Value to set for the mobileAppInstallStatusValue property.
     */
    public void setMobileAppInstallStatusValue(@jakarta.annotation.Nullable final ResultantAppState value) {
        this.backingStore.set("mobileAppInstallStatusValue", value);
    }
    /**
     * Sets the osDescription property value. OS Description
     * @param value Value to set for the osDescription property.
     */
    public void setOsDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osDescription", value);
    }
    /**
     * Sets the osVersion property value. OS Version
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osVersion", value);
    }
    /**
     * Sets the userName property value. Device User Name
     * @param value Value to set for the userName property.
     */
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userName", value);
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
