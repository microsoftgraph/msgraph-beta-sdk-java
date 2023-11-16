package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The embedded SIM activation code as provided by the mobile operator.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmbeddedSIMActivationCode implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new EmbeddedSIMActivationCode and sets the default values.
     */
    public EmbeddedSIMActivationCode() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EmbeddedSIMActivationCode
     */
    @jakarta.annotation.Nonnull
    public static EmbeddedSIMActivationCode createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmbeddedSIMActivationCode();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIntegratedCircuitCardIdentifier() {
        return this.BackingStore.get("integratedCircuitCardIdentifier");
    }
    /**
     * Gets the matchingIdentifier property value. The MatchingIdentifier (MatchingID) as specified in the GSMA Association SGP.22 RSP Technical Specification section 4.1.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMatchingIdentifier() {
        return this.BackingStore.get("matchingIdentifier");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the smdpPlusServerAddress property value. The fully qualified domain name of the SM-DP+ server as specified in the GSM Association SPG .22 RSP Technical Specification.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSmdpPlusServerAddress() {
        return this.BackingStore.get("smdpPlusServerAddress");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("integratedCircuitCardIdentifier", this.getIntegratedCircuitCardIdentifier());
        writer.writeStringValue("matchingIdentifier", this.getMatchingIdentifier());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("smdpPlusServerAddress", this.getSmdpPlusServerAddress());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the integratedCircuitCardIdentifier property value. The Integrated Circuit Card Identifier (ICCID) for this embedded SIM activation code as provided by the mobile operator.
     * @param value Value to set for the integratedCircuitCardIdentifier property.
     */
    public void setIntegratedCircuitCardIdentifier(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("integratedCircuitCardIdentifier", value);
    }
    /**
     * Sets the matchingIdentifier property value. The MatchingIdentifier (MatchingID) as specified in the GSMA Association SGP.22 RSP Technical Specification section 4.1.
     * @param value Value to set for the matchingIdentifier property.
     */
    public void setMatchingIdentifier(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("matchingIdentifier", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the smdpPlusServerAddress property value. The fully qualified domain name of the SM-DP+ server as specified in the GSM Association SPG .22 RSP Technical Specification.
     * @param value Value to set for the smdpPlusServerAddress property.
     */
    public void setSmdpPlusServerAddress(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("smdpPlusServerAddress", value);
    }
}
