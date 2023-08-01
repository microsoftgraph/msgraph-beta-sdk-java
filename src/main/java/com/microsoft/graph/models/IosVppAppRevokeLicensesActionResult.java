package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Defines results for actions on iOS Vpp Apps, contains inherited properties for ActionResult.
 */
public class IosVppAppRevokeLicensesActionResult implements AdditionalDataHolder, Parsable {
    /**
     * Possible types of reasons for an Apple Volume Purchase Program token action failure.
     */
    private VppTokenActionFailureReason actionFailureReason;
    /**
     * Action name
     */
    private String actionName;
    /**
     * The actionState property
     */
    private ActionState actionState;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A count of the number of licenses for which revoke failed.
     */
    private Integer failedLicensesCount;
    /**
     * Time the action state was last updated
     */
    private OffsetDateTime lastUpdatedDateTime;
    /**
     * DeviceId associated with the action.
     */
    private String managedDeviceId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Time the action was initiated
     */
    private OffsetDateTime startDateTime;
    /**
     * A count of the number of licenses for which revoke was attempted.
     */
    private Integer totalLicensesCount;
    /**
     * UserId associated with the action.
     */
    private String userId;
    /**
     * Instantiates a new iosVppAppRevokeLicensesActionResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosVppAppRevokeLicensesActionResult() {
        this.setAdditionalData(new HashMap<>());
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
        return this.actionFailureReason;
    }
    /**
     * Gets the actionName property value. Action name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActionName() {
        return this.actionName;
    }
    /**
     * Gets the actionState property value. The actionState property
     * @return a actionState
     */
    @javax.annotation.Nullable
    public ActionState getActionState() {
        return this.actionState;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the failedLicensesCount property value. A count of the number of licenses for which revoke failed.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedLicensesCount() {
        return this.failedLicensesCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("actionFailureReason", (n) -> { this.setActionFailureReason(n.getEnumValue(VppTokenActionFailureReason.class)); });
        deserializerMap.put("actionName", (n) -> { this.setActionName(n.getStringValue()); });
        deserializerMap.put("actionState", (n) -> { this.setActionState(n.getEnumValue(ActionState.class)); });
        deserializerMap.put("failedLicensesCount", (n) -> { this.setFailedLicensesCount(n.getIntegerValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("totalLicensesCount", (n) -> { this.setTotalLicensesCount(n.getIntegerValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastUpdatedDateTime property value. Time the action state was last updated
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }
    /**
     * Gets the managedDeviceId property value. DeviceId associated with the action.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this.managedDeviceId;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the startDateTime property value. Time the action was initiated
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the totalLicensesCount property value. A count of the number of licenses for which revoke was attempted.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalLicensesCount() {
        return this.totalLicensesCount;
    }
    /**
     * Gets the userId property value. UserId associated with the action.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setActionFailureReason(@javax.annotation.Nullable final VppTokenActionFailureReason value) {
        this.actionFailureReason = value;
    }
    /**
     * Sets the actionName property value. Action name
     * @param value Value to set for the actionName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionName(@javax.annotation.Nullable final String value) {
        this.actionName = value;
    }
    /**
     * Sets the actionState property value. The actionState property
     * @param value Value to set for the actionState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionState(@javax.annotation.Nullable final ActionState value) {
        this.actionState = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the failedLicensesCount property value. A count of the number of licenses for which revoke failed.
     * @param value Value to set for the failedLicensesCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailedLicensesCount(@javax.annotation.Nullable final Integer value) {
        this.failedLicensesCount = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. Time the action state was last updated
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdatedDateTime = value;
    }
    /**
     * Sets the managedDeviceId property value. DeviceId associated with the action.
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this.managedDeviceId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the startDateTime property value. Time the action was initiated
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the totalLicensesCount property value. A count of the number of licenses for which revoke was attempted.
     * @param value Value to set for the totalLicensesCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalLicensesCount(@javax.annotation.Nullable final Integer value) {
        this.totalLicensesCount = value;
    }
    /**
     * Sets the userId property value. UserId associated with the action.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
}
