package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkPeripheralHealth implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The connected state and time since the peripheral device was connected. */
    private TeamworkConnection _connection;
    /** True if the peripheral is optional. Used for health computation. */
    private Boolean _isOptional;
    /** The OdataType property */
    private String _odataType;
    /** The peripheral property */
    private TeamworkPeripheral _peripheral;
    /**
     * Instantiates a new teamworkPeripheralHealth and sets the default values.
     * @return a void
     */
    public TeamworkPeripheralHealth() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.teamworkPeripheralHealth");
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
        return this._additionalData;
    }
    /**
     * Gets the connection property value. The connected state and time since the peripheral device was connected.
     * @return a teamworkConnection
     */
    @javax.annotation.Nullable
    public TeamworkConnection getConnection() {
        return this._connection;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkPeripheralHealth currentObject = this;
        return new HashMap<>(4) {{
            this.put("connection", (n) -> { currentObject.setConnection(n.getObjectValue(TeamworkConnection::createFromDiscriminatorValue)); });
            this.put("isOptional", (n) -> { currentObject.setIsOptional(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("peripheral", (n) -> { currentObject.setPeripheral(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isOptional property value. True if the peripheral is optional. Used for health computation.
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
        writer.writeObjectValue("connection", this.getConnection());
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
     * Sets the connection property value. The connected state and time since the peripheral device was connected.
     * @param value Value to set for the connection property.
     * @return a void
     */
    public void setConnection(@javax.annotation.Nullable final TeamworkConnection value) {
        this._connection = value;
    }
    /**
     * Sets the isOptional property value. True if the peripheral is optional. Used for health computation.
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
