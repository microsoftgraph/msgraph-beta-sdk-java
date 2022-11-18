package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** VPN Security Association Parameters */
public class IosVpnSecurityAssociationParameters implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Lifetime (minutes) */
    private Integer _lifetimeInMinutes;
    /** The OdataType property */
    private String _odataType;
    /** Diffie-Hellman Group */
    private Integer _securityDiffieHellmanGroup;
    /** Encryption algorithm. Possible values are: aes256, des, tripleDes, aes128, aes128Gcm, aes256Gcm, aes192, aes192Gcm, chaCha20Poly1305. */
    private VpnEncryptionAlgorithmType _securityEncryptionAlgorithm;
    /** Integrity algorithm. Possible values are: sha2_256, sha1_96, sha1_160, sha2_384, sha2_512, md5. */
    private VpnIntegrityAlgorithmType _securityIntegrityAlgorithm;
    /**
     * Instantiates a new iosVpnSecurityAssociationParameters and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosVpnSecurityAssociationParameters() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.iosVpnSecurityAssociationParameters");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosVpnSecurityAssociationParameters
     */
    @javax.annotation.Nonnull
    public static IosVpnSecurityAssociationParameters createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosVpnSecurityAssociationParameters();
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
        final IosVpnSecurityAssociationParameters currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("lifetimeInMinutes", (n) -> { currentObject.setLifetimeInMinutes(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("securityDiffieHellmanGroup", (n) -> { currentObject.setSecurityDiffieHellmanGroup(n.getIntegerValue()); });
            this.put("securityEncryptionAlgorithm", (n) -> { currentObject.setSecurityEncryptionAlgorithm(n.getEnumValue(VpnEncryptionAlgorithmType.class)); });
            this.put("securityIntegrityAlgorithm", (n) -> { currentObject.setSecurityIntegrityAlgorithm(n.getEnumValue(VpnIntegrityAlgorithmType.class)); });
        }};
    }
    /**
     * Gets the lifetimeInMinutes property value. Lifetime (minutes)
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLifetimeInMinutes() {
        return this._lifetimeInMinutes;
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
     * Gets the securityDiffieHellmanGroup property value. Diffie-Hellman Group
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSecurityDiffieHellmanGroup() {
        return this._securityDiffieHellmanGroup;
    }
    /**
     * Gets the securityEncryptionAlgorithm property value. Encryption algorithm. Possible values are: aes256, des, tripleDes, aes128, aes128Gcm, aes256Gcm, aes192, aes192Gcm, chaCha20Poly1305.
     * @return a vpnEncryptionAlgorithmType
     */
    @javax.annotation.Nullable
    public VpnEncryptionAlgorithmType getSecurityEncryptionAlgorithm() {
        return this._securityEncryptionAlgorithm;
    }
    /**
     * Gets the securityIntegrityAlgorithm property value. Integrity algorithm. Possible values are: sha2_256, sha1_96, sha1_160, sha2_384, sha2_512, md5.
     * @return a vpnIntegrityAlgorithmType
     */
    @javax.annotation.Nullable
    public VpnIntegrityAlgorithmType getSecurityIntegrityAlgorithm() {
        return this._securityIntegrityAlgorithm;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("lifetimeInMinutes", this.getLifetimeInMinutes());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("securityDiffieHellmanGroup", this.getSecurityDiffieHellmanGroup());
        writer.writeEnumValue("securityEncryptionAlgorithm", this.getSecurityEncryptionAlgorithm());
        writer.writeEnumValue("securityIntegrityAlgorithm", this.getSecurityIntegrityAlgorithm());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the lifetimeInMinutes property value. Lifetime (minutes)
     * @param value Value to set for the lifetimeInMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLifetimeInMinutes(@javax.annotation.Nullable final Integer value) {
        this._lifetimeInMinutes = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the securityDiffieHellmanGroup property value. Diffie-Hellman Group
     * @param value Value to set for the securityDiffieHellmanGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityDiffieHellmanGroup(@javax.annotation.Nullable final Integer value) {
        this._securityDiffieHellmanGroup = value;
    }
    /**
     * Sets the securityEncryptionAlgorithm property value. Encryption algorithm. Possible values are: aes256, des, tripleDes, aes128, aes128Gcm, aes256Gcm, aes192, aes192Gcm, chaCha20Poly1305.
     * @param value Value to set for the securityEncryptionAlgorithm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityEncryptionAlgorithm(@javax.annotation.Nullable final VpnEncryptionAlgorithmType value) {
        this._securityEncryptionAlgorithm = value;
    }
    /**
     * Sets the securityIntegrityAlgorithm property value. Integrity algorithm. Possible values are: sha2_256, sha1_96, sha1_160, sha2_384, sha2_512, md5.
     * @param value Value to set for the securityIntegrityAlgorithm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityIntegrityAlgorithm(@javax.annotation.Nullable final VpnIntegrityAlgorithmType value) {
        this._securityIntegrityAlgorithm = value;
    }
}
