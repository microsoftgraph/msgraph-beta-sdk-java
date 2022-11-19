package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DepMacOSEnrollmentProfile extends DepEnrollmentBaseProfile implements Parsable {
    /** Indicates if Accessibility screen is disabled */
    private Boolean _accessibilityScreenDisabled;
    /** Indicates if UnlockWithWatch screen is disabled */
    private Boolean _autoUnlockWithWatchDisabled;
    /** Indicates if iCloud Documents and Desktop screen is disabled */
    private Boolean _chooseYourLockScreenDisabled;
    /** Indicates whether Setup Assistant will auto populate the primary account information */
    private Boolean _dontAutoPopulatePrimaryAccountInfo;
    /** Indicates whether the user will enable blockediting */
    private Boolean _enableRestrictEditing;
    /** Indicates if file vault is disabled */
    private Boolean _fileVaultDisabled;
    /** Indicates if iCloud Analytics screen is disabled */
    private Boolean _iCloudDiagnosticsDisabled;
    /** Indicates if iCloud Documents and Desktop screen is disabled */
    private Boolean _iCloudStorageDisabled;
    /** Indicates whether the profile is a local account */
    private Boolean _isLocalPrimaryAccount;
    /** Indicates whether the profile is a primary user */
    private Boolean _isPrimaryUser;
    /** Indicates whether the primary account information will be locked */
    private Boolean _lockPrimaryAccountInfo;
    /** Indicates whether or not this is the short name of the local account to manage */
    private Boolean _managedLocalUserShortName;
    /** Indicates if Passcode setup pane is disabled */
    private Boolean _passCodeDisabled;
    /** Indicates whether the user will prefill their account info */
    private Boolean _prefillAccountInfo;
    /** Indicates what the full name for the primary account is */
    private String _primaryAccountFullName;
    /** Indicates what the account name for the primary account is */
    private String _primaryAccountUserName;
    /** Indicates who the primary user of the profile is */
    private String _primaryUser;
    /** Indicates who the primary user of the profile is */
    private String _primaryUserFullName;
    /** Indicates if registration is disabled */
    private Boolean _registrationDisabled;
    /** Indicates if the device is network-tethered to run the command */
    private Boolean _requestRequiresNetworkTether;
    /** Indicates whether Setup Assistant will set the account as a regular user */
    private Boolean _setPrimarySetupAccountAsRegularUser;
    /** Indicates whether Setup Assistant will skip the user interface for primary account setup */
    private Boolean _skipPrimarySetupAccountCreation;
    /** Indicates if zoom setup pane is disabled */
    private Boolean _zoomDisabled;
    /**
     * Instantiates a new DepMacOSEnrollmentProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DepMacOSEnrollmentProfile() {
        super();
        this.setOdataType("#microsoft.graph.depMacOSEnrollmentProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DepMacOSEnrollmentProfile
     */
    @javax.annotation.Nonnull
    public static DepMacOSEnrollmentProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DepMacOSEnrollmentProfile();
    }
    /**
     * Gets the accessibilityScreenDisabled property value. Indicates if Accessibility screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAccessibilityScreenDisabled() {
        return this._accessibilityScreenDisabled;
    }
    /**
     * Gets the autoUnlockWithWatchDisabled property value. Indicates if UnlockWithWatch screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAutoUnlockWithWatchDisabled() {
        return this._autoUnlockWithWatchDisabled;
    }
    /**
     * Gets the chooseYourLockScreenDisabled property value. Indicates if iCloud Documents and Desktop screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getChooseYourLockScreenDisabled() {
        return this._chooseYourLockScreenDisabled;
    }
    /**
     * Gets the dontAutoPopulatePrimaryAccountInfo property value. Indicates whether Setup Assistant will auto populate the primary account information
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDontAutoPopulatePrimaryAccountInfo() {
        return this._dontAutoPopulatePrimaryAccountInfo;
    }
    /**
     * Gets the enableRestrictEditing property value. Indicates whether the user will enable blockediting
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableRestrictEditing() {
        return this._enableRestrictEditing;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DepMacOSEnrollmentProfile currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessibilityScreenDisabled", (n) -> { currentObject.setAccessibilityScreenDisabled(n.getBooleanValue()); });
        deserializerMap.put("autoUnlockWithWatchDisabled", (n) -> { currentObject.setAutoUnlockWithWatchDisabled(n.getBooleanValue()); });
        deserializerMap.put("chooseYourLockScreenDisabled", (n) -> { currentObject.setChooseYourLockScreenDisabled(n.getBooleanValue()); });
        deserializerMap.put("dontAutoPopulatePrimaryAccountInfo", (n) -> { currentObject.setDontAutoPopulatePrimaryAccountInfo(n.getBooleanValue()); });
        deserializerMap.put("enableRestrictEditing", (n) -> { currentObject.setEnableRestrictEditing(n.getBooleanValue()); });
        deserializerMap.put("fileVaultDisabled", (n) -> { currentObject.setFileVaultDisabled(n.getBooleanValue()); });
        deserializerMap.put("iCloudDiagnosticsDisabled", (n) -> { currentObject.setICloudDiagnosticsDisabled(n.getBooleanValue()); });
        deserializerMap.put("iCloudStorageDisabled", (n) -> { currentObject.setICloudStorageDisabled(n.getBooleanValue()); });
        deserializerMap.put("isLocalPrimaryAccount", (n) -> { currentObject.setIsLocalPrimaryAccount(n.getBooleanValue()); });
        deserializerMap.put("isPrimaryUser", (n) -> { currentObject.setIsPrimaryUser(n.getBooleanValue()); });
        deserializerMap.put("lockPrimaryAccountInfo", (n) -> { currentObject.setLockPrimaryAccountInfo(n.getBooleanValue()); });
        deserializerMap.put("managedLocalUserShortName", (n) -> { currentObject.setManagedLocalUserShortName(n.getBooleanValue()); });
        deserializerMap.put("passCodeDisabled", (n) -> { currentObject.setPassCodeDisabled(n.getBooleanValue()); });
        deserializerMap.put("prefillAccountInfo", (n) -> { currentObject.setPrefillAccountInfo(n.getBooleanValue()); });
        deserializerMap.put("primaryAccountFullName", (n) -> { currentObject.setPrimaryAccountFullName(n.getStringValue()); });
        deserializerMap.put("primaryAccountUserName", (n) -> { currentObject.setPrimaryAccountUserName(n.getStringValue()); });
        deserializerMap.put("primaryUser", (n) -> { currentObject.setPrimaryUser(n.getStringValue()); });
        deserializerMap.put("primaryUserFullName", (n) -> { currentObject.setPrimaryUserFullName(n.getStringValue()); });
        deserializerMap.put("registrationDisabled", (n) -> { currentObject.setRegistrationDisabled(n.getBooleanValue()); });
        deserializerMap.put("requestRequiresNetworkTether", (n) -> { currentObject.setRequestRequiresNetworkTether(n.getBooleanValue()); });
        deserializerMap.put("setPrimarySetupAccountAsRegularUser", (n) -> { currentObject.setSetPrimarySetupAccountAsRegularUser(n.getBooleanValue()); });
        deserializerMap.put("skipPrimarySetupAccountCreation", (n) -> { currentObject.setSkipPrimarySetupAccountCreation(n.getBooleanValue()); });
        deserializerMap.put("zoomDisabled", (n) -> { currentObject.setZoomDisabled(n.getBooleanValue()); });
        return deserializerMap
    }
    /**
     * Gets the fileVaultDisabled property value. Indicates if file vault is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFileVaultDisabled() {
        return this._fileVaultDisabled;
    }
    /**
     * Gets the iCloudDiagnosticsDisabled property value. Indicates if iCloud Analytics screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudDiagnosticsDisabled() {
        return this._iCloudDiagnosticsDisabled;
    }
    /**
     * Gets the iCloudStorageDisabled property value. Indicates if iCloud Documents and Desktop screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudStorageDisabled() {
        return this._iCloudStorageDisabled;
    }
    /**
     * Gets the isLocalPrimaryAccount property value. Indicates whether the profile is a local account
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsLocalPrimaryAccount() {
        return this._isLocalPrimaryAccount;
    }
    /**
     * Gets the isPrimaryUser property value. Indicates whether the profile is a primary user
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPrimaryUser() {
        return this._isPrimaryUser;
    }
    /**
     * Gets the lockPrimaryAccountInfo property value. Indicates whether the primary account information will be locked
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockPrimaryAccountInfo() {
        return this._lockPrimaryAccountInfo;
    }
    /**
     * Gets the managedLocalUserShortName property value. Indicates whether or not this is the short name of the local account to manage
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getManagedLocalUserShortName() {
        return this._managedLocalUserShortName;
    }
    /**
     * Gets the passCodeDisabled property value. Indicates if Passcode setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPassCodeDisabled() {
        return this._passCodeDisabled;
    }
    /**
     * Gets the prefillAccountInfo property value. Indicates whether the user will prefill their account info
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrefillAccountInfo() {
        return this._prefillAccountInfo;
    }
    /**
     * Gets the primaryAccountFullName property value. Indicates what the full name for the primary account is
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrimaryAccountFullName() {
        return this._primaryAccountFullName;
    }
    /**
     * Gets the primaryAccountUserName property value. Indicates what the account name for the primary account is
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrimaryAccountUserName() {
        return this._primaryAccountUserName;
    }
    /**
     * Gets the primaryUser property value. Indicates who the primary user of the profile is
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrimaryUser() {
        return this._primaryUser;
    }
    /**
     * Gets the primaryUserFullName property value. Indicates who the primary user of the profile is
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrimaryUserFullName() {
        return this._primaryUserFullName;
    }
    /**
     * Gets the registrationDisabled property value. Indicates if registration is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRegistrationDisabled() {
        return this._registrationDisabled;
    }
    /**
     * Gets the requestRequiresNetworkTether property value. Indicates if the device is network-tethered to run the command
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequestRequiresNetworkTether() {
        return this._requestRequiresNetworkTether;
    }
    /**
     * Gets the setPrimarySetupAccountAsRegularUser property value. Indicates whether Setup Assistant will set the account as a regular user
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSetPrimarySetupAccountAsRegularUser() {
        return this._setPrimarySetupAccountAsRegularUser;
    }
    /**
     * Gets the skipPrimarySetupAccountCreation property value. Indicates whether Setup Assistant will skip the user interface for primary account setup
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSkipPrimarySetupAccountCreation() {
        return this._skipPrimarySetupAccountCreation;
    }
    /**
     * Gets the zoomDisabled property value. Indicates if zoom setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getZoomDisabled() {
        return this._zoomDisabled;
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
        writer.writeBooleanValue("accessibilityScreenDisabled", this.getAccessibilityScreenDisabled());
        writer.writeBooleanValue("autoUnlockWithWatchDisabled", this.getAutoUnlockWithWatchDisabled());
        writer.writeBooleanValue("chooseYourLockScreenDisabled", this.getChooseYourLockScreenDisabled());
        writer.writeBooleanValue("dontAutoPopulatePrimaryAccountInfo", this.getDontAutoPopulatePrimaryAccountInfo());
        writer.writeBooleanValue("enableRestrictEditing", this.getEnableRestrictEditing());
        writer.writeBooleanValue("fileVaultDisabled", this.getFileVaultDisabled());
        writer.writeBooleanValue("iCloudDiagnosticsDisabled", this.getICloudDiagnosticsDisabled());
        writer.writeBooleanValue("iCloudStorageDisabled", this.getICloudStorageDisabled());
        writer.writeBooleanValue("isLocalPrimaryAccount", this.getIsLocalPrimaryAccount());
        writer.writeBooleanValue("isPrimaryUser", this.getIsPrimaryUser());
        writer.writeBooleanValue("lockPrimaryAccountInfo", this.getLockPrimaryAccountInfo());
        writer.writeBooleanValue("managedLocalUserShortName", this.getManagedLocalUserShortName());
        writer.writeBooleanValue("passCodeDisabled", this.getPassCodeDisabled());
        writer.writeBooleanValue("prefillAccountInfo", this.getPrefillAccountInfo());
        writer.writeStringValue("primaryAccountFullName", this.getPrimaryAccountFullName());
        writer.writeStringValue("primaryAccountUserName", this.getPrimaryAccountUserName());
        writer.writeStringValue("primaryUser", this.getPrimaryUser());
        writer.writeStringValue("primaryUserFullName", this.getPrimaryUserFullName());
        writer.writeBooleanValue("registrationDisabled", this.getRegistrationDisabled());
        writer.writeBooleanValue("requestRequiresNetworkTether", this.getRequestRequiresNetworkTether());
        writer.writeBooleanValue("setPrimarySetupAccountAsRegularUser", this.getSetPrimarySetupAccountAsRegularUser());
        writer.writeBooleanValue("skipPrimarySetupAccountCreation", this.getSkipPrimarySetupAccountCreation());
        writer.writeBooleanValue("zoomDisabled", this.getZoomDisabled());
    }
    /**
     * Sets the accessibilityScreenDisabled property value. Indicates if Accessibility screen is disabled
     * @param value Value to set for the accessibilityScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessibilityScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this._accessibilityScreenDisabled = value;
    }
    /**
     * Sets the autoUnlockWithWatchDisabled property value. Indicates if UnlockWithWatch screen is disabled
     * @param value Value to set for the autoUnlockWithWatchDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutoUnlockWithWatchDisabled(@javax.annotation.Nullable final Boolean value) {
        this._autoUnlockWithWatchDisabled = value;
    }
    /**
     * Sets the chooseYourLockScreenDisabled property value. Indicates if iCloud Documents and Desktop screen is disabled
     * @param value Value to set for the chooseYourLockScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChooseYourLockScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this._chooseYourLockScreenDisabled = value;
    }
    /**
     * Sets the dontAutoPopulatePrimaryAccountInfo property value. Indicates whether Setup Assistant will auto populate the primary account information
     * @param value Value to set for the dontAutoPopulatePrimaryAccountInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDontAutoPopulatePrimaryAccountInfo(@javax.annotation.Nullable final Boolean value) {
        this._dontAutoPopulatePrimaryAccountInfo = value;
    }
    /**
     * Sets the enableRestrictEditing property value. Indicates whether the user will enable blockediting
     * @param value Value to set for the enableRestrictEditing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableRestrictEditing(@javax.annotation.Nullable final Boolean value) {
        this._enableRestrictEditing = value;
    }
    /**
     * Sets the fileVaultDisabled property value. Indicates if file vault is disabled
     * @param value Value to set for the fileVaultDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileVaultDisabled(@javax.annotation.Nullable final Boolean value) {
        this._fileVaultDisabled = value;
    }
    /**
     * Sets the iCloudDiagnosticsDisabled property value. Indicates if iCloud Analytics screen is disabled
     * @param value Value to set for the iCloudDiagnosticsDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudDiagnosticsDisabled(@javax.annotation.Nullable final Boolean value) {
        this._iCloudDiagnosticsDisabled = value;
    }
    /**
     * Sets the iCloudStorageDisabled property value. Indicates if iCloud Documents and Desktop screen is disabled
     * @param value Value to set for the iCloudStorageDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudStorageDisabled(@javax.annotation.Nullable final Boolean value) {
        this._iCloudStorageDisabled = value;
    }
    /**
     * Sets the isLocalPrimaryAccount property value. Indicates whether the profile is a local account
     * @param value Value to set for the isLocalPrimaryAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsLocalPrimaryAccount(@javax.annotation.Nullable final Boolean value) {
        this._isLocalPrimaryAccount = value;
    }
    /**
     * Sets the isPrimaryUser property value. Indicates whether the profile is a primary user
     * @param value Value to set for the isPrimaryUser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsPrimaryUser(@javax.annotation.Nullable final Boolean value) {
        this._isPrimaryUser = value;
    }
    /**
     * Sets the lockPrimaryAccountInfo property value. Indicates whether the primary account information will be locked
     * @param value Value to set for the lockPrimaryAccountInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockPrimaryAccountInfo(@javax.annotation.Nullable final Boolean value) {
        this._lockPrimaryAccountInfo = value;
    }
    /**
     * Sets the managedLocalUserShortName property value. Indicates whether or not this is the short name of the local account to manage
     * @param value Value to set for the managedLocalUserShortName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedLocalUserShortName(@javax.annotation.Nullable final Boolean value) {
        this._managedLocalUserShortName = value;
    }
    /**
     * Sets the passCodeDisabled property value. Indicates if Passcode setup pane is disabled
     * @param value Value to set for the passCodeDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPassCodeDisabled(@javax.annotation.Nullable final Boolean value) {
        this._passCodeDisabled = value;
    }
    /**
     * Sets the prefillAccountInfo property value. Indicates whether the user will prefill their account info
     * @param value Value to set for the prefillAccountInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrefillAccountInfo(@javax.annotation.Nullable final Boolean value) {
        this._prefillAccountInfo = value;
    }
    /**
     * Sets the primaryAccountFullName property value. Indicates what the full name for the primary account is
     * @param value Value to set for the primaryAccountFullName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimaryAccountFullName(@javax.annotation.Nullable final String value) {
        this._primaryAccountFullName = value;
    }
    /**
     * Sets the primaryAccountUserName property value. Indicates what the account name for the primary account is
     * @param value Value to set for the primaryAccountUserName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimaryAccountUserName(@javax.annotation.Nullable final String value) {
        this._primaryAccountUserName = value;
    }
    /**
     * Sets the primaryUser property value. Indicates who the primary user of the profile is
     * @param value Value to set for the primaryUser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimaryUser(@javax.annotation.Nullable final String value) {
        this._primaryUser = value;
    }
    /**
     * Sets the primaryUserFullName property value. Indicates who the primary user of the profile is
     * @param value Value to set for the primaryUserFullName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimaryUserFullName(@javax.annotation.Nullable final String value) {
        this._primaryUserFullName = value;
    }
    /**
     * Sets the registrationDisabled property value. Indicates if registration is disabled
     * @param value Value to set for the registrationDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistrationDisabled(@javax.annotation.Nullable final Boolean value) {
        this._registrationDisabled = value;
    }
    /**
     * Sets the requestRequiresNetworkTether property value. Indicates if the device is network-tethered to run the command
     * @param value Value to set for the requestRequiresNetworkTether property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestRequiresNetworkTether(@javax.annotation.Nullable final Boolean value) {
        this._requestRequiresNetworkTether = value;
    }
    /**
     * Sets the setPrimarySetupAccountAsRegularUser property value. Indicates whether Setup Assistant will set the account as a regular user
     * @param value Value to set for the setPrimarySetupAccountAsRegularUser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSetPrimarySetupAccountAsRegularUser(@javax.annotation.Nullable final Boolean value) {
        this._setPrimarySetupAccountAsRegularUser = value;
    }
    /**
     * Sets the skipPrimarySetupAccountCreation property value. Indicates whether Setup Assistant will skip the user interface for primary account setup
     * @param value Value to set for the skipPrimarySetupAccountCreation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkipPrimarySetupAccountCreation(@javax.annotation.Nullable final Boolean value) {
        this._skipPrimarySetupAccountCreation = value;
    }
    /**
     * Sets the zoomDisabled property value. Indicates if zoom setup pane is disabled
     * @param value Value to set for the zoomDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setZoomDisabled(@javax.annotation.Nullable final Boolean value) {
        this._zoomDisabled = value;
    }
}
