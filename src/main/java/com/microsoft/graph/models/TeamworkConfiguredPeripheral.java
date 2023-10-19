package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkConfiguredPeripheral implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * True if the current peripheral is optional. If set to false, this property is also used as part of the calculation of the health state for the device.
     */
    private Boolean isOptional;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The peripheral property
     */
    private TeamworkPeripheral peripheral;
    /**
     * Instantiates a new TeamworkConfiguredPeripheral and sets the default values.
     */
    public TeamworkConfiguredPeripheral() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkConfiguredPeripheral
     */
    @jakarta.annotation.Nonnull
    public static TeamworkConfiguredPeripheral createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkConfiguredPeripheral();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("isOptional", (n) -> { this.setIsOptional(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("peripheral", (n) -> { this.setPeripheral(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isOptional property value. True if the current peripheral is optional. If set to false, this property is also used as part of the calculation of the health state for the device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOptional() {
        return this.isOptional;
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
     * Gets the peripheral property value. The peripheral property
     * @return a TeamworkPeripheral
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheral getPeripheral() {
        return this.peripheral;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isOptional", this.getIsOptional());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("peripheral", this.getPeripheral());
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
     * Sets the isOptional property value. True if the current peripheral is optional. If set to false, this property is also used as part of the calculation of the health state for the device.
     * @param value Value to set for the isOptional property.
     */
    public void setIsOptional(@jakarta.annotation.Nullable final Boolean value) {
        this.isOptional = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the peripheral property value. The peripheral property
     * @param value Value to set for the peripheral property.
     */
    public void setPeripheral(@jakarta.annotation.Nullable final TeamworkPeripheral value) {
        this.peripheral = value;
    }
}
