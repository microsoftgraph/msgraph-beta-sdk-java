package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The number of devices remediated by a device health script on a given date.
 */
public class DeviceHealthScriptRemediationHistoryData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date on which devices were remediated by the device health script.
     */
    private LocalDate date;
    /**
     * The number of devices for which the detection script found an issue.
     */
    private Integer detectFailedDeviceCount;
    /**
     * The number of devices that were found to have no issue by the device health script.
     */
    private Integer noIssueDeviceCount;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The number of devices remediated by the device health script.
     */
    private Integer remediatedDeviceCount;
    /**
     * Instantiates a new deviceHealthScriptRemediationHistoryData and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceHealthScriptRemediationHistoryData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceHealthScriptRemediationHistoryData
     */
    @javax.annotation.Nonnull
    public static DeviceHealthScriptRemediationHistoryData createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScriptRemediationHistoryData();
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
     * Gets the date property value. The date on which devices were remediated by the device health script.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getDate() {
        return this.date;
    }
    /**
     * Gets the detectFailedDeviceCount property value. The number of devices for which the detection script found an issue.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDetectFailedDeviceCount() {
        return this.detectFailedDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("date", (n) -> { this.setDate(n.getLocalDateValue()); });
        deserializerMap.put("detectFailedDeviceCount", (n) -> { this.setDetectFailedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("noIssueDeviceCount", (n) -> { this.setNoIssueDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("remediatedDeviceCount", (n) -> { this.setRemediatedDeviceCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the noIssueDeviceCount property value. The number of devices that were found to have no issue by the device health script.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNoIssueDeviceCount() {
        return this.noIssueDeviceCount;
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
     * Gets the remediatedDeviceCount property value. The number of devices remediated by the device health script.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRemediatedDeviceCount() {
        return this.remediatedDeviceCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLocalDateValue("date", this.getDate());
        writer.writeIntegerValue("detectFailedDeviceCount", this.getDetectFailedDeviceCount());
        writer.writeIntegerValue("noIssueDeviceCount", this.getNoIssueDeviceCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("remediatedDeviceCount", this.getRemediatedDeviceCount());
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
     * Sets the date property value. The date on which devices were remediated by the device health script.
     * @param value Value to set for the date property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDate(@javax.annotation.Nullable final LocalDate value) {
        this.date = value;
    }
    /**
     * Sets the detectFailedDeviceCount property value. The number of devices for which the detection script found an issue.
     * @param value Value to set for the detectFailedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectFailedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.detectFailedDeviceCount = value;
    }
    /**
     * Sets the noIssueDeviceCount property value. The number of devices that were found to have no issue by the device health script.
     * @param value Value to set for the noIssueDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNoIssueDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.noIssueDeviceCount = value;
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
     * Sets the remediatedDeviceCount property value. The number of devices remediated by the device health script.
     * @param value Value to set for the remediatedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemediatedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.remediatedDeviceCount = value;
    }
}
