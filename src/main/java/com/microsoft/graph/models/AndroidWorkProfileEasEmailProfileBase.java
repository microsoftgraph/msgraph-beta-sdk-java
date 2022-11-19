package com.microsoft.graph.models;

import com.microsoft.graph.models.AndroidWorkProfileGmailEasConfiguration;
import com.microsoft.graph.models.AndroidWorkProfileNineWorkEasConfiguration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidWorkProfileEasEmailProfileBase extends DeviceConfiguration implements Parsable {
    /** Exchange Active Sync authentication method. */
    private EasAuthenticationMethod _authenticationMethod;
    /** Possible values for email sync duration. */
    private EmailSyncDuration _durationOfEmailToSync;
    /** Possible values for username source or email source. */
    private UserEmailSource _emailAddressSource;
    /** Exchange location (URL) that the mail app connects to. */
    private String _hostName;
    /** Identity certificate. */
    private AndroidWorkProfileCertificateProfileBase _identityCertificate;
    /** Indicates whether or not to use SSL. */
    private Boolean _requireSsl;
    /** Android username source. */
    private AndroidUsernameSource _usernameSource;
    /**
     * Instantiates a new AndroidWorkProfileEasEmailProfileBase and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidWorkProfileEasEmailProfileBase() {
        super();
        this.setOdataType("#microsoft.graph.androidWorkProfileEasEmailProfileBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidWorkProfileEasEmailProfileBase
     */
    @javax.annotation.Nonnull
    public static AndroidWorkProfileEasEmailProfileBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
    @javax.annotation.Nullable
    public EasAuthenticationMethod getAuthenticationMethod() {
        return this._authenticationMethod;
    }
    /**
     * Gets the durationOfEmailToSync property value. Possible values for email sync duration.
     * @return a emailSyncDuration
     */
    @javax.annotation.Nullable
    public EmailSyncDuration getDurationOfEmailToSync() {
        return this._durationOfEmailToSync;
    }
    /**
     * Gets the emailAddressSource property value. Possible values for username source or email source.
     * @return a userEmailSource
     */
    @javax.annotation.Nullable
    public UserEmailSource getEmailAddressSource() {
        return this._emailAddressSource;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidWorkProfileEasEmailProfileBase currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMethod", (n) -> { currentObject.setAuthenticationMethod(n.getEnumValue(EasAuthenticationMethod.class)); });
        deserializerMap.put("durationOfEmailToSync", (n) -> { currentObject.setDurationOfEmailToSync(n.getEnumValue(EmailSyncDuration.class)); });
        deserializerMap.put("emailAddressSource", (n) -> { currentObject.setEmailAddressSource(n.getEnumValue(UserEmailSource.class)); });
        deserializerMap.put("hostName", (n) -> { currentObject.setHostName(n.getStringValue()); });
        deserializerMap.put("identityCertificate", (n) -> { currentObject.setIdentityCertificate(n.getObjectValue(AndroidWorkProfileCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("requireSsl", (n) -> { currentObject.setRequireSsl(n.getBooleanValue()); });
        deserializerMap.put("usernameSource", (n) -> { currentObject.setUsernameSource(n.getEnumValue(AndroidUsernameSource.class)); });
        return deserializerMap
    }
    /**
     * Gets the hostName property value. Exchange location (URL) that the mail app connects to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHostName() {
        return this._hostName;
    }
    /**
     * Gets the identityCertificate property value. Identity certificate.
     * @return a androidWorkProfileCertificateProfileBase
     */
    @javax.annotation.Nullable
    public AndroidWorkProfileCertificateProfileBase getIdentityCertificate() {
        return this._identityCertificate;
    }
    /**
     * Gets the requireSsl property value. Indicates whether or not to use SSL.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequireSsl() {
        return this._requireSsl;
    }
    /**
     * Gets the usernameSource property value. Android username source.
     * @return a androidUsernameSource
     */
    @javax.annotation.Nullable
    public AndroidUsernameSource getUsernameSource() {
        return this._usernameSource;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationMethod(@javax.annotation.Nullable final EasAuthenticationMethod value) {
        this._authenticationMethod = value;
    }
    /**
     * Sets the durationOfEmailToSync property value. Possible values for email sync duration.
     * @param value Value to set for the durationOfEmailToSync property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDurationOfEmailToSync(@javax.annotation.Nullable final EmailSyncDuration value) {
        this._durationOfEmailToSync = value;
    }
    /**
     * Sets the emailAddressSource property value. Possible values for username source or email source.
     * @param value Value to set for the emailAddressSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailAddressSource(@javax.annotation.Nullable final UserEmailSource value) {
        this._emailAddressSource = value;
    }
    /**
     * Sets the hostName property value. Exchange location (URL) that the mail app connects to.
     * @param value Value to set for the hostName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHostName(@javax.annotation.Nullable final String value) {
        this._hostName = value;
    }
    /**
     * Sets the identityCertificate property value. Identity certificate.
     * @param value Value to set for the identityCertificate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityCertificate(@javax.annotation.Nullable final AndroidWorkProfileCertificateProfileBase value) {
        this._identityCertificate = value;
    }
    /**
     * Sets the requireSsl property value. Indicates whether or not to use SSL.
     * @param value Value to set for the requireSsl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequireSsl(@javax.annotation.Nullable final Boolean value) {
        this._requireSsl = value;
    }
    /**
     * Sets the usernameSource property value. Android username source.
     * @param value Value to set for the usernameSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsernameSource(@javax.annotation.Nullable final AndroidUsernameSource value) {
        this._usernameSource = value;
    }
}
