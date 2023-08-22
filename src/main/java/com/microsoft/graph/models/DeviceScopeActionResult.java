package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The result of the triggered device scope action.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceScopeActionResult implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Trigger on the service to either START or STOP computing metrics data based on a device scope configuration.
     */
    private String deviceScopeAction;
    /**
     * The unique identifier of the device scope the action was triggered on.
     */
    private String deviceScopeId;
    /**
     * The message indicates the reason the device scope action failed to trigger.
     */
    private String failedMessage;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Indicates the status of the attempted device scope action
     */
    private DeviceScopeActionStatus status;
    /**
     * Instantiates a new deviceScopeActionResult and sets the default values.
     */
    public DeviceScopeActionResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceScopeActionResult
     */
    @jakarta.annotation.Nonnull
    public static DeviceScopeActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceScopeActionResult();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the deviceScopeAction property value. Trigger on the service to either START or STOP computing metrics data based on a device scope configuration.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceScopeAction() {
        return this.deviceScopeAction;
    }
    /**
     * Gets the deviceScopeId property value. The unique identifier of the device scope the action was triggered on.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceScopeId() {
        return this.deviceScopeId;
    }
    /**
     * Gets the failedMessage property value. The message indicates the reason the device scope action failed to trigger.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFailedMessage() {
        return this.failedMessage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("deviceScopeAction", (n) -> { this.setDeviceScopeAction(n.getStringValue()); });
        deserializerMap.put("deviceScopeId", (n) -> { this.setDeviceScopeId(n.getStringValue()); });
        deserializerMap.put("failedMessage", (n) -> { this.setFailedMessage(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(DeviceScopeActionStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the status property value. Indicates the status of the attempted device scope action
     * @return a deviceScopeActionStatus
     */
    @jakarta.annotation.Nullable
    public DeviceScopeActionStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("deviceScopeAction", this.getDeviceScopeAction());
        writer.writeStringValue("deviceScopeId", this.getDeviceScopeId());
        writer.writeStringValue("failedMessage", this.getFailedMessage());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the deviceScopeAction property value. Trigger on the service to either START or STOP computing metrics data based on a device scope configuration.
     * @param value Value to set for the deviceScopeAction property.
     */
    public void setDeviceScopeAction(@jakarta.annotation.Nullable final String value) {
        this.deviceScopeAction = value;
    }
    /**
     * Sets the deviceScopeId property value. The unique identifier of the device scope the action was triggered on.
     * @param value Value to set for the deviceScopeId property.
     */
    public void setDeviceScopeId(@jakarta.annotation.Nullable final String value) {
        this.deviceScopeId = value;
    }
    /**
     * Sets the failedMessage property value. The message indicates the reason the device scope action failed to trigger.
     * @param value Value to set for the failedMessage property.
     */
    public void setFailedMessage(@jakarta.annotation.Nullable final String value) {
        this.failedMessage = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the status property value. Indicates the status of the attempted device scope action
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final DeviceScopeActionStatus value) {
        this.status = value;
    }
}
