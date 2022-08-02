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
    /** A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins. */
    private ResultantAppState _installState;
    /** Indicates the status of the mobile app on the device. */
    private MobileAppIntent _mobileAppIntent;
    /** The OdataType property */
    private String _odataType;
    /** The supported platforms for the app. */
    private java.util.List<MobileAppSupportedDeviceType> _supportedDeviceTypes;
    /**
     * Instantiates a new mobileAppIntentAndStateDetail and sets the default values.
     * @return a void
     */
    public MobileAppIntentAndStateDetail() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.mobileAppIntentAndStateDetail");
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
        return new HashMap<>(7) {{
            this.put("applicationId", (n) -> { currentObject.setApplicationId(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("displayVersion", (n) -> { currentObject.setDisplayVersion(n.getStringValue()); });
            this.put("installState", (n) -> { currentObject.setInstallState(n.getEnumValue(ResultantAppState.class)); });
            this.put("mobileAppIntent", (n) -> { currentObject.setMobileAppIntent(n.getEnumValue(MobileAppIntent.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("supportedDeviceTypes", (n) -> { currentObject.setSupportedDeviceTypes(n.getCollectionOfObjectValues(MobileAppSupportedDeviceType::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the installState property value. A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
     * @return a resultantAppState
     */
    @javax.annotation.Nullable
    public ResultantAppState getInstallState() {
        return this._installState;
    }
    /**
     * Gets the mobileAppIntent property value. Indicates the status of the mobile app on the device.
     * @return a mobileAppIntent
     */
    @javax.annotation.Nullable
    public MobileAppIntent getMobileAppIntent() {
        return this._mobileAppIntent;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
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
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the installState property value. A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
     * @param value Value to set for the installState property.
     * @return a void
     */
    public void setInstallState(@javax.annotation.Nullable final ResultantAppState value) {
        this._installState = value;
    }
    /**
     * Sets the mobileAppIntent property value. Indicates the status of the mobile app on the device.
     * @param value Value to set for the mobileAppIntent property.
     * @return a void
     */
    public void setMobileAppIntent(@javax.annotation.Nullable final MobileAppIntent value) {
        this._mobileAppIntent = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
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
