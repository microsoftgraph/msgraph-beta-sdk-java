package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsDomainJoinConfiguration extends DeviceConfiguration implements Parsable {
    /** Active Directory domain name to join. */
    private String _activeDirectoryDomainName;
    /** Fixed prefix to be used for computer name. */
    private String _computerNameStaticPrefix;
    /** Dynamically generated characters used as suffix for computer name. Valid values 3 to 14 */
    private Integer _computerNameSuffixRandomCharCount;
    /** Reference to device configurations required for network connectivity */
    private java.util.List<DeviceConfiguration> _networkAccessConfigurations;
    /** Organizational unit (OU) where the computer account will be created. If this parameter is NULL, the well known computer object container will be used as published in the domain. */
    private String _organizationalUnit;
    /**
     * Instantiates a new WindowsDomainJoinConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsDomainJoinConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsDomainJoinConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsDomainJoinConfiguration
     */
    @javax.annotation.Nonnull
    public static WindowsDomainJoinConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDomainJoinConfiguration();
    }
    /**
     * Gets the activeDirectoryDomainName property value. Active Directory domain name to join.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActiveDirectoryDomainName() {
        return this._activeDirectoryDomainName;
    }
    /**
     * Gets the computerNameStaticPrefix property value. Fixed prefix to be used for computer name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComputerNameStaticPrefix() {
        return this._computerNameStaticPrefix;
    }
    /**
     * Gets the computerNameSuffixRandomCharCount property value. Dynamically generated characters used as suffix for computer name. Valid values 3 to 14
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getComputerNameSuffixRandomCharCount() {
        return this._computerNameSuffixRandomCharCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsDomainJoinConfiguration currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeDirectoryDomainName", (n) -> { currentObject.setActiveDirectoryDomainName(n.getStringValue()); });
        deserializerMap.put("computerNameStaticPrefix", (n) -> { currentObject.setComputerNameStaticPrefix(n.getStringValue()); });
        deserializerMap.put("computerNameSuffixRandomCharCount", (n) -> { currentObject.setComputerNameSuffixRandomCharCount(n.getIntegerValue()); });
        deserializerMap.put("networkAccessConfigurations", (n) -> { currentObject.setNetworkAccessConfigurations(n.getCollectionOfObjectValues(DeviceConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("organizationalUnit", (n) -> { currentObject.setOrganizationalUnit(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the networkAccessConfigurations property value. Reference to device configurations required for network connectivity
     * @return a deviceConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfiguration> getNetworkAccessConfigurations() {
        return this._networkAccessConfigurations;
    }
    /**
     * Gets the organizationalUnit property value. Organizational unit (OU) where the computer account will be created. If this parameter is NULL, the well known computer object container will be used as published in the domain.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrganizationalUnit() {
        return this._organizationalUnit;
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
        writer.writeStringValue("activeDirectoryDomainName", this.getActiveDirectoryDomainName());
        writer.writeStringValue("computerNameStaticPrefix", this.getComputerNameStaticPrefix());
        writer.writeIntegerValue("computerNameSuffixRandomCharCount", this.getComputerNameSuffixRandomCharCount());
        writer.writeCollectionOfObjectValues("networkAccessConfigurations", this.getNetworkAccessConfigurations());
        writer.writeStringValue("organizationalUnit", this.getOrganizationalUnit());
    }
    /**
     * Sets the activeDirectoryDomainName property value. Active Directory domain name to join.
     * @param value Value to set for the activeDirectoryDomainName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActiveDirectoryDomainName(@javax.annotation.Nullable final String value) {
        this._activeDirectoryDomainName = value;
    }
    /**
     * Sets the computerNameStaticPrefix property value. Fixed prefix to be used for computer name.
     * @param value Value to set for the computerNameStaticPrefix property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComputerNameStaticPrefix(@javax.annotation.Nullable final String value) {
        this._computerNameStaticPrefix = value;
    }
    /**
     * Sets the computerNameSuffixRandomCharCount property value. Dynamically generated characters used as suffix for computer name. Valid values 3 to 14
     * @param value Value to set for the computerNameSuffixRandomCharCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComputerNameSuffixRandomCharCount(@javax.annotation.Nullable final Integer value) {
        this._computerNameSuffixRandomCharCount = value;
    }
    /**
     * Sets the networkAccessConfigurations property value. Reference to device configurations required for network connectivity
     * @param value Value to set for the networkAccessConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkAccessConfigurations(@javax.annotation.Nullable final java.util.List<DeviceConfiguration> value) {
        this._networkAccessConfigurations = value;
    }
    /**
     * Sets the organizationalUnit property value. Organizational unit (OU) where the computer account will be created. If this parameter is NULL, the well known computer object container will be used as published in the domain.
     * @param value Value to set for the organizationalUnit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizationalUnit(@javax.annotation.Nullable final String value) {
        this._organizationalUnit = value;
    }
}
