package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A rule controlling traffic through the Windows Firewall.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsFirewallRule implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link WindowsFirewallRule} and sets the default values.
     */
    public WindowsFirewallRule() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsFirewallRule}
     */
    @jakarta.annotation.Nonnull
    public static WindowsFirewallRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsFirewallRule();
    }
    /**
     * Gets the action property value. State Management Setting.
     * @return a {@link StateManagementSetting}
     */
    @jakarta.annotation.Nullable
    public StateManagementSetting getAction() {
        return this.backingStore.get("action");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the description property value. The description of the rule.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the rule. Does not need to be unique.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the edgeTraversal property value. State Management Setting.
     * @return a {@link StateManagementSetting}
     */
    @jakarta.annotation.Nullable
    public StateManagementSetting getEdgeTraversal() {
        return this.backingStore.get("edgeTraversal");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(17);
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(StateManagementSetting::forValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("edgeTraversal", (n) -> { this.setEdgeTraversal(n.getEnumValue(StateManagementSetting::forValue)); });
        deserializerMap.put("filePath", (n) -> { this.setFilePath(n.getStringValue()); });
        deserializerMap.put("interfaceTypes", (n) -> { this.setInterfaceTypes(n.getEnumSetValue(WindowsFirewallRuleInterfaceTypes::forValue)); });
        deserializerMap.put("localAddressRanges", (n) -> { this.setLocalAddressRanges(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("localPortRanges", (n) -> { this.setLocalPortRanges(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("localUserAuthorizations", (n) -> { this.setLocalUserAuthorizations(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("packageFamilyName", (n) -> { this.setPackageFamilyName(n.getStringValue()); });
        deserializerMap.put("profileTypes", (n) -> { this.setProfileTypes(n.getEnumSetValue(WindowsFirewallRuleNetworkProfileTypes::forValue)); });
        deserializerMap.put("protocol", (n) -> { this.setProtocol(n.getIntegerValue()); });
        deserializerMap.put("remoteAddressRanges", (n) -> { this.setRemoteAddressRanges(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("remotePortRanges", (n) -> { this.setRemotePortRanges(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("serviceName", (n) -> { this.setServiceName(n.getStringValue()); });
        deserializerMap.put("trafficDirection", (n) -> { this.setTrafficDirection(n.getEnumValue(WindowsFirewallRuleTrafficDirectionType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the filePath property value. The full file path of an app that&apos;s affected by the firewall rule.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFilePath() {
        return this.backingStore.get("filePath");
    }
    /**
     * Gets the interfaceTypes property value. Flags representing firewall rule interface types.
     * @return a {@link EnumSet<WindowsFirewallRuleInterfaceTypes>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<WindowsFirewallRuleInterfaceTypes> getInterfaceTypes() {
        return this.backingStore.get("interfaceTypes");
    }
    /**
     * Gets the localAddressRanges property value. List of local addresses covered by the rule. Default is any address. Valid tokens include:&apos;&apos; indicates any local address. If present, this must be the only token included.A subnet can be specified using either the subnet mask or network prefix notation. If neither a subnet mask nor a network prefix is specified, the subnet mask defaults to 255.255.255.255.A valid IPv6 address.An IPv4 address range in the format of &apos;start address - end address&apos; with no spaces included.An IPv6 address range in the format of &apos;start address - end address&apos; with no spaces included.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getLocalAddressRanges() {
        return this.backingStore.get("localAddressRanges");
    }
    /**
     * Gets the localPortRanges property value. List of local port ranges. For example, &apos;100-120&apos;, &apos;200&apos;, &apos;300-320&apos;. If not specified, the default is All.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getLocalPortRanges() {
        return this.backingStore.get("localPortRanges");
    }
    /**
     * Gets the localUserAuthorizations property value. Specifies the list of authorized local users for the app container. This is a string in Security Descriptor Definition Language (SDDL) format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocalUserAuthorizations() {
        return this.backingStore.get("localUserAuthorizations");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the packageFamilyName property value. The package family name of a Microsoft Store application that&apos;s affected by the firewall rule.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPackageFamilyName() {
        return this.backingStore.get("packageFamilyName");
    }
    /**
     * Gets the profileTypes property value. Flags representing which network profile types apply to a firewall rule.
     * @return a {@link EnumSet<WindowsFirewallRuleNetworkProfileTypes>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<WindowsFirewallRuleNetworkProfileTypes> getProfileTypes() {
        return this.backingStore.get("profileTypes");
    }
    /**
     * Gets the protocol property value. 0-255 number representing the IP protocol (TCP = 6, UDP = 17). If not specified, the default is All. Valid values 0 to 255
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getProtocol() {
        return this.backingStore.get("protocol");
    }
    /**
     * Gets the remoteAddressRanges property value. List of tokens specifying the remote addresses covered by the rule. Tokens are case insensitive. Default is any address. Valid tokens include:&apos;&apos; indicates any remote address. If present, this must be the only token included.&apos;Defaultgateway&apos;&apos;DHCP&apos;&apos;DNS&apos;&apos;WINS&apos;&apos;Intranet&apos; (supported on Windows versions 1809+)&apos;RmtIntranet&apos; (supported on Windows versions 1809+)&apos;Internet&apos; (supported on Windows versions 1809+)&apos;Ply2Renders&apos; (supported on Windows versions 1809+)&apos;LocalSubnet&apos; indicates any local address on the local subnet.A subnet can be specified using either the subnet mask or network prefix notation. If neither a subnet mask nor a network prefix is specified, the subnet mask defaults to 255.255.255.255.A valid IPv6 address.An IPv4 address range in the format of &apos;start address - end address&apos; with no spaces included.An IPv6 address range in the format of &apos;start address - end address&apos; with no spaces included.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRemoteAddressRanges() {
        return this.backingStore.get("remoteAddressRanges");
    }
    /**
     * Gets the remotePortRanges property value. List of remote port ranges. For example, &apos;100-120&apos;, &apos;200&apos;, &apos;300-320&apos;. If not specified, the default is All.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRemotePortRanges() {
        return this.backingStore.get("remotePortRanges");
    }
    /**
     * Gets the serviceName property value. The name used in cases when a service, not an application, is sending or receiving traffic.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServiceName() {
        return this.backingStore.get("serviceName");
    }
    /**
     * Gets the trafficDirection property value. Firewall rule traffic directions.
     * @return a {@link WindowsFirewallRuleTrafficDirectionType}
     */
    @jakarta.annotation.Nullable
    public WindowsFirewallRuleTrafficDirectionType getTrafficDirection() {
        return this.backingStore.get("trafficDirection");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("edgeTraversal", this.getEdgeTraversal());
        writer.writeStringValue("filePath", this.getFilePath());
        writer.writeEnumSetValue("interfaceTypes", this.getInterfaceTypes());
        writer.writeCollectionOfPrimitiveValues("localAddressRanges", this.getLocalAddressRanges());
        writer.writeCollectionOfPrimitiveValues("localPortRanges", this.getLocalPortRanges());
        writer.writeStringValue("localUserAuthorizations", this.getLocalUserAuthorizations());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("packageFamilyName", this.getPackageFamilyName());
        writer.writeEnumSetValue("profileTypes", this.getProfileTypes());
        writer.writeIntegerValue("protocol", this.getProtocol());
        writer.writeCollectionOfPrimitiveValues("remoteAddressRanges", this.getRemoteAddressRanges());
        writer.writeCollectionOfPrimitiveValues("remotePortRanges", this.getRemotePortRanges());
        writer.writeStringValue("serviceName", this.getServiceName());
        writer.writeEnumValue("trafficDirection", this.getTrafficDirection());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. State Management Setting.
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final StateManagementSetting value) {
        this.backingStore.set("action", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the description property value. The description of the rule.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the rule. Does not need to be unique.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the edgeTraversal property value. State Management Setting.
     * @param value Value to set for the edgeTraversal property.
     */
    public void setEdgeTraversal(@jakarta.annotation.Nullable final StateManagementSetting value) {
        this.backingStore.set("edgeTraversal", value);
    }
    /**
     * Sets the filePath property value. The full file path of an app that&apos;s affected by the firewall rule.
     * @param value Value to set for the filePath property.
     */
    public void setFilePath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("filePath", value);
    }
    /**
     * Sets the interfaceTypes property value. Flags representing firewall rule interface types.
     * @param value Value to set for the interfaceTypes property.
     */
    public void setInterfaceTypes(@jakarta.annotation.Nullable final EnumSet<WindowsFirewallRuleInterfaceTypes> value) {
        this.backingStore.set("interfaceTypes", value);
    }
    /**
     * Sets the localAddressRanges property value. List of local addresses covered by the rule. Default is any address. Valid tokens include:&apos;&apos; indicates any local address. If present, this must be the only token included.A subnet can be specified using either the subnet mask or network prefix notation. If neither a subnet mask nor a network prefix is specified, the subnet mask defaults to 255.255.255.255.A valid IPv6 address.An IPv4 address range in the format of &apos;start address - end address&apos; with no spaces included.An IPv6 address range in the format of &apos;start address - end address&apos; with no spaces included.
     * @param value Value to set for the localAddressRanges property.
     */
    public void setLocalAddressRanges(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("localAddressRanges", value);
    }
    /**
     * Sets the localPortRanges property value. List of local port ranges. For example, &apos;100-120&apos;, &apos;200&apos;, &apos;300-320&apos;. If not specified, the default is All.
     * @param value Value to set for the localPortRanges property.
     */
    public void setLocalPortRanges(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("localPortRanges", value);
    }
    /**
     * Sets the localUserAuthorizations property value. Specifies the list of authorized local users for the app container. This is a string in Security Descriptor Definition Language (SDDL) format.
     * @param value Value to set for the localUserAuthorizations property.
     */
    public void setLocalUserAuthorizations(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("localUserAuthorizations", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the packageFamilyName property value. The package family name of a Microsoft Store application that&apos;s affected by the firewall rule.
     * @param value Value to set for the packageFamilyName property.
     */
    public void setPackageFamilyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("packageFamilyName", value);
    }
    /**
     * Sets the profileTypes property value. Flags representing which network profile types apply to a firewall rule.
     * @param value Value to set for the profileTypes property.
     */
    public void setProfileTypes(@jakarta.annotation.Nullable final EnumSet<WindowsFirewallRuleNetworkProfileTypes> value) {
        this.backingStore.set("profileTypes", value);
    }
    /**
     * Sets the protocol property value. 0-255 number representing the IP protocol (TCP = 6, UDP = 17). If not specified, the default is All. Valid values 0 to 255
     * @param value Value to set for the protocol property.
     */
    public void setProtocol(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("protocol", value);
    }
    /**
     * Sets the remoteAddressRanges property value. List of tokens specifying the remote addresses covered by the rule. Tokens are case insensitive. Default is any address. Valid tokens include:&apos;&apos; indicates any remote address. If present, this must be the only token included.&apos;Defaultgateway&apos;&apos;DHCP&apos;&apos;DNS&apos;&apos;WINS&apos;&apos;Intranet&apos; (supported on Windows versions 1809+)&apos;RmtIntranet&apos; (supported on Windows versions 1809+)&apos;Internet&apos; (supported on Windows versions 1809+)&apos;Ply2Renders&apos; (supported on Windows versions 1809+)&apos;LocalSubnet&apos; indicates any local address on the local subnet.A subnet can be specified using either the subnet mask or network prefix notation. If neither a subnet mask nor a network prefix is specified, the subnet mask defaults to 255.255.255.255.A valid IPv6 address.An IPv4 address range in the format of &apos;start address - end address&apos; with no spaces included.An IPv6 address range in the format of &apos;start address - end address&apos; with no spaces included.
     * @param value Value to set for the remoteAddressRanges property.
     */
    public void setRemoteAddressRanges(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("remoteAddressRanges", value);
    }
    /**
     * Sets the remotePortRanges property value. List of remote port ranges. For example, &apos;100-120&apos;, &apos;200&apos;, &apos;300-320&apos;. If not specified, the default is All.
     * @param value Value to set for the remotePortRanges property.
     */
    public void setRemotePortRanges(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("remotePortRanges", value);
    }
    /**
     * Sets the serviceName property value. The name used in cases when a service, not an application, is sending or receiving traffic.
     * @param value Value to set for the serviceName property.
     */
    public void setServiceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serviceName", value);
    }
    /**
     * Sets the trafficDirection property value. Firewall rule traffic directions.
     * @param value Value to set for the trafficDirection property.
     */
    public void setTrafficDirection(@jakarta.annotation.Nullable final WindowsFirewallRuleTrafficDirectionType value) {
        this.backingStore.set("trafficDirection", value);
    }
}
