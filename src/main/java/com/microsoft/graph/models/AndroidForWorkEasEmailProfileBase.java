package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidForWorkEasEmailProfileBase extends DeviceConfiguration implements Parsable {
    /** Authentication method for Exchange ActiveSync. Possible values are: usernameAndPassword, certificate, derivedCredential. */
    private EasAuthenticationMethod _authenticationMethod;
    /** Duration of time email should be synced to. Possible values are: userDefined, oneDay, threeDays, oneWeek, twoWeeks, oneMonth, unlimited. */
    private EmailSyncDuration _durationOfEmailToSync;
    /** Email attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: userPrincipalName, primarySmtpAddress. */
    private UserEmailSource _emailAddressSource;
    /** Exchange location (URL) that the mail app connects to. */
    private String _hostName;
    /** Identity certificate. */
    private AndroidForWorkCertificateProfileBase _identityCertificate;
    /** Indicates whether or not to use SSL. */
    private Boolean _requireSsl;
    /** Username attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: username, userPrincipalName, samAccountName, primarySmtpAddress. */
    private AndroidUsernameSource _usernameSource;
    /**
     * Instantiates a new AndroidForWorkEasEmailProfileBase and sets the default values.
     * @return a void
     */
    public AndroidForWorkEasEmailProfileBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidForWorkEasEmailProfileBase
     */
    @javax.annotation.Nonnull
    public static AndroidForWorkEasEmailProfileBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * Gets the authenticationMethod property value. Authentication method for Exchange ActiveSync. Possible values are: usernameAndPassword, certificate, derivedCredential.
     * @return a easAuthenticationMethod
     */
    @javax.annotation.Nullable
    public EasAuthenticationMethod getAuthenticationMethod() {
        return this._authenticationMethod;
    }
    /**
     * Gets the durationOfEmailToSync property value. Duration of time email should be synced to. Possible values are: userDefined, oneDay, threeDays, oneWeek, twoWeeks, oneMonth, unlimited.
     * @return a emailSyncDuration
     */
    @javax.annotation.Nullable
    public EmailSyncDuration getDurationOfEmailToSync() {
        return this._durationOfEmailToSync;
    }
    /**
     * Gets the emailAddressSource property value. Email attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: userPrincipalName, primarySmtpAddress.
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
        final AndroidForWorkEasEmailProfileBase currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("authenticationMethod", (n) -> { currentObject.setAuthenticationMethod(n.getEnumValue(EasAuthenticationMethod.class)); });
            this.put("durationOfEmailToSync", (n) -> { currentObject.setDurationOfEmailToSync(n.getEnumValue(EmailSyncDuration.class)); });
            this.put("emailAddressSource", (n) -> { currentObject.setEmailAddressSource(n.getEnumValue(UserEmailSource.class)); });
            this.put("hostName", (n) -> { currentObject.setHostName(n.getStringValue()); });
            this.put("identityCertificate", (n) -> { currentObject.setIdentityCertificate(n.getObjectValue(AndroidForWorkCertificateProfileBase::createFromDiscriminatorValue)); });
            this.put("requireSsl", (n) -> { currentObject.setRequireSsl(n.getBooleanValue()); });
            this.put("usernameSource", (n) -> { currentObject.setUsernameSource(n.getEnumValue(AndroidUsernameSource.class)); });
        }};
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
     * @return a androidForWorkCertificateProfileBase
     */
    @javax.annotation.Nullable
    public AndroidForWorkCertificateProfileBase getIdentityCertificate() {
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
     * Gets the usernameSource property value. Username attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: username, userPrincipalName, samAccountName, primarySmtpAddress.
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
     * Sets the authenticationMethod property value. Authentication method for Exchange ActiveSync. Possible values are: usernameAndPassword, certificate, derivedCredential.
     * @param value Value to set for the authenticationMethod property.
     * @return a void
     */
    public void setAuthenticationMethod(@javax.annotation.Nullable final EasAuthenticationMethod value) {
        this._authenticationMethod = value;
    }
    /**
     * Sets the durationOfEmailToSync property value. Duration of time email should be synced to. Possible values are: userDefined, oneDay, threeDays, oneWeek, twoWeeks, oneMonth, unlimited.
     * @param value Value to set for the durationOfEmailToSync property.
     * @return a void
     */
    public void setDurationOfEmailToSync(@javax.annotation.Nullable final EmailSyncDuration value) {
        this._durationOfEmailToSync = value;
    }
    /**
     * Sets the emailAddressSource property value. Email attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: userPrincipalName, primarySmtpAddress.
     * @param value Value to set for the emailAddressSource property.
     * @return a void
     */
    public void setEmailAddressSource(@javax.annotation.Nullable final UserEmailSource value) {
        this._emailAddressSource = value;
    }
    /**
     * Sets the hostName property value. Exchange location (URL) that the mail app connects to.
     * @param value Value to set for the hostName property.
     * @return a void
     */
    public void setHostName(@javax.annotation.Nullable final String value) {
        this._hostName = value;
    }
    /**
     * Sets the identityCertificate property value. Identity certificate.
     * @param value Value to set for the identityCertificate property.
     * @return a void
     */
    public void setIdentityCertificate(@javax.annotation.Nullable final AndroidForWorkCertificateProfileBase value) {
        this._identityCertificate = value;
    }
    /**
     * Sets the requireSsl property value. Indicates whether or not to use SSL.
     * @param value Value to set for the requireSsl property.
     * @return a void
     */
    public void setRequireSsl(@javax.annotation.Nullable final Boolean value) {
        this._requireSsl = value;
    }
    /**
     * Sets the usernameSource property value. Username attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: username, userPrincipalName, samAccountName, primarySmtpAddress.
     * @param value Value to set for the usernameSource property.
     * @return a void
     */
    public void setUsernameSource(@javax.annotation.Nullable final AndroidUsernameSource value) {
        this._usernameSource = value;
    }
}
