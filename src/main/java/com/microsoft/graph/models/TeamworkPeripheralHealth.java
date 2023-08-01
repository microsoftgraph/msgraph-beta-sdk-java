package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkPeripheralHealth implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The connected state and time since the peripheral device was connected.
     */
    private TeamworkConnection connection;
    /**
     * True if the peripheral is optional. Used for health computation.
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
     * Instantiates a new teamworkPeripheralHealth and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkPeripheralHealth() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkPeripheralHealth
     */
    @javax.annotation.Nonnull
    public static TeamworkPeripheralHealth createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkPeripheralHealth();
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
     * Gets the connection property value. The connected state and time since the peripheral device was connected.
     * @return a teamworkConnection
     */
    @javax.annotation.Nullable
    public TeamworkConnection getConnection() {
        return this.connection;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("connection", (n) -> { this.setConnection(n.getObjectValue(TeamworkConnection::createFromDiscriminatorValue)); });
        deserializerMap.put("isOptional", (n) -> { this.setIsOptional(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("peripheral", (n) -> { this.setPeripheral(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isOptional property value. True if the peripheral is optional. Used for health computation.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsOptional() {
        return this.isOptional;
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
     * Gets the peripheral property value. The peripheral property
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nullable
    public TeamworkPeripheral getPeripheral() {
        return this.peripheral;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("connection", this.getConnection());
        writer.writeBooleanValue("isOptional", this.getIsOptional());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("peripheral", this.getPeripheral());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the connection property value. The connected state and time since the peripheral device was connected.
     * @param value Value to set for the connection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnection(@javax.annotation.Nullable final TeamworkConnection value) {
        this.connection = value;
    }
    /**
     * Sets the isOptional property value. True if the peripheral is optional. Used for health computation.
     * @param value Value to set for the isOptional property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsOptional(@javax.annotation.Nullable final Boolean value) {
        this.isOptional = value;
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
     * Sets the peripheral property value. The peripheral property
     * @param value Value to set for the peripheral property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeripheral(@javax.annotation.Nullable final TeamworkPeripheral value) {
        this.peripheral = value;
    }
}
