package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppCredentialSignInActivity extends Entity implements Parsable {
    /**
     * Instantiates a new AppCredentialSignInActivity and sets the default values.
     */
    public AppCredentialSignInActivity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppCredentialSignInActivity
     */
    @jakarta.annotation.Nonnull
    public static AppCredentialSignInActivity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppCredentialSignInActivity();
    }
    /**
     * Gets the appId property value. The globally unique appId (also called client ID on the Microsoft Entra admin center) of the credential application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.BackingStore.get("appId");
    }
    /**
     * Gets the appObjectId property value. The ID of the credential application instance.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppObjectId() {
        return this.BackingStore.get("appObjectId");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the credential was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.BackingStore.get("createdDateTime");
    }
    /**
     * Gets the credentialOrigin property value. The credentialOrigin property
     * @return a ApplicationKeyOrigin
     */
    @jakarta.annotation.Nullable
    public ApplicationKeyOrigin getCredentialOrigin() {
        return this.BackingStore.get("credentialOrigin");
    }
    /**
     * Gets the expirationDateTime property value. The date and time when the credential is set to expire. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.BackingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("appObjectId", (n) -> { this.setAppObjectId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("credentialOrigin", (n) -> { this.setCredentialOrigin(n.getEnumValue(ApplicationKeyOrigin.class)); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("keyId", (n) -> { this.setKeyId(n.getStringValue()); });
        deserializerMap.put("keyType", (n) -> { this.setKeyType(n.getEnumValue(ApplicationKeyType.class)); });
        deserializerMap.put("keyUsage", (n) -> { this.setKeyUsage(n.getEnumValue(ApplicationKeyUsage.class)); });
        deserializerMap.put("resourceId", (n) -> { this.setResourceId(n.getStringValue()); });
        deserializerMap.put("servicePrincipalObjectId", (n) -> { this.setServicePrincipalObjectId(n.getStringValue()); });
        deserializerMap.put("signInActivity", (n) -> { this.setSignInActivity(n.getObjectValue(SignInActivity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the keyId property value. The key ID of the credential.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKeyId() {
        return this.BackingStore.get("keyId");
    }
    /**
     * Gets the keyType property value. Specifies the key type. The possible values are: clientSecret, certificate, unknownFutureValue.
     * @return a ApplicationKeyType
     */
    @jakarta.annotation.Nullable
    public ApplicationKeyType getKeyType() {
        return this.BackingStore.get("keyType");
    }
    /**
     * Gets the keyUsage property value. Specifies what the key was used for. The possible values are: sign, verify, unknownFutureValue.
     * @return a ApplicationKeyUsage
     */
    @jakarta.annotation.Nullable
    public ApplicationKeyUsage getKeyUsage() {
        return this.BackingStore.get("keyUsage");
    }
    /**
     * Gets the resourceId property value. The ID of the accessed resource.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceId() {
        return this.BackingStore.get("resourceId");
    }
    /**
     * Gets the servicePrincipalObjectId property value. The ID of the service principal.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServicePrincipalObjectId() {
        return this.BackingStore.get("servicePrincipalObjectId");
    }
    /**
     * Gets the signInActivity property value. The signInActivity property
     * @return a SignInActivity
     */
    @jakarta.annotation.Nullable
    public SignInActivity getSignInActivity() {
        return this.BackingStore.get("signInActivity");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("appObjectId", this.getAppObjectId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeEnumValue("credentialOrigin", this.getCredentialOrigin());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("keyId", this.getKeyId());
        writer.writeEnumValue("keyType", this.getKeyType());
        writer.writeEnumValue("keyUsage", this.getKeyUsage());
        writer.writeStringValue("resourceId", this.getResourceId());
        writer.writeStringValue("servicePrincipalObjectId", this.getServicePrincipalObjectId());
        writer.writeObjectValue("signInActivity", this.getSignInActivity());
    }
    /**
     * Sets the appId property value. The globally unique appId (also called client ID on the Microsoft Entra admin center) of the credential application.
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("appId", value);
    }
    /**
     * Sets the appObjectId property value. The ID of the credential application instance.
     * @param value Value to set for the appObjectId property.
     */
    public void setAppObjectId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("appObjectId", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the credential was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("createdDateTime", value);
    }
    /**
     * Sets the credentialOrigin property value. The credentialOrigin property
     * @param value Value to set for the credentialOrigin property.
     */
    public void setCredentialOrigin(@jakarta.annotation.Nullable final ApplicationKeyOrigin value) {
        this.BackingStore.set("credentialOrigin", value);
    }
    /**
     * Sets the expirationDateTime property value. The date and time when the credential is set to expire. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the keyId property value. The key ID of the credential.
     * @param value Value to set for the keyId property.
     */
    public void setKeyId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("keyId", value);
    }
    /**
     * Sets the keyType property value. Specifies the key type. The possible values are: clientSecret, certificate, unknownFutureValue.
     * @param value Value to set for the keyType property.
     */
    public void setKeyType(@jakarta.annotation.Nullable final ApplicationKeyType value) {
        this.BackingStore.set("keyType", value);
    }
    /**
     * Sets the keyUsage property value. Specifies what the key was used for. The possible values are: sign, verify, unknownFutureValue.
     * @param value Value to set for the keyUsage property.
     */
    public void setKeyUsage(@jakarta.annotation.Nullable final ApplicationKeyUsage value) {
        this.BackingStore.set("keyUsage", value);
    }
    /**
     * Sets the resourceId property value. The ID of the accessed resource.
     * @param value Value to set for the resourceId property.
     */
    public void setResourceId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("resourceId", value);
    }
    /**
     * Sets the servicePrincipalObjectId property value. The ID of the service principal.
     * @param value Value to set for the servicePrincipalObjectId property.
     */
    public void setServicePrincipalObjectId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("servicePrincipalObjectId", value);
    }
    /**
     * Sets the signInActivity property value. The signInActivity property
     * @param value Value to set for the signInActivity property.
     */
    public void setSignInActivity(@jakarta.annotation.Nullable final SignInActivity value) {
        this.BackingStore.set("signInActivity", value);
    }
}
