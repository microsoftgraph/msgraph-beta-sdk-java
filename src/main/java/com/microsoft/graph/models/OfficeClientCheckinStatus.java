package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OfficeClientCheckinStatus implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** List of policies delivered to the device as last checkin. */
    private java.util.List<String> _appliedPolicies;
    /** Last device check-in time in UTC. */
    private OffsetDateTime _checkinDateTime;
    /** Device name trying to check-in. */
    private String _deviceName;
    /** Device platform trying to check-in. */
    private String _devicePlatform;
    /** Device platform version trying to check-in. */
    private String _devicePlatformVersion;
    /** Error message if any associated for the last checkin. */
    private String _errorMessage;
    /** The OdataType property */
    private String _odataType;
    /** User identifier using the device. */
    private String _userId;
    /** User principal name using the device. */
    private String _userPrincipalName;
    /** If the last checkin was successful. */
    private Boolean _wasSuccessful;
    /**
     * Instantiates a new officeClientCheckinStatus and sets the default values.
     * @return a void
     */
    public OfficeClientCheckinStatus() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.officeClientCheckinStatus");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a officeClientCheckinStatus
     */
    @javax.annotation.Nonnull
    public static OfficeClientCheckinStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OfficeClientCheckinStatus();
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
     * Gets the appliedPolicies property value. List of policies delivered to the device as last checkin.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAppliedPolicies() {
        return this._appliedPolicies;
    }
    /**
     * Gets the checkinDateTime property value. Last device check-in time in UTC.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCheckinDateTime() {
        return this._checkinDateTime;
    }
    /**
     * Gets the deviceName property value. Device name trying to check-in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * Gets the devicePlatform property value. Device platform trying to check-in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDevicePlatform() {
        return this._devicePlatform;
    }
    /**
     * Gets the devicePlatformVersion property value. Device platform version trying to check-in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDevicePlatformVersion() {
        return this._devicePlatformVersion;
    }
    /**
     * Gets the errorMessage property value. Error message if any associated for the last checkin.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorMessage() {
        return this._errorMessage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OfficeClientCheckinStatus currentObject = this;
        return new HashMap<>(10) {{
            this.put("appliedPolicies", (n) -> { currentObject.setAppliedPolicies(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("checkinDateTime", (n) -> { currentObject.setCheckinDateTime(n.getOffsetDateTimeValue()); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("devicePlatform", (n) -> { currentObject.setDevicePlatform(n.getStringValue()); });
            this.put("devicePlatformVersion", (n) -> { currentObject.setDevicePlatformVersion(n.getStringValue()); });
            this.put("errorMessage", (n) -> { currentObject.setErrorMessage(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
            this.put("wasSuccessful", (n) -> { currentObject.setWasSuccessful(n.getBooleanValue()); });
        }};
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
     * Gets the userId property value. User identifier using the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Gets the userPrincipalName property value. User principal name using the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Gets the wasSuccessful property value. If the last checkin was successful.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWasSuccessful() {
        return this._wasSuccessful;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("appliedPolicies", this.getAppliedPolicies());
        writer.writeOffsetDateTimeValue("checkinDateTime", this.getCheckinDateTime());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("devicePlatform", this.getDevicePlatform());
        writer.writeStringValue("devicePlatformVersion", this.getDevicePlatformVersion());
        writer.writeStringValue("errorMessage", this.getErrorMessage());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeBooleanValue("wasSuccessful", this.getWasSuccessful());
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
     * Sets the appliedPolicies property value. List of policies delivered to the device as last checkin.
     * @param value Value to set for the appliedPolicies property.
     * @return a void
     */
    public void setAppliedPolicies(@javax.annotation.Nullable final java.util.List<String> value) {
        this._appliedPolicies = value;
    }
    /**
     * Sets the checkinDateTime property value. Last device check-in time in UTC.
     * @param value Value to set for the checkinDateTime property.
     * @return a void
     */
    public void setCheckinDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._checkinDateTime = value;
    }
    /**
     * Sets the deviceName property value. Device name trying to check-in.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the devicePlatform property value. Device platform trying to check-in.
     * @param value Value to set for the devicePlatform property.
     * @return a void
     */
    public void setDevicePlatform(@javax.annotation.Nullable final String value) {
        this._devicePlatform = value;
    }
    /**
     * Sets the devicePlatformVersion property value. Device platform version trying to check-in.
     * @param value Value to set for the devicePlatformVersion property.
     * @return a void
     */
    public void setDevicePlatformVersion(@javax.annotation.Nullable final String value) {
        this._devicePlatformVersion = value;
    }
    /**
     * Sets the errorMessage property value. Error message if any associated for the last checkin.
     * @param value Value to set for the errorMessage property.
     * @return a void
     */
    public void setErrorMessage(@javax.annotation.Nullable final String value) {
        this._errorMessage = value;
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
     * Sets the userId property value. User identifier using the device.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the userPrincipalName property value. User principal name using the device.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
    /**
     * Sets the wasSuccessful property value. If the last checkin was successful.
     * @param value Value to set for the wasSuccessful property.
     * @return a void
     */
    public void setWasSuccessful(@javax.annotation.Nullable final Boolean value) {
        this._wasSuccessful = value;
    }
}
