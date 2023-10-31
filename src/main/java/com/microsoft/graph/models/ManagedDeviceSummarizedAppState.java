package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Event representing a user's devices with failed or pending apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedDeviceSummarizedAppState implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * DeviceId of device represented by this object
     */
    private String deviceId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Indicates the type of execution status of the device management script.
     */
    private RunState summarizedAppState;
    /**
     * Instantiates a new ManagedDeviceSummarizedAppState and sets the default values.
     */
    public ManagedDeviceSummarizedAppState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedDeviceSummarizedAppState
     */
    @jakarta.annotation.Nonnull
    public static ManagedDeviceSummarizedAppState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceSummarizedAppState();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the deviceId property value. DeviceId of device represented by this object
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("summarizedAppState", (n) -> { this.setSummarizedAppState(n.getEnumValue(RunState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the summarizedAppState property value. Indicates the type of execution status of the device management script.
     * @return a RunState
     */
    @jakarta.annotation.Nullable
    public RunState getSummarizedAppState() {
        return this.summarizedAppState;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("summarizedAppState", this.getSummarizedAppState());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the deviceId property value. DeviceId of device represented by this object
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the summarizedAppState property value. Indicates the type of execution status of the device management script.
     * @param value Value to set for the summarizedAppState property.
     */
    public void setSummarizedAppState(@jakarta.annotation.Nullable final RunState value) {
        this.summarizedAppState = value;
    }
}
