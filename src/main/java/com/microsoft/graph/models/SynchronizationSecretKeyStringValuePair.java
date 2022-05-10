package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SynchronizationSecretKeyStringValuePair implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Possible values are: None, UserName, Password, SecretToken, AppKey, BaseAddress, ClientIdentifier, ClientSecret, SingleSignOnType, Sandbox, Url, Domain, ConsumerKey, ConsumerSecret, TokenKey, TokenExpiration, Oauth2AccessToken, Oauth2AccessTokenCreationTime, Oauth2RefreshToken, SyncAll, InstanceName, Oauth2ClientId, Oauth2ClientSecret, CompanyId, UpdateKeyOnSoftDelete, SynchronizationSchedule, SystemOfRecord, SandboxName, EnforceDomain, SyncNotificationSettings, Server, PerformInboundEntitlementGrants, HardDeletesEnabled, SyncAgentCompatibilityKey, SyncAgentADContainer, ValidateDomain, Oauth2TokenExchangeUri, Oauth2AuthorizationUri, AuthenticationType, TestReferences, ConnectionString. */
    private SynchronizationSecret _key;
    /** The value of the secret. */
    private String _value;
    /**
     * Instantiates a new synchronizationSecretKeyStringValuePair and sets the default values.
     * @return a void
     */
    public SynchronizationSecretKeyStringValuePair() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationSecretKeyStringValuePair
     */
    @javax.annotation.Nonnull
    public static SynchronizationSecretKeyStringValuePair createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationSecretKeyStringValuePair();
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
        final SynchronizationSecretKeyStringValuePair currentObject = this;
        return new HashMap<>(2) {{
            this.put("key", (n) -> { currentObject.setKey(n.getEnumValue(SynchronizationSecret.class)); });
            this.put("value", (n) -> { currentObject.setValue(n.getStringValue()); });
        }};
    }
    /**
     * Gets the key property value. Possible values are: None, UserName, Password, SecretToken, AppKey, BaseAddress, ClientIdentifier, ClientSecret, SingleSignOnType, Sandbox, Url, Domain, ConsumerKey, ConsumerSecret, TokenKey, TokenExpiration, Oauth2AccessToken, Oauth2AccessTokenCreationTime, Oauth2RefreshToken, SyncAll, InstanceName, Oauth2ClientId, Oauth2ClientSecret, CompanyId, UpdateKeyOnSoftDelete, SynchronizationSchedule, SystemOfRecord, SandboxName, EnforceDomain, SyncNotificationSettings, Server, PerformInboundEntitlementGrants, HardDeletesEnabled, SyncAgentCompatibilityKey, SyncAgentADContainer, ValidateDomain, Oauth2TokenExchangeUri, Oauth2AuthorizationUri, AuthenticationType, TestReferences, ConnectionString.
     * @return a synchronizationSecret
     */
    @javax.annotation.Nullable
    public SynchronizationSecret getKey() {
        return this._key;
    }
    /**
     * Gets the value property value. The value of the secret.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValue() {
        return this._value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("key", this.getKey());
        writer.writeStringValue("value", this.getValue());
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
     * Sets the key property value. Possible values are: None, UserName, Password, SecretToken, AppKey, BaseAddress, ClientIdentifier, ClientSecret, SingleSignOnType, Sandbox, Url, Domain, ConsumerKey, ConsumerSecret, TokenKey, TokenExpiration, Oauth2AccessToken, Oauth2AccessTokenCreationTime, Oauth2RefreshToken, SyncAll, InstanceName, Oauth2ClientId, Oauth2ClientSecret, CompanyId, UpdateKeyOnSoftDelete, SynchronizationSchedule, SystemOfRecord, SandboxName, EnforceDomain, SyncNotificationSettings, Server, PerformInboundEntitlementGrants, HardDeletesEnabled, SyncAgentCompatibilityKey, SyncAgentADContainer, ValidateDomain, Oauth2TokenExchangeUri, Oauth2AuthorizationUri, AuthenticationType, TestReferences, ConnectionString.
     * @param value Value to set for the key property.
     * @return a void
     */
    public void setKey(@javax.annotation.Nullable final SynchronizationSecret value) {
        this._key = value;
    }
    /**
     * Sets the value property value. The value of the secret.
     * @param value Value to set for the value property.
     * @return a void
     */
    public void setValue(@javax.annotation.Nullable final String value) {
        this._value = value;
    }
}
