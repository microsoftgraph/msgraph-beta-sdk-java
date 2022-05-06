package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RemoteActionAudit extends Entity implements Parsable {
    /** The action name. Possible values are: unknown, factoryReset, removeCompanyData, resetPasscode, remoteLock, enableLostMode, disableLostMode, locateDevice, rebootNow, recoverPasscode, cleanWindowsDevice, logoutSharedAppleDeviceActiveUser, quickScan, fullScan, windowsDefenderUpdateSignatures, factoryResetKeepEnrollmentData, updateDeviceAccount, automaticRedeployment, shutDown, rotateBitLockerKeys, rotateFileVaultKey, getFileVaultKey, setDeviceName, activateDeviceEsim.  */
    private RemoteAction _action;
    /** Action state. Possible values are: none, pending, canceled, active, done, failed, notSupported.  */
    private ActionState _actionState;
    /** Intune device name.  */
    private String _deviceDisplayName;
    /** IMEI of the device.  */
    private String _deviceIMEI;
    /** Upn of the device owner.  */
    private String _deviceOwnerUserPrincipalName;
    /** User who initiated the device action, format is UPN.  */
    private String _initiatedByUserPrincipalName;
    /** Action target.  */
    private String _managedDeviceId;
    /** Time when the action was issued, given in UTC.  */
    private OffsetDateTime _requestDateTime;
    /** [deprecated] Please use InitiatedByUserPrincipalName instead.  */
    private String _userName;
    /**
     * Instantiates a new remoteActionAudit and sets the default values.
     * @return a void
     */
    public RemoteActionAudit() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a remoteActionAudit
     */
    @javax.annotation.Nonnull
    public static RemoteActionAudit createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoteActionAudit();
    }
    /**
     * Gets the action property value. The action name. Possible values are: unknown, factoryReset, removeCompanyData, resetPasscode, remoteLock, enableLostMode, disableLostMode, locateDevice, rebootNow, recoverPasscode, cleanWindowsDevice, logoutSharedAppleDeviceActiveUser, quickScan, fullScan, windowsDefenderUpdateSignatures, factoryResetKeepEnrollmentData, updateDeviceAccount, automaticRedeployment, shutDown, rotateBitLockerKeys, rotateFileVaultKey, getFileVaultKey, setDeviceName, activateDeviceEsim.
     * @return a remoteAction
     */
    @javax.annotation.Nullable
    public RemoteAction getAction() {
        return this._action;
    }
    /**
     * Gets the actionState property value. Action state. Possible values are: none, pending, canceled, active, done, failed, notSupported.
     * @return a actionState
     */
    @javax.annotation.Nullable
    public ActionState getActionState() {
        return this._actionState;
    }
    /**
     * Gets the deviceDisplayName property value. Intune device name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceDisplayName() {
        return this._deviceDisplayName;
    }
    /**
     * Gets the deviceIMEI property value. IMEI of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceIMEI() {
        return this._deviceIMEI;
    }
    /**
     * Gets the deviceOwnerUserPrincipalName property value. Upn of the device owner.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceOwnerUserPrincipalName() {
        return this._deviceOwnerUserPrincipalName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RemoteActionAudit currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("action", (n) -> { currentObject.setAction(n.getEnumValue(RemoteAction.class)); });
            this.put("actionState", (n) -> { currentObject.setActionState(n.getEnumValue(ActionState.class)); });
            this.put("deviceDisplayName", (n) -> { currentObject.setDeviceDisplayName(n.getStringValue()); });
            this.put("deviceIMEI", (n) -> { currentObject.setDeviceIMEI(n.getStringValue()); });
            this.put("deviceOwnerUserPrincipalName", (n) -> { currentObject.setDeviceOwnerUserPrincipalName(n.getStringValue()); });
            this.put("initiatedByUserPrincipalName", (n) -> { currentObject.setInitiatedByUserPrincipalName(n.getStringValue()); });
            this.put("managedDeviceId", (n) -> { currentObject.setManagedDeviceId(n.getStringValue()); });
            this.put("requestDateTime", (n) -> { currentObject.setRequestDateTime(n.getOffsetDateTimeValue()); });
            this.put("userName", (n) -> { currentObject.setUserName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the initiatedByUserPrincipalName property value. User who initiated the device action, format is UPN.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInitiatedByUserPrincipalName() {
        return this._initiatedByUserPrincipalName;
    }
    /**
     * Gets the managedDeviceId property value. Action target.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this._managedDeviceId;
    }
    /**
     * Gets the requestDateTime property value. Time when the action was issued, given in UTC.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRequestDateTime() {
        return this._requestDateTime;
    }
    /**
     * Gets the userName property value. [deprecated] Please use InitiatedByUserPrincipalName instead.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this._userName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeEnumValue("actionState", this.getActionState());
        writer.writeStringValue("deviceDisplayName", this.getDeviceDisplayName());
        writer.writeStringValue("deviceIMEI", this.getDeviceIMEI());
        writer.writeStringValue("deviceOwnerUserPrincipalName", this.getDeviceOwnerUserPrincipalName());
        writer.writeStringValue("initiatedByUserPrincipalName", this.getInitiatedByUserPrincipalName());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeOffsetDateTimeValue("requestDateTime", this.getRequestDateTime());
        writer.writeStringValue("userName", this.getUserName());
    }
    /**
     * Sets the action property value. The action name. Possible values are: unknown, factoryReset, removeCompanyData, resetPasscode, remoteLock, enableLostMode, disableLostMode, locateDevice, rebootNow, recoverPasscode, cleanWindowsDevice, logoutSharedAppleDeviceActiveUser, quickScan, fullScan, windowsDefenderUpdateSignatures, factoryResetKeepEnrollmentData, updateDeviceAccount, automaticRedeployment, shutDown, rotateBitLockerKeys, rotateFileVaultKey, getFileVaultKey, setDeviceName, activateDeviceEsim.
     * @param value Value to set for the action property.
     * @return a void
     */
    public void setAction(@javax.annotation.Nullable final RemoteAction value) {
        this._action = value;
    }
    /**
     * Sets the actionState property value. Action state. Possible values are: none, pending, canceled, active, done, failed, notSupported.
     * @param value Value to set for the actionState property.
     * @return a void
     */
    public void setActionState(@javax.annotation.Nullable final ActionState value) {
        this._actionState = value;
    }
    /**
     * Sets the deviceDisplayName property value. Intune device name.
     * @param value Value to set for the deviceDisplayName property.
     * @return a void
     */
    public void setDeviceDisplayName(@javax.annotation.Nullable final String value) {
        this._deviceDisplayName = value;
    }
    /**
     * Sets the deviceIMEI property value. IMEI of the device.
     * @param value Value to set for the deviceIMEI property.
     * @return a void
     */
    public void setDeviceIMEI(@javax.annotation.Nullable final String value) {
        this._deviceIMEI = value;
    }
    /**
     * Sets the deviceOwnerUserPrincipalName property value. Upn of the device owner.
     * @param value Value to set for the deviceOwnerUserPrincipalName property.
     * @return a void
     */
    public void setDeviceOwnerUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._deviceOwnerUserPrincipalName = value;
    }
    /**
     * Sets the initiatedByUserPrincipalName property value. User who initiated the device action, format is UPN.
     * @param value Value to set for the initiatedByUserPrincipalName property.
     * @return a void
     */
    public void setInitiatedByUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._initiatedByUserPrincipalName = value;
    }
    /**
     * Sets the managedDeviceId property value. Action target.
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this._managedDeviceId = value;
    }
    /**
     * Sets the requestDateTime property value. Time when the action was issued, given in UTC.
     * @param value Value to set for the requestDateTime property.
     * @return a void
     */
    public void setRequestDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._requestDateTime = value;
    }
    /**
     * Sets the userName property value. [deprecated] Please use InitiatedByUserPrincipalName instead.
     * @param value Value to set for the userName property.
     * @return a void
     */
    public void setUserName(@javax.annotation.Nullable final String value) {
        this._userName = value;
    }
}
