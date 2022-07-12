package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class StrongAuthenticationPhoneAppDetail extends Entity implements Parsable {
    /** The authenticationType property */
    private String _authenticationType;
    /** The authenticatorFlavor property */
    private String _authenticatorFlavor;
    /** The deviceId property */
    private String _deviceId;
    /** The deviceName property */
    private String _deviceName;
    /** The deviceTag property */
    private String _deviceTag;
    /** The deviceToken property */
    private String _deviceToken;
    /** The hashFunction property */
    private String _hashFunction;
    /** The lastAuthenticatedDateTime property */
    private OffsetDateTime _lastAuthenticatedDateTime;
    /** The notificationType property */
    private String _notificationType;
    /** The oathSecretKey property */
    private String _oathSecretKey;
    /** The oathTokenMetadata property */
    private OathTokenMetadata _oathTokenMetadata;
    /** The oathTokenTimeDriftInSeconds property */
    private Integer _oathTokenTimeDriftInSeconds;
    /** The phoneAppVersion property */
    private String _phoneAppVersion;
    /** The tenantDeviceId property */
    private String _tenantDeviceId;
    /** The tokenGenerationIntervalInSeconds property */
    private Integer _tokenGenerationIntervalInSeconds;
    /**
     * Instantiates a new StrongAuthenticationPhoneAppDetail and sets the default values.
     * @return a void
     */
    public StrongAuthenticationPhoneAppDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a StrongAuthenticationPhoneAppDetail
     */
    @javax.annotation.Nonnull
    public static StrongAuthenticationPhoneAppDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StrongAuthenticationPhoneAppDetail();
    }
    /**
     * Gets the authenticationType property value. The authenticationType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuthenticationType() {
        return this._authenticationType;
    }
    /**
     * Gets the authenticatorFlavor property value. The authenticatorFlavor property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuthenticatorFlavor() {
        return this._authenticatorFlavor;
    }
    /**
     * Gets the deviceId property value. The deviceId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the deviceName property value. The deviceName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * Gets the deviceTag property value. The deviceTag property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceTag() {
        return this._deviceTag;
    }
    /**
     * Gets the deviceToken property value. The deviceToken property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceToken() {
        return this._deviceToken;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final StrongAuthenticationPhoneAppDetail currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("authenticationType", (n) -> { currentObject.setAuthenticationType(n.getStringValue()); });
            this.put("authenticatorFlavor", (n) -> { currentObject.setAuthenticatorFlavor(n.getStringValue()); });
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("deviceTag", (n) -> { currentObject.setDeviceTag(n.getStringValue()); });
            this.put("deviceToken", (n) -> { currentObject.setDeviceToken(n.getStringValue()); });
            this.put("hashFunction", (n) -> { currentObject.setHashFunction(n.getStringValue()); });
            this.put("lastAuthenticatedDateTime", (n) -> { currentObject.setLastAuthenticatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("notificationType", (n) -> { currentObject.setNotificationType(n.getStringValue()); });
            this.put("oathSecretKey", (n) -> { currentObject.setOathSecretKey(n.getStringValue()); });
            this.put("oathTokenMetadata", (n) -> { currentObject.setOathTokenMetadata(n.getObjectValue(OathTokenMetadata::createFromDiscriminatorValue)); });
            this.put("oathTokenTimeDriftInSeconds", (n) -> { currentObject.setOathTokenTimeDriftInSeconds(n.getIntegerValue()); });
            this.put("phoneAppVersion", (n) -> { currentObject.setPhoneAppVersion(n.getStringValue()); });
            this.put("tenantDeviceId", (n) -> { currentObject.setTenantDeviceId(n.getStringValue()); });
            this.put("tokenGenerationIntervalInSeconds", (n) -> { currentObject.setTokenGenerationIntervalInSeconds(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the hashFunction property value. The hashFunction property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHashFunction() {
        return this._hashFunction;
    }
    /**
     * Gets the lastAuthenticatedDateTime property value. The lastAuthenticatedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastAuthenticatedDateTime() {
        return this._lastAuthenticatedDateTime;
    }
    /**
     * Gets the notificationType property value. The notificationType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotificationType() {
        return this._notificationType;
    }
    /**
     * Gets the oathSecretKey property value. The oathSecretKey property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOathSecretKey() {
        return this._oathSecretKey;
    }
    /**
     * Gets the oathTokenMetadata property value. The oathTokenMetadata property
     * @return a oathTokenMetadata
     */
    @javax.annotation.Nullable
    public OathTokenMetadata getOathTokenMetadata() {
        return this._oathTokenMetadata;
    }
    /**
     * Gets the oathTokenTimeDriftInSeconds property value. The oathTokenTimeDriftInSeconds property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOathTokenTimeDriftInSeconds() {
        return this._oathTokenTimeDriftInSeconds;
    }
    /**
     * Gets the phoneAppVersion property value. The phoneAppVersion property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhoneAppVersion() {
        return this._phoneAppVersion;
    }
    /**
     * Gets the tenantDeviceId property value. The tenantDeviceId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantDeviceId() {
        return this._tenantDeviceId;
    }
    /**
     * Gets the tokenGenerationIntervalInSeconds property value. The tokenGenerationIntervalInSeconds property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTokenGenerationIntervalInSeconds() {
        return this._tokenGenerationIntervalInSeconds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("authenticationType", this.getAuthenticationType());
        writer.writeStringValue("authenticatorFlavor", this.getAuthenticatorFlavor());
        writer.writeStringValue("deviceId", this.getDeviceId());
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
     * @return a void
     */
    public void setAuthenticationType(@javax.annotation.Nullable final String value) {
        this._authenticationType = value;
    }
    /**
     * Sets the authenticatorFlavor property value. The authenticatorFlavor property
     * @param value Value to set for the authenticatorFlavor property.
     * @return a void
     */
    public void setAuthenticatorFlavor(@javax.annotation.Nullable final String value) {
        this._authenticatorFlavor = value;
    }
    /**
     * Sets the deviceId property value. The deviceId property
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the deviceName property value. The deviceName property
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the deviceTag property value. The deviceTag property
     * @param value Value to set for the deviceTag property.
     * @return a void
     */
    public void setDeviceTag(@javax.annotation.Nullable final String value) {
        this._deviceTag = value;
    }
    /**
     * Sets the deviceToken property value. The deviceToken property
     * @param value Value to set for the deviceToken property.
     * @return a void
     */
    public void setDeviceToken(@javax.annotation.Nullable final String value) {
        this._deviceToken = value;
    }
    /**
     * Sets the hashFunction property value. The hashFunction property
     * @param value Value to set for the hashFunction property.
     * @return a void
     */
    public void setHashFunction(@javax.annotation.Nullable final String value) {
        this._hashFunction = value;
    }
    /**
     * Sets the lastAuthenticatedDateTime property value. The lastAuthenticatedDateTime property
     * @param value Value to set for the lastAuthenticatedDateTime property.
     * @return a void
     */
    public void setLastAuthenticatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastAuthenticatedDateTime = value;
    }
    /**
     * Sets the notificationType property value. The notificationType property
     * @param value Value to set for the notificationType property.
     * @return a void
     */
    public void setNotificationType(@javax.annotation.Nullable final String value) {
        this._notificationType = value;
    }
    /**
     * Sets the oathSecretKey property value. The oathSecretKey property
     * @param value Value to set for the oathSecretKey property.
     * @return a void
     */
    public void setOathSecretKey(@javax.annotation.Nullable final String value) {
        this._oathSecretKey = value;
    }
    /**
     * Sets the oathTokenMetadata property value. The oathTokenMetadata property
     * @param value Value to set for the oathTokenMetadata property.
     * @return a void
     */
    public void setOathTokenMetadata(@javax.annotation.Nullable final OathTokenMetadata value) {
        this._oathTokenMetadata = value;
    }
    /**
     * Sets the oathTokenTimeDriftInSeconds property value. The oathTokenTimeDriftInSeconds property
     * @param value Value to set for the oathTokenTimeDriftInSeconds property.
     * @return a void
     */
    public void setOathTokenTimeDriftInSeconds(@javax.annotation.Nullable final Integer value) {
        this._oathTokenTimeDriftInSeconds = value;
    }
    /**
     * Sets the phoneAppVersion property value. The phoneAppVersion property
     * @param value Value to set for the phoneAppVersion property.
     * @return a void
     */
    public void setPhoneAppVersion(@javax.annotation.Nullable final String value) {
        this._phoneAppVersion = value;
    }
    /**
     * Sets the tenantDeviceId property value. The tenantDeviceId property
     * @param value Value to set for the tenantDeviceId property.
     * @return a void
     */
    public void setTenantDeviceId(@javax.annotation.Nullable final String value) {
        this._tenantDeviceId = value;
    }
    /**
     * Sets the tokenGenerationIntervalInSeconds property value. The tokenGenerationIntervalInSeconds property
     * @param value Value to set for the tokenGenerationIntervalInSeconds property.
     * @return a void
     */
    public void setTokenGenerationIntervalInSeconds(@javax.annotation.Nullable final Integer value) {
        this._tokenGenerationIntervalInSeconds = value;
    }
}
