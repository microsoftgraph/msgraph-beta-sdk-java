package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Base for Android For Work EAS Email profiles
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidForWorkEasEmailProfileBase extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link AndroidForWorkEasEmailProfileBase} and sets the default values.
     */
    public AndroidForWorkEasEmailProfileBase() {
        super();
        this.setOdataType("#microsoft.graph.androidForWorkEasEmailProfileBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AndroidForWorkEasEmailProfileBase}
     */
    @jakarta.annotation.Nonnull
    public static AndroidForWorkEasEmailProfileBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidForWorkGmailEasConfiguration": return new AndroidForWorkGmailEasConfiguration();
                case "#microsoft.graph.androidForWorkNineWorkEasConfiguration": return new AndroidForWorkNineWorkEasConfiguration();
            }
        }
        return new AndroidForWorkEasEmailProfileBase();
    }
    /**
     * Gets the authenticationMethod property value. Exchange Active Sync authentication method.
     * @return a {@link EasAuthenticationMethod}
     */
    @jakarta.annotation.Nullable
    public EasAuthenticationMethod getAuthenticationMethod() {
        return this.backingStore.get("authenticationMethod");
    }
    /**
     * Gets the durationOfEmailToSync property value. Possible values for email sync duration.
     * @return a {@link EmailSyncDuration}
     */
    @jakarta.annotation.Nullable
    public EmailSyncDuration getDurationOfEmailToSync() {
        return this.backingStore.get("durationOfEmailToSync");
    }
    /**
     * Gets the emailAddressSource property value. Possible values for username source or email source.
     * @return a {@link UserEmailSource}
     */
    @jakarta.annotation.Nullable
    public UserEmailSource getEmailAddressSource() {
        return this.backingStore.get("emailAddressSource");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getEnumValue(EasAuthenticationMethod::forValue)); });
        deserializerMap.put("durationOfEmailToSync", (n) -> { this.setDurationOfEmailToSync(n.getEnumValue(EmailSyncDuration::forValue)); });
        deserializerMap.put("emailAddressSource", (n) -> { this.setEmailAddressSource(n.getEnumValue(UserEmailSource::forValue)); });
        deserializerMap.put("hostName", (n) -> { this.setHostName(n.getStringValue()); });
        deserializerMap.put("identityCertificate", (n) -> { this.setIdentityCertificate(n.getObjectValue(AndroidForWorkCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("requireSsl", (n) -> { this.setRequireSsl(n.getBooleanValue()); });
        deserializerMap.put("usernameSource", (n) -> { this.setUsernameSource(n.getEnumValue(AndroidUsernameSource::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hostName property value. Exchange location (URL) that the mail app connects to.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHostName() {
        return this.backingStore.get("hostName");
    }
    /**
     * Gets the identityCertificate property value. Identity certificate.
     * @return a {@link AndroidForWorkCertificateProfileBase}
     */
    @jakarta.annotation.Nullable
    public AndroidForWorkCertificateProfileBase getIdentityCertificate() {
        return this.backingStore.get("identityCertificate");
    }
    /**
     * Gets the requireSsl property value. Indicates whether or not to use SSL.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireSsl() {
        return this.backingStore.get("requireSsl");
    }
    /**
     * Gets the usernameSource property value. Android username source.
     * @return a {@link AndroidUsernameSource}
     */
    @jakarta.annotation.Nullable
    public AndroidUsernameSource getUsernameSource() {
        return this.backingStore.get("usernameSource");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("authenticationMethod", this.getAuthenticationMethod());
        writer.writeEnumValue("durationOfEmailToSync", this.getDurationOfEmailToSync());
        writer.writeEnumValue("emailAddressSource", this.getEmailAddressSource());
        writer.writeStringValue("hostName", this.getHostName());
        writer.writeObjectValue("identityCertificate", this.getIdentityCertificate());
        writer.writeBooleanValue("requireSsl", this.getRequireSsl());
        writer.writeEnumValue("usernameSource", this.getUsernameSource());
    }
    /**
     * Sets the authenticationMethod property value. Exchange Active Sync authentication method.
     * @param value Value to set for the authenticationMethod property.
     */
    public void setAuthenticationMethod(@jakarta.annotation.Nullable final EasAuthenticationMethod value) {
        this.backingStore.set("authenticationMethod", value);
    }
    /**
     * Sets the durationOfEmailToSync property value. Possible values for email sync duration.
     * @param value Value to set for the durationOfEmailToSync property.
     */
    public void setDurationOfEmailToSync(@jakarta.annotation.Nullable final EmailSyncDuration value) {
        this.backingStore.set("durationOfEmailToSync", value);
    }
    /**
     * Sets the emailAddressSource property value. Possible values for username source or email source.
     * @param value Value to set for the emailAddressSource property.
     */
    public void setEmailAddressSource(@jakarta.annotation.Nullable final UserEmailSource value) {
        this.backingStore.set("emailAddressSource", value);
    }
    /**
     * Sets the hostName property value. Exchange location (URL) that the mail app connects to.
     * @param value Value to set for the hostName property.
     */
    public void setHostName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("hostName", value);
    }
    /**
     * Sets the identityCertificate property value. Identity certificate.
     * @param value Value to set for the identityCertificate property.
     */
    public void setIdentityCertificate(@jakarta.annotation.Nullable final AndroidForWorkCertificateProfileBase value) {
        this.backingStore.set("identityCertificate", value);
    }
    /**
     * Sets the requireSsl property value. Indicates whether or not to use SSL.
     * @param value Value to set for the requireSsl property.
     */
    public void setRequireSsl(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("requireSsl", value);
    }
    /**
     * Sets the usernameSource property value. Android username source.
     * @param value Value to set for the usernameSource property.
     */
    public void setUsernameSource(@jakarta.annotation.Nullable final AndroidUsernameSource value) {
        this.backingStore.set("usernameSource", value);
    }
}
