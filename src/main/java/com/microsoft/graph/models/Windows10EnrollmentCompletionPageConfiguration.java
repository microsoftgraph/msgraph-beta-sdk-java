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
     * Allow or block device reset on installation failure
     */
    private Boolean allowDeviceResetOnInstallFailure;
    /**
     * Allow the user to continue using the device on installation failure
     */
    private Boolean allowDeviceUseOnInstallFailure;
    /**
     * Allow or block log collection on installation failure
     */
    private Boolean allowLogCollectionOnInstallFailure;
    /**
     * Install all required apps as non blocking apps during white glove
     */
    private Boolean allowNonBlockingAppInstallation;
    /**
     * Allow the user to retry the setup on installation failure
     */
    private Boolean blockDeviceSetupRetryByUser;
    /**
     * Set custom error message to show upon installation failure
     */
    private String customErrorMessage;
    /**
     * Only show installation progress for first user post enrollment
     */
    private Boolean disableUserStatusTrackingAfterFirstUser;
    /**
     * Set installation progress timeout in minutes
     */
    private Integer installProgressTimeoutInMinutes;
    /**
     * Allows quality updates installation during OOBE
     */
    private Boolean installQualityUpdates;
    /**
     * Selected applications to track the installation status
     */
    private java.util.List<String> selectedMobileAppIds;
    /**
     * Show or hide installation progress to user
     */
    private Boolean showInstallationProgress;
    /**
     * Only show installation progress for Autopilot enrollment scenarios
     */
    private Boolean trackInstallProgressForAutopilotOnly;
    /**
     * Instantiates a new windows10EnrollmentCompletionPageConfiguration and sets the default values.
     */
    public Windows10EnrollmentCompletionPageConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10EnrollmentCompletionPageConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windows10EnrollmentCompletionPageConfiguration
     */
    @jakarta.annotation.Nonnull
    public static Windows10EnrollmentCompletionPageConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10EnrollmentCompletionPageConfiguration();
    }
    /**
     * Gets the allowDeviceResetOnInstallFailure property value. Allow or block device reset on installation failure
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowDeviceResetOnInstallFailure() {
        return this.allowDeviceResetOnInstallFailure;
    }
    /**
     * Gets the allowDeviceUseOnInstallFailure property value. Allow the user to continue using the device on installation failure
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowDeviceUseOnInstallFailure() {
        return this.allowDeviceUseOnInstallFailure;
    }
    /**
     * Gets the allowLogCollectionOnInstallFailure property value. Allow or block log collection on installation failure
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowLogCollectionOnInstallFailure() {
        return this.allowLogCollectionOnInstallFailure;
    }
    /**
     * Gets the allowNonBlockingAppInstallation property value. Install all required apps as non blocking apps during white glove
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowNonBlockingAppInstallation() {
        return this.allowNonBlockingAppInstallation;
    }
    /**
     * Gets the blockDeviceSetupRetryByUser property value. Allow the user to retry the setup on installation failure
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockDeviceSetupRetryByUser() {
        return this.blockDeviceSetupRetryByUser;
    }
    /**
     * Gets the customErrorMessage property value. Set custom error message to show upon installation failure
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCustomErrorMessage() {
        return this.customErrorMessage;
    }
    /**
     * Gets the disableUserStatusTrackingAfterFirstUser property value. Only show installation progress for first user post enrollment
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableUserStatusTrackingAfterFirstUser() {
        return this.disableUserStatusTrackingAfterFirstUser;
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
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getInstallProgressTimeoutInMinutes() {
        return this.installProgressTimeoutInMinutes;
    }
    /**
     * Gets the installQualityUpdates property value. Allows quality updates installation during OOBE
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getInstallQualityUpdates() {
        return this.installQualityUpdates;
    }
    /**
     * Gets the selectedMobileAppIds property value. Selected applications to track the installation status
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSelectedMobileAppIds() {
        return this.selectedMobileAppIds;
    }
    /**
     * Gets the showInstallationProgress property value. Show or hide installation progress to user
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShowInstallationProgress() {
        return this.showInstallationProgress;
    }
    /**
     * Gets the trackInstallProgressForAutopilotOnly property value. Only show installation progress for Autopilot enrollment scenarios
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTrackInstallProgressForAutopilotOnly() {
        return this.trackInstallProgressForAutopilotOnly;
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
        this.allowDeviceResetOnInstallFailure = value;
    }
    /**
     * Sets the allowDeviceUseOnInstallFailure property value. Allow the user to continue using the device on installation failure
     * @param value Value to set for the allowDeviceUseOnInstallFailure property.
     */
    public void setAllowDeviceUseOnInstallFailure(@jakarta.annotation.Nullable final Boolean value) {
        this.allowDeviceUseOnInstallFailure = value;
    }
    /**
     * Sets the allowLogCollectionOnInstallFailure property value. Allow or block log collection on installation failure
     * @param value Value to set for the allowLogCollectionOnInstallFailure property.
     */
    public void setAllowLogCollectionOnInstallFailure(@jakarta.annotation.Nullable final Boolean value) {
        this.allowLogCollectionOnInstallFailure = value;
    }
    /**
     * Sets the allowNonBlockingAppInstallation property value. Install all required apps as non blocking apps during white glove
     * @param value Value to set for the allowNonBlockingAppInstallation property.
     */
    public void setAllowNonBlockingAppInstallation(@jakarta.annotation.Nullable final Boolean value) {
        this.allowNonBlockingAppInstallation = value;
    }
    /**
     * Sets the blockDeviceSetupRetryByUser property value. Allow the user to retry the setup on installation failure
     * @param value Value to set for the blockDeviceSetupRetryByUser property.
     */
    public void setBlockDeviceSetupRetryByUser(@jakarta.annotation.Nullable final Boolean value) {
        this.blockDeviceSetupRetryByUser = value;
    }
    /**
     * Sets the customErrorMessage property value. Set custom error message to show upon installation failure
     * @param value Value to set for the customErrorMessage property.
     */
    public void setCustomErrorMessage(@jakarta.annotation.Nullable final String value) {
        this.customErrorMessage = value;
    }
    /**
     * Sets the disableUserStatusTrackingAfterFirstUser property value. Only show installation progress for first user post enrollment
     * @param value Value to set for the disableUserStatusTrackingAfterFirstUser property.
     */
    public void setDisableUserStatusTrackingAfterFirstUser(@jakarta.annotation.Nullable final Boolean value) {
        this.disableUserStatusTrackingAfterFirstUser = value;
    }
    /**
     * Sets the installProgressTimeoutInMinutes property value. Set installation progress timeout in minutes
     * @param value Value to set for the installProgressTimeoutInMinutes property.
     */
    public void setInstallProgressTimeoutInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.installProgressTimeoutInMinutes = value;
    }
    /**
     * Sets the installQualityUpdates property value. Allows quality updates installation during OOBE
     * @param value Value to set for the installQualityUpdates property.
     */
    public void setInstallQualityUpdates(@jakarta.annotation.Nullable final Boolean value) {
        this.installQualityUpdates = value;
    }
    /**
     * Sets the selectedMobileAppIds property value. Selected applications to track the installation status
     * @param value Value to set for the selectedMobileAppIds property.
     */
    public void setSelectedMobileAppIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.selectedMobileAppIds = value;
    }
    /**
     * Sets the showInstallationProgress property value. Show or hide installation progress to user
     * @param value Value to set for the showInstallationProgress property.
     */
    public void setShowInstallationProgress(@jakarta.annotation.Nullable final Boolean value) {
        this.showInstallationProgress = value;
    }
    /**
     * Sets the trackInstallProgressForAutopilotOnly property value. Only show installation progress for Autopilot enrollment scenarios
     * @param value Value to set for the trackInstallProgressForAutopilotOnly property.
     */
    public void setTrackInstallProgressForAutopilotOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.trackInstallProgressForAutopilotOnly = value;
    }
}
