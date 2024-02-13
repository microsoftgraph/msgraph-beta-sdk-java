package com.microsoft.graph.beta.models;

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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TrustFrameworkKey implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link TrustFrameworkKey} and sets the default values.
     */
    public TrustFrameworkKey() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TrustFrameworkKey}
     */
    @jakarta.annotation.Nonnull
    public static TrustFrameworkKey createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrustFrameworkKey();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the d property value. RSA Key - private exponent. Field can't be read back.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getD() {
        return this.backingStore.get("d");
    }
    /**
     * Gets the dp property value. RSA Key - first exponent. Field can't be read back.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDp() {
        return this.backingStore.get("dp");
    }
    /**
     * Gets the dq property value. RSA Key - second exponent. Field can't be read back.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDq() {
        return this.backingStore.get("dq");
    }
    /**
     * Gets the e property value. RSA Key - public exponent
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getE() {
        return this.backingStore.get("e");
    }
    /**
     * Gets the exp property value. This value is a NumericDate as defined in RFC 7519 (A JSON numeric value representing the number of seconds from 1970-01-01T00:00:00Z UTC until the specified UTC date/time, ignoring leap seconds.)
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getExp() {
        return this.backingStore.get("exp");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(17);
        deserializerMap.put("d", (n) -> { this.setD(n.getStringValue()); });
        deserializerMap.put("dp", (n) -> { this.setDp(n.getStringValue()); });
        deserializerMap.put("dq", (n) -> { this.setDq(n.getStringValue()); });
        deserializerMap.put("e", (n) -> { this.setE(n.getStringValue()); });
        deserializerMap.put("exp", (n) -> { this.setExp(n.getLongValue()); });
        deserializerMap.put("k", (n) -> { this.setK(n.getStringValue()); });
        deserializerMap.put("kid", (n) -> { this.setKid(n.getStringValue()); });
        deserializerMap.put("kty", (n) -> { this.setKty(n.getStringValue()); });
        deserializerMap.put("n", (n) -> { this.setN(n.getStringValue()); });
        deserializerMap.put("nbf", (n) -> { this.setNbf(n.getLongValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("p", (n) -> { this.setP(n.getStringValue()); });
        deserializerMap.put("q", (n) -> { this.setQ(n.getStringValue()); });
        deserializerMap.put("qi", (n) -> { this.setQi(n.getStringValue()); });
        deserializerMap.put("use", (n) -> { this.setUse(n.getStringValue()); });
        deserializerMap.put("x5c", (n) -> { this.setX5c(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("x5t", (n) -> { this.setX5t(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the k property value. Symmetric Key for oct key type. Field can't be read back.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getK() {
        return this.backingStore.get("k");
    }
    /**
     * Gets the kid property value. The unique identifier for the key.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKid() {
        return this.backingStore.get("kid");
    }
    /**
     * Gets the kty property value. The kty (key type) parameter identifies the cryptographic algorithm family used with the key, The valid values are rsa, oct.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKty() {
        return this.backingStore.get("kty");
    }
    /**
     * Gets the n property value. RSA Key - modulus
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getN() {
        return this.backingStore.get("n");
    }
    /**
     * Gets the nbf property value. This value is a NumericDate as defined in RFC 7519 (A JSON numeric value representing the number of seconds from 1970-01-01T00:00:00Z UTC until the specified UTC date/time, ignoring leap seconds.)
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getNbf() {
        return this.backingStore.get("nbf");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the p property value. RSA Key - first prime. Field can't be read back.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getP() {
        return this.backingStore.get("p");
    }
    /**
     * Gets the q property value. RSA Key - second prime. Field can't be read back.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getQ() {
        return this.backingStore.get("q");
    }
    /**
     * Gets the qi property value. RSA Key - Coefficient. Field can't be read back.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getQi() {
        return this.backingStore.get("qi");
    }
    /**
     * Gets the use property value. The use (public key use) parameter identifies the intended use of the public key.  The use parameter is employed to indicate whether a public key is used for encrypting data or verifying the signature on data. Possible values are: sig (signature), enc (encryption)
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUse() {
        return this.backingStore.get("use");
    }
    /**
     * Gets the x5c property value. The x5c (X.509 certificate chain) parameter contains a chain of one or more PKIX certificates RFC 5280.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getX5c() {
        return this.backingStore.get("x5c");
    }
    /**
     * Gets the x5t property value. The x5t (X.509 certificate SHA-1 thumbprint) parameter is a base64url-encoded SHA-1 thumbprint (also known as digest) of the DER encoding of an X.509 certificate RFC 5280.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getX5t() {
        return this.backingStore.get("x5t");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("d", this.getD());
        writer.writeStringValue("dp", this.getDp());
        writer.writeStringValue("dq", this.getDq());
        writer.writeStringValue("e", this.getE());
        writer.writeLongValue("exp", this.getExp());
        writer.writeStringValue("k", this.getK());
        writer.writeStringValue("kid", this.getKid());
        writer.writeStringValue("kty", this.getKty());
        writer.writeStringValue("n", this.getN());
        writer.writeLongValue("nbf", this.getNbf());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("p", this.getP());
        writer.writeStringValue("q", this.getQ());
        writer.writeStringValue("qi", this.getQi());
        writer.writeStringValue("use", this.getUse());
        writer.writeCollectionOfPrimitiveValues("x5c", this.getX5c());
        writer.writeStringValue("x5t", this.getX5t());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the d property value. RSA Key - private exponent. Field can't be read back.
     * @param value Value to set for the d property.
     */
    public void setD(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("d", value);
    }
    /**
     * Sets the dp property value. RSA Key - first exponent. Field can't be read back.
     * @param value Value to set for the dp property.
     */
    public void setDp(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dp", value);
    }
    /**
     * Sets the dq property value. RSA Key - second exponent. Field can't be read back.
     * @param value Value to set for the dq property.
     */
    public void setDq(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dq", value);
    }
    /**
     * Sets the e property value. RSA Key - public exponent
     * @param value Value to set for the e property.
     */
    public void setE(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("e", value);
    }
    /**
     * Sets the exp property value. This value is a NumericDate as defined in RFC 7519 (A JSON numeric value representing the number of seconds from 1970-01-01T00:00:00Z UTC until the specified UTC date/time, ignoring leap seconds.)
     * @param value Value to set for the exp property.
     */
    public void setExp(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("exp", value);
    }
    /**
     * Sets the k property value. Symmetric Key for oct key type. Field can't be read back.
     * @param value Value to set for the k property.
     */
    public void setK(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("k", value);
    }
    /**
     * Sets the kid property value. The unique identifier for the key.
     * @param value Value to set for the kid property.
     */
    public void setKid(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("kid", value);
    }
    /**
     * Sets the kty property value. The kty (key type) parameter identifies the cryptographic algorithm family used with the key, The valid values are rsa, oct.
     * @param value Value to set for the kty property.
     */
    public void setKty(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("kty", value);
    }
    /**
     * Sets the n property value. RSA Key - modulus
     * @param value Value to set for the n property.
     */
    public void setN(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("n", value);
    }
    /**
     * Sets the nbf property value. This value is a NumericDate as defined in RFC 7519 (A JSON numeric value representing the number of seconds from 1970-01-01T00:00:00Z UTC until the specified UTC date/time, ignoring leap seconds.)
     * @param value Value to set for the nbf property.
     */
    public void setNbf(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("nbf", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the p property value. RSA Key - first prime. Field can't be read back.
     * @param value Value to set for the p property.
     */
    public void setP(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("p", value);
    }
    /**
     * Sets the q property value. RSA Key - second prime. Field can't be read back.
     * @param value Value to set for the q property.
     */
    public void setQ(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("q", value);
    }
    /**
     * Sets the qi property value. RSA Key - Coefficient. Field can't be read back.
     * @param value Value to set for the qi property.
     */
    public void setQi(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("qi", value);
    }
    /**
     * Sets the use property value. The use (public key use) parameter identifies the intended use of the public key.  The use parameter is employed to indicate whether a public key is used for encrypting data or verifying the signature on data. Possible values are: sig (signature), enc (encryption)
     * @param value Value to set for the use property.
     */
    public void setUse(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("use", value);
    }
    /**
     * Sets the x5c property value. The x5c (X.509 certificate chain) parameter contains a chain of one or more PKIX certificates RFC 5280.
     * @param value Value to set for the x5c property.
     */
    public void setX5c(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("x5c", value);
    }
    /**
     * Sets the x5t property value. The x5t (X.509 certificate SHA-1 thumbprint) parameter is a base64url-encoded SHA-1 thumbprint (also known as digest) of the DER encoding of an X.509 certificate RFC 5280.
     * @param value Value to set for the x5t property.
     */
    public void setX5t(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("x5t", value);
    }
}
