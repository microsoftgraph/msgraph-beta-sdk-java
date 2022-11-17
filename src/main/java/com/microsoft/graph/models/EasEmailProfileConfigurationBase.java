package com.microsoft.graph.models;

import com.microsoft.graph.models.IosEasEmailProfileConfiguration;
import com.microsoft.graph.models.Windows10EasEmailProfileConfiguration;
import com.microsoft.graph.models.WindowsPhoneEASEmailProfileConfiguration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EasEmailProfileConfigurationBase extends DeviceConfiguration implements Parsable {
    /** Custom domain name value used while generating an email profile before installing on the device. */
    private String _customDomainName;
    /** UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: fullDomainName, netBiosDomainName. */
    private DomainNameSource _userDomainNameSource;
    /** Name of the AAD field, that will be used to retrieve UserName for email profile. Possible values are: userPrincipalName, primarySmtpAddress, samAccountName. */
    private UsernameSource _usernameAADSource;
    /** Possible values for username source or email source. */
    private UserEmailSource _usernameSource;
    /**
     * Instantiates a new EasEmailProfileConfigurationBase and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EasEmailProfileConfigurationBase() {
        super();
        this.setOdataType("#microsoft.graph.easEmailProfileConfigurationBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EasEmailProfileConfigurationBase
     */
    @javax.annotation.Nonnull
    public static EasEmailProfileConfigurationBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.iosEasEmailProfileConfiguration": return new IosEasEmailProfileConfiguration();
                case "#microsoft.graph.windows10EasEmailProfileConfiguration": return new Windows10EasEmailProfileConfiguration();
                case "#microsoft.graph.windowsPhoneEASEmailProfileConfiguration": return new WindowsPhoneEASEmailProfileConfiguration();
            }
        }
        return new EasEmailProfileConfigurationBase();
    }
    /**
     * Gets the customDomainName property value. Custom domain name value used while generating an email profile before installing on the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomDomainName() {
        return this._customDomainName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EasEmailProfileConfigurationBase currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("customDomainName", (n) -> { currentObject.setCustomDomainName(n.getStringValue()); });
            this.put("userDomainNameSource", (n) -> { currentObject.setUserDomainNameSource(n.getEnumValue(DomainNameSource.class)); });
            this.put("usernameAADSource", (n) -> { currentObject.setUsernameAADSource(n.getEnumValue(UsernameSource.class)); });
            this.put("usernameSource", (n) -> { currentObject.setUsernameSource(n.getEnumValue(UserEmailSource.class)); });
        }};
    }
    /**
     * Gets the userDomainNameSource property value. UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: fullDomainName, netBiosDomainName.
     * @return a domainNameSource
     */
    @javax.annotation.Nullable
    public DomainNameSource getUserDomainNameSource() {
        return this._userDomainNameSource;
    }
    /**
     * Gets the usernameAADSource property value. Name of the AAD field, that will be used to retrieve UserName for email profile. Possible values are: userPrincipalName, primarySmtpAddress, samAccountName.
     * @return a usernameSource
     */
    @javax.annotation.Nullable
    public UsernameSource getUsernameAADSource() {
        return this._usernameAADSource;
    }
    /**
     * Gets the usernameSource property value. Possible values for username source or email source.
     * @return a userEmailSource
     */
    @javax.annotation.Nullable
    public UserEmailSource getUsernameSource() {
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
        writer.writeStringValue("customDomainName", this.getCustomDomainName());
        writer.writeEnumValue("userDomainNameSource", this.getUserDomainNameSource());
        writer.writeEnumValue("usernameAADSource", this.getUsernameAADSource());
        writer.writeEnumValue("usernameSource", this.getUsernameSource());
    }
    /**
     * Sets the customDomainName property value. Custom domain name value used while generating an email profile before installing on the device.
     * @param value Value to set for the customDomainName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomDomainName(@javax.annotation.Nullable final String value) {
        this._customDomainName = value;
    }
    /**
     * Sets the userDomainNameSource property value. UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: fullDomainName, netBiosDomainName.
     * @param value Value to set for the userDomainNameSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserDomainNameSource(@javax.annotation.Nullable final DomainNameSource value) {
        this._userDomainNameSource = value;
    }
    /**
     * Sets the usernameAADSource property value. Name of the AAD field, that will be used to retrieve UserName for email profile. Possible values are: userPrincipalName, primarySmtpAddress, samAccountName.
     * @param value Value to set for the usernameAADSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsernameAADSource(@javax.annotation.Nullable final UsernameSource value) {
        this._usernameAADSource = value;
    }
    /**
     * Sets the usernameSource property value. Possible values for username source or email source.
     * @param value Value to set for the usernameSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsernameSource(@javax.annotation.Nullable final UserEmailSource value) {
        this._usernameSource = value;
    }
}
