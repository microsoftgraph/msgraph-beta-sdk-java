package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Configuration Manager client information synced from SCCM */
public class ConfigurationManagerClientInformation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Configuration Manager Client Id from SCCM */
    private String _clientIdentifier;
    /** Configuration Manager Client blocked status from SCCM */
    private Boolean _isBlocked;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new configurationManagerClientInformation and sets the default values.
     * @return a void
     */
    public ConfigurationManagerClientInformation() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.configurationManagerClientInformation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a configurationManagerClientInformation
     */
    @javax.annotation.Nonnull
    public static ConfigurationManagerClientInformation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigurationManagerClientInformation();
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
     * Gets the clientIdentifier property value. Configuration Manager Client Id from SCCM
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientIdentifier() {
        return this._clientIdentifier;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConfigurationManagerClientInformation currentObject = this;
        return new HashMap<>(3) {{
            this.put("clientIdentifier", (n) -> { currentObject.setClientIdentifier(n.getStringValue()); });
            this.put("isBlocked", (n) -> { currentObject.setIsBlocked(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isBlocked property value. Configuration Manager Client blocked status from SCCM
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBlocked() {
        return this._isBlocked;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("clientIdentifier", this.getClientIdentifier());
        writer.writeBooleanValue("isBlocked", this.getIsBlocked());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the clientIdentifier property value. Configuration Manager Client Id from SCCM
     * @param value Value to set for the clientIdentifier property.
     * @return a void
     */
    public void setClientIdentifier(@javax.annotation.Nullable final String value) {
        this._clientIdentifier = value;
    }
    /**
     * Sets the isBlocked property value. Configuration Manager Client blocked status from SCCM
     * @param value Value to set for the isBlocked property.
     * @return a void
     */
    public void setIsBlocked(@javax.annotation.Nullable final Boolean value) {
        this._isBlocked = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
