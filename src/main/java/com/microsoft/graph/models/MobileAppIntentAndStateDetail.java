package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Mobile App Intent and Install State for a given device. */
public class MobileAppIntentAndStateDetail implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** MobieApp identifier. */
    private String _applicationId;
    /** The admin provided or imported title of the app. */
    private String _displayName;
    /** Human readable version of the application */
    private String _displayVersion;
    /** The install state of the app. Possible values are: installed, failed, notInstalled, uninstallFailed, pendingInstall, unknown, notApplicable. */
    private ResultantAppState _installState;
    /** Mobile App Intent. Possible values are: available, notAvailable, requiredInstall, requiredUninstall, requiredAndAvailableInstall, availableInstallWithoutEnrollment, exclude. */
    private MobileAppIntent _mobileAppIntent;
    /** The supported platforms for the app. */
    private java.util.List<MobileAppSupportedDeviceType> _supportedDeviceTypes;
    /**
     * Instantiates a new mobileAppIntentAndStateDetail and sets the default values.
     * @return a void
     */
    public MobileAppIntentAndStateDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppIntentAndStateDetail
     */
    @javax.annotation.Nonnull
    public static MobileAppIntentAndStateDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppIntentAndStateDetail();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the applicationId property value. MobieApp identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationId() {
        return this._applicationId;
    }
    /**
     * Gets the displayName property value. The admin provided or imported title of the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the displayVersion property value. Human readable version of the application
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayVersion() {
        return this._displayVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MobileAppIntentAndStateDetail currentObject = this;
        return new HashMap<>(6) {{
            this.put("applicationId", (n) -> { currentObject.setApplicationId(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("displayVersion", (n) -> { currentObject.setDisplayVersion(n.getStringValue()); });
            this.put("installState", (n) -> { currentObject.setInstallState(n.getEnumValue(ResultantAppState.class)); });
            this.put("mobileAppIntent", (n) -> { currentObject.setMobileAppIntent(n.getEnumValue(MobileAppIntent.class)); });
            this.put("supportedDeviceTypes", (n) -> { currentObject.setSupportedDeviceTypes(n.getCollectionOfObjectValues(MobileAppSupportedDeviceType::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the installState property value. The install state of the app. Possible values are: installed, failed, notInstalled, uninstallFailed, pendingInstall, unknown, notApplicable.
     * @return a resultantAppState
     */
    @javax.annotation.Nullable
    public ResultantAppState getInstallState() {
        return this._installState;
    }
    /**
     * Gets the mobileAppIntent property value. Mobile App Intent. Possible values are: available, notAvailable, requiredInstall, requiredUninstall, requiredAndAvailableInstall, availableInstallWithoutEnrollment, exclude.
     * @return a mobileAppIntent
     */
    @javax.annotation.Nullable
    public MobileAppIntent getMobileAppIntent() {
        return this._mobileAppIntent;
    }
    /**
     * Gets the supportedDeviceTypes property value. The supported platforms for the app.
     * @return a mobileAppSupportedDeviceType
     */
    @javax.annotation.Nullable
    public java.util.List<MobileAppSupportedDeviceType> getSupportedDeviceTypes() {
        return this._supportedDeviceTypes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("applicationId", this.getApplicationId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("displayVersion", this.getDisplayVersion());
        writer.writeEnumValue("installState", this.getInstallState());
        writer.writeEnumValue("mobileAppIntent", this.getMobileAppIntent());
        writer.writeCollectionOfObjectValues("supportedDeviceTypes", this.getSupportedDeviceTypes());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the applicationId property value. MobieApp identifier.
     * @param value Value to set for the applicationId property.
     * @return a void
     */
    public void setApplicationId(@javax.annotation.Nullable final String value) {
        this._applicationId = value;
    }
    /**
     * Sets the displayName property value. The admin provided or imported title of the app.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the displayVersion property value. Human readable version of the application
     * @param value Value to set for the displayVersion property.
     * @return a void
     */
    public void setDisplayVersion(@javax.annotation.Nullable final String value) {
        this._displayVersion = value;
    }
    /**
     * Sets the installState property value. The install state of the app. Possible values are: installed, failed, notInstalled, uninstallFailed, pendingInstall, unknown, notApplicable.
     * @param value Value to set for the installState property.
     * @return a void
     */
    public void setInstallState(@javax.annotation.Nullable final ResultantAppState value) {
        this._installState = value;
    }
    /**
     * Sets the mobileAppIntent property value. Mobile App Intent. Possible values are: available, notAvailable, requiredInstall, requiredUninstall, requiredAndAvailableInstall, availableInstallWithoutEnrollment, exclude.
     * @param value Value to set for the mobileAppIntent property.
     * @return a void
     */
    public void setMobileAppIntent(@javax.annotation.Nullable final MobileAppIntent value) {
        this._mobileAppIntent = value;
    }
    /**
     * Sets the supportedDeviceTypes property value. The supported platforms for the app.
     * @param value Value to set for the supportedDeviceTypes property.
     * @return a void
     */
    public void setSupportedDeviceTypes(@javax.annotation.Nullable final java.util.List<MobileAppSupportedDeviceType> value) {
        this._supportedDeviceTypes = value;
    }
}
