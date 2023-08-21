package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity that encapsulates all information required for a user's PFX certificates.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserPFXCertificate extends Entity implements Parsable {
    /**
     * Date/time when this PFX certificate was imported.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Encrypted PFX blob.
     */
    private byte[] encryptedPfxBlob;
    /**
     * Encrypted PFX password.
     */
    private String encryptedPfxPassword;
    /**
     * Certificate's validity expiration date/time.
     */
    private OffsetDateTime expirationDateTime;
    /**
     * Supported values for the intended purpose of a user PFX certificate.
     */
    private UserPfxIntendedPurpose intendedPurpose;
    /**
     * Name of the key (within the provider) used to encrypt the blob.
     */
    private String keyName;
    /**
     * Date/time when this PFX certificate was last modified.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Supported values for the padding scheme used by encryption provider.
     */
    private UserPfxPaddingScheme paddingScheme;
    /**
     * Crypto provider used to encrypt this blob.
     */
    private String providerName;
    /**
     * Certificate's validity start date/time.
     */
    private OffsetDateTime startDateTime;
    /**
     * SHA-1 thumbprint of the PFX certificate.
     */
    private String thumbprint;
    /**
     * User Principal Name of the PFX certificate.
     */
    private String userPrincipalName;
    /**
     * Instantiates a new userPFXCertificate and sets the default values.
     */
    public UserPFXCertificate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userPFXCertificate
     */
    @jakarta.annotation.Nonnull
    public static UserPFXCertificate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserPFXCertificate();
    }
    /**
     * Gets the createdDateTime property value. Date/time when this PFX certificate was imported.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the encryptedPfxBlob property value. Encrypted PFX blob.
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getEncryptedPfxBlob() {
        return this.encryptedPfxBlob;
    }
    /**
     * Gets the encryptedPfxPassword property value. Encrypted PFX password.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEncryptedPfxPassword() {
        return this.encryptedPfxPassword;
    }
    /**
     * Gets the expirationDateTime property value. Certificate's validity expiration date/time.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("encryptedPfxBlob", (n) -> { this.setEncryptedPfxBlob(n.getByteArrayValue()); });
        deserializerMap.put("encryptedPfxPassword", (n) -> { this.setEncryptedPfxPassword(n.getStringValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("intendedPurpose", (n) -> { this.setIntendedPurpose(n.getEnumValue(UserPfxIntendedPurpose.class)); });
        deserializerMap.put("keyName", (n) -> { this.setKeyName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("paddingScheme", (n) -> { this.setPaddingScheme(n.getEnumValue(UserPfxPaddingScheme.class)); });
        deserializerMap.put("providerName", (n) -> { this.setProviderName(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("thumbprint", (n) -> { this.setThumbprint(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the intendedPurpose property value. Supported values for the intended purpose of a user PFX certificate.
     * @return a userPfxIntendedPurpose
     */
    @jakarta.annotation.Nullable
    public UserPfxIntendedPurpose getIntendedPurpose() {
        return this.intendedPurpose;
    }
    /**
     * Gets the keyName property value. Name of the key (within the provider) used to encrypt the blob.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getKeyName() {
        return this.keyName;
    }
    /**
     * Gets the lastModifiedDateTime property value. Date/time when this PFX certificate was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the paddingScheme property value. Supported values for the padding scheme used by encryption provider.
     * @return a userPfxPaddingScheme
     */
    @jakarta.annotation.Nullable
    public UserPfxPaddingScheme getPaddingScheme() {
        return this.paddingScheme;
    }
    /**
     * Gets the providerName property value. Crypto provider used to encrypt this blob.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getProviderName() {
        return this.providerName;
    }
    /**
     * Gets the startDateTime property value. Certificate's validity start date/time.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the thumbprint property value. SHA-1 thumbprint of the PFX certificate.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getThumbprint() {
        return this.thumbprint;
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name of the PFX certificate.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeByteArrayValue("encryptedPfxBlob", this.getEncryptedPfxBlob());
        writer.writeStringValue("encryptedPfxPassword", this.getEncryptedPfxPassword());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeEnumValue("intendedPurpose", this.getIntendedPurpose());
        writer.writeStringValue("keyName", this.getKeyName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("paddingScheme", this.getPaddingScheme());
        writer.writeStringValue("providerName", this.getProviderName());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("thumbprint", this.getThumbprint());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the createdDateTime property value. Date/time when this PFX certificate was imported.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the encryptedPfxBlob property value. Encrypted PFX blob.
     * @param value Value to set for the encryptedPfxBlob property.
     */
    public void setEncryptedPfxBlob(@jakarta.annotation.Nullable final byte[] value) {
        this.encryptedPfxBlob = value;
    }
    /**
     * Sets the encryptedPfxPassword property value. Encrypted PFX password.
     * @param value Value to set for the encryptedPfxPassword property.
     */
    public void setEncryptedPfxPassword(@jakarta.annotation.Nullable final String value) {
        this.encryptedPfxPassword = value;
    }
    /**
     * Sets the expirationDateTime property value. Certificate's validity expiration date/time.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the intendedPurpose property value. Supported values for the intended purpose of a user PFX certificate.
     * @param value Value to set for the intendedPurpose property.
     */
    public void setIntendedPurpose(@jakarta.annotation.Nullable final UserPfxIntendedPurpose value) {
        this.intendedPurpose = value;
    }
    /**
     * Sets the keyName property value. Name of the key (within the provider) used to encrypt the blob.
     * @param value Value to set for the keyName property.
     */
    public void setKeyName(@jakarta.annotation.Nullable final String value) {
        this.keyName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Date/time when this PFX certificate was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the paddingScheme property value. Supported values for the padding scheme used by encryption provider.
     * @param value Value to set for the paddingScheme property.
     */
    public void setPaddingScheme(@jakarta.annotation.Nullable final UserPfxPaddingScheme value) {
        this.paddingScheme = value;
    }
    /**
     * Sets the providerName property value. Crypto provider used to encrypt this blob.
     * @param value Value to set for the providerName property.
     */
    public void setProviderName(@jakarta.annotation.Nullable final String value) {
        this.providerName = value;
    }
    /**
     * Sets the startDateTime property value. Certificate's validity start date/time.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the thumbprint property value. SHA-1 thumbprint of the PFX certificate.
     * @param value Value to set for the thumbprint property.
     */
    public void setThumbprint(@jakarta.annotation.Nullable final String value) {
        this.thumbprint = value;
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name of the PFX certificate.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
