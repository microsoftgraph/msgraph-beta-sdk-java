package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * VPN Security Association Parameters
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosVpnSecurityAssociationParameters implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Lifetime (minutes)
     */
    private Integer lifetimeInMinutes;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Diffie-Hellman Group
     */
    private Integer securityDiffieHellmanGroup;
    /**
     * Encryption algorithm. Possible values are: aes256, des, tripleDes, aes128, aes128Gcm, aes256Gcm, aes192, aes192Gcm, chaCha20Poly1305.
     */
    private VpnEncryptionAlgorithmType securityEncryptionAlgorithm;
    /**
     * Integrity algorithm. Possible values are: sha2256, sha196, sha1160, sha2384, sha2_512, md5.
     */
    private VpnIntegrityAlgorithmType securityIntegrityAlgorithm;
    /**
     * Instantiates a new IosVpnSecurityAssociationParameters and sets the default values.
     */
    public IosVpnSecurityAssociationParameters() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosVpnSecurityAssociationParameters
     */
    @jakarta.annotation.Nonnull
    public static IosVpnSecurityAssociationParameters createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosVpnSecurityAssociationParameters();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("lifetimeInMinutes", (n) -> { this.setLifetimeInMinutes(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("securityDiffieHellmanGroup", (n) -> { this.setSecurityDiffieHellmanGroup(n.getIntegerValue()); });
        deserializerMap.put("securityEncryptionAlgorithm", (n) -> { this.setSecurityEncryptionAlgorithm(n.getEnumValue(VpnEncryptionAlgorithmType.class)); });
        deserializerMap.put("securityIntegrityAlgorithm", (n) -> { this.setSecurityIntegrityAlgorithm(n.getEnumValue(VpnIntegrityAlgorithmType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lifetimeInMinutes property value. Lifetime (minutes)
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLifetimeInMinutes() {
        return this.lifetimeInMinutes;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the securityDiffieHellmanGroup property value. Diffie-Hellman Group
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSecurityDiffieHellmanGroup() {
        return this.securityDiffieHellmanGroup;
    }
    /**
     * Gets the securityEncryptionAlgorithm property value. Encryption algorithm. Possible values are: aes256, des, tripleDes, aes128, aes128Gcm, aes256Gcm, aes192, aes192Gcm, chaCha20Poly1305.
     * @return a VpnEncryptionAlgorithmType
     */
    @jakarta.annotation.Nullable
    public VpnEncryptionAlgorithmType getSecurityEncryptionAlgorithm() {
        return this.securityEncryptionAlgorithm;
    }
    /**
     * Gets the securityIntegrityAlgorithm property value. Integrity algorithm. Possible values are: sha2256, sha196, sha1160, sha2384, sha2_512, md5.
     * @return a VpnIntegrityAlgorithmType
     */
    @jakarta.annotation.Nullable
    public VpnIntegrityAlgorithmType getSecurityIntegrityAlgorithm() {
        return this.securityIntegrityAlgorithm;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("lifetimeInMinutes", this.getLifetimeInMinutes());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("securityDiffieHellmanGroup", this.getSecurityDiffieHellmanGroup());
        writer.writeEnumValue("securityEncryptionAlgorithm", this.getSecurityEncryptionAlgorithm());
        writer.writeEnumValue("securityIntegrityAlgorithm", this.getSecurityIntegrityAlgorithm());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the lifetimeInMinutes property value. Lifetime (minutes)
     * @param value Value to set for the lifetimeInMinutes property.
     */
    public void setLifetimeInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.lifetimeInMinutes = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the securityDiffieHellmanGroup property value. Diffie-Hellman Group
     * @param value Value to set for the securityDiffieHellmanGroup property.
     */
    public void setSecurityDiffieHellmanGroup(@jakarta.annotation.Nullable final Integer value) {
        this.securityDiffieHellmanGroup = value;
    }
    /**
     * Sets the securityEncryptionAlgorithm property value. Encryption algorithm. Possible values are: aes256, des, tripleDes, aes128, aes128Gcm, aes256Gcm, aes192, aes192Gcm, chaCha20Poly1305.
     * @param value Value to set for the securityEncryptionAlgorithm property.
     */
    public void setSecurityEncryptionAlgorithm(@jakarta.annotation.Nullable final VpnEncryptionAlgorithmType value) {
        this.securityEncryptionAlgorithm = value;
    }
    /**
     * Sets the securityIntegrityAlgorithm property value. Integrity algorithm. Possible values are: sha2256, sha196, sha1160, sha2384, sha2_512, md5.
     * @param value Value to set for the securityIntegrityAlgorithm property.
     */
    public void setSecurityIntegrityAlgorithm(@jakarta.annotation.Nullable final VpnIntegrityAlgorithmType value) {
        this.securityIntegrityAlgorithm = value;
    }
}
