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
 * Describes the status for a single FOTA deployment.
 */
public class ZebraFotaDeploymentStatus implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A boolean that indicates if a cancellation was requested on the deployment. NOTE: A cancellation request does not guarantee that the deployment was canceled.
     */
    private Boolean cancelRequested;
    /**
     * The date and time when this deployment was completed or canceled. The actual date time is determined by the value of state. If the state is canceled, this property holds the cancellation date/time. If the the state is completed, this property holds the completion date/time. If the deployment is not completed before the deployment end date, then completed date/time and end date/time are the same. This is always in the deployment timezone. Note: An installation that is in progress can continue past the deployment end date.
     */
    private OffsetDateTime completeOrCanceledDateTime;
    /**
     * An error code indicating the failure reason, when the deployment state is createFailed. Possible values: See zebraFotaErrorCode enum.
     */
    private ZebraFotaErrorCode errorCode;
    /**
     * Date and time when the deployment status was updated from Zebra
     */
    private OffsetDateTime lastUpdatedDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Represents the state of Zebra FOTA deployment.
     */
    private ZebraFotaDeploymentState state;
    /**
     * An integer that indicates the total number of devices where installation was successful.
     */
    private Integer totalAwaitingInstall;
    /**
     * An integer that indicates the total number of devices where installation was canceled.
     */
    private Integer totalCanceled;
    /**
     * An integer that indicates the total number of devices that have a job in the CREATED state. Typically indicates jobs that did not reach the devices.
     */
    private Integer totalCreated;
    /**
     * An integer that indicates the total number of devices in the deployment.
     */
    private Integer totalDevices;
    /**
     * An integer that indicates the total number of devices where installation was successful.
     */
    private Integer totalDownloading;
    /**
     * An integer that indicates the total number of devices that have failed to download the new OS file.
     */
    private Integer totalFailedDownload;
    /**
     * An integer that indicates the total number of devices that have failed to install the new OS file.
     */
    private Integer totalFailedInstall;
    /**
     * An integer that indicates the total number of devices that received the json and are scheduled.
     */
    private Integer totalScheduled;
    /**
     * An integer that indicates the total number of devices where installation was successful.
     */
    private Integer totalSucceededInstall;
    /**
     * An integer that indicates the total number of devices where no deployment status or end state has not received, even after the scheduled end date was reached.
     */
    private Integer totalUnknown;
    /**
     * Instantiates a new zebraFotaDeploymentStatus and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ZebraFotaDeploymentStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a zebraFotaDeploymentStatus
     */
    @javax.annotation.Nonnull
    public static ZebraFotaDeploymentStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ZebraFotaDeploymentStatus();
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
     * Gets the cancelRequested property value. A boolean that indicates if a cancellation was requested on the deployment. NOTE: A cancellation request does not guarantee that the deployment was canceled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCancelRequested() {
        return this.cancelRequested;
    }
    /**
     * Gets the completeOrCanceledDateTime property value. The date and time when this deployment was completed or canceled. The actual date time is determined by the value of state. If the state is canceled, this property holds the cancellation date/time. If the the state is completed, this property holds the completion date/time. If the deployment is not completed before the deployment end date, then completed date/time and end date/time are the same. This is always in the deployment timezone. Note: An installation that is in progress can continue past the deployment end date.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompleteOrCanceledDateTime() {
        return this.completeOrCanceledDateTime;
    }
    /**
     * Gets the errorCode property value. An error code indicating the failure reason, when the deployment state is createFailed. Possible values: See zebraFotaErrorCode enum.
     * @return a zebraFotaErrorCode
     */
    @javax.annotation.Nullable
    public ZebraFotaErrorCode getErrorCode() {
        return this.errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
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
     * Gets the state property value. Represents the state of Zebra FOTA deployment.
     * @return a zebraFotaDeploymentState
     */
    @javax.annotation.Nullable
    public ZebraFotaDeploymentState getState() {
        return this.state;
    }
    /**
     * Gets the totalAwaitingInstall property value. An integer that indicates the total number of devices where installation was successful.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalAwaitingInstall() {
        return this.totalAwaitingInstall;
    }
    /**
     * Gets the totalCanceled property value. An integer that indicates the total number of devices where installation was canceled.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalCanceled() {
        return this.totalCanceled;
    }
    /**
     * Gets the totalCreated property value. An integer that indicates the total number of devices that have a job in the CREATED state. Typically indicates jobs that did not reach the devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalCreated() {
        return this.totalCreated;
    }
    /**
     * Gets the totalDevices property value. An integer that indicates the total number of devices in the deployment.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalDevices() {
        return this.totalDevices;
    }
    /**
     * Gets the totalDownloading property value. An integer that indicates the total number of devices where installation was successful.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalDownloading() {
        return this.totalDownloading;
    }
    /**
     * Gets the totalFailedDownload property value. An integer that indicates the total number of devices that have failed to download the new OS file.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalFailedDownload() {
        return this.totalFailedDownload;
    }
    /**
     * Gets the totalFailedInstall property value. An integer that indicates the total number of devices that have failed to install the new OS file.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalFailedInstall() {
        return this.totalFailedInstall;
    }
    /**
     * Gets the totalScheduled property value. An integer that indicates the total number of devices that received the json and are scheduled.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalScheduled() {
        return this.totalScheduled;
    }
    /**
     * Gets the totalSucceededInstall property value. An integer that indicates the total number of devices where installation was successful.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalSucceededInstall() {
        return this.totalSucceededInstall;
    }
    /**
     * Gets the totalUnknown property value. An integer that indicates the total number of devices where no deployment status or end state has not received, even after the scheduled end date was reached.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalUnknown() {
        return this.totalUnknown;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the cancelRequested property value. A boolean that indicates if a cancellation was requested on the deployment. NOTE: A cancellation request does not guarantee that the deployment was canceled.
     * @param value Value to set for the cancelRequested property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCancelRequested(@javax.annotation.Nullable final Boolean value) {
        this.cancelRequested = value;
    }
    /**
     * Sets the completeOrCanceledDateTime property value. The date and time when this deployment was completed or canceled. The actual date time is determined by the value of state. If the state is canceled, this property holds the cancellation date/time. If the the state is completed, this property holds the completion date/time. If the deployment is not completed before the deployment end date, then completed date/time and end date/time are the same. This is always in the deployment timezone. Note: An installation that is in progress can continue past the deployment end date.
     * @param value Value to set for the completeOrCanceledDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompleteOrCanceledDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.completeOrCanceledDateTime = value;
    }
    /**
     * Sets the errorCode property value. An error code indicating the failure reason, when the deployment state is createFailed. Possible values: See zebraFotaErrorCode enum.
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorCode(@javax.annotation.Nullable final ZebraFotaErrorCode value) {
        this.errorCode = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. Date and time when the deployment status was updated from Zebra
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdatedDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the state property value. Represents the state of Zebra FOTA deployment.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final ZebraFotaDeploymentState value) {
        this.state = value;
    }
    /**
     * Sets the totalAwaitingInstall property value. An integer that indicates the total number of devices where installation was successful.
     * @param value Value to set for the totalAwaitingInstall property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalAwaitingInstall(@javax.annotation.Nullable final Integer value) {
        this.totalAwaitingInstall = value;
    }
    /**
     * Sets the totalCanceled property value. An integer that indicates the total number of devices where installation was canceled.
     * @param value Value to set for the totalCanceled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalCanceled(@javax.annotation.Nullable final Integer value) {
        this.totalCanceled = value;
    }
    /**
     * Sets the totalCreated property value. An integer that indicates the total number of devices that have a job in the CREATED state. Typically indicates jobs that did not reach the devices.
     * @param value Value to set for the totalCreated property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalCreated(@javax.annotation.Nullable final Integer value) {
        this.totalCreated = value;
    }
    /**
     * Sets the totalDevices property value. An integer that indicates the total number of devices in the deployment.
     * @param value Value to set for the totalDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalDevices(@javax.annotation.Nullable final Integer value) {
        this.totalDevices = value;
    }
    /**
     * Sets the totalDownloading property value. An integer that indicates the total number of devices where installation was successful.
     * @param value Value to set for the totalDownloading property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalDownloading(@javax.annotation.Nullable final Integer value) {
        this.totalDownloading = value;
    }
    /**
     * Sets the totalFailedDownload property value. An integer that indicates the total number of devices that have failed to download the new OS file.
     * @param value Value to set for the totalFailedDownload property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalFailedDownload(@javax.annotation.Nullable final Integer value) {
        this.totalFailedDownload = value;
    }
    /**
     * Sets the totalFailedInstall property value. An integer that indicates the total number of devices that have failed to install the new OS file.
     * @param value Value to set for the totalFailedInstall property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalFailedInstall(@javax.annotation.Nullable final Integer value) {
        this.totalFailedInstall = value;
    }
    /**
     * Sets the totalScheduled property value. An integer that indicates the total number of devices that received the json and are scheduled.
     * @param value Value to set for the totalScheduled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalScheduled(@javax.annotation.Nullable final Integer value) {
        this.totalScheduled = value;
    }
    /**
     * Sets the totalSucceededInstall property value. An integer that indicates the total number of devices where installation was successful.
     * @param value Value to set for the totalSucceededInstall property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalSucceededInstall(@javax.annotation.Nullable final Integer value) {
        this.totalSucceededInstall = value;
    }
    /**
     * Sets the totalUnknown property value. An integer that indicates the total number of devices where no deployment status or end state has not received, even after the scheduled end date was reached.
     * @param value Value to set for the totalUnknown property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalUnknown(@javax.annotation.Nullable final Integer value) {
        this.totalUnknown = value;
    }
}
