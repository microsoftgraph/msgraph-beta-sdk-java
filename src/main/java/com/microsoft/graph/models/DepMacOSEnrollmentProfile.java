package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DepMacOSEnrollmentProfile extends DepEnrollmentBaseProfile implements Parsable {
    /** Indicates if Accessibility screen is disabled */
    private Boolean accessibilityScreenDisabled;
    /** Indicates what the full name for the admin account is */
    private String adminAccountFullName;
    /** Indicates what the password for the admin account is */
    private String adminAccountPassword;
    /** Indicates what the user name for the admin account is */
    private String adminAccountUserName;
    /** Indicates if UnlockWithWatch screen is disabled */
    private Boolean autoUnlockWithWatchDisabled;
    /** Indicates if iCloud Documents and Desktop screen is disabled */
    private Boolean chooseYourLockScreenDisabled;
    /** Indicates whether Setup Assistant will auto populate the primary account information */
    private Boolean dontAutoPopulatePrimaryAccountInfo;
    /** Indicates whether the user will enable blockediting */
    private Boolean enableRestrictEditing;
    /** Indicates if file vault is disabled */
    private Boolean fileVaultDisabled;
    /** Indicates whether the admin account should be hidded or not */
    private Boolean hideAdminAccount;
    /** Indicates if iCloud Analytics screen is disabled */
    private Boolean iCloudDiagnosticsDisabled;
    /** Indicates if iCloud Documents and Desktop screen is disabled */
    private Boolean iCloudStorageDisabled;
    /** Indicates if Passcode setup pane is disabled */
    private Boolean passCodeDisabled;
    /** Indicates what the full name for the primary account is */
    private String primaryAccountFullName;
    /** Indicates what the account name for the primary account is */
    private String primaryAccountUserName;
    /** Indicates if registration is disabled */
    private Boolean registrationDisabled;
    /** Indicates whether Setup Assistant will set the account as a regular user */
    private Boolean setPrimarySetupAccountAsRegularUser;
    /** Indicates whether Setup Assistant will skip the user interface for primary account setup */
    private Boolean skipPrimarySetupAccountCreation;
    /** Indicates if zoom setup pane is disabled */
    private Boolean zoomDisabled;
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
        return this.accessibilityScreenDisabled;
    }
    /**
     * Gets the adminAccountFullName property value. Indicates what the full name for the admin account is
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdminAccountFullName() {
        return this.adminAccountFullName;
    }
    /**
     * Gets the adminAccountPassword property value. Indicates what the password for the admin account is
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdminAccountPassword() {
        return this.adminAccountPassword;
    }
    /**
     * Gets the adminAccountUserName property value. Indicates what the user name for the admin account is
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdminAccountUserName() {
        return this.adminAccountUserName;
    }
    /**
     * Gets the autoUnlockWithWatchDisabled property value. Indicates if UnlockWithWatch screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAutoUnlockWithWatchDisabled() {
        return this.autoUnlockWithWatchDisabled;
    }
    /**
     * Gets the chooseYourLockScreenDisabled property value. Indicates if iCloud Documents and Desktop screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getChooseYourLockScreenDisabled() {
        return this.chooseYourLockScreenDisabled;
    }
    /**
     * Gets the dontAutoPopulatePrimaryAccountInfo property value. Indicates whether Setup Assistant will auto populate the primary account information
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDontAutoPopulatePrimaryAccountInfo() {
        return this.dontAutoPopulatePrimaryAccountInfo;
    }
    /**
     * Gets the enableRestrictEditing property value. Indicates whether the user will enable blockediting
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableRestrictEditing() {
        return this.enableRestrictEditing;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessibilityScreenDisabled", (n) -> { this.setAccessibilityScreenDisabled(n.getBooleanValue()); });
        deserializerMap.put("adminAccountFullName", (n) -> { this.setAdminAccountFullName(n.getStringValue()); });
        deserializerMap.put("adminAccountPassword", (n) -> { this.setAdminAccountPassword(n.getStringValue()); });
        deserializerMap.put("adminAccountUserName", (n) -> { this.setAdminAccountUserName(n.getStringValue()); });
        deserializerMap.put("autoUnlockWithWatchDisabled", (n) -> { this.setAutoUnlockWithWatchDisabled(n.getBooleanValue()); });
        deserializerMap.put("chooseYourLockScreenDisabled", (n) -> { this.setChooseYourLockScreenDisabled(n.getBooleanValue()); });
        deserializerMap.put("dontAutoPopulatePrimaryAccountInfo", (n) -> { this.setDontAutoPopulatePrimaryAccountInfo(n.getBooleanValue()); });
        deserializerMap.put("enableRestrictEditing", (n) -> { this.setEnableRestrictEditing(n.getBooleanValue()); });
        deserializerMap.put("fileVaultDisabled", (n) -> { this.setFileVaultDisabled(n.getBooleanValue()); });
        deserializerMap.put("hideAdminAccount", (n) -> { this.setHideAdminAccount(n.getBooleanValue()); });
        deserializerMap.put("iCloudDiagnosticsDisabled", (n) -> { this.setICloudDiagnosticsDisabled(n.getBooleanValue()); });
        deserializerMap.put("iCloudStorageDisabled", (n) -> { this.setICloudStorageDisabled(n.getBooleanValue()); });
        deserializerMap.put("passCodeDisabled", (n) -> { this.setPassCodeDisabled(n.getBooleanValue()); });
        deserializerMap.put("primaryAccountFullName", (n) -> { this.setPrimaryAccountFullName(n.getStringValue()); });
        deserializerMap.put("primaryAccountUserName", (n) -> { this.setPrimaryAccountUserName(n.getStringValue()); });
        deserializerMap.put("registrationDisabled", (n) -> { this.setRegistrationDisabled(n.getBooleanValue()); });
        deserializerMap.put("setPrimarySetupAccountAsRegularUser", (n) -> { this.setSetPrimarySetupAccountAsRegularUser(n.getBooleanValue()); });
        deserializerMap.put("skipPrimarySetupAccountCreation", (n) -> { this.setSkipPrimarySetupAccountCreation(n.getBooleanValue()); });
        deserializerMap.put("zoomDisabled", (n) -> { this.setZoomDisabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileVaultDisabled property value. Indicates if file vault is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFileVaultDisabled() {
        return this.fileVaultDisabled;
    }
    /**
     * Gets the hideAdminAccount property value. Indicates whether the admin account should be hidded or not
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHideAdminAccount() {
        return this.hideAdminAccount;
    }
    /**
     * Gets the iCloudDiagnosticsDisabled property value. Indicates if iCloud Analytics screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudDiagnosticsDisabled() {
        return this.iCloudDiagnosticsDisabled;
    }
    /**
     * Gets the iCloudStorageDisabled property value. Indicates if iCloud Documents and Desktop screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getICloudStorageDisabled() {
        return this.iCloudStorageDisabled;
    }
    /**
     * Gets the passCodeDisabled property value. Indicates if Passcode setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPassCodeDisabled() {
        return this.passCodeDisabled;
    }
    /**
     * Gets the primaryAccountFullName property value. Indicates what the full name for the primary account is
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrimaryAccountFullName() {
        return this.primaryAccountFullName;
    }
    /**
     * Gets the primaryAccountUserName property value. Indicates what the account name for the primary account is
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrimaryAccountUserName() {
        return this.primaryAccountUserName;
    }
    /**
     * Gets the registrationDisabled property value. Indicates if registration is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRegistrationDisabled() {
        return this.registrationDisabled;
    }
    /**
     * Gets the setPrimarySetupAccountAsRegularUser property value. Indicates whether Setup Assistant will set the account as a regular user
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSetPrimarySetupAccountAsRegularUser() {
        return this.setPrimarySetupAccountAsRegularUser;
    }
    /**
     * Gets the skipPrimarySetupAccountCreation property value. Indicates whether Setup Assistant will skip the user interface for primary account setup
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSkipPrimarySetupAccountCreation() {
        return this.skipPrimarySetupAccountCreation;
    }
    /**
     * Gets the zoomDisabled property value. Indicates if zoom setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getZoomDisabled() {
        return this.zoomDisabled;
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
        writer.writeStringValue("adminAccountFullName", this.getAdminAccountFullName());
        writer.writeStringValue("adminAccountPassword", this.getAdminAccountPassword());
        writer.writeStringValue("adminAccountUserName", this.getAdminAccountUserName());
        writer.writeBooleanValue("autoUnlockWithWatchDisabled", this.getAutoUnlockWithWatchDisabled());
        writer.writeBooleanValue("chooseYourLockScreenDisabled", this.getChooseYourLockScreenDisabled());
        writer.writeBooleanValue("dontAutoPopulatePrimaryAccountInfo", this.getDontAutoPopulatePrimaryAccountInfo());
        writer.writeBooleanValue("enableRestrictEditing", this.getEnableRestrictEditing());
        writer.writeBooleanValue("fileVaultDisabled", this.getFileVaultDisabled());
        writer.writeBooleanValue("hideAdminAccount", this.getHideAdminAccount());
        writer.writeBooleanValue("iCloudDiagnosticsDisabled", this.getICloudDiagnosticsDisabled());
        writer.writeBooleanValue("iCloudStorageDisabled", this.getICloudStorageDisabled());
        writer.writeBooleanValue("passCodeDisabled", this.getPassCodeDisabled());
        writer.writeStringValue("primaryAccountFullName", this.getPrimaryAccountFullName());
        writer.writeStringValue("primaryAccountUserName", this.getPrimaryAccountUserName());
        writer.writeBooleanValue("registrationDisabled", this.getRegistrationDisabled());
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
        this.accessibilityScreenDisabled = value;
    }
    /**
     * Sets the adminAccountFullName property value. Indicates what the full name for the admin account is
     * @param value Value to set for the adminAccountFullName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdminAccountFullName(@javax.annotation.Nullable final String value) {
        this.adminAccountFullName = value;
    }
    /**
     * Sets the adminAccountPassword property value. Indicates what the password for the admin account is
     * @param value Value to set for the adminAccountPassword property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdminAccountPassword(@javax.annotation.Nullable final String value) {
        this.adminAccountPassword = value;
    }
    /**
     * Sets the adminAccountUserName property value. Indicates what the user name for the admin account is
     * @param value Value to set for the adminAccountUserName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdminAccountUserName(@javax.annotation.Nullable final String value) {
        this.adminAccountUserName = value;
    }
    /**
     * Sets the autoUnlockWithWatchDisabled property value. Indicates if UnlockWithWatch screen is disabled
     * @param value Value to set for the autoUnlockWithWatchDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutoUnlockWithWatchDisabled(@javax.annotation.Nullable final Boolean value) {
        this.autoUnlockWithWatchDisabled = value;
    }
    /**
     * Sets the chooseYourLockScreenDisabled property value. Indicates if iCloud Documents and Desktop screen is disabled
     * @param value Value to set for the chooseYourLockScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChooseYourLockScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this.chooseYourLockScreenDisabled = value;
    }
    /**
     * Sets the dontAutoPopulatePrimaryAccountInfo property value. Indicates whether Setup Assistant will auto populate the primary account information
     * @param value Value to set for the dontAutoPopulatePrimaryAccountInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDontAutoPopulatePrimaryAccountInfo(@javax.annotation.Nullable final Boolean value) {
        this.dontAutoPopulatePrimaryAccountInfo = value;
    }
    /**
     * Sets the enableRestrictEditing property value. Indicates whether the user will enable blockediting
     * @param value Value to set for the enableRestrictEditing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableRestrictEditing(@javax.annotation.Nullable final Boolean value) {
        this.enableRestrictEditing = value;
    }
    /**
     * Sets the fileVaultDisabled property value. Indicates if file vault is disabled
     * @param value Value to set for the fileVaultDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileVaultDisabled(@javax.annotation.Nullable final Boolean value) {
        this.fileVaultDisabled = value;
    }
    /**
     * Sets the hideAdminAccount property value. Indicates whether the admin account should be hidded or not
     * @param value Value to set for the hideAdminAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHideAdminAccount(@javax.annotation.Nullable final Boolean value) {
        this.hideAdminAccount = value;
    }
    /**
     * Sets the iCloudDiagnosticsDisabled property value. Indicates if iCloud Analytics screen is disabled
     * @param value Value to set for the iCloudDiagnosticsDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudDiagnosticsDisabled(@javax.annotation.Nullable final Boolean value) {
        this.iCloudDiagnosticsDisabled = value;
    }
    /**
     * Sets the iCloudStorageDisabled property value. Indicates if iCloud Documents and Desktop screen is disabled
     * @param value Value to set for the iCloudStorageDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setICloudStorageDisabled(@javax.annotation.Nullable final Boolean value) {
        this.iCloudStorageDisabled = value;
    }
    /**
     * Sets the passCodeDisabled property value. Indicates if Passcode setup pane is disabled
     * @param value Value to set for the passCodeDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPassCodeDisabled(@javax.annotation.Nullable final Boolean value) {
        this.passCodeDisabled = value;
    }
    /**
     * Sets the primaryAccountFullName property value. Indicates what the full name for the primary account is
     * @param value Value to set for the primaryAccountFullName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimaryAccountFullName(@javax.annotation.Nullable final String value) {
        this.primaryAccountFullName = value;
    }
    /**
     * Sets the primaryAccountUserName property value. Indicates what the account name for the primary account is
     * @param value Value to set for the primaryAccountUserName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimaryAccountUserName(@javax.annotation.Nullable final String value) {
        this.primaryAccountUserName = value;
    }
    /**
     * Sets the registrationDisabled property value. Indicates if registration is disabled
     * @param value Value to set for the registrationDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistrationDisabled(@javax.annotation.Nullable final Boolean value) {
        this.registrationDisabled = value;
    }
    /**
     * Sets the setPrimarySetupAccountAsRegularUser property value. Indicates whether Setup Assistant will set the account as a regular user
     * @param value Value to set for the setPrimarySetupAccountAsRegularUser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSetPrimarySetupAccountAsRegularUser(@javax.annotation.Nullable final Boolean value) {
        this.setPrimarySetupAccountAsRegularUser = value;
    }
    /**
     * Sets the skipPrimarySetupAccountCreation property value. Indicates whether Setup Assistant will skip the user interface for primary account setup
     * @param value Value to set for the skipPrimarySetupAccountCreation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkipPrimarySetupAccountCreation(@javax.annotation.Nullable final Boolean value) {
        this.skipPrimarySetupAccountCreation = value;
    }
    /**
     * Sets the zoomDisabled property value. Indicates if zoom setup pane is disabled
     * @param value Value to set for the zoomDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setZoomDisabled(@javax.annotation.Nullable final Boolean value) {
        this.zoomDisabled = value;
    }
}
