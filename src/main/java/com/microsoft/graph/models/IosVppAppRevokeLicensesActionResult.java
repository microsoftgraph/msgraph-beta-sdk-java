package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Defines results for actions on iOS Vpp Apps, contains inherited properties for ActionResult. */
public class IosVppAppRevokeLicensesActionResult implements AdditionalDataHolder, Parsable {
    /** Possible types of reasons for an Apple Volume Purchase Program token action failure. */
    private VppTokenActionFailureReason _actionFailureReason;
    /** Action name */
    private String _actionName;
    /** The actionState property */
    private ActionState _actionState;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** A count of the number of licenses for which revoke failed. */
    private Integer _failedLicensesCount;
    /** Time the action state was last updated */
    private OffsetDateTime _lastUpdatedDateTime;
    /** DeviceId associated with the action. */
    private String _managedDeviceId;
    /** The OdataType property */
    private String _odataType;
    /** Time the action was initiated */
    private OffsetDateTime _startDateTime;
    /** A count of the number of licenses for which revoke was attempted. */
    private Integer _totalLicensesCount;
    /** UserId associated with the action. */
    private String _userId;
    /**
     * Instantiates a new iosVppAppRevokeLicensesActionResult and sets the default values.
     * @return a void
     */
    public IosVppAppRevokeLicensesActionResult() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.iosVppAppRevokeLicensesActionResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosVppAppRevokeLicensesActionResult
     */
    @javax.annotation.Nonnull
    public static IosVppAppRevokeLicensesActionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosVppAppRevokeLicensesActionResult();
    }
    /**
     * Gets the actionFailureReason property value. Possible types of reasons for an Apple Volume Purchase Program token action failure.
     * @return a vppTokenActionFailureReason
     */
    @javax.annotation.Nullable
    public VppTokenActionFailureReason getActionFailureReason() {
        return this._actionFailureReason;
    }
    /**
     * Gets the actionName property value. Action name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActionName() {
        return this._actionName;
    }
    /**
     * Gets the actionState property value. The actionState property
     * @return a actionState
     */
    @javax.annotation.Nullable
    public ActionState getActionState() {
        return this._actionState;
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
     * Gets the failedLicensesCount property value. A count of the number of licenses for which revoke failed.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedLicensesCount() {
        return this._failedLicensesCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosVppAppRevokeLicensesActionResult currentObject = this;
        return new HashMap<>(10) {{
            this.put("actionFailureReason", (n) -> { currentObject.setActionFailureReason(n.getEnumValue(VppTokenActionFailureReason.class)); });
            this.put("actionName", (n) -> { currentObject.setActionName(n.getStringValue()); });
            this.put("actionState", (n) -> { currentObject.setActionState(n.getEnumValue(ActionState.class)); });
            this.put("failedLicensesCount", (n) -> { currentObject.setFailedLicensesCount(n.getIntegerValue()); });
            this.put("lastUpdatedDateTime", (n) -> { currentObject.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("managedDeviceId", (n) -> { currentObject.setManagedDeviceId(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("totalLicensesCount", (n) -> { currentObject.setTotalLicensesCount(n.getIntegerValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastUpdatedDateTime property value. Time the action state was last updated
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this._lastUpdatedDateTime;
    }
    /**
     * Gets the managedDeviceId property value. DeviceId associated with the action.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this._managedDeviceId;
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
     * Gets the startDateTime property value. Time the action was initiated
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the totalLicensesCount property value. A count of the number of licenses for which revoke was attempted.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalLicensesCount() {
        return this._totalLicensesCount;
    }
    /**
     * Gets the userId property value. UserId associated with the action.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("actionFailureReason", this.getActionFailureReason());
        writer.writeStringValue("actionName", this.getActionName());
        writer.writeEnumValue("actionState", this.getActionState());
        writer.writeIntegerValue("failedLicensesCount", this.getFailedLicensesCount());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeIntegerValue("totalLicensesCount", this.getTotalLicensesCount());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionFailureReason property value. Possible types of reasons for an Apple Volume Purchase Program token action failure.
     * @param value Value to set for the actionFailureReason property.
     * @return a void
     */
    public void setActionFailureReason(@javax.annotation.Nullable final VppTokenActionFailureReason value) {
        this._actionFailureReason = value;
    }
    /**
     * Sets the actionName property value. Action name
     * @param value Value to set for the actionName property.
     * @return a void
     */
    public void setActionName(@javax.annotation.Nullable final String value) {
        this._actionName = value;
    }
    /**
     * Sets the actionState property value. The actionState property
     * @param value Value to set for the actionState property.
     * @return a void
     */
    public void setActionState(@javax.annotation.Nullable final ActionState value) {
        this._actionState = value;
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
     * Sets the failedLicensesCount property value. A count of the number of licenses for which revoke failed.
     * @param value Value to set for the failedLicensesCount property.
     * @return a void
     */
    public void setFailedLicensesCount(@javax.annotation.Nullable final Integer value) {
        this._failedLicensesCount = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. Time the action state was last updated
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdatedDateTime = value;
    }
    /**
     * Sets the managedDeviceId property value. DeviceId associated with the action.
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this._managedDeviceId = value;
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
     * Sets the startDateTime property value. Time the action was initiated
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the totalLicensesCount property value. A count of the number of licenses for which revoke was attempted.
     * @param value Value to set for the totalLicensesCount property.
     * @return a void
     */
    public void setTotalLicensesCount(@javax.annotation.Nullable final Integer value) {
        this._totalLicensesCount = value;
    }
    /**
     * Sets the userId property value. UserId associated with the action.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
}
