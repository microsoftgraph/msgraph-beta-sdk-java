package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TrustFrameworkKey implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** RSA Key - private exponent. Field cannot be read back. */
    private String _d;
    /** RSA Key - first exponent. Field cannot be read back. */
    private String _dp;
    /** RSA Key - second exponent. Field cannot be read back. */
    private String _dq;
    /** RSA Key - public exponent */
    private String _e;
    /** This value is a NumericDate as defined in RFC 7519 (A JSON numeric value representing the number of seconds from 1970-01-01T00:00:00Z UTC until the specified UTC date/time, ignoring leap seconds.) */
    private Long _exp;
    /** Symmetric Key for oct key type. Field cannot be read back. */
    private String _k;
    /** The unique identifier for the key. */
    private String _kid;
    /** The kty (key type) parameter identifies the cryptographic algorithm family used with the key, The valid values are rsa, oct. */
    private String _kty;
    /** RSA Key - modulus */
    private String _n;
    /** This value is a NumericDate as defined in RFC 7519 (A JSON numeric value representing the number of seconds from 1970-01-01T00:00:00Z UTC until the specified UTC date/time, ignoring leap seconds.) */
    private Long _nbf;
    /** The OdataType property */
    private String _odataType;
    /** RSA Key - first prime. Field cannot be read back. */
    private String _p;
    /** RSA Key - second prime. Field cannot be read back. */
    private String _q;
    /** RSA Key - Coefficient. Field cannot be read back. */
    private String _qi;
    /** The use (public key use) parameter identifies the intended use of the public key.  The use parameter is employed to indicate whether a public key is used for encrypting data or verifying the signature on data. Possible values are: sig (signature), enc (encryption) */
    private String _use;
    /** The x5c (X.509 certificate chain) parameter contains a chain of one or more PKIX certificates RFC 5280. */
    private java.util.List<String> _x5c;
    /** The x5t (X.509 certificate SHA-1 thumbprint) parameter is a base64url-encoded SHA-1 thumbprint (a.k.a. digest) of the DER encoding of an X.509 certificate RFC 5280. */
    private String _x5t;
    /**
     * Instantiates a new trustFrameworkKey and sets the default values.
     * @return a void
     */
    public TrustFrameworkKey() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.trustFrameworkKey");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a trustFrameworkKey
     */
    @javax.annotation.Nonnull
    public static TrustFrameworkKey createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrustFrameworkKey();
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
     * Gets the d property value. RSA Key - private exponent. Field cannot be read back.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getD() {
        return this._d;
    }
    /**
     * Gets the dp property value. RSA Key - first exponent. Field cannot be read back.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDp() {
        return this._dp;
    }
    /**
     * Gets the dq property value. RSA Key - second exponent. Field cannot be read back.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDq() {
        return this._dq;
    }
    /**
     * Gets the e property value. RSA Key - public exponent
     * @return a string
     */
    @javax.annotation.Nullable
    public String getE() {
        return this._e;
    }
    /**
     * Gets the exp property value. This value is a NumericDate as defined in RFC 7519 (A JSON numeric value representing the number of seconds from 1970-01-01T00:00:00Z UTC until the specified UTC date/time, ignoring leap seconds.)
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getExp() {
        return this._exp;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TrustFrameworkKey currentObject = this;
        return new HashMap<>(17) {{
            this.put("d", (n) -> { currentObject.setD(n.getStringValue()); });
            this.put("dp", (n) -> { currentObject.setDp(n.getStringValue()); });
            this.put("dq", (n) -> { currentObject.setDq(n.getStringValue()); });
            this.put("e", (n) -> { currentObject.setE(n.getStringValue()); });
            this.put("exp", (n) -> { currentObject.setExp(n.getLongValue()); });
            this.put("k", (n) -> { currentObject.setK(n.getStringValue()); });
            this.put("kid", (n) -> { currentObject.setKid(n.getStringValue()); });
            this.put("kty", (n) -> { currentObject.setKty(n.getStringValue()); });
            this.put("n", (n) -> { currentObject.setN(n.getStringValue()); });
            this.put("nbf", (n) -> { currentObject.setNbf(n.getLongValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("p", (n) -> { currentObject.setP(n.getStringValue()); });
            this.put("q", (n) -> { currentObject.setQ(n.getStringValue()); });
            this.put("qi", (n) -> { currentObject.setQi(n.getStringValue()); });
            this.put("use", (n) -> { currentObject.setUse(n.getStringValue()); });
            this.put("x5c", (n) -> { currentObject.setX5c(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("x5t", (n) -> { currentObject.setX5t(n.getStringValue()); });
        }};
    }
    /**
     * Gets the k property value. Symmetric Key for oct key type. Field cannot be read back.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getK() {
        return this._k;
    }
    /**
     * Gets the kid property value. The unique identifier for the key.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKid() {
        return this._kid;
    }
    /**
     * Gets the kty property value. The kty (key type) parameter identifies the cryptographic algorithm family used with the key, The valid values are rsa, oct.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKty() {
        return this._kty;
    }
    /**
     * Gets the n property value. RSA Key - modulus
     * @return a string
     */
    @javax.annotation.Nullable
    public String getN() {
        return this._n;
    }
    /**
     * Gets the nbf property value. This value is a NumericDate as defined in RFC 7519 (A JSON numeric value representing the number of seconds from 1970-01-01T00:00:00Z UTC until the specified UTC date/time, ignoring leap seconds.)
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getNbf() {
        return this._nbf;
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
     * Gets the p property value. RSA Key - first prime. Field cannot be read back.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getP() {
        return this._p;
    }
    /**
     * Gets the q property value. RSA Key - second prime. Field cannot be read back.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQ() {
        return this._q;
    }
    /**
     * Gets the qi property value. RSA Key - Coefficient. Field cannot be read back.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQi() {
        return this._qi;
    }
    /**
     * Gets the use property value. The use (public key use) parameter identifies the intended use of the public key.  The use parameter is employed to indicate whether a public key is used for encrypting data or verifying the signature on data. Possible values are: sig (signature), enc (encryption)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUse() {
        return this._use;
    }
    /**
     * Gets the x5c property value. The x5c (X.509 certificate chain) parameter contains a chain of one or more PKIX certificates RFC 5280.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getX5c() {
        return this._x5c;
    }
    /**
     * Gets the x5t property value. The x5t (X.509 certificate SHA-1 thumbprint) parameter is a base64url-encoded SHA-1 thumbprint (a.k.a. digest) of the DER encoding of an X.509 certificate RFC 5280.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getX5t() {
        return this._x5t;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the d property value. RSA Key - private exponent. Field cannot be read back.
     * @param value Value to set for the d property.
     * @return a void
     */
    public void setD(@javax.annotation.Nullable final String value) {
        this._d = value;
    }
    /**
     * Sets the dp property value. RSA Key - first exponent. Field cannot be read back.
     * @param value Value to set for the dp property.
     * @return a void
     */
    public void setDp(@javax.annotation.Nullable final String value) {
        this._dp = value;
    }
    /**
     * Sets the dq property value. RSA Key - second exponent. Field cannot be read back.
     * @param value Value to set for the dq property.
     * @return a void
     */
    public void setDq(@javax.annotation.Nullable final String value) {
        this._dq = value;
    }
    /**
     * Sets the e property value. RSA Key - public exponent
     * @param value Value to set for the e property.
     * @return a void
     */
    public void setE(@javax.annotation.Nullable final String value) {
        this._e = value;
    }
    /**
     * Sets the exp property value. This value is a NumericDate as defined in RFC 7519 (A JSON numeric value representing the number of seconds from 1970-01-01T00:00:00Z UTC until the specified UTC date/time, ignoring leap seconds.)
     * @param value Value to set for the exp property.
     * @return a void
     */
    public void setExp(@javax.annotation.Nullable final Long value) {
        this._exp = value;
    }
    /**
     * Sets the k property value. Symmetric Key for oct key type. Field cannot be read back.
     * @param value Value to set for the k property.
     * @return a void
     */
    public void setK(@javax.annotation.Nullable final String value) {
        this._k = value;
    }
    /**
     * Sets the kid property value. The unique identifier for the key.
     * @param value Value to set for the kid property.
     * @return a void
     */
    public void setKid(@javax.annotation.Nullable final String value) {
        this._kid = value;
    }
    /**
     * Sets the kty property value. The kty (key type) parameter identifies the cryptographic algorithm family used with the key, The valid values are rsa, oct.
     * @param value Value to set for the kty property.
     * @return a void
     */
    public void setKty(@javax.annotation.Nullable final String value) {
        this._kty = value;
    }
    /**
     * Sets the n property value. RSA Key - modulus
     * @param value Value to set for the n property.
     * @return a void
     */
    public void setN(@javax.annotation.Nullable final String value) {
        this._n = value;
    }
    /**
     * Sets the nbf property value. This value is a NumericDate as defined in RFC 7519 (A JSON numeric value representing the number of seconds from 1970-01-01T00:00:00Z UTC until the specified UTC date/time, ignoring leap seconds.)
     * @param value Value to set for the nbf property.
     * @return a void
     */
    public void setNbf(@javax.annotation.Nullable final Long value) {
        this._nbf = value;
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
     * Sets the p property value. RSA Key - first prime. Field cannot be read back.
     * @param value Value to set for the p property.
     * @return a void
     */
    public void setP(@javax.annotation.Nullable final String value) {
        this._p = value;
    }
    /**
     * Sets the q property value. RSA Key - second prime. Field cannot be read back.
     * @param value Value to set for the q property.
     * @return a void
     */
    public void setQ(@javax.annotation.Nullable final String value) {
        this._q = value;
    }
    /**
     * Sets the qi property value. RSA Key - Coefficient. Field cannot be read back.
     * @param value Value to set for the qi property.
     * @return a void
     */
    public void setQi(@javax.annotation.Nullable final String value) {
        this._qi = value;
    }
    /**
     * Sets the use property value. The use (public key use) parameter identifies the intended use of the public key.  The use parameter is employed to indicate whether a public key is used for encrypting data or verifying the signature on data. Possible values are: sig (signature), enc (encryption)
     * @param value Value to set for the use property.
     * @return a void
     */
    public void setUse(@javax.annotation.Nullable final String value) {
        this._use = value;
    }
    /**
     * Sets the x5c property value. The x5c (X.509 certificate chain) parameter contains a chain of one or more PKIX certificates RFC 5280.
     * @param value Value to set for the x5c property.
     * @return a void
     */
    public void setX5c(@javax.annotation.Nullable final java.util.List<String> value) {
        this._x5c = value;
    }
    /**
     * Sets the x5t property value. The x5t (X.509 certificate SHA-1 thumbprint) parameter is a base64url-encoded SHA-1 thumbprint (a.k.a. digest) of the DER encoding of an X.509 certificate RFC 5280.
     * @param value Value to set for the x5t property.
     * @return a void
     */
    public void setX5t(@javax.annotation.Nullable final String value) {
        this._x5t = value;
    }
}
