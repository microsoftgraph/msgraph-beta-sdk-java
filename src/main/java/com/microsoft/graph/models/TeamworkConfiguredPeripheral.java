package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkConfiguredPeripheral implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** True if the current peripheral is optional. If set to false, this property is also used as part of the calculation of the health state for the device. */
    private Boolean _isOptional;
    /** The OdataType property */
    private String _odataType;
    /** The peripheral property */
    private TeamworkPeripheral _peripheral;
    /**
     * Instantiates a new teamworkConfiguredPeripheral and sets the default values.
     * @return a void
     */
    public TeamworkConfiguredPeripheral() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.teamworkConfiguredPeripheral");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkConfiguredPeripheral
     */
    @javax.annotation.Nonnull
    public static TeamworkConfiguredPeripheral createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkConfiguredPeripheral();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkConfiguredPeripheral currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("isOptional", (n) -> { currentObject.setIsOptional(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("peripheral", (n) -> { currentObject.setPeripheral(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isOptional property value. True if the current peripheral is optional. If set to false, this property is also used as part of the calculation of the health state for the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsOptional() {
        return this._isOptional;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the peripheral property value. The peripheral property
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nullable
    public TeamworkPeripheral getPeripheral() {
        return this._peripheral;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isOptional", this.getIsOptional());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("peripheral", this.getPeripheral());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the isOptional property value. True if the current peripheral is optional. If set to false, this property is also used as part of the calculation of the health state for the device.
     * @param value Value to set for the isOptional property.
     * @return a void
     */
    public void setIsOptional(@javax.annotation.Nullable final Boolean value) {
        this._isOptional = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the peripheral property value. The peripheral property
     * @param value Value to set for the peripheral property.
     * @return a void
     */
    public void setPeripheral(@javax.annotation.Nullable final TeamworkPeripheral value) {
        this._peripheral = value;
    }
}
