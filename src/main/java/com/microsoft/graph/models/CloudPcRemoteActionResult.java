package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcRemoteActionResult implements AdditionalDataHolder, Parsable {
    /**
     * The specified action. Supported values in the Microsoft Endpoint Manager portal are: Reprovision, Resize, Restore. Supported values in enterprise Cloud PC devices are: Reboot, Rename, Reprovision, Troubleshoot.
     */
    private String actionName;
    /**
     * State of the action. Possible values are: None, pending, canceled, active, done, failed, notSupported. Read-only.
     */
    private ActionState actionState;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ID of the Cloud PC device on which the remote action is performed. Read-only.
     */
    private String cloudPcId;
    /**
     * Last update time for action. The Timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as'2014-01-01T00:00:00Z'.
     */
    private OffsetDateTime lastUpdatedDateTime;
    /**
     * The ID of the Intune managed device on which the remote action is performed. Read-only.
     */
    private String managedDeviceId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Time the action was initiated. The Timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as'2014-01-01T00:00:00Z'.
     */
    private OffsetDateTime startDateTime;
    /**
     * The details of the Cloud PC status.
     */
    private CloudPcStatusDetails statusDetails;
    /**
     * Instantiates a new cloudPcRemoteActionResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPcRemoteActionResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcRemoteActionResult
     */
    @javax.annotation.Nonnull
    public static CloudPcRemoteActionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcRemoteActionResult();
    }
    /**
     * Gets the actionName property value. The specified action. Supported values in the Microsoft Endpoint Manager portal are: Reprovision, Resize, Restore. Supported values in enterprise Cloud PC devices are: Reboot, Rename, Reprovision, Troubleshoot.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActionName() {
        return this.actionName;
    }
    /**
     * Gets the actionState property value. State of the action. Possible values are: None, pending, canceled, active, done, failed, notSupported. Read-only.
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
     * Gets the cloudPcId property value. The ID of the Cloud PC device on which the remote action is performed. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudPcId() {
        return this.cloudPcId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("actionName", (n) -> { this.setActionName(n.getStringValue()); });
        deserializerMap.put("actionState", (n) -> { this.setActionState(n.getEnumValue(ActionState.class)); });
        deserializerMap.put("cloudPcId", (n) -> { this.setCloudPcId(n.getStringValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("statusDetails", (n) -> { this.setStatusDetails(n.getObjectValue(CloudPcStatusDetails::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastUpdatedDateTime property value. Last update time for action. The Timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as'2014-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }
    /**
     * Gets the managedDeviceId property value. The ID of the Intune managed device on which the remote action is performed. Read-only.
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
     * Gets the startDateTime property value. Time the action was initiated. The Timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as'2014-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the statusDetails property value. The details of the Cloud PC status.
     * @return a cloudPcStatusDetails
     */
    @javax.annotation.Nullable
    public CloudPcStatusDetails getStatusDetails() {
        return this.statusDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actionName", this.getActionName());
        writer.writeEnumValue("actionState", this.getActionState());
        writer.writeStringValue("cloudPcId", this.getCloudPcId());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeObjectValue("statusDetails", this.getStatusDetails());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionName property value. The specified action. Supported values in the Microsoft Endpoint Manager portal are: Reprovision, Resize, Restore. Supported values in enterprise Cloud PC devices are: Reboot, Rename, Reprovision, Troubleshoot.
     * @param value Value to set for the actionName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionName(@javax.annotation.Nullable final String value) {
        this.actionName = value;
    }
    /**
     * Sets the actionState property value. State of the action. Possible values are: None, pending, canceled, active, done, failed, notSupported. Read-only.
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
     * Sets the cloudPcId property value. The ID of the Cloud PC device on which the remote action is performed. Read-only.
     * @param value Value to set for the cloudPcId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudPcId(@javax.annotation.Nullable final String value) {
        this.cloudPcId = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. Last update time for action. The Timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as'2014-01-01T00:00:00Z'.
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdatedDateTime = value;
    }
    /**
     * Sets the managedDeviceId property value. The ID of the Intune managed device on which the remote action is performed. Read-only.
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
     * Sets the startDateTime property value. Time the action was initiated. The Timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as'2014-01-01T00:00:00Z'.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the statusDetails property value. The details of the Cloud PC status.
     * @param value Value to set for the statusDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatusDetails(@javax.annotation.Nullable final CloudPcStatusDetails value) {
        this.statusDetails = value;
    }
}
