package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Apple device features configuration profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EasEmailProfileConfigurationBase extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new EasEmailProfileConfigurationBase and sets the default values.
     */
    public EasEmailProfileConfigurationBase() {
        super();
        this.setOdataType("#microsoft.graph.easEmailProfileConfigurationBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EasEmailProfileConfigurationBase
     */
    @jakarta.annotation.Nonnull
    public static EasEmailProfileConfigurationBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomDomainName() {
        return this.backingStore.get("customDomainName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customDomainName", (n) -> { this.setCustomDomainName(n.getStringValue()); });
        deserializerMap.put("userDomainNameSource", (n) -> { this.setUserDomainNameSource(n.getEnumValue(DomainNameSource.class)); });
        deserializerMap.put("usernameAADSource", (n) -> { this.setUsernameAADSource(n.getEnumValue(UsernameSource.class)); });
        deserializerMap.put("usernameSource", (n) -> { this.setUsernameSource(n.getEnumValue(UserEmailSource.class)); });
        return deserializerMap;
    }
    /**
     * Gets the userDomainNameSource property value. UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: fullDomainName, netBiosDomainName.
     * @return a DomainNameSource
     */
    @jakarta.annotation.Nullable
    public DomainNameSource getUserDomainNameSource() {
        return this.backingStore.get("userDomainNameSource");
    }
    /**
     * Gets the usernameAADSource property value. Name of the AAD field, that will be used to retrieve UserName for email profile. Possible values are: userPrincipalName, primarySmtpAddress, samAccountName.
     * @return a UsernameSource
     */
    @jakarta.annotation.Nullable
    public UsernameSource getUsernameAADSource() {
        return this.backingStore.get("usernameAADSource");
    }
    /**
     * Gets the usernameSource property value. Possible values for username source or email source.
     * @return a UserEmailSource
     */
    @jakarta.annotation.Nullable
    public UserEmailSource getUsernameSource() {
        return this.backingStore.get("usernameSource");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCustomDomainName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customDomainName", value);
    }
    /**
     * Sets the userDomainNameSource property value. UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: fullDomainName, netBiosDomainName.
     * @param value Value to set for the userDomainNameSource property.
     */
    public void setUserDomainNameSource(@jakarta.annotation.Nullable final DomainNameSource value) {
        this.backingStore.set("userDomainNameSource", value);
    }
    /**
     * Sets the usernameAADSource property value. Name of the AAD field, that will be used to retrieve UserName for email profile. Possible values are: userPrincipalName, primarySmtpAddress, samAccountName.
     * @param value Value to set for the usernameAADSource property.
     */
    public void setUsernameAADSource(@jakarta.annotation.Nullable final UsernameSource value) {
        this.backingStore.set("usernameAADSource", value);
    }
    /**
     * Sets the usernameSource property value. Possible values for username source or email source.
     * @param value Value to set for the usernameSource property.
     */
    public void setUsernameSource(@jakarta.annotation.Nullable final UserEmailSource value) {
        this.backingStore.set("usernameSource", value);
    }
}
