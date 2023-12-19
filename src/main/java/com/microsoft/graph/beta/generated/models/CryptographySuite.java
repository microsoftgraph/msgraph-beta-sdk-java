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
/**
 * VPN Security Association Parameters
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CryptographySuite implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new CryptographySuite and sets the default values.
     */
    public CryptographySuite() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CryptographySuite
     */
    @jakarta.annotation.Nonnull
    public static CryptographySuite createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CryptographySuite();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the authenticationTransformConstants property value. Authentication Transform Constants. Possible values are: md596, sha196, sha256128, aes128Gcm, aes192Gcm, aes256Gcm.
     * @return a CryptographySuiteAuthenticationTransformConstants
     */
    @jakarta.annotation.Nullable
    public CryptographySuiteAuthenticationTransformConstants getAuthenticationTransformConstants() {
        return this.backingStore.get("authenticationTransformConstants");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the cipherTransformConstants property value. Cipher Transform Constants. Possible values are: aes256, des, tripleDes, aes128, aes128Gcm, aes256Gcm, aes192, aes192Gcm, chaCha20Poly1305.
     * @return a CryptographySuiteCipherTransformConstants
     */
    @jakarta.annotation.Nullable
    public CryptographySuiteCipherTransformConstants getCipherTransformConstants() {
        return this.backingStore.get("cipherTransformConstants");
    }
    /**
     * Gets the dhGroup property value. Diffie Hellman Group. Possible values are: group1, group2, group14, ecp256, ecp384, group24.
     * @return a CryptographySuiteDhGroup
     */
    @jakarta.annotation.Nullable
    public CryptographySuiteDhGroup getDhGroup() {
        return this.backingStore.get("dhGroup");
    }
    /**
     * Gets the encryptionMethod property value. Encryption Method. Possible values are: aes256, des, tripleDes, aes128, aes128Gcm, aes256Gcm, aes192, aes192Gcm, chaCha20Poly1305.
     * @return a CryptographySuiteEncryptionMethod
     */
    @jakarta.annotation.Nullable
    public CryptographySuiteEncryptionMethod getEncryptionMethod() {
        return this.backingStore.get("encryptionMethod");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("authenticationTransformConstants", (n) -> { this.setAuthenticationTransformConstants(n.getEnumValue(CryptographySuiteAuthenticationTransformConstants::forValue)); });
        deserializerMap.put("cipherTransformConstants", (n) -> { this.setCipherTransformConstants(n.getEnumValue(CryptographySuiteCipherTransformConstants::forValue)); });
        deserializerMap.put("dhGroup", (n) -> { this.setDhGroup(n.getEnumValue(CryptographySuiteDhGroup::forValue)); });
        deserializerMap.put("encryptionMethod", (n) -> { this.setEncryptionMethod(n.getEnumValue(CryptographySuiteEncryptionMethod::forValue)); });
        deserializerMap.put("integrityCheckMethod", (n) -> { this.setIntegrityCheckMethod(n.getEnumValue(CryptographySuiteIntegrityCheckMethod::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("pfsGroup", (n) -> { this.setPfsGroup(n.getEnumValue(CryptographySuitePfsGroup::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the integrityCheckMethod property value. Integrity Check Method. Possible values are: sha2256, sha196, sha1160, sha2384, sha2_512, md5.
     * @return a CryptographySuiteIntegrityCheckMethod
     */
    @jakarta.annotation.Nullable
    public CryptographySuiteIntegrityCheckMethod getIntegrityCheckMethod() {
        return this.backingStore.get("integrityCheckMethod");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the pfsGroup property value. Perfect Forward Secrecy Group. Possible values are: pfs1, pfs2, pfs2048, ecp256, ecp384, pfsMM, pfs24.
     * @return a CryptographySuitePfsGroup
     */
    @jakarta.annotation.Nullable
    public CryptographySuitePfsGroup getPfsGroup() {
        return this.backingStore.get("pfsGroup");
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the authenticationTransformConstants property value. Authentication Transform Constants. Possible values are: md596, sha196, sha256128, aes128Gcm, aes192Gcm, aes256Gcm.
     * @param value Value to set for the authenticationTransformConstants property.
     */
    public void setAuthenticationTransformConstants(@jakarta.annotation.Nullable final CryptographySuiteAuthenticationTransformConstants value) {
        this.backingStore.set("authenticationTransformConstants", value);
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
     * Sets the cipherTransformConstants property value. Cipher Transform Constants. Possible values are: aes256, des, tripleDes, aes128, aes128Gcm, aes256Gcm, aes192, aes192Gcm, chaCha20Poly1305.
     * @param value Value to set for the cipherTransformConstants property.
     */
    public void setCipherTransformConstants(@jakarta.annotation.Nullable final CryptographySuiteCipherTransformConstants value) {
        this.backingStore.set("cipherTransformConstants", value);
    }
    /**
     * Sets the dhGroup property value. Diffie Hellman Group. Possible values are: group1, group2, group14, ecp256, ecp384, group24.
     * @param value Value to set for the dhGroup property.
     */
    public void setDhGroup(@jakarta.annotation.Nullable final CryptographySuiteDhGroup value) {
        this.backingStore.set("dhGroup", value);
    }
    /**
     * Sets the encryptionMethod property value. Encryption Method. Possible values are: aes256, des, tripleDes, aes128, aes128Gcm, aes256Gcm, aes192, aes192Gcm, chaCha20Poly1305.
     * @param value Value to set for the encryptionMethod property.
     */
    public void setEncryptionMethod(@jakarta.annotation.Nullable final CryptographySuiteEncryptionMethod value) {
        this.backingStore.set("encryptionMethod", value);
    }
    /**
     * Sets the integrityCheckMethod property value. Integrity Check Method. Possible values are: sha2256, sha196, sha1160, sha2384, sha2_512, md5.
     * @param value Value to set for the integrityCheckMethod property.
     */
    public void setIntegrityCheckMethod(@jakarta.annotation.Nullable final CryptographySuiteIntegrityCheckMethod value) {
        this.backingStore.set("integrityCheckMethod", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the pfsGroup property value. Perfect Forward Secrecy Group. Possible values are: pfs1, pfs2, pfs2048, ecp256, ecp384, pfsMM, pfs24.
     * @param value Value to set for the pfsGroup property.
     */
    public void setPfsGroup(@jakarta.annotation.Nullable final CryptographySuitePfsGroup value) {
        this.backingStore.set("pfsGroup", value);
    }
}
