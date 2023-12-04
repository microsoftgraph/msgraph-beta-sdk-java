package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows Domain Join device configuration.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsDomainJoinConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new WindowsDomainJoinConfiguration and sets the default values.
     */
    public WindowsDomainJoinConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsDomainJoinConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsDomainJoinConfiguration
     */
    @jakarta.annotation.Nonnull
    public static WindowsDomainJoinConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDomainJoinConfiguration();
    }
    /**
     * Gets the activeDirectoryDomainName property value. Active Directory domain name to join.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getActiveDirectoryDomainName() {
        return this.backingStore.get("activeDirectoryDomainName");
    }
    /**
     * Gets the computerNameStaticPrefix property value. Fixed prefix to be used for computer name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getComputerNameStaticPrefix() {
        return this.backingStore.get("computerNameStaticPrefix");
    }
    /**
     * Gets the computerNameSuffixRandomCharCount property value. Dynamically generated characters used as suffix for computer name. Valid values 3 to 14
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getComputerNameSuffixRandomCharCount() {
        return this.backingStore.get("computerNameSuffixRandomCharCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeDirectoryDomainName", (n) -> { this.setActiveDirectoryDomainName(n.getStringValue()); });
        deserializerMap.put("computerNameStaticPrefix", (n) -> { this.setComputerNameStaticPrefix(n.getStringValue()); });
        deserializerMap.put("computerNameSuffixRandomCharCount", (n) -> { this.setComputerNameSuffixRandomCharCount(n.getIntegerValue()); });
        deserializerMap.put("networkAccessConfigurations", (n) -> { this.setNetworkAccessConfigurations(n.getCollectionOfObjectValues(DeviceConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("organizationalUnit", (n) -> { this.setOrganizationalUnit(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the networkAccessConfigurations property value. Reference to device configurations required for network connectivity
     * @return a java.util.List<DeviceConfiguration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceConfiguration> getNetworkAccessConfigurations() {
        return this.backingStore.get("networkAccessConfigurations");
    }
    /**
     * Gets the organizationalUnit property value. Organizational unit (OU) where the computer account will be created. If this parameter is NULL, the well known computer object container will be used as published in the domain.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrganizationalUnit() {
        return this.backingStore.get("organizationalUnit");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("activeDirectoryDomainName", this.getActiveDirectoryDomainName());
        writer.writeStringValue("computerNameStaticPrefix", this.getComputerNameStaticPrefix());
        writer.writeIntegerValue("computerNameSuffixRandomCharCount", this.getComputerNameSuffixRandomCharCount());
        writer.writeCollectionOfObjectValues("networkAccessConfigurations", this.getNetworkAccessConfigurations());
        writer.writeStringValue("organizationalUnit", this.getOrganizationalUnit());
    }
    /**
     * Sets the activeDirectoryDomainName property value. Active Directory domain name to join.
     * @param value Value to set for the activeDirectoryDomainName property.
     */
    public void setActiveDirectoryDomainName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("activeDirectoryDomainName", value);
    }
    /**
     * Sets the computerNameStaticPrefix property value. Fixed prefix to be used for computer name.
     * @param value Value to set for the computerNameStaticPrefix property.
     */
    public void setComputerNameStaticPrefix(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("computerNameStaticPrefix", value);
    }
    /**
     * Sets the computerNameSuffixRandomCharCount property value. Dynamically generated characters used as suffix for computer name. Valid values 3 to 14
     * @param value Value to set for the computerNameSuffixRandomCharCount property.
     */
    public void setComputerNameSuffixRandomCharCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("computerNameSuffixRandomCharCount", value);
    }
    /**
     * Sets the networkAccessConfigurations property value. Reference to device configurations required for network connectivity
     * @param value Value to set for the networkAccessConfigurations property.
     */
    public void setNetworkAccessConfigurations(@jakarta.annotation.Nullable final java.util.List<DeviceConfiguration> value) {
        this.backingStore.set("networkAccessConfigurations", value);
    }
    /**
     * Sets the organizationalUnit property value. Organizational unit (OU) where the computer account will be created. If this parameter is NULL, the well known computer object container will be used as published in the domain.
     * @param value Value to set for the organizationalUnit property.
     */
    public void setOrganizationalUnit(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("organizationalUnit", value);
    }
}
