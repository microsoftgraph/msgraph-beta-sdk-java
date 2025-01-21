package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceTemplate extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new {@link DeviceTemplate} and sets the default values.
     */
    public DeviceTemplate() {
        super();
        this.setOdataType("#microsoft.graph.deviceTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceTemplate}
     */
    @jakarta.annotation.Nonnull
    public static DeviceTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceTemplate();
    }
    /**
     * Gets the deviceAuthority property value. A tenant-defined name for the party that's responsible for provisioning and managing devices on the Microsoft Entra tenant. For example, Tailwind Traders (the manufacturer) makes security cameras that are installed in customer buildings and managed by Lakeshore Retail (the device authority). This value is provided to the customer by the device authority (manufacturer or reseller).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceAuthority() {
        return this.backingStore.get("deviceAuthority");
    }
    /**
     * Gets the deviceInstances property value. Collection of device objects created based on this template.
     * @return a {@link java.util.List<Device>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Device> getDeviceInstances() {
        return this.backingStore.get("deviceInstances");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceAuthority", (n) -> { this.setDeviceAuthority(n.getStringValue()); });
        deserializerMap.put("deviceInstances", (n) -> { this.setDeviceInstances(n.getCollectionOfObjectValues(Device::createFromDiscriminatorValue)); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("mutualTlsOauthConfigurationId", (n) -> { this.setMutualTlsOauthConfigurationId(n.getStringValue()); });
        deserializerMap.put("mutualTlsOauthConfigurationTenantId", (n) -> { this.setMutualTlsOauthConfigurationTenantId(n.getStringValue()); });
        deserializerMap.put("operatingSystem", (n) -> { this.setOperatingSystem(n.getStringValue()); });
        deserializerMap.put("owners", (n) -> { this.setOwners(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the manufacturer property value. Manufacturer name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.backingStore.get("manufacturer");
    }
    /**
     * Gets the model property value. Model name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.backingStore.get("model");
    }
    /**
     * Gets the mutualTlsOauthConfigurationId property value. Object ID of the mutualTlsOauthConfiguration. This value isn't required if self-signed certificates are used. This value is provided to the customer by the device authority (manufacturer or reseller).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMutualTlsOauthConfigurationId() {
        return this.backingStore.get("mutualTlsOauthConfigurationId");
    }
    /**
     * Gets the mutualTlsOauthConfigurationTenantId property value. ID (tenant ID for device authority) of the tenant that contains the mutualTlsOauthConfiguration. This value isn't required if self-signed certificates are used. This value is provided to the customer by the device authority (manufacturer or reseller).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMutualTlsOauthConfigurationTenantId() {
        return this.backingStore.get("mutualTlsOauthConfigurationTenantId");
    }
    /**
     * Gets the operatingSystem property value. Operating system type. Supports $filter (eq, in).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystem() {
        return this.backingStore.get("operatingSystem");
    }
    /**
     * Gets the owners property value. Collection of directory objects that can manage the device template and the related deviceInstances. Owners can be represented as service principals, users, or applications. An owner has full privileges over the device template and doesn't require other administrator roles to create, update, or delete devices from this template, as well as to add or remove template owners. There can be a maximum of 100 owners on a device template.  Supports $expand.
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getOwners() {
        return this.backingStore.get("owners");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("deviceAuthority", this.getDeviceAuthority());
        writer.writeCollectionOfObjectValues("deviceInstances", this.getDeviceInstances());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeStringValue("mutualTlsOauthConfigurationId", this.getMutualTlsOauthConfigurationId());
        writer.writeStringValue("mutualTlsOauthConfigurationTenantId", this.getMutualTlsOauthConfigurationTenantId());
        writer.writeStringValue("operatingSystem", this.getOperatingSystem());
        writer.writeCollectionOfObjectValues("owners", this.getOwners());
    }
    /**
     * Sets the deviceAuthority property value. A tenant-defined name for the party that's responsible for provisioning and managing devices on the Microsoft Entra tenant. For example, Tailwind Traders (the manufacturer) makes security cameras that are installed in customer buildings and managed by Lakeshore Retail (the device authority). This value is provided to the customer by the device authority (manufacturer or reseller).
     * @param value Value to set for the deviceAuthority property.
     */
    public void setDeviceAuthority(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceAuthority", value);
    }
    /**
     * Sets the deviceInstances property value. Collection of device objects created based on this template.
     * @param value Value to set for the deviceInstances property.
     */
    public void setDeviceInstances(@jakarta.annotation.Nullable final java.util.List<Device> value) {
        this.backingStore.set("deviceInstances", value);
    }
    /**
     * Sets the manufacturer property value. Manufacturer name.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manufacturer", value);
    }
    /**
     * Sets the model property value. Model name.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("model", value);
    }
    /**
     * Sets the mutualTlsOauthConfigurationId property value. Object ID of the mutualTlsOauthConfiguration. This value isn't required if self-signed certificates are used. This value is provided to the customer by the device authority (manufacturer or reseller).
     * @param value Value to set for the mutualTlsOauthConfigurationId property.
     */
    public void setMutualTlsOauthConfigurationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mutualTlsOauthConfigurationId", value);
    }
    /**
     * Sets the mutualTlsOauthConfigurationTenantId property value. ID (tenant ID for device authority) of the tenant that contains the mutualTlsOauthConfiguration. This value isn't required if self-signed certificates are used. This value is provided to the customer by the device authority (manufacturer or reseller).
     * @param value Value to set for the mutualTlsOauthConfigurationTenantId property.
     */
    public void setMutualTlsOauthConfigurationTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mutualTlsOauthConfigurationTenantId", value);
    }
    /**
     * Sets the operatingSystem property value. Operating system type. Supports $filter (eq, in).
     * @param value Value to set for the operatingSystem property.
     */
    public void setOperatingSystem(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operatingSystem", value);
    }
    /**
     * Sets the owners property value. Collection of directory objects that can manage the device template and the related deviceInstances. Owners can be represented as service principals, users, or applications. An owner has full privileges over the device template and doesn't require other administrator roles to create, update, or delete devices from this template, as well as to add or remove template owners. There can be a maximum of 100 owners on a device template.  Supports $expand.
     * @param value Value to set for the owners property.
     */
    public void setOwners(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("owners", value);
    }
}
