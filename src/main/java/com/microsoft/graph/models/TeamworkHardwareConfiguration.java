package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkHardwareConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The compute property
     */
    private TeamworkPeripheral compute;
    /**
     * The hdmiIngest property
     */
    private TeamworkPeripheral hdmiIngest;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The CPU model on the device.
     */
    private String processorModel;
    /**
     * Instantiates a new teamworkHardwareConfiguration and sets the default values.
     */
    public TeamworkHardwareConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkHardwareConfiguration
     */
    @jakarta.annotation.Nonnull
    public static TeamworkHardwareConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkHardwareConfiguration();
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
     * Gets the compute property value. The compute property
     * @return a teamworkPeripheral
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheral getCompute() {
        return this.compute;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("compute", (n) -> { this.setCompute(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("hdmiIngest", (n) -> { this.setHdmiIngest(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("processorModel", (n) -> { this.setProcessorModel(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hdmiIngest property value. The hdmiIngest property
     * @return a teamworkPeripheral
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheral getHdmiIngest() {
        return this.hdmiIngest;
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
     * Gets the processorModel property value. The CPU model on the device.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getProcessorModel() {
        return this.processorModel;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("compute", this.getCompute());
        writer.writeObjectValue("hdmiIngest", this.getHdmiIngest());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("processorModel", this.getProcessorModel());
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
     * Sets the compute property value. The compute property
     * @param value Value to set for the compute property.
     */
    public void setCompute(@jakarta.annotation.Nullable final TeamworkPeripheral value) {
        this.compute = value;
    }
    /**
     * Sets the hdmiIngest property value. The hdmiIngest property
     * @param value Value to set for the hdmiIngest property.
     */
    public void setHdmiIngest(@jakarta.annotation.Nullable final TeamworkPeripheral value) {
        this.hdmiIngest = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the processorModel property value. The CPU model on the device.
     * @param value Value to set for the processorModel property.
     */
    public void setProcessorModel(@jakarta.annotation.Nullable final String value) {
        this.processorModel = value;
    }
}
