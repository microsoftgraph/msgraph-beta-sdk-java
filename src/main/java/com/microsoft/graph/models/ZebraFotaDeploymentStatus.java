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
 * Describes the status for a single FOTA deployment.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ZebraFotaDeploymentStatus implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new ZebraFotaDeploymentStatus and sets the default values.
     */
    public ZebraFotaDeploymentStatus() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ZebraFotaDeploymentStatus
     */
    @jakarta.annotation.Nonnull
    public static ZebraFotaDeploymentStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ZebraFotaDeploymentStatus();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the cancelRequested property value. A boolean that indicates if a cancellation was requested on the deployment. NOTE: A cancellation request does not guarantee that the deployment was canceled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCancelRequested() {
        return this.BackingStore.get("cancelRequested");
    }
    /**
     * Gets the completeOrCanceledDateTime property value. The date and time when this deployment was completed or canceled. The actual date time is determined by the value of state. If the state is canceled, this property holds the cancellation date/time. If the the state is completed, this property holds the completion date/time. If the deployment is not completed before the deployment end date, then completed date/time and end date/time are the same. This is always in the deployment timezone. Note: An installation that is in progress can continue past the deployment end date.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompleteOrCanceledDateTime() {
        return this.BackingStore.get("completeOrCanceledDateTime");
    }
    /**
     * Gets the errorCode property value. An error code indicating the failure reason, when the deployment state is createFailed. Possible values: See zebraFotaErrorCode enum.
     * @return a ZebraFotaErrorCode
     */
    @jakarta.annotation.Nullable
    public ZebraFotaErrorCode getErrorCode() {
        return this.BackingStore.get("errorCode");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(16);
        deserializerMap.put("cancelRequested", (n) -> { this.setCancelRequested(n.getBooleanValue()); });
        deserializerMap.put("completeOrCanceledDateTime", (n) -> { this.setCompleteOrCanceledDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getEnumValue(ZebraFotaErrorCode.class)); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ZebraFotaDeploymentState.class)); });
        deserializerMap.put("totalAwaitingInstall", (n) -> { this.setTotalAwaitingInstall(n.getIntegerValue()); });
        deserializerMap.put("totalCanceled", (n) -> { this.setTotalCanceled(n.getIntegerValue()); });
        deserializerMap.put("totalCreated", (n) -> { this.setTotalCreated(n.getIntegerValue()); });
        deserializerMap.put("totalDevices", (n) -> { this.setTotalDevices(n.getIntegerValue()); });
        deserializerMap.put("totalDownloading", (n) -> { this.setTotalDownloading(n.getIntegerValue()); });
        deserializerMap.put("totalFailedDownload", (n) -> { this.setTotalFailedDownload(n.getIntegerValue()); });
        deserializerMap.put("totalFailedInstall", (n) -> { this.setTotalFailedInstall(n.getIntegerValue()); });
        deserializerMap.put("totalScheduled", (n) -> { this.setTotalScheduled(n.getIntegerValue()); });
        deserializerMap.put("totalSucceededInstall", (n) -> { this.setTotalSucceededInstall(n.getIntegerValue()); });
        deserializerMap.put("totalUnknown", (n) -> { this.setTotalUnknown(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastUpdatedDateTime property value. Date and time when the deployment status was updated from Zebra
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.BackingStore.get("lastUpdatedDateTime");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the state property value. Represents the state of Zebra FOTA deployment.
     * @return a ZebraFotaDeploymentState
     */
    @jakarta.annotation.Nullable
    public ZebraFotaDeploymentState getState() {
        return this.BackingStore.get("state");
    }
    /**
     * Gets the totalAwaitingInstall property value. An integer that indicates the total number of devices where installation was successful.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalAwaitingInstall() {
        return this.BackingStore.get("totalAwaitingInstall");
    }
    /**
     * Gets the totalCanceled property value. An integer that indicates the total number of devices where installation was canceled.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalCanceled() {
        return this.BackingStore.get("totalCanceled");
    }
    /**
     * Gets the totalCreated property value. An integer that indicates the total number of devices that have a job in the CREATED state. Typically indicates jobs that did not reach the devices.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalCreated() {
        return this.BackingStore.get("totalCreated");
    }
    /**
     * Gets the totalDevices property value. An integer that indicates the total number of devices in the deployment.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalDevices() {
        return this.BackingStore.get("totalDevices");
    }
    /**
     * Gets the totalDownloading property value. An integer that indicates the total number of devices where installation was successful.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalDownloading() {
        return this.BackingStore.get("totalDownloading");
    }
    /**
     * Gets the totalFailedDownload property value. An integer that indicates the total number of devices that have failed to download the new OS file.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalFailedDownload() {
        return this.BackingStore.get("totalFailedDownload");
    }
    /**
     * Gets the totalFailedInstall property value. An integer that indicates the total number of devices that have failed to install the new OS file.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalFailedInstall() {
        return this.BackingStore.get("totalFailedInstall");
    }
    /**
     * Gets the totalScheduled property value. An integer that indicates the total number of devices that received the json and are scheduled.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalScheduled() {
        return this.BackingStore.get("totalScheduled");
    }
    /**
     * Gets the totalSucceededInstall property value. An integer that indicates the total number of devices where installation was successful.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalSucceededInstall() {
        return this.BackingStore.get("totalSucceededInstall");
    }
    /**
     * Gets the totalUnknown property value. An integer that indicates the total number of devices where no deployment status or end state has not received, even after the scheduled end date was reached.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalUnknown() {
        return this.BackingStore.get("totalUnknown");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("cancelRequested", this.getCancelRequested());
        writer.writeOffsetDateTimeValue("completeOrCanceledDateTime", this.getCompleteOrCanceledDateTime());
        writer.writeEnumValue("errorCode", this.getErrorCode());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("state", this.getState());
        writer.writeIntegerValue("totalAwaitingInstall", this.getTotalAwaitingInstall());
        writer.writeIntegerValue("totalCanceled", this.getTotalCanceled());
        writer.writeIntegerValue("totalCreated", this.getTotalCreated());
        writer.writeIntegerValue("totalDevices", this.getTotalDevices());
        writer.writeIntegerValue("totalDownloading", this.getTotalDownloading());
        writer.writeIntegerValue("totalFailedDownload", this.getTotalFailedDownload());
        writer.writeIntegerValue("totalFailedInstall", this.getTotalFailedInstall());
        writer.writeIntegerValue("totalScheduled", this.getTotalScheduled());
        writer.writeIntegerValue("totalSucceededInstall", this.getTotalSucceededInstall());
        writer.writeIntegerValue("totalUnknown", this.getTotalUnknown());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the cancelRequested property value. A boolean that indicates if a cancellation was requested on the deployment. NOTE: A cancellation request does not guarantee that the deployment was canceled.
     * @param value Value to set for the cancelRequested property.
     */
    public void setCancelRequested(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("cancelRequested", value);
    }
    /**
     * Sets the completeOrCanceledDateTime property value. The date and time when this deployment was completed or canceled. The actual date time is determined by the value of state. If the state is canceled, this property holds the cancellation date/time. If the the state is completed, this property holds the completion date/time. If the deployment is not completed before the deployment end date, then completed date/time and end date/time are the same. This is always in the deployment timezone. Note: An installation that is in progress can continue past the deployment end date.
     * @param value Value to set for the completeOrCanceledDateTime property.
     */
    public void setCompleteOrCanceledDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("completeOrCanceledDateTime", value);
    }
    /**
     * Sets the errorCode property value. An error code indicating the failure reason, when the deployment state is createFailed. Possible values: See zebraFotaErrorCode enum.
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final ZebraFotaErrorCode value) {
        this.BackingStore.set("errorCode", value);
    }
    /**
     * Sets the lastUpdatedDateTime property value. Date and time when the deployment status was updated from Zebra
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastUpdatedDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the state property value. Represents the state of Zebra FOTA deployment.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ZebraFotaDeploymentState value) {
        this.BackingStore.set("state", value);
    }
    /**
     * Sets the totalAwaitingInstall property value. An integer that indicates the total number of devices where installation was successful.
     * @param value Value to set for the totalAwaitingInstall property.
     */
    public void setTotalAwaitingInstall(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("totalAwaitingInstall", value);
    }
    /**
     * Sets the totalCanceled property value. An integer that indicates the total number of devices where installation was canceled.
     * @param value Value to set for the totalCanceled property.
     */
    public void setTotalCanceled(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("totalCanceled", value);
    }
    /**
     * Sets the totalCreated property value. An integer that indicates the total number of devices that have a job in the CREATED state. Typically indicates jobs that did not reach the devices.
     * @param value Value to set for the totalCreated property.
     */
    public void setTotalCreated(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("totalCreated", value);
    }
    /**
     * Sets the totalDevices property value. An integer that indicates the total number of devices in the deployment.
     * @param value Value to set for the totalDevices property.
     */
    public void setTotalDevices(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("totalDevices", value);
    }
    /**
     * Sets the totalDownloading property value. An integer that indicates the total number of devices where installation was successful.
     * @param value Value to set for the totalDownloading property.
     */
    public void setTotalDownloading(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("totalDownloading", value);
    }
    /**
     * Sets the totalFailedDownload property value. An integer that indicates the total number of devices that have failed to download the new OS file.
     * @param value Value to set for the totalFailedDownload property.
     */
    public void setTotalFailedDownload(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("totalFailedDownload", value);
    }
    /**
     * Sets the totalFailedInstall property value. An integer that indicates the total number of devices that have failed to install the new OS file.
     * @param value Value to set for the totalFailedInstall property.
     */
    public void setTotalFailedInstall(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("totalFailedInstall", value);
    }
    /**
     * Sets the totalScheduled property value. An integer that indicates the total number of devices that received the json and are scheduled.
     * @param value Value to set for the totalScheduled property.
     */
    public void setTotalScheduled(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("totalScheduled", value);
    }
    /**
     * Sets the totalSucceededInstall property value. An integer that indicates the total number of devices where installation was successful.
     * @param value Value to set for the totalSucceededInstall property.
     */
    public void setTotalSucceededInstall(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("totalSucceededInstall", value);
    }
    /**
     * Sets the totalUnknown property value. An integer that indicates the total number of devices where no deployment status or end state has not received, even after the scheduled end date was reached.
     * @param value Value to set for the totalUnknown property.
     */
    public void setTotalUnknown(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("totalUnknown", value);
    }
}
