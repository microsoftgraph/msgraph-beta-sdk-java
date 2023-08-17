package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class StrongAuthenticationPhoneAppDetail extends Entity implements Parsable {
    /**
     * The authenticationType property
     */
    private String authenticationType;
    /**
     * The authenticatorFlavor property
     */
    private String authenticatorFlavor;
    /**
     * The deviceId property
     */
    private UUID deviceId;
    /**
     * The deviceName property
     */
    private String deviceName;
    /**
     * The deviceTag property
     */
    private String deviceTag;
    /**
     * The deviceToken property
     */
    private String deviceToken;
    /**
     * The hashFunction property
     */
    private String hashFunction;
    /**
     * The lastAuthenticatedDateTime property
     */
    private OffsetDateTime lastAuthenticatedDateTime;
    /**
     * The notificationType property
     */
    private String notificationType;
    /**
     * The oathSecretKey property
     */
    private String oathSecretKey;
    /**
     * The oathTokenMetadata property
     */
    private OathTokenMetadata oathTokenMetadata;
    /**
     * The oathTokenTimeDriftInSeconds property
     */
    private Integer oathTokenTimeDriftInSeconds;
    /**
     * The phoneAppVersion property
     */
    private String phoneAppVersion;
    /**
     * The tenantDeviceId property
     */
    private String tenantDeviceId;
    /**
     * The tokenGenerationIntervalInSeconds property
     */
    private Integer tokenGenerationIntervalInSeconds;
    /**
     * Instantiates a new strongAuthenticationPhoneAppDetail and sets the default values.
     */
    public StrongAuthenticationPhoneAppDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a strongAuthenticationPhoneAppDetail
     */
    @jakarta.annotation.Nonnull
    public static StrongAuthenticationPhoneAppDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StrongAuthenticationPhoneAppDetail();
    }
    /**
     * Gets the authenticationType property value. The authenticationType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAuthenticationType() {
        return this.authenticationType;
    }
    /**
     * Gets the authenticatorFlavor property value. The authenticatorFlavor property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAuthenticatorFlavor() {
        return this.authenticatorFlavor;
    }
    /**
     * Gets the deviceId property value. The deviceId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the deviceName property value. The deviceName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Gets the deviceTag property value. The deviceTag property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceTag() {
        return this.deviceTag;
    }
    /**
     * Gets the deviceToken property value. The deviceToken property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceToken() {
        return this.deviceToken;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationType", (n) -> { this.setAuthenticationType(n.getStringValue()); });
        deserializerMap.put("authenticatorFlavor", (n) -> { this.setAuthenticatorFlavor(n.getStringValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getUUIDValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("deviceTag", (n) -> { this.setDeviceTag(n.getStringValue()); });
        deserializerMap.put("deviceToken", (n) -> { this.setDeviceToken(n.getStringValue()); });
        deserializerMap.put("hashFunction", (n) -> { this.setHashFunction(n.getStringValue()); });
        deserializerMap.put("lastAuthenticatedDateTime", (n) -> { this.setLastAuthenticatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("notificationType", (n) -> { this.setNotificationType(n.getStringValue()); });
        deserializerMap.put("oathSecretKey", (n) -> { this.setOathSecretKey(n.getStringValue()); });
        deserializerMap.put("oathTokenMetadata", (n) -> { this.setOathTokenMetadata(n.getObjectValue(OathTokenMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("oathTokenTimeDriftInSeconds", (n) -> { this.setOathTokenTimeDriftInSeconds(n.getIntegerValue()); });
        deserializerMap.put("phoneAppVersion", (n) -> { this.setPhoneAppVersion(n.getStringValue()); });
        deserializerMap.put("tenantDeviceId", (n) -> { this.setTenantDeviceId(n.getStringValue()); });
        deserializerMap.put("tokenGenerationIntervalInSeconds", (n) -> { this.setTokenGenerationIntervalInSeconds(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hashFunction property value. The hashFunction property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getHashFunction() {
        return this.hashFunction;
    }
    /**
     * Gets the lastAuthenticatedDateTime property value. The lastAuthenticatedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastAuthenticatedDateTime() {
        return this.lastAuthenticatedDateTime;
    }
    /**
     * Gets the notificationType property value. The notificationType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNotificationType() {
        return this.notificationType;
    }
    /**
     * Gets the oathSecretKey property value. The oathSecretKey property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOathSecretKey() {
        return this.oathSecretKey;
    }
    /**
     * Gets the oathTokenMetadata property value. The oathTokenMetadata property
     * @return a oathTokenMetadata
     */
    @jakarta.annotation.Nullable
    public OathTokenMetadata getOathTokenMetadata() {
        return this.oathTokenMetadata;
    }
    /**
     * Gets the oathTokenTimeDriftInSeconds property value. The oathTokenTimeDriftInSeconds property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getOathTokenTimeDriftInSeconds() {
        return this.oathTokenTimeDriftInSeconds;
    }
    /**
     * Gets the phoneAppVersion property value. The phoneAppVersion property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPhoneAppVersion() {
        return this.phoneAppVersion;
    }
    /**
     * Gets the tenantDeviceId property value. The tenantDeviceId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTenantDeviceId() {
        return this.tenantDeviceId;
    }
    /**
     * Gets the tokenGenerationIntervalInSeconds property value. The tokenGenerationIntervalInSeconds property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getTokenGenerationIntervalInSeconds() {
        return this.tokenGenerationIntervalInSeconds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("authenticationType", this.getAuthenticationType());
        writer.writeStringValue("authenticatorFlavor", this.getAuthenticatorFlavor());
        writer.writeUUIDValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("deviceTag", this.getDeviceTag());
        writer.writeStringValue("deviceToken", this.getDeviceToken());
        writer.writeStringValue("hashFunction", this.getHashFunction());
        writer.writeOffsetDateTimeValue("lastAuthenticatedDateTime", this.getLastAuthenticatedDateTime());
        writer.writeStringValue("notificationType", this.getNotificationType());
        writer.writeStringValue("oathSecretKey", this.getOathSecretKey());
        writer.writeObjectValue("oathTokenMetadata", this.getOathTokenMetadata());
        writer.writeIntegerValue("oathTokenTimeDriftInSeconds", this.getOathTokenTimeDriftInSeconds());
        writer.writeStringValue("phoneAppVersion", this.getPhoneAppVersion());
        writer.writeStringValue("tenantDeviceId", this.getTenantDeviceId());
        writer.writeIntegerValue("tokenGenerationIntervalInSeconds", this.getTokenGenerationIntervalInSeconds());
    }
    /**
     * Sets the authenticationType property value. The authenticationType property
     * @param value Value to set for the authenticationType property.
     */
    public void setAuthenticationType(@jakarta.annotation.Nullable final String value) {
        this.authenticationType = value;
    }
    /**
     * Sets the authenticatorFlavor property value. The authenticatorFlavor property
     * @param value Value to set for the authenticatorFlavor property.
     */
    public void setAuthenticatorFlavor(@jakarta.annotation.Nullable final String value) {
        this.authenticatorFlavor = value;
    }
    /**
     * Sets the deviceId property value. The deviceId property
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final UUID value) {
        this.deviceId = value;
    }
    /**
     * Sets the deviceName property value. The deviceName property
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the deviceTag property value. The deviceTag property
     * @param value Value to set for the deviceTag property.
     */
    public void setDeviceTag(@jakarta.annotation.Nullable final String value) {
        this.deviceTag = value;
    }
    /**
     * Sets the deviceToken property value. The deviceToken property
     * @param value Value to set for the deviceToken property.
     */
    public void setDeviceToken(@jakarta.annotation.Nullable final String value) {
        this.deviceToken = value;
    }
    /**
     * Sets the hashFunction property value. The hashFunction property
     * @param value Value to set for the hashFunction property.
     */
    public void setHashFunction(@jakarta.annotation.Nullable final String value) {
        this.hashFunction = value;
    }
    /**
     * Sets the lastAuthenticatedDateTime property value. The lastAuthenticatedDateTime property
     * @param value Value to set for the lastAuthenticatedDateTime property.
     */
    public void setLastAuthenticatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastAuthenticatedDateTime = value;
    }
    /**
     * Sets the notificationType property value. The notificationType property
     * @param value Value to set for the notificationType property.
     */
    public void setNotificationType(@jakarta.annotation.Nullable final String value) {
        this.notificationType = value;
    }
    /**
     * Sets the oathSecretKey property value. The oathSecretKey property
     * @param value Value to set for the oathSecretKey property.
     */
    public void setOathSecretKey(@jakarta.annotation.Nullable final String value) {
        this.oathSecretKey = value;
    }
    /**
     * Sets the oathTokenMetadata property value. The oathTokenMetadata property
     * @param value Value to set for the oathTokenMetadata property.
     */
    public void setOathTokenMetadata(@jakarta.annotation.Nullable final OathTokenMetadata value) {
        this.oathTokenMetadata = value;
    }
    /**
     * Sets the oathTokenTimeDriftInSeconds property value. The oathTokenTimeDriftInSeconds property
     * @param value Value to set for the oathTokenTimeDriftInSeconds property.
     */
    public void setOathTokenTimeDriftInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.oathTokenTimeDriftInSeconds = value;
    }
    /**
     * Sets the phoneAppVersion property value. The phoneAppVersion property
     * @param value Value to set for the phoneAppVersion property.
     */
    public void setPhoneAppVersion(@jakarta.annotation.Nullable final String value) {
        this.phoneAppVersion = value;
    }
    /**
     * Sets the tenantDeviceId property value. The tenantDeviceId property
     * @param value Value to set for the tenantDeviceId property.
     */
    public void setTenantDeviceId(@jakarta.annotation.Nullable final String value) {
        this.tenantDeviceId = value;
    }
    /**
     * Sets the tokenGenerationIntervalInSeconds property value. The tokenGenerationIntervalInSeconds property
     * @param value Value to set for the tokenGenerationIntervalInSeconds property.
     */
    public void setTokenGenerationIntervalInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.tokenGenerationIntervalInSeconds = value;
    }
}
