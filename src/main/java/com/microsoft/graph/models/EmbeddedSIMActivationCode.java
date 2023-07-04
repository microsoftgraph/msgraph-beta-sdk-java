package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The embedded SIM activation code as provided by the mobile operator.
 */
public class EmbeddedSIMActivationCode implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Integrated Circuit Card Identifier (ICCID) for this embedded SIM activation code as provided by the mobile operator.
     */
    private String integratedCircuitCardIdentifier;
    /**
     * The MatchingIdentifier (MatchingID) as specified in the GSMA Association SGP.22 RSP Technical Specification section 4.1.
     */
    private String matchingIdentifier;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The fully qualified domain name of the SM-DP+ server as specified in the GSM Association SPG .22 RSP Technical Specification.
     */
    private String smdpPlusServerAddress;
    /**
     * Instantiates a new EmbeddedSIMActivationCode and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EmbeddedSIMActivationCode() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EmbeddedSIMActivationCode
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
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("integratedCircuitCardIdentifier", (n) -> { this.setIntegratedCircuitCardIdentifier(n.getStringValue()); });
        deserializerMap.put("matchingIdentifier", (n) -> { this.setMatchingIdentifier(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("smdpPlusServerAddress", (n) -> { this.setSmdpPlusServerAddress(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the integratedCircuitCardIdentifier property value. The Integrated Circuit Card Identifier (ICCID) for this embedded SIM activation code as provided by the mobile operator.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIntegratedCircuitCardIdentifier() {
        return this.integratedCircuitCardIdentifier;
    }
    /**
     * Gets the matchingIdentifier property value. The MatchingIdentifier (MatchingID) as specified in the GSMA Association SGP.22 RSP Technical Specification section 4.1.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMatchingIdentifier() {
        return this.matchingIdentifier;
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
     * Gets the smdpPlusServerAddress property value. The fully qualified domain name of the SM-DP+ server as specified in the GSM Association SPG .22 RSP Technical Specification.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSmdpPlusServerAddress() {
        return this.smdpPlusServerAddress;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the integratedCircuitCardIdentifier property value. The Integrated Circuit Card Identifier (ICCID) for this embedded SIM activation code as provided by the mobile operator.
     * @param value Value to set for the integratedCircuitCardIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntegratedCircuitCardIdentifier(@javax.annotation.Nullable final String value) {
        this.integratedCircuitCardIdentifier = value;
    }
    /**
     * Sets the matchingIdentifier property value. The MatchingIdentifier (MatchingID) as specified in the GSMA Association SGP.22 RSP Technical Specification section 4.1.
     * @param value Value to set for the matchingIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMatchingIdentifier(@javax.annotation.Nullable final String value) {
        this.matchingIdentifier = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the smdpPlusServerAddress property value. The fully qualified domain name of the SM-DP+ server as specified in the GSM Association SPG .22 RSP Technical Specification.
     * @param value Value to set for the smdpPlusServerAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmdpPlusServerAddress(@javax.annotation.Nullable final String value) {
        this.smdpPlusServerAddress = value;
    }
}
