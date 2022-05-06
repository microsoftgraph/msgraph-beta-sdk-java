package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DepMacOSEnrollmentProfile extends DepEnrollmentBaseProfile implements Parsable {
    /** Indicates if Accessibility screen is disabled  */
    private Boolean _accessibilityScreenDisabled;
    /** Indicates if UnlockWithWatch screen is disabled  */
    private Boolean _autoUnlockWithWatchDisabled;
    /** Indicates if iCloud Documents and Desktop screen is disabled  */
    private Boolean _chooseYourLockScreenDisabled;
    /** Indicates if file vault is disabled  */
    private Boolean _fileVaultDisabled;
    /** Indicates if iCloud Analytics screen is disabled  */
    private Boolean _iCloudDiagnosticsDisabled;
    /** Indicates if iCloud Documents and Desktop screen is disabled  */
    private Boolean _iCloudStorageDisabled;
    /** Indicates if Passcode setup pane is disabled  */
    private Boolean _passCodeDisabled;
    /** Indicates if registration is disabled  */
    private Boolean _registrationDisabled;
    /** Indicates if zoom setup pane is disabled  */
    private Boolean _zoomDisabled;
    /**
     * Instantiates a new depMacOSEnrollmentProfile and sets the default values.
     * @return a void
     */
    public DepMacOSEnrollmentProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a depMacOSEnrollmentProfile
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DepMacOSEnrollmentProfile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("accessibilityScreenDisabled", (n) -> { currentObject.setAccessibilityScreenDisabled(n.getBooleanValue()); });
            this.put("autoUnlockWithWatchDisabled", (n) -> { currentObject.setAutoUnlockWithWatchDisabled(n.getBooleanValue()); });
            this.put("chooseYourLockScreenDisabled", (n) -> { currentObject.setChooseYourLockScreenDisabled(n.getBooleanValue()); });
            this.put("fileVaultDisabled", (n) -> { currentObject.setFileVaultDisabled(n.getBooleanValue()); });
            this.put("iCloudDiagnosticsDisabled", (n) -> { currentObject.setICloudDiagnosticsDisabled(n.getBooleanValue()); });
            this.put("iCloudStorageDisabled", (n) -> { currentObject.setICloudStorageDisabled(n.getBooleanValue()); });
            this.put("passCodeDisabled", (n) -> { currentObject.setPassCodeDisabled(n.getBooleanValue()); });
            this.put("registrationDisabled", (n) -> { currentObject.setRegistrationDisabled(n.getBooleanValue()); });
            this.put("zoomDisabled", (n) -> { currentObject.setZoomDisabled(n.getBooleanValue()); });
        }};
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
     * Gets the passCodeDisabled property value. Indicates if Passcode setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPassCodeDisabled() {
        return this._passCodeDisabled;
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("accessibilityScreenDisabled", this.getAccessibilityScreenDisabled());
        writer.writeBooleanValue("autoUnlockWithWatchDisabled", this.getAutoUnlockWithWatchDisabled());
        writer.writeBooleanValue("chooseYourLockScreenDisabled", this.getChooseYourLockScreenDisabled());
        writer.writeBooleanValue("fileVaultDisabled", this.getFileVaultDisabled());
        writer.writeBooleanValue("iCloudDiagnosticsDisabled", this.getICloudDiagnosticsDisabled());
        writer.writeBooleanValue("iCloudStorageDisabled", this.getICloudStorageDisabled());
        writer.writeBooleanValue("passCodeDisabled", this.getPassCodeDisabled());
        writer.writeBooleanValue("registrationDisabled", this.getRegistrationDisabled());
        writer.writeBooleanValue("zoomDisabled", this.getZoomDisabled());
    }
    /**
     * Sets the accessibilityScreenDisabled property value. Indicates if Accessibility screen is disabled
     * @param value Value to set for the accessibilityScreenDisabled property.
     * @return a void
     */
    public void setAccessibilityScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this._accessibilityScreenDisabled = value;
    }
    /**
     * Sets the autoUnlockWithWatchDisabled property value. Indicates if UnlockWithWatch screen is disabled
     * @param value Value to set for the autoUnlockWithWatchDisabled property.
     * @return a void
     */
    public void setAutoUnlockWithWatchDisabled(@javax.annotation.Nullable final Boolean value) {
        this._autoUnlockWithWatchDisabled = value;
    }
    /**
     * Sets the chooseYourLockScreenDisabled property value. Indicates if iCloud Documents and Desktop screen is disabled
     * @param value Value to set for the chooseYourLockScreenDisabled property.
     * @return a void
     */
    public void setChooseYourLockScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this._chooseYourLockScreenDisabled = value;
    }
    /**
     * Sets the fileVaultDisabled property value. Indicates if file vault is disabled
     * @param value Value to set for the fileVaultDisabled property.
     * @return a void
     */
    public void setFileVaultDisabled(@javax.annotation.Nullable final Boolean value) {
        this._fileVaultDisabled = value;
    }
    /**
     * Sets the iCloudDiagnosticsDisabled property value. Indicates if iCloud Analytics screen is disabled
     * @param value Value to set for the iCloudDiagnosticsDisabled property.
     * @return a void
     */
    public void setICloudDiagnosticsDisabled(@javax.annotation.Nullable final Boolean value) {
        this._iCloudDiagnosticsDisabled = value;
    }
    /**
     * Sets the iCloudStorageDisabled property value. Indicates if iCloud Documents and Desktop screen is disabled
     * @param value Value to set for the iCloudStorageDisabled property.
     * @return a void
     */
    public void setICloudStorageDisabled(@javax.annotation.Nullable final Boolean value) {
        this._iCloudStorageDisabled = value;
    }
    /**
     * Sets the passCodeDisabled property value. Indicates if Passcode setup pane is disabled
     * @param value Value to set for the passCodeDisabled property.
     * @return a void
     */
    public void setPassCodeDisabled(@javax.annotation.Nullable final Boolean value) {
        this._passCodeDisabled = value;
    }
    /**
     * Sets the registrationDisabled property value. Indicates if registration is disabled
     * @param value Value to set for the registrationDisabled property.
     * @return a void
     */
    public void setRegistrationDisabled(@javax.annotation.Nullable final Boolean value) {
        this._registrationDisabled = value;
    }
    /**
     * Sets the zoomDisabled property value. Indicates if zoom setup pane is disabled
     * @param value Value to set for the zoomDisabled property.
     * @return a void
     */
    public void setZoomDisabled(@javax.annotation.Nullable final Boolean value) {
        this._zoomDisabled = value;
    }
}
