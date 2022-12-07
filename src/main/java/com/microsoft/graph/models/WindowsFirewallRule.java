package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** A rule controlling traffic through the Windows Firewall. */
public class WindowsFirewallRule implements AdditionalDataHolder, Parsable {
    /** State Management Setting. */
    private StateManagementSetting _action;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The description of the rule. */
    private String _description;
    /** The display name of the rule. Does not need to be unique. */
    private String _displayName;
    /** State Management Setting. */
    private StateManagementSetting _edgeTraversal;
    /** The full file path of an app that's affected by the firewall rule. */
    private String _filePath;
    /** Flags representing firewall rule interface types. */
    private WindowsFirewallRuleInterfaceTypes _interfaceTypes;
    /** List of local addresses covered by the rule. Default is any address. Valid tokens include:'' indicates any local address. If present, this must be the only token included.A subnet can be specified using either the subnet mask or network prefix notation. If neither a subnet mask nor a network prefix is specified, the subnet mask defaults to 255.255.255.255.A valid IPv6 address.An IPv4 address range in the format of 'start address - end address' with no spaces included.An IPv6 address range in the format of 'start address - end address' with no spaces included. */
    private java.util.List<String> _localAddressRanges;
    /** List of local port ranges. For example, '100-120', '200', '300-320'. If not specified, the default is All. */
    private java.util.List<String> _localPortRanges;
    /** Specifies the list of authorized local users for the app container. This is a string in Security Descriptor Definition Language (SDDL) format. */
    private String _localUserAuthorizations;
    /** The OdataType property */
    private String _odataType;
    /** The package family name of a Microsoft Store application that's affected by the firewall rule. */
    private String _packageFamilyName;
    /** Flags representing which network profile types apply to a firewall rule. */
    private WindowsFirewallRuleNetworkProfileTypes _profileTypes;
    /** 0-255 number representing the IP protocol (TCP = 6, UDP = 17). If not specified, the default is All. Valid values 0 to 255 */
    private Integer _protocol;
    /** List of tokens specifying the remote addresses covered by the rule. Tokens are case insensitive. Default is any address. Valid tokens include:'' indicates any remote address. If present, this must be the only token included.'Defaultgateway''DHCP''DNS''WINS''Intranet' (supported on Windows versions 1809+)'RmtIntranet' (supported on Windows versions 1809+)'Internet' (supported on Windows versions 1809+)'Ply2Renders' (supported on Windows versions 1809+)'LocalSubnet' indicates any local address on the local subnet.A subnet can be specified using either the subnet mask or network prefix notation. If neither a subnet mask nor a network prefix is specified, the subnet mask defaults to 255.255.255.255.A valid IPv6 address.An IPv4 address range in the format of 'start address - end address' with no spaces included.An IPv6 address range in the format of 'start address - end address' with no spaces included. */
    private java.util.List<String> _remoteAddressRanges;
    /** List of remote port ranges. For example, '100-120', '200', '300-320'. If not specified, the default is All. */
    private java.util.List<String> _remotePortRanges;
    /** The name used in cases when a service, not an application, is sending or receiving traffic. */
    private String _serviceName;
    /** Firewall rule traffic directions. */
    private WindowsFirewallRuleTrafficDirectionType _trafficDirection;
    /**
     * Instantiates a new windowsFirewallRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsFirewallRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsFirewallRule
     */
    @javax.annotation.Nonnull
    public static WindowsFirewallRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsFirewallRule();
    }
    /**
     * Gets the action property value. State Management Setting.
     * @return a stateManagementSetting
     */
    @javax.annotation.Nullable
    public StateManagementSetting getAction() {
        return this._action;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the description property value. The description of the rule.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name of the rule. Does not need to be unique.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the edgeTraversal property value. State Management Setting.
     * @return a stateManagementSetting
     */
    @javax.annotation.Nullable
    public StateManagementSetting getEdgeTraversal() {
        return this._edgeTraversal;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(17);
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(StateManagementSetting.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("edgeTraversal", (n) -> { this.setEdgeTraversal(n.getEnumValue(StateManagementSetting.class)); });
        deserializerMap.put("filePath", (n) -> { this.setFilePath(n.getStringValue()); });
        deserializerMap.put("interfaceTypes", (n) -> { this.setInterfaceTypes(n.getEnumValue(WindowsFirewallRuleInterfaceTypes.class)); });
        deserializerMap.put("localAddressRanges", (n) -> { this.setLocalAddressRanges(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("localPortRanges", (n) -> { this.setLocalPortRanges(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("localUserAuthorizations", (n) -> { this.setLocalUserAuthorizations(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("packageFamilyName", (n) -> { this.setPackageFamilyName(n.getStringValue()); });
        deserializerMap.put("profileTypes", (n) -> { this.setProfileTypes(n.getEnumValue(WindowsFirewallRuleNetworkProfileTypes.class)); });
        deserializerMap.put("protocol", (n) -> { this.setProtocol(n.getIntegerValue()); });
        deserializerMap.put("remoteAddressRanges", (n) -> { this.setRemoteAddressRanges(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("remotePortRanges", (n) -> { this.setRemotePortRanges(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("serviceName", (n) -> { this.setServiceName(n.getStringValue()); });
        deserializerMap.put("trafficDirection", (n) -> { this.setTrafficDirection(n.getEnumValue(WindowsFirewallRuleTrafficDirectionType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the filePath property value. The full file path of an app that's affected by the firewall rule.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFilePath() {
        return this._filePath;
    }
    /**
     * Gets the interfaceTypes property value. Flags representing firewall rule interface types.
     * @return a windowsFirewallRuleInterfaceTypes
     */
    @javax.annotation.Nullable
    public WindowsFirewallRuleInterfaceTypes getInterfaceTypes() {
        return this._interfaceTypes;
    }
    /**
     * Gets the localAddressRanges property value. List of local addresses covered by the rule. Default is any address. Valid tokens include:'' indicates any local address. If present, this must be the only token included.A subnet can be specified using either the subnet mask or network prefix notation. If neither a subnet mask nor a network prefix is specified, the subnet mask defaults to 255.255.255.255.A valid IPv6 address.An IPv4 address range in the format of 'start address - end address' with no spaces included.An IPv6 address range in the format of 'start address - end address' with no spaces included.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getLocalAddressRanges() {
        return this._localAddressRanges;
    }
    /**
     * Gets the localPortRanges property value. List of local port ranges. For example, '100-120', '200', '300-320'. If not specified, the default is All.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getLocalPortRanges() {
        return this._localPortRanges;
    }
    /**
     * Gets the localUserAuthorizations property value. Specifies the list of authorized local users for the app container. This is a string in Security Descriptor Definition Language (SDDL) format.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocalUserAuthorizations() {
        return this._localUserAuthorizations;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the packageFamilyName property value. The package family name of a Microsoft Store application that's affected by the firewall rule.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPackageFamilyName() {
        return this._packageFamilyName;
    }
    /**
     * Gets the profileTypes property value. Flags representing which network profile types apply to a firewall rule.
     * @return a windowsFirewallRuleNetworkProfileTypes
     */
    @javax.annotation.Nullable
    public WindowsFirewallRuleNetworkProfileTypes getProfileTypes() {
        return this._profileTypes;
    }
    /**
     * Gets the protocol property value. 0-255 number representing the IP protocol (TCP = 6, UDP = 17). If not specified, the default is All. Valid values 0 to 255
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getProtocol() {
        return this._protocol;
    }
    /**
     * Gets the remoteAddressRanges property value. List of tokens specifying the remote addresses covered by the rule. Tokens are case insensitive. Default is any address. Valid tokens include:'' indicates any remote address. If present, this must be the only token included.'Defaultgateway''DHCP''DNS''WINS''Intranet' (supported on Windows versions 1809+)'RmtIntranet' (supported on Windows versions 1809+)'Internet' (supported on Windows versions 1809+)'Ply2Renders' (supported on Windows versions 1809+)'LocalSubnet' indicates any local address on the local subnet.A subnet can be specified using either the subnet mask or network prefix notation. If neither a subnet mask nor a network prefix is specified, the subnet mask defaults to 255.255.255.255.A valid IPv6 address.An IPv4 address range in the format of 'start address - end address' with no spaces included.An IPv6 address range in the format of 'start address - end address' with no spaces included.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRemoteAddressRanges() {
        return this._remoteAddressRanges;
    }
    /**
     * Gets the remotePortRanges property value. List of remote port ranges. For example, '100-120', '200', '300-320'. If not specified, the default is All.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRemotePortRanges() {
        return this._remotePortRanges;
    }
    /**
     * Gets the serviceName property value. The name used in cases when a service, not an application, is sending or receiving traffic.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceName() {
        return this._serviceName;
    }
    /**
     * Gets the trafficDirection property value. Firewall rule traffic directions.
     * @return a windowsFirewallRuleTrafficDirectionType
     */
    @javax.annotation.Nullable
    public WindowsFirewallRuleTrafficDirectionType getTrafficDirection() {
        return this._trafficDirection;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("edgeTraversal", this.getEdgeTraversal());
        writer.writeStringValue("filePath", this.getFilePath());
        writer.writeEnumValue("interfaceTypes", this.getInterfaceTypes());
        writer.writeCollectionOfPrimitiveValues("localAddressRanges", this.getLocalAddressRanges());
        writer.writeCollectionOfPrimitiveValues("localPortRanges", this.getLocalPortRanges());
        writer.writeStringValue("localUserAuthorizations", this.getLocalUserAuthorizations());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("packageFamilyName", this.getPackageFamilyName());
        writer.writeEnumValue("profileTypes", this.getProfileTypes());
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAction(@javax.annotation.Nullable final StateManagementSetting value) {
        this._action = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the description property value. The description of the rule.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name of the rule. Does not need to be unique.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the edgeTraversal property value. State Management Setting.
     * @param value Value to set for the edgeTraversal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeTraversal(@javax.annotation.Nullable final StateManagementSetting value) {
        this._edgeTraversal = value;
    }
    /**
     * Sets the filePath property value. The full file path of an app that's affected by the firewall rule.
     * @param value Value to set for the filePath property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFilePath(@javax.annotation.Nullable final String value) {
        this._filePath = value;
    }
    /**
     * Sets the interfaceTypes property value. Flags representing firewall rule interface types.
     * @param value Value to set for the interfaceTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInterfaceTypes(@javax.annotation.Nullable final WindowsFirewallRuleInterfaceTypes value) {
        this._interfaceTypes = value;
    }
    /**
     * Sets the localAddressRanges property value. List of local addresses covered by the rule. Default is any address. Valid tokens include:'' indicates any local address. If present, this must be the only token included.A subnet can be specified using either the subnet mask or network prefix notation. If neither a subnet mask nor a network prefix is specified, the subnet mask defaults to 255.255.255.255.A valid IPv6 address.An IPv4 address range in the format of 'start address - end address' with no spaces included.An IPv6 address range in the format of 'start address - end address' with no spaces included.
     * @param value Value to set for the localAddressRanges property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalAddressRanges(@javax.annotation.Nullable final java.util.List<String> value) {
        this._localAddressRanges = value;
    }
    /**
     * Sets the localPortRanges property value. List of local port ranges. For example, '100-120', '200', '300-320'. If not specified, the default is All.
     * @param value Value to set for the localPortRanges property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalPortRanges(@javax.annotation.Nullable final java.util.List<String> value) {
        this._localPortRanges = value;
    }
    /**
     * Sets the localUserAuthorizations property value. Specifies the list of authorized local users for the app container. This is a string in Security Descriptor Definition Language (SDDL) format.
     * @param value Value to set for the localUserAuthorizations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalUserAuthorizations(@javax.annotation.Nullable final String value) {
        this._localUserAuthorizations = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the packageFamilyName property value. The package family name of a Microsoft Store application that's affected by the firewall rule.
     * @param value Value to set for the packageFamilyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPackageFamilyName(@javax.annotation.Nullable final String value) {
        this._packageFamilyName = value;
    }
    /**
     * Sets the profileTypes property value. Flags representing which network profile types apply to a firewall rule.
     * @param value Value to set for the profileTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProfileTypes(@javax.annotation.Nullable final WindowsFirewallRuleNetworkProfileTypes value) {
        this._profileTypes = value;
    }
    /**
     * Sets the protocol property value. 0-255 number representing the IP protocol (TCP = 6, UDP = 17). If not specified, the default is All. Valid values 0 to 255
     * @param value Value to set for the protocol property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProtocol(@javax.annotation.Nullable final Integer value) {
        this._protocol = value;
    }
    /**
     * Sets the remoteAddressRanges property value. List of tokens specifying the remote addresses covered by the rule. Tokens are case insensitive. Default is any address. Valid tokens include:'' indicates any remote address. If present, this must be the only token included.'Defaultgateway''DHCP''DNS''WINS''Intranet' (supported on Windows versions 1809+)'RmtIntranet' (supported on Windows versions 1809+)'Internet' (supported on Windows versions 1809+)'Ply2Renders' (supported on Windows versions 1809+)'LocalSubnet' indicates any local address on the local subnet.A subnet can be specified using either the subnet mask or network prefix notation. If neither a subnet mask nor a network prefix is specified, the subnet mask defaults to 255.255.255.255.A valid IPv6 address.An IPv4 address range in the format of 'start address - end address' with no spaces included.An IPv6 address range in the format of 'start address - end address' with no spaces included.
     * @param value Value to set for the remoteAddressRanges property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoteAddressRanges(@javax.annotation.Nullable final java.util.List<String> value) {
        this._remoteAddressRanges = value;
    }
    /**
     * Sets the remotePortRanges property value. List of remote port ranges. For example, '100-120', '200', '300-320'. If not specified, the default is All.
     * @param value Value to set for the remotePortRanges property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemotePortRanges(@javax.annotation.Nullable final java.util.List<String> value) {
        this._remotePortRanges = value;
    }
    /**
     * Sets the serviceName property value. The name used in cases when a service, not an application, is sending or receiving traffic.
     * @param value Value to set for the serviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceName(@javax.annotation.Nullable final String value) {
        this._serviceName = value;
    }
    /**
     * Sets the trafficDirection property value. Firewall rule traffic directions.
     * @param value Value to set for the trafficDirection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrafficDirection(@javax.annotation.Nullable final WindowsFirewallRuleTrafficDirectionType value) {
        this._trafficDirection = value;
    }
}
