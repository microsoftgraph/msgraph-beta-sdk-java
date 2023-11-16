package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows 10 Enrollment Status Page Configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows10EnrollmentCompletionPageConfiguration extends DeviceEnrollmentConfiguration implements Parsable {
    /**
     * Instantiates a new Windows10EnrollmentCompletionPageConfiguration and sets the default values.
     */
    public Windows10EnrollmentCompletionPageConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10EnrollmentCompletionPageConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10EnrollmentCompletionPageConfiguration
     */
    @jakarta.annotation.Nonnull
    public static Windows10EnrollmentCompletionPageConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10EnrollmentCompletionPageConfiguration();
    }
    /**
     * Gets the allowDeviceResetOnInstallFailure property value. Allow or block device reset on installation failure
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowDeviceResetOnInstallFailure() {
        return this.BackingStore.get("allowDeviceResetOnInstallFailure");
    }
    /**
     * Gets the allowDeviceUseOnInstallFailure property value. Allow the user to continue using the device on installation failure
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowDeviceUseOnInstallFailure() {
        return this.BackingStore.get("allowDeviceUseOnInstallFailure");
    }
    /**
     * Gets the allowLogCollectionOnInstallFailure property value. Allow or block log collection on installation failure
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowLogCollectionOnInstallFailure() {
        return this.BackingStore.get("allowLogCollectionOnInstallFailure");
    }
    /**
     * Gets the allowNonBlockingAppInstallation property value. Install all required apps as non blocking apps during white glove
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowNonBlockingAppInstallation() {
        return this.BackingStore.get("allowNonBlockingAppInstallation");
    }
    /**
     * Gets the blockDeviceSetupRetryByUser property value. Allow the user to retry the setup on installation failure
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockDeviceSetupRetryByUser() {
        return this.BackingStore.get("blockDeviceSetupRetryByUser");
    }
    /**
     * Gets the customErrorMessage property value. Set custom error message to show upon installation failure
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomErrorMessage() {
        return this.BackingStore.get("customErrorMessage");
    }
    /**
     * Gets the disableUserStatusTrackingAfterFirstUser property value. Only show installation progress for first user post enrollment
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableUserStatusTrackingAfterFirstUser() {
        return this.BackingStore.get("disableUserStatusTrackingAfterFirstUser");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowDeviceResetOnInstallFailure", (n) -> { this.setAllowDeviceResetOnInstallFailure(n.getBooleanValue()); });
        deserializerMap.put("allowDeviceUseOnInstallFailure", (n) -> { this.setAllowDeviceUseOnInstallFailure(n.getBooleanValue()); });
        deserializerMap.put("allowLogCollectionOnInstallFailure", (n) -> { this.setAllowLogCollectionOnInstallFailure(n.getBooleanValue()); });
        deserializerMap.put("allowNonBlockingAppInstallation", (n) -> { this.setAllowNonBlockingAppInstallation(n.getBooleanValue()); });
        deserializerMap.put("blockDeviceSetupRetryByUser", (n) -> { this.setBlockDeviceSetupRetryByUser(n.getBooleanValue()); });
        deserializerMap.put("customErrorMessage", (n) -> { this.setCustomErrorMessage(n.getStringValue()); });
        deserializerMap.put("disableUserStatusTrackingAfterFirstUser", (n) -> { this.setDisableUserStatusTrackingAfterFirstUser(n.getBooleanValue()); });
        deserializerMap.put("installProgressTimeoutInMinutes", (n) -> { this.setInstallProgressTimeoutInMinutes(n.getIntegerValue()); });
        deserializerMap.put("installQualityUpdates", (n) -> { this.setInstallQualityUpdates(n.getBooleanValue()); });
        deserializerMap.put("selectedMobileAppIds", (n) -> { this.setSelectedMobileAppIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("showInstallationProgress", (n) -> { this.setShowInstallationProgress(n.getBooleanValue()); });
        deserializerMap.put("trackInstallProgressForAutopilotOnly", (n) -> { this.setTrackInstallProgressForAutopilotOnly(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installProgressTimeoutInMinutes property value. Set installation progress timeout in minutes
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInstallProgressTimeoutInMinutes() {
        return this.BackingStore.get("installProgressTimeoutInMinutes");
    }
    /**
     * Gets the installQualityUpdates property value. Allows quality updates installation during OOBE
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getInstallQualityUpdates() {
        return this.BackingStore.get("installQualityUpdates");
    }
    /**
     * Gets the selectedMobileAppIds property value. Selected applications to track the installation status
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSelectedMobileAppIds() {
        return this.BackingStore.get("selectedMobileAppIds");
    }
    /**
     * Gets the showInstallationProgress property value. Show or hide installation progress to user
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShowInstallationProgress() {
        return this.BackingStore.get("showInstallationProgress");
    }
    /**
     * Gets the trackInstallProgressForAutopilotOnly property value. Only show installation progress for Autopilot enrollment scenarios
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTrackInstallProgressForAutopilotOnly() {
        return this.BackingStore.get("trackInstallProgressForAutopilotOnly");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowDeviceResetOnInstallFailure", this.getAllowDeviceResetOnInstallFailure());
        writer.writeBooleanValue("allowDeviceUseOnInstallFailure", this.getAllowDeviceUseOnInstallFailure());
        writer.writeBooleanValue("allowLogCollectionOnInstallFailure", this.getAllowLogCollectionOnInstallFailure());
        writer.writeBooleanValue("allowNonBlockingAppInstallation", this.getAllowNonBlockingAppInstallation());
        writer.writeBooleanValue("blockDeviceSetupRetryByUser", this.getBlockDeviceSetupRetryByUser());
        writer.writeStringValue("customErrorMessage", this.getCustomErrorMessage());
        writer.writeBooleanValue("disableUserStatusTrackingAfterFirstUser", this.getDisableUserStatusTrackingAfterFirstUser());
        writer.writeIntegerValue("installProgressTimeoutInMinutes", this.getInstallProgressTimeoutInMinutes());
        writer.writeBooleanValue("installQualityUpdates", this.getInstallQualityUpdates());
        writer.writeCollectionOfPrimitiveValues("selectedMobileAppIds", this.getSelectedMobileAppIds());
        writer.writeBooleanValue("showInstallationProgress", this.getShowInstallationProgress());
        writer.writeBooleanValue("trackInstallProgressForAutopilotOnly", this.getTrackInstallProgressForAutopilotOnly());
    }
    /**
     * Sets the allowDeviceResetOnInstallFailure property value. Allow or block device reset on installation failure
     * @param value Value to set for the allowDeviceResetOnInstallFailure property.
     */
    public void setAllowDeviceResetOnInstallFailure(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("allowDeviceResetOnInstallFailure", value);
    }
    /**
     * Sets the allowDeviceUseOnInstallFailure property value. Allow the user to continue using the device on installation failure
     * @param value Value to set for the allowDeviceUseOnInstallFailure property.
     */
    public void setAllowDeviceUseOnInstallFailure(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("allowDeviceUseOnInstallFailure", value);
    }
    /**
     * Sets the allowLogCollectionOnInstallFailure property value. Allow or block log collection on installation failure
     * @param value Value to set for the allowLogCollectionOnInstallFailure property.
     */
    public void setAllowLogCollectionOnInstallFailure(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("allowLogCollectionOnInstallFailure", value);
    }
    /**
     * Sets the allowNonBlockingAppInstallation property value. Install all required apps as non blocking apps during white glove
     * @param value Value to set for the allowNonBlockingAppInstallation property.
     */
    public void setAllowNonBlockingAppInstallation(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("allowNonBlockingAppInstallation", value);
    }
    /**
     * Sets the blockDeviceSetupRetryByUser property value. Allow the user to retry the setup on installation failure
     * @param value Value to set for the blockDeviceSetupRetryByUser property.
     */
    public void setBlockDeviceSetupRetryByUser(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("blockDeviceSetupRetryByUser", value);
    }
    /**
     * Sets the customErrorMessage property value. Set custom error message to show upon installation failure
     * @param value Value to set for the customErrorMessage property.
     */
    public void setCustomErrorMessage(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("customErrorMessage", value);
    }
    /**
     * Sets the disableUserStatusTrackingAfterFirstUser property value. Only show installation progress for first user post enrollment
     * @param value Value to set for the disableUserStatusTrackingAfterFirstUser property.
     */
    public void setDisableUserStatusTrackingAfterFirstUser(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("disableUserStatusTrackingAfterFirstUser", value);
    }
    /**
     * Sets the installProgressTimeoutInMinutes property value. Set installation progress timeout in minutes
     * @param value Value to set for the installProgressTimeoutInMinutes property.
     */
    public void setInstallProgressTimeoutInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("installProgressTimeoutInMinutes", value);
    }
    /**
     * Sets the installQualityUpdates property value. Allows quality updates installation during OOBE
     * @param value Value to set for the installQualityUpdates property.
     */
    public void setInstallQualityUpdates(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("installQualityUpdates", value);
    }
    /**
     * Sets the selectedMobileAppIds property value. Selected applications to track the installation status
     * @param value Value to set for the selectedMobileAppIds property.
     */
    public void setSelectedMobileAppIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("selectedMobileAppIds", value);
    }
    /**
     * Sets the showInstallationProgress property value. Show or hide installation progress to user
     * @param value Value to set for the showInstallationProgress property.
     */
    public void setShowInstallationProgress(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("showInstallationProgress", value);
    }
    /**
     * Sets the trackInstallProgressForAutopilotOnly property value. Only show installation progress for Autopilot enrollment scenarios
     * @param value Value to set for the trackInstallProgressForAutopilotOnly property.
     */
    public void setTrackInstallProgressForAutopilotOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("trackInstallProgressForAutopilotOnly", value);
    }
}
