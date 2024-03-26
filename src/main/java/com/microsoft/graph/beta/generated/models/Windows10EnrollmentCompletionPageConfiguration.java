package com.microsoft.graph.beta.models;

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
     * Instantiates a new {@link Windows10EnrollmentCompletionPageConfiguration} and sets the default values.
     */
    public Windows10EnrollmentCompletionPageConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10EnrollmentCompletionPageConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Windows10EnrollmentCompletionPageConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static Windows10EnrollmentCompletionPageConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10EnrollmentCompletionPageConfiguration();
    }
    /**
     * Gets the allowDeviceResetOnInstallFailure property value. When TRUE, allows device reset on installation failure. When false, reset is blocked. The default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowDeviceResetOnInstallFailure() {
        return this.backingStore.get("allowDeviceResetOnInstallFailure");
    }
    /**
     * Gets the allowDeviceUseOnInstallFailure property value. When TRUE, allows the user to continue using the device on installation failure. When false, blocks the user on installation failure. The default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowDeviceUseOnInstallFailure() {
        return this.backingStore.get("allowDeviceUseOnInstallFailure");
    }
    /**
     * Gets the allowLogCollectionOnInstallFailure property value. When TRUE, allows log collection on installation failure. When false, log collection is not allowed. The default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowLogCollectionOnInstallFailure() {
        return this.backingStore.get("allowLogCollectionOnInstallFailure");
    }
    /**
     * Gets the allowNonBlockingAppInstallation property value. When TRUE, ESP (Enrollment Status Page) installs all required apps targeted during technician phase and ignores any failures for non-blocking apps. When FALSE, ESP fails on any error during app install. The default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowNonBlockingAppInstallation() {
        return this.backingStore.get("allowNonBlockingAppInstallation");
    }
    /**
     * Gets the blockDeviceSetupRetryByUser property value. When TRUE, blocks user from retrying the setup on installation failure. When false, user is allowed to retry. The default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockDeviceSetupRetryByUser() {
        return this.backingStore.get("blockDeviceSetupRetryByUser");
    }
    /**
     * Gets the customErrorMessage property value. The custom error message to show upon installation failure. Max length is 10000. example: 'Setup could not be completed. Please try again or contact your support person for help.'
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomErrorMessage() {
        return this.backingStore.get("customErrorMessage");
    }
    /**
     * Gets the disableUserStatusTrackingAfterFirstUser property value. When TRUE, disables showing installation progress for first user post enrollment. When false, enables showing progress. The default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableUserStatusTrackingAfterFirstUser() {
        return this.backingStore.get("disableUserStatusTrackingAfterFirstUser");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     * Gets the installProgressTimeoutInMinutes property value. The installation progress timeout in minutes. Default is 60 minutes.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getInstallProgressTimeoutInMinutes() {
        return this.backingStore.get("installProgressTimeoutInMinutes");
    }
    /**
     * Gets the installQualityUpdates property value. Allows quality updates installation during OOBE
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getInstallQualityUpdates() {
        return this.backingStore.get("installQualityUpdates");
    }
    /**
     * Gets the selectedMobileAppIds property value. Selected applications to track the installation status. It is in the form of an array of GUIDs.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSelectedMobileAppIds() {
        return this.backingStore.get("selectedMobileAppIds");
    }
    /**
     * Gets the showInstallationProgress property value. When TRUE, shows installation progress to user. When false, hides installation progress. The default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShowInstallationProgress() {
        return this.backingStore.get("showInstallationProgress");
    }
    /**
     * Gets the trackInstallProgressForAutopilotOnly property value. When TRUE, installation progress is tracked for only Autopilot enrollment scenarios. When false, other scenarios are tracked as well. The default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getTrackInstallProgressForAutopilotOnly() {
        return this.backingStore.get("trackInstallProgressForAutopilotOnly");
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
     * Sets the allowDeviceResetOnInstallFailure property value. When TRUE, allows device reset on installation failure. When false, reset is blocked. The default is false.
     * @param value Value to set for the allowDeviceResetOnInstallFailure property.
     */
    public void setAllowDeviceResetOnInstallFailure(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowDeviceResetOnInstallFailure", value);
    }
    /**
     * Sets the allowDeviceUseOnInstallFailure property value. When TRUE, allows the user to continue using the device on installation failure. When false, blocks the user on installation failure. The default is false.
     * @param value Value to set for the allowDeviceUseOnInstallFailure property.
     */
    public void setAllowDeviceUseOnInstallFailure(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowDeviceUseOnInstallFailure", value);
    }
    /**
     * Sets the allowLogCollectionOnInstallFailure property value. When TRUE, allows log collection on installation failure. When false, log collection is not allowed. The default is false.
     * @param value Value to set for the allowLogCollectionOnInstallFailure property.
     */
    public void setAllowLogCollectionOnInstallFailure(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowLogCollectionOnInstallFailure", value);
    }
    /**
     * Sets the allowNonBlockingAppInstallation property value. When TRUE, ESP (Enrollment Status Page) installs all required apps targeted during technician phase and ignores any failures for non-blocking apps. When FALSE, ESP fails on any error during app install. The default is false.
     * @param value Value to set for the allowNonBlockingAppInstallation property.
     */
    public void setAllowNonBlockingAppInstallation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowNonBlockingAppInstallation", value);
    }
    /**
     * Sets the blockDeviceSetupRetryByUser property value. When TRUE, blocks user from retrying the setup on installation failure. When false, user is allowed to retry. The default is false.
     * @param value Value to set for the blockDeviceSetupRetryByUser property.
     */
    public void setBlockDeviceSetupRetryByUser(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("blockDeviceSetupRetryByUser", value);
    }
    /**
     * Sets the customErrorMessage property value. The custom error message to show upon installation failure. Max length is 10000. example: 'Setup could not be completed. Please try again or contact your support person for help.'
     * @param value Value to set for the customErrorMessage property.
     */
    public void setCustomErrorMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customErrorMessage", value);
    }
    /**
     * Sets the disableUserStatusTrackingAfterFirstUser property value. When TRUE, disables showing installation progress for first user post enrollment. When false, enables showing progress. The default is false.
     * @param value Value to set for the disableUserStatusTrackingAfterFirstUser property.
     */
    public void setDisableUserStatusTrackingAfterFirstUser(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("disableUserStatusTrackingAfterFirstUser", value);
    }
    /**
     * Sets the installProgressTimeoutInMinutes property value. The installation progress timeout in minutes. Default is 60 minutes.
     * @param value Value to set for the installProgressTimeoutInMinutes property.
     */
    public void setInstallProgressTimeoutInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("installProgressTimeoutInMinutes", value);
    }
    /**
     * Sets the installQualityUpdates property value. Allows quality updates installation during OOBE
     * @param value Value to set for the installQualityUpdates property.
     */
    public void setInstallQualityUpdates(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("installQualityUpdates", value);
    }
    /**
     * Sets the selectedMobileAppIds property value. Selected applications to track the installation status. It is in the form of an array of GUIDs.
     * @param value Value to set for the selectedMobileAppIds property.
     */
    public void setSelectedMobileAppIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("selectedMobileAppIds", value);
    }
    /**
     * Sets the showInstallationProgress property value. When TRUE, shows installation progress to user. When false, hides installation progress. The default is false.
     * @param value Value to set for the showInstallationProgress property.
     */
    public void setShowInstallationProgress(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("showInstallationProgress", value);
    }
    /**
     * Sets the trackInstallProgressForAutopilotOnly property value. When TRUE, installation progress is tracked for only Autopilot enrollment scenarios. When false, other scenarios are tracked as well. The default is false.
     * @param value Value to set for the trackInstallProgressForAutopilotOnly property.
     */
    public void setTrackInstallProgressForAutopilotOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("trackInstallProgressForAutopilotOnly", value);
    }
}
