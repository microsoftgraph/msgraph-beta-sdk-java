package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This topic provides descriptions of the declared methods, properties and relationships exposed by the sharedPCConfiguration resource.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharedPCConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new SharedPCConfiguration and sets the default values.
     */
    public SharedPCConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.sharedPCConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SharedPCConfiguration
     */
    @jakarta.annotation.Nonnull
    public static SharedPCConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharedPCConfiguration();
    }
    /**
     * Gets the accountManagerPolicy property value. Specifies how accounts are managed on a shared PC. Only applies when disableAccountManager is false.
     * @return a SharedPCAccountManagerPolicy
     */
    @jakarta.annotation.Nullable
    public SharedPCAccountManagerPolicy getAccountManagerPolicy() {
        return this.BackingStore.get("accountManagerPolicy");
    }
    /**
     * Gets the allowedAccounts property value. Type of accounts that are allowed to share the PC.
     * @return a EnumSet<SharedPCAllowedAccountType>
     */
    @jakarta.annotation.Nullable
    public EnumSet<SharedPCAllowedAccountType> getAllowedAccounts() {
        return this.BackingStore.get("allowedAccounts");
    }
    /**
     * Gets the allowLocalStorage property value. Specifies whether local storage is allowed on a shared PC.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowLocalStorage() {
        return this.BackingStore.get("allowLocalStorage");
    }
    /**
     * Gets the disableAccountManager property value. Disables the account manager for shared PC mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableAccountManager() {
        return this.BackingStore.get("disableAccountManager");
    }
    /**
     * Gets the disableEduPolicies property value. Specifies whether the default shared PC education environment policies should be disabled. For Windows 10 RS2 and later, this policy will be applied without setting Enabled to true.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableEduPolicies() {
        return this.BackingStore.get("disableEduPolicies");
    }
    /**
     * Gets the disablePowerPolicies property value. Specifies whether the default shared PC power policies should be disabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisablePowerPolicies() {
        return this.BackingStore.get("disablePowerPolicies");
    }
    /**
     * Gets the disableSignInOnResume property value. Disables the requirement to sign in whenever the device wakes up from sleep mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableSignInOnResume() {
        return this.BackingStore.get("disableSignInOnResume");
    }
    /**
     * Gets the enabled property value. Enables shared PC mode and applies the shared pc policies.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.BackingStore.get("enabled");
    }
    /**
     * Gets the fastFirstSignIn property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getFastFirstSignIn() {
        return this.BackingStore.get("fastFirstSignIn");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountManagerPolicy", (n) -> { this.setAccountManagerPolicy(n.getObjectValue(SharedPCAccountManagerPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("allowedAccounts", (n) -> { this.setAllowedAccounts(n.getEnumSetValue(SharedPCAllowedAccountType.class)); });
        deserializerMap.put("allowLocalStorage", (n) -> { this.setAllowLocalStorage(n.getBooleanValue()); });
        deserializerMap.put("disableAccountManager", (n) -> { this.setDisableAccountManager(n.getBooleanValue()); });
        deserializerMap.put("disableEduPolicies", (n) -> { this.setDisableEduPolicies(n.getBooleanValue()); });
        deserializerMap.put("disablePowerPolicies", (n) -> { this.setDisablePowerPolicies(n.getBooleanValue()); });
        deserializerMap.put("disableSignInOnResume", (n) -> { this.setDisableSignInOnResume(n.getBooleanValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("fastFirstSignIn", (n) -> { this.setFastFirstSignIn(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("idleTimeBeforeSleepInSeconds", (n) -> { this.setIdleTimeBeforeSleepInSeconds(n.getIntegerValue()); });
        deserializerMap.put("kioskAppDisplayName", (n) -> { this.setKioskAppDisplayName(n.getStringValue()); });
        deserializerMap.put("kioskAppUserModelId", (n) -> { this.setKioskAppUserModelId(n.getStringValue()); });
        deserializerMap.put("localStorage", (n) -> { this.setLocalStorage(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("maintenanceStartTime", (n) -> { this.setMaintenanceStartTime(n.getLocalTimeValue()); });
        deserializerMap.put("setAccountManager", (n) -> { this.setSetAccountManager(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("setEduPolicies", (n) -> { this.setSetEduPolicies(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("setPowerPolicies", (n) -> { this.setSetPowerPolicies(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("signInOnResume", (n) -> { this.setSignInOnResume(n.getEnumValue(Enablement.class)); });
        return deserializerMap;
    }
    /**
     * Gets the idleTimeBeforeSleepInSeconds property value. Specifies the time in seconds that a device must sit idle before the PC goes to sleep. Setting this value to 0 prevents the sleep timeout from occurring.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIdleTimeBeforeSleepInSeconds() {
        return this.BackingStore.get("idleTimeBeforeSleepInSeconds");
    }
    /**
     * Gets the kioskAppDisplayName property value. Specifies the display text for the account shown on the sign-in screen which launches the app specified by SetKioskAppUserModelId. Only applies when KioskAppUserModelId is set.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKioskAppDisplayName() {
        return this.BackingStore.get("kioskAppDisplayName");
    }
    /**
     * Gets the kioskAppUserModelId property value. Specifies the application user model ID of the app to use with assigned access.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKioskAppUserModelId() {
        return this.BackingStore.get("kioskAppUserModelId");
    }
    /**
     * Gets the localStorage property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getLocalStorage() {
        return this.BackingStore.get("localStorage");
    }
    /**
     * Gets the maintenanceStartTime property value. Specifies the daily start time of maintenance hour.
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getMaintenanceStartTime() {
        return this.BackingStore.get("maintenanceStartTime");
    }
    /**
     * Gets the setAccountManager property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getSetAccountManager() {
        return this.BackingStore.get("setAccountManager");
    }
    /**
     * Gets the setEduPolicies property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getSetEduPolicies() {
        return this.BackingStore.get("setEduPolicies");
    }
    /**
     * Gets the setPowerPolicies property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getSetPowerPolicies() {
        return this.BackingStore.get("setPowerPolicies");
    }
    /**
     * Gets the signInOnResume property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getSignInOnResume() {
        return this.BackingStore.get("signInOnResume");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("accountManagerPolicy", this.getAccountManagerPolicy());
        writer.writeEnumSetValue("allowedAccounts", this.getAllowedAccounts());
        writer.writeBooleanValue("allowLocalStorage", this.getAllowLocalStorage());
        writer.writeBooleanValue("disableAccountManager", this.getDisableAccountManager());
        writer.writeBooleanValue("disableEduPolicies", this.getDisableEduPolicies());
        writer.writeBooleanValue("disablePowerPolicies", this.getDisablePowerPolicies());
        writer.writeBooleanValue("disableSignInOnResume", this.getDisableSignInOnResume());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeEnumValue("fastFirstSignIn", this.getFastFirstSignIn());
        writer.writeIntegerValue("idleTimeBeforeSleepInSeconds", this.getIdleTimeBeforeSleepInSeconds());
        writer.writeStringValue("kioskAppDisplayName", this.getKioskAppDisplayName());
        writer.writeStringValue("kioskAppUserModelId", this.getKioskAppUserModelId());
        writer.writeEnumValue("localStorage", this.getLocalStorage());
        writer.writeLocalTimeValue("maintenanceStartTime", this.getMaintenanceStartTime());
        writer.writeEnumValue("setAccountManager", this.getSetAccountManager());
        writer.writeEnumValue("setEduPolicies", this.getSetEduPolicies());
        writer.writeEnumValue("setPowerPolicies", this.getSetPowerPolicies());
        writer.writeEnumValue("signInOnResume", this.getSignInOnResume());
    }
    /**
     * Sets the accountManagerPolicy property value. Specifies how accounts are managed on a shared PC. Only applies when disableAccountManager is false.
     * @param value Value to set for the accountManagerPolicy property.
     */
    public void setAccountManagerPolicy(@jakarta.annotation.Nullable final SharedPCAccountManagerPolicy value) {
        this.BackingStore.set("accountManagerPolicy", value);
    }
    /**
     * Sets the allowedAccounts property value. Type of accounts that are allowed to share the PC.
     * @param value Value to set for the allowedAccounts property.
     */
    public void setAllowedAccounts(@jakarta.annotation.Nullable final EnumSet<SharedPCAllowedAccountType> value) {
        this.BackingStore.set("allowedAccounts", value);
    }
    /**
     * Sets the allowLocalStorage property value. Specifies whether local storage is allowed on a shared PC.
     * @param value Value to set for the allowLocalStorage property.
     */
    public void setAllowLocalStorage(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("allowLocalStorage", value);
    }
    /**
     * Sets the disableAccountManager property value. Disables the account manager for shared PC mode.
     * @param value Value to set for the disableAccountManager property.
     */
    public void setDisableAccountManager(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("disableAccountManager", value);
    }
    /**
     * Sets the disableEduPolicies property value. Specifies whether the default shared PC education environment policies should be disabled. For Windows 10 RS2 and later, this policy will be applied without setting Enabled to true.
     * @param value Value to set for the disableEduPolicies property.
     */
    public void setDisableEduPolicies(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("disableEduPolicies", value);
    }
    /**
     * Sets the disablePowerPolicies property value. Specifies whether the default shared PC power policies should be disabled.
     * @param value Value to set for the disablePowerPolicies property.
     */
    public void setDisablePowerPolicies(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("disablePowerPolicies", value);
    }
    /**
     * Sets the disableSignInOnResume property value. Disables the requirement to sign in whenever the device wakes up from sleep mode.
     * @param value Value to set for the disableSignInOnResume property.
     */
    public void setDisableSignInOnResume(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("disableSignInOnResume", value);
    }
    /**
     * Sets the enabled property value. Enables shared PC mode and applies the shared pc policies.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("enabled", value);
    }
    /**
     * Sets the fastFirstSignIn property value. Possible values of a property
     * @param value Value to set for the fastFirstSignIn property.
     */
    public void setFastFirstSignIn(@jakarta.annotation.Nullable final Enablement value) {
        this.BackingStore.set("fastFirstSignIn", value);
    }
    /**
     * Sets the idleTimeBeforeSleepInSeconds property value. Specifies the time in seconds that a device must sit idle before the PC goes to sleep. Setting this value to 0 prevents the sleep timeout from occurring.
     * @param value Value to set for the idleTimeBeforeSleepInSeconds property.
     */
    public void setIdleTimeBeforeSleepInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("idleTimeBeforeSleepInSeconds", value);
    }
    /**
     * Sets the kioskAppDisplayName property value. Specifies the display text for the account shown on the sign-in screen which launches the app specified by SetKioskAppUserModelId. Only applies when KioskAppUserModelId is set.
     * @param value Value to set for the kioskAppDisplayName property.
     */
    public void setKioskAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("kioskAppDisplayName", value);
    }
    /**
     * Sets the kioskAppUserModelId property value. Specifies the application user model ID of the app to use with assigned access.
     * @param value Value to set for the kioskAppUserModelId property.
     */
    public void setKioskAppUserModelId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("kioskAppUserModelId", value);
    }
    /**
     * Sets the localStorage property value. Possible values of a property
     * @param value Value to set for the localStorage property.
     */
    public void setLocalStorage(@jakarta.annotation.Nullable final Enablement value) {
        this.BackingStore.set("localStorage", value);
    }
    /**
     * Sets the maintenanceStartTime property value. Specifies the daily start time of maintenance hour.
     * @param value Value to set for the maintenanceStartTime property.
     */
    public void setMaintenanceStartTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.BackingStore.set("maintenanceStartTime", value);
    }
    /**
     * Sets the setAccountManager property value. Possible values of a property
     * @param value Value to set for the setAccountManager property.
     */
    public void setSetAccountManager(@jakarta.annotation.Nullable final Enablement value) {
        this.BackingStore.set("setAccountManager", value);
    }
    /**
     * Sets the setEduPolicies property value. Possible values of a property
     * @param value Value to set for the setEduPolicies property.
     */
    public void setSetEduPolicies(@jakarta.annotation.Nullable final Enablement value) {
        this.BackingStore.set("setEduPolicies", value);
    }
    /**
     * Sets the setPowerPolicies property value. Possible values of a property
     * @param value Value to set for the setPowerPolicies property.
     */
    public void setSetPowerPolicies(@jakarta.annotation.Nullable final Enablement value) {
        this.BackingStore.set("setPowerPolicies", value);
    }
    /**
     * Sets the signInOnResume property value. Possible values of a property
     * @param value Value to set for the signInOnResume property.
     */
    public void setSignInOnResume(@jakarta.annotation.Nullable final Enablement value) {
        this.BackingStore.set("signInOnResume", value);
    }
}
