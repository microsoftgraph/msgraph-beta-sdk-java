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
public class CryptographySuite implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Authentication Transform Constants. Possible values are: md596, sha196, sha256128, aes128Gcm, aes192Gcm, aes256Gcm.
     */
    private AuthenticationTransformConstant authenticationTransformConstants;
    /**
     * Cipher Transform Constants. Possible values are: aes256, des, tripleDes, aes128, aes128Gcm, aes256Gcm, aes192, aes192Gcm, chaCha20Poly1305.
     */
    private VpnEncryptionAlgorithmType cipherTransformConstants;
    /**
     * Diffie Hellman Group. Possible values are: group1, group2, group14, ecp256, ecp384, group24.
     */
    private DiffieHellmanGroup dhGroup;
    /**
     * Encryption Method. Possible values are: aes256, des, tripleDes, aes128, aes128Gcm, aes256Gcm, aes192, aes192Gcm, chaCha20Poly1305.
     */
    private VpnEncryptionAlgorithmType encryptionMethod;
    /**
     * Integrity Check Method. Possible values are: sha2256, sha196, sha1160, sha2384, sha2_512, md5.
     */
    private VpnIntegrityAlgorithmType integrityCheckMethod;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Perfect Forward Secrecy Group. Possible values are: pfs1, pfs2, pfs2048, ecp256, ecp384, pfsMM, pfs24.
     */
    private PerfectForwardSecrecyGroup pfsGroup;
    /**
     * Instantiates a new cryptographySuite and sets the default values.
     */
    public CryptographySuite() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cryptographySuite
     */
    @jakarta.annotation.Nonnull
    public static CryptographySuite createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CryptographySuite();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the authenticationTransformConstants property value. Authentication Transform Constants. Possible values are: md596, sha196, sha256128, aes128Gcm, aes192Gcm, aes256Gcm.
     * @return a authenticationTransformConstant
     */
    @jakarta.annotation.Nullable
    public AuthenticationTransformConstant getAuthenticationTransformConstants() {
        return this.authenticationTransformConstants;
    }
    /**
     * Gets the cipherTransformConstants property value. Cipher Transform Constants. Possible values are: aes256, des, tripleDes, aes128, aes128Gcm, aes256Gcm, aes192, aes192Gcm, chaCha20Poly1305.
     * @return a vpnEncryptionAlgorithmType
     */
    @jakarta.annotation.Nullable
    public VpnEncryptionAlgorithmType getCipherTransformConstants() {
        return this.cipherTransformConstants;
    }
    /**
     * Gets the dhGroup property value. Diffie Hellman Group. Possible values are: group1, group2, group14, ecp256, ecp384, group24.
     * @return a diffieHellmanGroup
     */
    @jakarta.annotation.Nullable
    public DiffieHellmanGroup getDhGroup() {
        return this.dhGroup;
    }
    /**
     * Gets the encryptionMethod property value. Encryption Method. Possible values are: aes256, des, tripleDes, aes128, aes128Gcm, aes256Gcm, aes192, aes192Gcm, chaCha20Poly1305.
     * @return a vpnEncryptionAlgorithmType
     */
    @jakarta.annotation.Nullable
    public VpnEncryptionAlgorithmType getEncryptionMethod() {
        return this.encryptionMethod;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("authenticationTransformConstants", (n) -> { this.setAuthenticationTransformConstants(n.getEnumValue(AuthenticationTransformConstant.class)); });
        deserializerMap.put("cipherTransformConstants", (n) -> { this.setCipherTransformConstants(n.getEnumValue(VpnEncryptionAlgorithmType.class)); });
        deserializerMap.put("dhGroup", (n) -> { this.setDhGroup(n.getEnumValue(DiffieHellmanGroup.class)); });
        deserializerMap.put("encryptionMethod", (n) -> { this.setEncryptionMethod(n.getEnumValue(VpnEncryptionAlgorithmType.class)); });
        deserializerMap.put("integrityCheckMethod", (n) -> { this.setIntegrityCheckMethod(n.getEnumValue(VpnIntegrityAlgorithmType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("pfsGroup", (n) -> { this.setPfsGroup(n.getEnumValue(PerfectForwardSecrecyGroup.class)); });
        return deserializerMap;
    }
    /**
     * Gets the integrityCheckMethod property value. Integrity Check Method. Possible values are: sha2256, sha196, sha1160, sha2384, sha2_512, md5.
     * @return a vpnIntegrityAlgorithmType
     */
    @jakarta.annotation.Nullable
    public VpnIntegrityAlgorithmType getIntegrityCheckMethod() {
        return this.integrityCheckMethod;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the pfsGroup property value. Perfect Forward Secrecy Group. Possible values are: pfs1, pfs2, pfs2048, ecp256, ecp384, pfsMM, pfs24.
     * @return a perfectForwardSecrecyGroup
     */
    @jakarta.annotation.Nullable
    public PerfectForwardSecrecyGroup getPfsGroup() {
        return this.pfsGroup;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("authenticationTransformConstants", this.getAuthenticationTransformConstants());
        writer.writeEnumValue("cipherTransformConstants", this.getCipherTransformConstants());
        writer.writeEnumValue("dhGroup", this.getDhGroup());
        writer.writeEnumValue("encryptionMethod", this.getEncryptionMethod());
        writer.writeEnumValue("integrityCheckMethod", this.getIntegrityCheckMethod());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("pfsGroup", this.getPfsGroup());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the authenticationTransformConstants property value. Authentication Transform Constants. Possible values are: md596, sha196, sha256128, aes128Gcm, aes192Gcm, aes256Gcm.
     * @param value Value to set for the authenticationTransformConstants property.
     */
    public void setAuthenticationTransformConstants(@jakarta.annotation.Nullable final AuthenticationTransformConstant value) {
        this.authenticationTransformConstants = value;
    }
    /**
     * Sets the cipherTransformConstants property value. Cipher Transform Constants. Possible values are: aes256, des, tripleDes, aes128, aes128Gcm, aes256Gcm, aes192, aes192Gcm, chaCha20Poly1305.
     * @param value Value to set for the cipherTransformConstants property.
     */
    public void setCipherTransformConstants(@jakarta.annotation.Nullable final VpnEncryptionAlgorithmType value) {
        this.cipherTransformConstants = value;
    }
    /**
     * Sets the dhGroup property value. Diffie Hellman Group. Possible values are: group1, group2, group14, ecp256, ecp384, group24.
     * @param value Value to set for the dhGroup property.
     */
    public void setDhGroup(@jakarta.annotation.Nullable final DiffieHellmanGroup value) {
        this.dhGroup = value;
    }
    /**
     * Sets the encryptionMethod property value. Encryption Method. Possible values are: aes256, des, tripleDes, aes128, aes128Gcm, aes256Gcm, aes192, aes192Gcm, chaCha20Poly1305.
     * @param value Value to set for the encryptionMethod property.
     */
    public void setEncryptionMethod(@jakarta.annotation.Nullable final VpnEncryptionAlgorithmType value) {
        this.encryptionMethod = value;
    }
    /**
     * Sets the integrityCheckMethod property value. Integrity Check Method. Possible values are: sha2256, sha196, sha1160, sha2384, sha2_512, md5.
     * @param value Value to set for the integrityCheckMethod property.
     */
    public void setIntegrityCheckMethod(@jakarta.annotation.Nullable final VpnIntegrityAlgorithmType value) {
        this.integrityCheckMethod = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the pfsGroup property value. Perfect Forward Secrecy Group. Possible values are: pfs1, pfs2, pfs2048, ecp256, ecp384, pfsMM, pfs24.
     * @param value Value to set for the pfsGroup property.
     */
    public void setPfsGroup(@jakarta.annotation.Nullable final PerfectForwardSecrecyGroup value) {
        this.pfsGroup = value;
    }
}
