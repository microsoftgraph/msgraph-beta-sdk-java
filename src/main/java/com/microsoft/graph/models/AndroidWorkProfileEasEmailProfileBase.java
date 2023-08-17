package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Base for Android Work Profile EAS Email profiles
 */
public class AndroidWorkProfileEasEmailProfileBase extends DeviceConfiguration implements Parsable {
    /**
     * Exchange Active Sync authentication method.
     */
    private EasAuthenticationMethod authenticationMethod;
    /**
     * Possible values for email sync duration.
     */
    private EmailSyncDuration durationOfEmailToSync;
    /**
     * Possible values for username source or email source.
     */
    private UserEmailSource emailAddressSource;
    /**
     * Exchange location (URL) that the mail app connects to.
     */
    private String hostName;
    /**
     * Identity certificate.
     */
    private AndroidWorkProfileCertificateProfileBase identityCertificate;
    /**
     * Indicates whether or not to use SSL.
     */
    private Boolean requireSsl;
    /**
     * Android username source.
     */
    private AndroidUsernameSource usernameSource;
    /**
     * Instantiates a new androidWorkProfileEasEmailProfileBase and sets the default values.
     */
    public AndroidWorkProfileEasEmailProfileBase() {
        super();
        this.setOdataType("#microsoft.graph.androidWorkProfileEasEmailProfileBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidWorkProfileEasEmailProfileBase
     */
    @jakarta.annotation.Nonnull
    public static AndroidWorkProfileEasEmailProfileBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidWorkProfileGmailEasConfiguration": return new AndroidWorkProfileGmailEasConfiguration();
                case "#microsoft.graph.androidWorkProfileNineWorkEasConfiguration": return new AndroidWorkProfileNineWorkEasConfiguration();
            }
        }
        return new AndroidWorkProfileEasEmailProfileBase();
    }
    /**
     * Gets the authenticationMethod property value. Exchange Active Sync authentication method.
     * @return a easAuthenticationMethod
     */
    @jakarta.annotation.Nullable
    public EasAuthenticationMethod getAuthenticationMethod() {
        return this.authenticationMethod;
    }
    /**
     * Gets the durationOfEmailToSync property value. Possible values for email sync duration.
     * @return a emailSyncDuration
     */
    @jakarta.annotation.Nullable
    public EmailSyncDuration getDurationOfEmailToSync() {
        return this.durationOfEmailToSync;
    }
    /**
     * Gets the emailAddressSource property value. Possible values for username source or email source.
     * @return a userEmailSource
     */
    @jakarta.annotation.Nullable
    public UserEmailSource getEmailAddressSource() {
        return this.emailAddressSource;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getEnumValue(EasAuthenticationMethod.class)); });
        deserializerMap.put("durationOfEmailToSync", (n) -> { this.setDurationOfEmailToSync(n.getEnumValue(EmailSyncDuration.class)); });
        deserializerMap.put("emailAddressSource", (n) -> { this.setEmailAddressSource(n.getEnumValue(UserEmailSource.class)); });
        deserializerMap.put("hostName", (n) -> { this.setHostName(n.getStringValue()); });
        deserializerMap.put("identityCertificate", (n) -> { this.setIdentityCertificate(n.getObjectValue(AndroidWorkProfileCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("requireSsl", (n) -> { this.setRequireSsl(n.getBooleanValue()); });
        deserializerMap.put("usernameSource", (n) -> { this.setUsernameSource(n.getEnumValue(AndroidUsernameSource.class)); });
        return deserializerMap;
    }
    /**
     * Gets the hostName property value. Exchange location (URL) that the mail app connects to.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getHostName() {
        return this.hostName;
    }
    /**
     * Gets the identityCertificate property value. Identity certificate.
     * @return a androidWorkProfileCertificateProfileBase
     */
    @jakarta.annotation.Nullable
    public AndroidWorkProfileCertificateProfileBase getIdentityCertificate() {
        return this.identityCertificate;
    }
    /**
     * Gets the requireSsl property value. Indicates whether or not to use SSL.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireSsl() {
        return this.requireSsl;
    }
    /**
     * Gets the usernameSource property value. Android username source.
     * @return a androidUsernameSource
     */
    @jakarta.annotation.Nullable
    public AndroidUsernameSource getUsernameSource() {
        return this.usernameSource;
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
        this.authenticationMethod = value;
    }
    /**
     * Sets the durationOfEmailToSync property value. Possible values for email sync duration.
     * @param value Value to set for the durationOfEmailToSync property.
     */
    public void setDurationOfEmailToSync(@jakarta.annotation.Nullable final EmailSyncDuration value) {
        this.durationOfEmailToSync = value;
    }
    /**
     * Sets the emailAddressSource property value. Possible values for username source or email source.
     * @param value Value to set for the emailAddressSource property.
     */
    public void setEmailAddressSource(@jakarta.annotation.Nullable final UserEmailSource value) {
        this.emailAddressSource = value;
    }
    /**
     * Sets the hostName property value. Exchange location (URL) that the mail app connects to.
     * @param value Value to set for the hostName property.
     */
    public void setHostName(@jakarta.annotation.Nullable final String value) {
        this.hostName = value;
    }
    /**
     * Sets the identityCertificate property value. Identity certificate.
     * @param value Value to set for the identityCertificate property.
     */
    public void setIdentityCertificate(@jakarta.annotation.Nullable final AndroidWorkProfileCertificateProfileBase value) {
        this.identityCertificate = value;
    }
    /**
     * Sets the requireSsl property value. Indicates whether or not to use SSL.
     * @param value Value to set for the requireSsl property.
     */
    public void setRequireSsl(@jakarta.annotation.Nullable final Boolean value) {
        this.requireSsl = value;
    }
    /**
     * Sets the usernameSource property value. Android username source.
     * @param value Value to set for the usernameSource property.
     */
    public void setUsernameSource(@jakarta.annotation.Nullable final AndroidUsernameSource value) {
        this.usernameSource = value;
    }
}
