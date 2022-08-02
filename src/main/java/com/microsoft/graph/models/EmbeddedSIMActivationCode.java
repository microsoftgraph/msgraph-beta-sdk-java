package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The embedded SIM activation code as provided by the mobile operator. */
public class EmbeddedSIMActivationCode implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The Integrated Circuit Card Identifier (ICCID) for this embedded SIM activation code as provided by the mobile operator. */
    private String _integratedCircuitCardIdentifier;
    /** The MatchingIdentifier (MatchingID) as specified in the GSMA Association SGP.22 RSP Technical Specification section 4.1. */
    private String _matchingIdentifier;
    /** The OdataType property */
    private String _odataType;
    /** The fully qualified domain name of the SM-DP+ server as specified in the GSM Association SPG .22 RSP Technical Specification. */
    private String _smdpPlusServerAddress;
    /**
     * Instantiates a new embeddedSIMActivationCode and sets the default values.
     * @return a void
     */
    public EmbeddedSIMActivationCode() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.embeddedSIMActivationCode");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a embeddedSIMActivationCode
     */
    @javax.annotation.Nonnull
    public static EmbeddedSIMActivationCode createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmbeddedSIMActivationCode();
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
        final EmbeddedSIMActivationCode currentObject = this;
        return new HashMap<>(4) {{
            this.put("integratedCircuitCardIdentifier", (n) -> { currentObject.setIntegratedCircuitCardIdentifier(n.getStringValue()); });
            this.put("matchingIdentifier", (n) -> { currentObject.setMatchingIdentifier(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("smdpPlusServerAddress", (n) -> { currentObject.setSmdpPlusServerAddress(n.getStringValue()); });
        }};
    }
    /**
     * Gets the integratedCircuitCardIdentifier property value. The Integrated Circuit Card Identifier (ICCID) for this embedded SIM activation code as provided by the mobile operator.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIntegratedCircuitCardIdentifier() {
        return this._integratedCircuitCardIdentifier;
    }
    /**
     * Gets the matchingIdentifier property value. The MatchingIdentifier (MatchingID) as specified in the GSMA Association SGP.22 RSP Technical Specification section 4.1.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMatchingIdentifier() {
        return this._matchingIdentifier;
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
     * Gets the smdpPlusServerAddress property value. The fully qualified domain name of the SM-DP+ server as specified in the GSM Association SPG .22 RSP Technical Specification.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSmdpPlusServerAddress() {
        return this._smdpPlusServerAddress;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("integratedCircuitCardIdentifier", this.getIntegratedCircuitCardIdentifier());
        writer.writeStringValue("matchingIdentifier", this.getMatchingIdentifier());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("smdpPlusServerAddress", this.getSmdpPlusServerAddress());
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
     * Sets the integratedCircuitCardIdentifier property value. The Integrated Circuit Card Identifier (ICCID) for this embedded SIM activation code as provided by the mobile operator.
     * @param value Value to set for the integratedCircuitCardIdentifier property.
     * @return a void
     */
    public void setIntegratedCircuitCardIdentifier(@javax.annotation.Nullable final String value) {
        this._integratedCircuitCardIdentifier = value;
    }
    /**
     * Sets the matchingIdentifier property value. The MatchingIdentifier (MatchingID) as specified in the GSMA Association SGP.22 RSP Technical Specification section 4.1.
     * @param value Value to set for the matchingIdentifier property.
     * @return a void
     */
    public void setMatchingIdentifier(@javax.annotation.Nullable final String value) {
        this._matchingIdentifier = value;
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
     * Sets the smdpPlusServerAddress property value. The fully qualified domain name of the SM-DP+ server as specified in the GSM Association SPG .22 RSP Technical Specification.
     * @param value Value to set for the smdpPlusServerAddress property.
     * @return a void
     */
    public void setSmdpPlusServerAddress(@javax.annotation.Nullable final String value) {
        this._smdpPlusServerAddress = value;
    }
}
