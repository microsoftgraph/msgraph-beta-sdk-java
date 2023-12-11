package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The DepMacOSEnrollmentProfile resource represents an Apple Device Enrollment Program (DEP) enrollment profile specific to macOS configuration. This type of profile must be assigned to Apple DEP serial numbers before the corresponding devices can enroll via DEP.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DepMacOSEnrollmentProfile extends DepEnrollmentBaseProfile implements Parsable {
    /**
     * Instantiates a new DepMacOSEnrollmentProfile and sets the default values.
     */
    public DepMacOSEnrollmentProfile() {
        super();
        this.setOdataType("#microsoft.graph.depMacOSEnrollmentProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DepMacOSEnrollmentProfile
     */
    @jakarta.annotation.Nonnull
    public static DepMacOSEnrollmentProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DepMacOSEnrollmentProfile();
    }
    /**
     * Gets the accessibilityScreenDisabled property value. Indicates if Accessibility screen is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAccessibilityScreenDisabled() {
        return this.backingStore.get("accessibilityScreenDisabled");
    }
    /**
     * Gets the adminAccountFullName property value. Indicates what the full name for the admin account is
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAdminAccountFullName() {
        return this.backingStore.get("adminAccountFullName");
    }
    /**
     * Gets the adminAccountPassword property value. Indicates what the password for the admin account is
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAdminAccountPassword() {
        return this.backingStore.get("adminAccountPassword");
    }
    /**
     * Gets the adminAccountUserName property value. Indicates what the user name for the admin account is
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAdminAccountUserName() {
        return this.backingStore.get("adminAccountUserName");
    }
    /**
     * Gets the autoAdvanceSetupEnabled property value. Indicates if Setup Assistant will automatically advance through its screen
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoAdvanceSetupEnabled() {
        return this.backingStore.get("autoAdvanceSetupEnabled");
    }
    /**
     * Gets the autoUnlockWithWatchDisabled property value. Indicates if UnlockWithWatch screen is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoUnlockWithWatchDisabled() {
        return this.backingStore.get("autoUnlockWithWatchDisabled");
    }
    /**
     * Gets the chooseYourLockScreenDisabled property value. Indicates if iCloud Documents and Desktop screen is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getChooseYourLockScreenDisabled() {
        return this.backingStore.get("chooseYourLockScreenDisabled");
    }
    /**
     * Gets the dontAutoPopulatePrimaryAccountInfo property value. Indicates whether Setup Assistant will auto populate the primary account information
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDontAutoPopulatePrimaryAccountInfo() {
        return this.backingStore.get("dontAutoPopulatePrimaryAccountInfo");
    }
    /**
     * Gets the enableRestrictEditing property value. Indicates whether the user will enable blockediting
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableRestrictEditing() {
        return this.backingStore.get("enableRestrictEditing");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessibilityScreenDisabled", (n) -> { this.setAccessibilityScreenDisabled(n.getBooleanValue()); });
        deserializerMap.put("adminAccountFullName", (n) -> { this.setAdminAccountFullName(n.getStringValue()); });
        deserializerMap.put("adminAccountPassword", (n) -> { this.setAdminAccountPassword(n.getStringValue()); });
        deserializerMap.put("adminAccountUserName", (n) -> { this.setAdminAccountUserName(n.getStringValue()); });
        deserializerMap.put("autoAdvanceSetupEnabled", (n) -> { this.setAutoAdvanceSetupEnabled(n.getBooleanValue()); });
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
        deserializerMap.put("requestRequiresNetworkTether", (n) -> { this.setRequestRequiresNetworkTether(n.getBooleanValue()); });
        deserializerMap.put("setPrimarySetupAccountAsRegularUser", (n) -> { this.setSetPrimarySetupAccountAsRegularUser(n.getBooleanValue()); });
        deserializerMap.put("skipPrimarySetupAccountCreation", (n) -> { this.setSkipPrimarySetupAccountCreation(n.getBooleanValue()); });
        deserializerMap.put("zoomDisabled", (n) -> { this.setZoomDisabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileVaultDisabled property value. Indicates if file vault is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFileVaultDisabled() {
        return this.backingStore.get("fileVaultDisabled");
    }
    /**
     * Gets the hideAdminAccount property value. Indicates whether the admin account should be hidded or not
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHideAdminAccount() {
        return this.backingStore.get("hideAdminAccount");
    }
    /**
     * Gets the iCloudDiagnosticsDisabled property value. Indicates if iCloud Analytics screen is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudDiagnosticsDisabled() {
        return this.backingStore.get("iCloudDiagnosticsDisabled");
    }
    /**
     * Gets the iCloudStorageDisabled property value. Indicates if iCloud Documents and Desktop screen is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudStorageDisabled() {
        return this.backingStore.get("iCloudStorageDisabled");
    }
    /**
     * Gets the passCodeDisabled property value. Indicates if Passcode setup pane is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPassCodeDisabled() {
        return this.backingStore.get("passCodeDisabled");
    }
    /**
     * Gets the primaryAccountFullName property value. Indicates what the full name for the primary account is
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrimaryAccountFullName() {
        return this.backingStore.get("primaryAccountFullName");
    }
    /**
     * Gets the primaryAccountUserName property value. Indicates what the account name for the primary account is
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrimaryAccountUserName() {
        return this.backingStore.get("primaryAccountUserName");
    }
    /**
     * Gets the registrationDisabled property value. Indicates if registration is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRegistrationDisabled() {
        return this.backingStore.get("registrationDisabled");
    }
    /**
     * Gets the requestRequiresNetworkTether property value. Indicates if the device is network-tethered to run the command
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequestRequiresNetworkTether() {
        return this.backingStore.get("requestRequiresNetworkTether");
    }
    /**
     * Gets the setPrimarySetupAccountAsRegularUser property value. Indicates whether Setup Assistant will set the account as a regular user
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSetPrimarySetupAccountAsRegularUser() {
        return this.backingStore.get("setPrimarySetupAccountAsRegularUser");
    }
    /**
     * Gets the skipPrimarySetupAccountCreation property value. Indicates whether Setup Assistant will skip the user interface for primary account setup
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSkipPrimarySetupAccountCreation() {
        return this.backingStore.get("skipPrimarySetupAccountCreation");
    }
    /**
     * Gets the zoomDisabled property value. Indicates if zoom setup pane is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getZoomDisabled() {
        return this.backingStore.get("zoomDisabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("accessibilityScreenDisabled", this.getAccessibilityScreenDisabled());
        writer.writeStringValue("adminAccountFullName", this.getAdminAccountFullName());
        writer.writeStringValue("adminAccountPassword", this.getAdminAccountPassword());
        writer.writeStringValue("adminAccountUserName", this.getAdminAccountUserName());
        writer.writeBooleanValue("autoAdvanceSetupEnabled", this.getAutoAdvanceSetupEnabled());
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
        writer.writeBooleanValue("requestRequiresNetworkTether", this.getRequestRequiresNetworkTether());
        writer.writeBooleanValue("setPrimarySetupAccountAsRegularUser", this.getSetPrimarySetupAccountAsRegularUser());
        writer.writeBooleanValue("skipPrimarySetupAccountCreation", this.getSkipPrimarySetupAccountCreation());
        writer.writeBooleanValue("zoomDisabled", this.getZoomDisabled());
    }
    /**
     * Sets the accessibilityScreenDisabled property value. Indicates if Accessibility screen is disabled
     * @param value Value to set for the accessibilityScreenDisabled property.
     */
    public void setAccessibilityScreenDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("accessibilityScreenDisabled", value);
    }
    /**
     * Sets the adminAccountFullName property value. Indicates what the full name for the admin account is
     * @param value Value to set for the adminAccountFullName property.
     */
    public void setAdminAccountFullName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("adminAccountFullName", value);
    }
    /**
     * Sets the adminAccountPassword property value. Indicates what the password for the admin account is
     * @param value Value to set for the adminAccountPassword property.
     */
    public void setAdminAccountPassword(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("adminAccountPassword", value);
    }
    /**
     * Sets the adminAccountUserName property value. Indicates what the user name for the admin account is
     * @param value Value to set for the adminAccountUserName property.
     */
    public void setAdminAccountUserName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("adminAccountUserName", value);
    }
    /**
     * Sets the autoAdvanceSetupEnabled property value. Indicates if Setup Assistant will automatically advance through its screen
     * @param value Value to set for the autoAdvanceSetupEnabled property.
     */
    public void setAutoAdvanceSetupEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("autoAdvanceSetupEnabled", value);
    }
    /**
     * Sets the autoUnlockWithWatchDisabled property value. Indicates if UnlockWithWatch screen is disabled
     * @param value Value to set for the autoUnlockWithWatchDisabled property.
     */
    public void setAutoUnlockWithWatchDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("autoUnlockWithWatchDisabled", value);
    }
    /**
     * Sets the chooseYourLockScreenDisabled property value. Indicates if iCloud Documents and Desktop screen is disabled
     * @param value Value to set for the chooseYourLockScreenDisabled property.
     */
    public void setChooseYourLockScreenDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("chooseYourLockScreenDisabled", value);
    }
    /**
     * Sets the dontAutoPopulatePrimaryAccountInfo property value. Indicates whether Setup Assistant will auto populate the primary account information
     * @param value Value to set for the dontAutoPopulatePrimaryAccountInfo property.
     */
    public void setDontAutoPopulatePrimaryAccountInfo(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("dontAutoPopulatePrimaryAccountInfo", value);
    }
    /**
     * Sets the enableRestrictEditing property value. Indicates whether the user will enable blockediting
     * @param value Value to set for the enableRestrictEditing property.
     */
    public void setEnableRestrictEditing(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableRestrictEditing", value);
    }
    /**
     * Sets the fileVaultDisabled property value. Indicates if file vault is disabled
     * @param value Value to set for the fileVaultDisabled property.
     */
    public void setFileVaultDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("fileVaultDisabled", value);
    }
    /**
     * Sets the hideAdminAccount property value. Indicates whether the admin account should be hidded or not
     * @param value Value to set for the hideAdminAccount property.
     */
    public void setHideAdminAccount(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hideAdminAccount", value);
    }
    /**
     * Sets the iCloudDiagnosticsDisabled property value. Indicates if iCloud Analytics screen is disabled
     * @param value Value to set for the iCloudDiagnosticsDisabled property.
     */
    public void setICloudDiagnosticsDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iCloudDiagnosticsDisabled", value);
    }
    /**
     * Sets the iCloudStorageDisabled property value. Indicates if iCloud Documents and Desktop screen is disabled
     * @param value Value to set for the iCloudStorageDisabled property.
     */
    public void setICloudStorageDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iCloudStorageDisabled", value);
    }
    /**
     * Sets the passCodeDisabled property value. Indicates if Passcode setup pane is disabled
     * @param value Value to set for the passCodeDisabled property.
     */
    public void setPassCodeDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passCodeDisabled", value);
    }
    /**
     * Sets the primaryAccountFullName property value. Indicates what the full name for the primary account is
     * @param value Value to set for the primaryAccountFullName property.
     */
    public void setPrimaryAccountFullName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("primaryAccountFullName", value);
    }
    /**
     * Sets the primaryAccountUserName property value. Indicates what the account name for the primary account is
     * @param value Value to set for the primaryAccountUserName property.
     */
    public void setPrimaryAccountUserName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("primaryAccountUserName", value);
    }
    /**
     * Sets the registrationDisabled property value. Indicates if registration is disabled
     * @param value Value to set for the registrationDisabled property.
     */
    public void setRegistrationDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("registrationDisabled", value);
    }
    /**
     * Sets the requestRequiresNetworkTether property value. Indicates if the device is network-tethered to run the command
     * @param value Value to set for the requestRequiresNetworkTether property.
     */
    public void setRequestRequiresNetworkTether(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("requestRequiresNetworkTether", value);
    }
    /**
     * Sets the setPrimarySetupAccountAsRegularUser property value. Indicates whether Setup Assistant will set the account as a regular user
     * @param value Value to set for the setPrimarySetupAccountAsRegularUser property.
     */
    public void setSetPrimarySetupAccountAsRegularUser(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("setPrimarySetupAccountAsRegularUser", value);
    }
    /**
     * Sets the skipPrimarySetupAccountCreation property value. Indicates whether Setup Assistant will skip the user interface for primary account setup
     * @param value Value to set for the skipPrimarySetupAccountCreation property.
     */
    public void setSkipPrimarySetupAccountCreation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("skipPrimarySetupAccountCreation", value);
    }
    /**
     * Sets the zoomDisabled property value. Indicates if zoom setup pane is disabled
     * @param value Value to set for the zoomDisabled property.
     */
    public void setZoomDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("zoomDisabled", value);
    }
}
