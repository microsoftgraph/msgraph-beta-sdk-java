package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10EnrollmentCompletionPageConfiguration extends DeviceEnrollmentConfiguration implements Parsable {
    /** Allow or block device reset on installation failure */
    private Boolean _allowDeviceResetOnInstallFailure;
    /** Allow the user to continue using the device on installation failure */
    private Boolean _allowDeviceUseOnInstallFailure;
    /** Allow or block log collection on installation failure */
    private Boolean _allowLogCollectionOnInstallFailure;
    /** Allow the user to retry the setup on installation failure */
    private Boolean _blockDeviceSetupRetryByUser;
    /** Set custom error message to show upon installation failure */
    private String _customErrorMessage;
    /** Only show installation progress for first user post enrollment */
    private Boolean _disableUserStatusTrackingAfterFirstUser;
    /** Set installation progress timeout in minutes */
    private Integer _installProgressTimeoutInMinutes;
    /** Selected applications to track the installation status */
    private java.util.List<String> _selectedMobileAppIds;
    /** Show or hide installation progress to user */
    private Boolean _showInstallationProgress;
    /** Only show installation progress for Autopilot enrollment scenarios */
    private Boolean _trackInstallProgressForAutopilotOnly;
    /**
     * Instantiates a new Windows10EnrollmentCompletionPageConfiguration and sets the default values.
     * @return a void
     */
    public Windows10EnrollmentCompletionPageConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10EnrollmentCompletionPageConfiguration
     */
    @javax.annotation.Nonnull
    public static Windows10EnrollmentCompletionPageConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10EnrollmentCompletionPageConfiguration();
    }
    /**
     * Gets the allowDeviceResetOnInstallFailure property value. Allow or block device reset on installation failure
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowDeviceResetOnInstallFailure() {
        return this._allowDeviceResetOnInstallFailure;
    }
    /**
     * Gets the allowDeviceUseOnInstallFailure property value. Allow the user to continue using the device on installation failure
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowDeviceUseOnInstallFailure() {
        return this._allowDeviceUseOnInstallFailure;
    }
    /**
     * Gets the allowLogCollectionOnInstallFailure property value. Allow or block log collection on installation failure
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowLogCollectionOnInstallFailure() {
        return this._allowLogCollectionOnInstallFailure;
    }
    /**
     * Gets the blockDeviceSetupRetryByUser property value. Allow the user to retry the setup on installation failure
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockDeviceSetupRetryByUser() {
        return this._blockDeviceSetupRetryByUser;
    }
    /**
     * Gets the customErrorMessage property value. Set custom error message to show upon installation failure
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomErrorMessage() {
        return this._customErrorMessage;
    }
    /**
     * Gets the disableUserStatusTrackingAfterFirstUser property value. Only show installation progress for first user post enrollment
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableUserStatusTrackingAfterFirstUser() {
        return this._disableUserStatusTrackingAfterFirstUser;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows10EnrollmentCompletionPageConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowDeviceResetOnInstallFailure", (n) -> { currentObject.setAllowDeviceResetOnInstallFailure(n.getBooleanValue()); });
            this.put("allowDeviceUseOnInstallFailure", (n) -> { currentObject.setAllowDeviceUseOnInstallFailure(n.getBooleanValue()); });
            this.put("allowLogCollectionOnInstallFailure", (n) -> { currentObject.setAllowLogCollectionOnInstallFailure(n.getBooleanValue()); });
            this.put("blockDeviceSetupRetryByUser", (n) -> { currentObject.setBlockDeviceSetupRetryByUser(n.getBooleanValue()); });
            this.put("customErrorMessage", (n) -> { currentObject.setCustomErrorMessage(n.getStringValue()); });
            this.put("disableUserStatusTrackingAfterFirstUser", (n) -> { currentObject.setDisableUserStatusTrackingAfterFirstUser(n.getBooleanValue()); });
            this.put("installProgressTimeoutInMinutes", (n) -> { currentObject.setInstallProgressTimeoutInMinutes(n.getIntegerValue()); });
            this.put("selectedMobileAppIds", (n) -> { currentObject.setSelectedMobileAppIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("showInstallationProgress", (n) -> { currentObject.setShowInstallationProgress(n.getBooleanValue()); });
            this.put("trackInstallProgressForAutopilotOnly", (n) -> { currentObject.setTrackInstallProgressForAutopilotOnly(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the installProgressTimeoutInMinutes property value. Set installation progress timeout in minutes
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInstallProgressTimeoutInMinutes() {
        return this._installProgressTimeoutInMinutes;
    }
    /**
     * Gets the selectedMobileAppIds property value. Selected applications to track the installation status
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSelectedMobileAppIds() {
        return this._selectedMobileAppIds;
    }
    /**
     * Gets the showInstallationProgress property value. Show or hide installation progress to user
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowInstallationProgress() {
        return this._showInstallationProgress;
    }
    /**
     * Gets the trackInstallProgressForAutopilotOnly property value. Only show installation progress for Autopilot enrollment scenarios
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTrackInstallProgressForAutopilotOnly() {
        return this._trackInstallProgressForAutopilotOnly;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowDeviceResetOnInstallFailure", this.getAllowDeviceResetOnInstallFailure());
        writer.writeBooleanValue("allowDeviceUseOnInstallFailure", this.getAllowDeviceUseOnInstallFailure());
        writer.writeBooleanValue("allowLogCollectionOnInstallFailure", this.getAllowLogCollectionOnInstallFailure());
        writer.writeBooleanValue("blockDeviceSetupRetryByUser", this.getBlockDeviceSetupRetryByUser());
        writer.writeStringValue("customErrorMessage", this.getCustomErrorMessage());
        writer.writeBooleanValue("disableUserStatusTrackingAfterFirstUser", this.getDisableUserStatusTrackingAfterFirstUser());
        writer.writeIntegerValue("installProgressTimeoutInMinutes", this.getInstallProgressTimeoutInMinutes());
        writer.writeCollectionOfPrimitiveValues("selectedMobileAppIds", this.getSelectedMobileAppIds());
        writer.writeBooleanValue("showInstallationProgress", this.getShowInstallationProgress());
        writer.writeBooleanValue("trackInstallProgressForAutopilotOnly", this.getTrackInstallProgressForAutopilotOnly());
    }
    /**
     * Sets the allowDeviceResetOnInstallFailure property value. Allow or block device reset on installation failure
     * @param value Value to set for the allowDeviceResetOnInstallFailure property.
     * @return a void
     */
    public void setAllowDeviceResetOnInstallFailure(@javax.annotation.Nullable final Boolean value) {
        this._allowDeviceResetOnInstallFailure = value;
    }
    /**
     * Sets the allowDeviceUseOnInstallFailure property value. Allow the user to continue using the device on installation failure
     * @param value Value to set for the allowDeviceUseOnInstallFailure property.
     * @return a void
     */
    public void setAllowDeviceUseOnInstallFailure(@javax.annotation.Nullable final Boolean value) {
        this._allowDeviceUseOnInstallFailure = value;
    }
    /**
     * Sets the allowLogCollectionOnInstallFailure property value. Allow or block log collection on installation failure
     * @param value Value to set for the allowLogCollectionOnInstallFailure property.
     * @return a void
     */
    public void setAllowLogCollectionOnInstallFailure(@javax.annotation.Nullable final Boolean value) {
        this._allowLogCollectionOnInstallFailure = value;
    }
    /**
     * Sets the blockDeviceSetupRetryByUser property value. Allow the user to retry the setup on installation failure
     * @param value Value to set for the blockDeviceSetupRetryByUser property.
     * @return a void
     */
    public void setBlockDeviceSetupRetryByUser(@javax.annotation.Nullable final Boolean value) {
        this._blockDeviceSetupRetryByUser = value;
    }
    /**
     * Sets the customErrorMessage property value. Set custom error message to show upon installation failure
     * @param value Value to set for the customErrorMessage property.
     * @return a void
     */
    public void setCustomErrorMessage(@javax.annotation.Nullable final String value) {
        this._customErrorMessage = value;
    }
    /**
     * Sets the disableUserStatusTrackingAfterFirstUser property value. Only show installation progress for first user post enrollment
     * @param value Value to set for the disableUserStatusTrackingAfterFirstUser property.
     * @return a void
     */
    public void setDisableUserStatusTrackingAfterFirstUser(@javax.annotation.Nullable final Boolean value) {
        this._disableUserStatusTrackingAfterFirstUser = value;
    }
    /**
     * Sets the installProgressTimeoutInMinutes property value. Set installation progress timeout in minutes
     * @param value Value to set for the installProgressTimeoutInMinutes property.
     * @return a void
     */
    public void setInstallProgressTimeoutInMinutes(@javax.annotation.Nullable final Integer value) {
        this._installProgressTimeoutInMinutes = value;
    }
    /**
     * Sets the selectedMobileAppIds property value. Selected applications to track the installation status
     * @param value Value to set for the selectedMobileAppIds property.
     * @return a void
     */
    public void setSelectedMobileAppIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._selectedMobileAppIds = value;
    }
    /**
     * Sets the showInstallationProgress property value. Show or hide installation progress to user
     * @param value Value to set for the showInstallationProgress property.
     * @return a void
     */
    public void setShowInstallationProgress(@javax.annotation.Nullable final Boolean value) {
        this._showInstallationProgress = value;
    }
    /**
     * Sets the trackInstallProgressForAutopilotOnly property value. Only show installation progress for Autopilot enrollment scenarios
     * @param value Value to set for the trackInstallProgressForAutopilotOnly property.
     * @return a void
     */
    public void setTrackInstallProgressForAutopilotOnly(@javax.annotation.Nullable final Boolean value) {
        this._trackInstallProgressForAutopilotOnly = value;
    }
}
