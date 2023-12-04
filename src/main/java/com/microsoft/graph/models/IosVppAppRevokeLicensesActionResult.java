package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Defines results for actions on iOS Vpp Apps, contains inherited properties for ActionResult.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosVppAppRevokeLicensesActionResult implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new IosVppAppRevokeLicensesActionResult and sets the default values.
     */
    public IosVppAppRevokeLicensesActionResult() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosVppAppRevokeLicensesActionResult
     */
    @jakarta.annotation.Nonnull
    public static IosVppAppRevokeLicensesActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosVppAppRevokeLicensesActionResult();
    }
    /**
     * Gets the actionFailureReason property value. Possible types of reasons for an Apple Volume Purchase Program token action failure.
     * @return a VppTokenActionFailureReason
     */
    @jakarta.annotation.Nullable
    public VppTokenActionFailureReason getActionFailureReason() {
        return this.backingStore.get("actionFailureReason");
    }
    /**
     * Gets the actionName property value. Action name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getActionName() {
        return this.backingStore.get("actionName");
    }
    /**
     * Gets the actionState property value. The actionState property
     * @return a ActionState
     */
    @jakarta.annotation.Nullable
    public ActionState getActionState() {
        return this.backingStore.get("actionState");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the failedLicensesCount property value. A count of the number of licenses for which revoke failed.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFailedLicensesCount() {
        return this.backingStore.get("failedLicensesCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("actionFailureReason", (n) -> { this.setActionFailureReason(n.getEnumValue(VppTokenActionFailureReason::forValue)); });
        deserializerMap.put("actionName", (n) -> { this.setActionName(n.getStringValue()); });
        deserializerMap.put("actionState", (n) -> { this.setActionState(n.getEnumValue(ActionState::forValue)); });
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
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.backingStore.get("lastUpdatedDateTime");
    }
    /**
     * Gets the managedDeviceId property value. DeviceId associated with the action.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceId() {
        return this.backingStore.get("managedDeviceId");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the startDateTime property value. Time the action was initiated
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the totalLicensesCount property value. A count of the number of licenses for which revoke was attempted.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalLicensesCount() {
        return this.backingStore.get("totalLicensesCount");
    }
    /**
     * Gets the userId property value. UserId associated with the action.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setActionFailureReason(@jakarta.annotation.Nullable final VppTokenActionFailureReason value) {
        this.backingStore.set("actionFailureReason", value);
    }
    /**
     * Sets the actionName property value. Action name
     * @param value Value to set for the actionName property.
     */
    public void setActionName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("actionName", value);
    }
    /**
     * Sets the actionState property value. The actionState property
     * @param value Value to set for the actionState property.
     */
    public void setActionState(@jakarta.annotation.Nullable final ActionState value) {
        this.backingStore.set("actionState", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the failedLicensesCount property value. A count of the number of licenses for which revoke failed.
     * @param value Value to set for the failedLicensesCount property.
     */
    public void setFailedLicensesCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedLicensesCount", value);
    }
    /**
     * Sets the lastUpdatedDateTime property value. Time the action state was last updated
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUpdatedDateTime", value);
    }
    /**
     * Sets the managedDeviceId property value. DeviceId associated with the action.
     * @param value Value to set for the managedDeviceId property.
     */
    public void setManagedDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the startDateTime property value. Time the action was initiated
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the totalLicensesCount property value. A count of the number of licenses for which revoke was attempted.
     * @param value Value to set for the totalLicensesCount property.
     */
    public void setTotalLicensesCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalLicensesCount", value);
    }
    /**
     * Sets the userId property value. UserId associated with the action.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
