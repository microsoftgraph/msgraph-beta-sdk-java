package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows Firewall Profile Policies.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsFirewallNetworkProfile implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new WindowsFirewallNetworkProfile and sets the default values.
     */
    public WindowsFirewallNetworkProfile() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsFirewallNetworkProfile
     */
    @jakarta.annotation.Nonnull
    public static WindowsFirewallNetworkProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsFirewallNetworkProfile();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the authorizedApplicationRulesFromGroupPolicyMerged property value. Configures the firewall to merge authorized application rules from group policy with those from local store instead of ignoring the local store rules. When AuthorizedApplicationRulesFromGroupPolicyNotMerged and AuthorizedApplicationRulesFromGroupPolicyMerged are both true, AuthorizedApplicationRulesFromGroupPolicyMerged takes priority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAuthorizedApplicationRulesFromGroupPolicyMerged() {
        return this.backingStore.get("authorizedApplicationRulesFromGroupPolicyMerged");
    }
    /**
     * Gets the authorizedApplicationRulesFromGroupPolicyNotMerged property value. Configures the firewall to prevent merging authorized application rules from group policy with those from local store instead of ignoring the local store rules. When AuthorizedApplicationRulesFromGroupPolicyNotMerged and AuthorizedApplicationRulesFromGroupPolicyMerged are both true, AuthorizedApplicationRulesFromGroupPolicyMerged takes priority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAuthorizedApplicationRulesFromGroupPolicyNotMerged() {
        return this.backingStore.get("authorizedApplicationRulesFromGroupPolicyNotMerged");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the connectionSecurityRulesFromGroupPolicyMerged property value. Configures the firewall to merge connection security rules from group policy with those from local store instead of ignoring the local store rules. When ConnectionSecurityRulesFromGroupPolicyNotMerged and ConnectionSecurityRulesFromGroupPolicyMerged are both true, ConnectionSecurityRulesFromGroupPolicyMerged takes priority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConnectionSecurityRulesFromGroupPolicyMerged() {
        return this.backingStore.get("connectionSecurityRulesFromGroupPolicyMerged");
    }
    /**
     * Gets the connectionSecurityRulesFromGroupPolicyNotMerged property value. Configures the firewall to prevent merging connection security rules from group policy with those from local store instead of ignoring the local store rules. When ConnectionSecurityRulesFromGroupPolicyNotMerged and ConnectionSecurityRulesFromGroupPolicyMerged are both true, ConnectionSecurityRulesFromGroupPolicyMerged takes priority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConnectionSecurityRulesFromGroupPolicyNotMerged() {
        return this.backingStore.get("connectionSecurityRulesFromGroupPolicyNotMerged");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(24);
        deserializerMap.put("authorizedApplicationRulesFromGroupPolicyMerged", (n) -> { this.setAuthorizedApplicationRulesFromGroupPolicyMerged(n.getBooleanValue()); });
        deserializerMap.put("authorizedApplicationRulesFromGroupPolicyNotMerged", (n) -> { this.setAuthorizedApplicationRulesFromGroupPolicyNotMerged(n.getBooleanValue()); });
        deserializerMap.put("connectionSecurityRulesFromGroupPolicyMerged", (n) -> { this.setConnectionSecurityRulesFromGroupPolicyMerged(n.getBooleanValue()); });
        deserializerMap.put("connectionSecurityRulesFromGroupPolicyNotMerged", (n) -> { this.setConnectionSecurityRulesFromGroupPolicyNotMerged(n.getBooleanValue()); });
        deserializerMap.put("firewallEnabled", (n) -> { this.setFirewallEnabled(n.getEnumValue(StateManagementSetting::forValue)); });
        deserializerMap.put("globalPortRulesFromGroupPolicyMerged", (n) -> { this.setGlobalPortRulesFromGroupPolicyMerged(n.getBooleanValue()); });
        deserializerMap.put("globalPortRulesFromGroupPolicyNotMerged", (n) -> { this.setGlobalPortRulesFromGroupPolicyNotMerged(n.getBooleanValue()); });
        deserializerMap.put("inboundConnectionsBlocked", (n) -> { this.setInboundConnectionsBlocked(n.getBooleanValue()); });
        deserializerMap.put("inboundConnectionsRequired", (n) -> { this.setInboundConnectionsRequired(n.getBooleanValue()); });
        deserializerMap.put("inboundNotificationsBlocked", (n) -> { this.setInboundNotificationsBlocked(n.getBooleanValue()); });
        deserializerMap.put("inboundNotificationsRequired", (n) -> { this.setInboundNotificationsRequired(n.getBooleanValue()); });
        deserializerMap.put("incomingTrafficBlocked", (n) -> { this.setIncomingTrafficBlocked(n.getBooleanValue()); });
        deserializerMap.put("incomingTrafficRequired", (n) -> { this.setIncomingTrafficRequired(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("outboundConnectionsBlocked", (n) -> { this.setOutboundConnectionsBlocked(n.getBooleanValue()); });
        deserializerMap.put("outboundConnectionsRequired", (n) -> { this.setOutboundConnectionsRequired(n.getBooleanValue()); });
        deserializerMap.put("policyRulesFromGroupPolicyMerged", (n) -> { this.setPolicyRulesFromGroupPolicyMerged(n.getBooleanValue()); });
        deserializerMap.put("policyRulesFromGroupPolicyNotMerged", (n) -> { this.setPolicyRulesFromGroupPolicyNotMerged(n.getBooleanValue()); });
        deserializerMap.put("securedPacketExemptionAllowed", (n) -> { this.setSecuredPacketExemptionAllowed(n.getBooleanValue()); });
        deserializerMap.put("securedPacketExemptionBlocked", (n) -> { this.setSecuredPacketExemptionBlocked(n.getBooleanValue()); });
        deserializerMap.put("stealthModeBlocked", (n) -> { this.setStealthModeBlocked(n.getBooleanValue()); });
        deserializerMap.put("stealthModeRequired", (n) -> { this.setStealthModeRequired(n.getBooleanValue()); });
        deserializerMap.put("unicastResponsesToMulticastBroadcastsBlocked", (n) -> { this.setUnicastResponsesToMulticastBroadcastsBlocked(n.getBooleanValue()); });
        deserializerMap.put("unicastResponsesToMulticastBroadcastsRequired", (n) -> { this.setUnicastResponsesToMulticastBroadcastsRequired(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firewallEnabled property value. State Management Setting.
     * @return a StateManagementSetting
     */
    @jakarta.annotation.Nullable
    public StateManagementSetting getFirewallEnabled() {
        return this.backingStore.get("firewallEnabled");
    }
    /**
     * Gets the globalPortRulesFromGroupPolicyMerged property value. Configures the firewall to merge global port rules from group policy with those from local store instead of ignoring the local store rules. When GlobalPortRulesFromGroupPolicyNotMerged and GlobalPortRulesFromGroupPolicyMerged are both true, GlobalPortRulesFromGroupPolicyMerged takes priority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getGlobalPortRulesFromGroupPolicyMerged() {
        return this.backingStore.get("globalPortRulesFromGroupPolicyMerged");
    }
    /**
     * Gets the globalPortRulesFromGroupPolicyNotMerged property value. Configures the firewall to prevent merging global port rules from group policy with those from local store instead of ignoring the local store rules. When GlobalPortRulesFromGroupPolicyNotMerged and GlobalPortRulesFromGroupPolicyMerged are both true, GlobalPortRulesFromGroupPolicyMerged takes priority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getGlobalPortRulesFromGroupPolicyNotMerged() {
        return this.backingStore.get("globalPortRulesFromGroupPolicyNotMerged");
    }
    /**
     * Gets the inboundConnectionsBlocked property value. Configures the firewall to block all incoming connections by default. When InboundConnectionsRequired and InboundConnectionsBlocked are both true, InboundConnectionsBlocked takes priority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getInboundConnectionsBlocked() {
        return this.backingStore.get("inboundConnectionsBlocked");
    }
    /**
     * Gets the inboundConnectionsRequired property value. Configures the firewall to allow all incoming connections by default. When InboundConnectionsRequired and InboundConnectionsBlocked are both true, InboundConnectionsBlocked takes priority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getInboundConnectionsRequired() {
        return this.backingStore.get("inboundConnectionsRequired");
    }
    /**
     * Gets the inboundNotificationsBlocked property value. Prevents the firewall from displaying notifications when an application is blocked from listening on a port. When InboundNotificationsRequired and InboundNotificationsBlocked are both true, InboundNotificationsBlocked takes priority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getInboundNotificationsBlocked() {
        return this.backingStore.get("inboundNotificationsBlocked");
    }
    /**
     * Gets the inboundNotificationsRequired property value. Allows the firewall to display notifications when an application is blocked from listening on a port. When InboundNotificationsRequired and InboundNotificationsBlocked are both true, InboundNotificationsBlocked takes priority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getInboundNotificationsRequired() {
        return this.backingStore.get("inboundNotificationsRequired");
    }
    /**
     * Gets the incomingTrafficBlocked property value. Configures the firewall to block all incoming traffic regardless of other policy settings. When IncomingTrafficRequired and IncomingTrafficBlocked are both true, IncomingTrafficBlocked takes priority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIncomingTrafficBlocked() {
        return this.backingStore.get("incomingTrafficBlocked");
    }
    /**
     * Gets the incomingTrafficRequired property value. Configures the firewall to allow incoming traffic pursuant to other policy settings. When IncomingTrafficRequired and IncomingTrafficBlocked are both true, IncomingTrafficBlocked takes priority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIncomingTrafficRequired() {
        return this.backingStore.get("incomingTrafficRequired");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the outboundConnectionsBlocked property value. Configures the firewall to block all outgoing connections by default. When OutboundConnectionsRequired and OutboundConnectionsBlocked are both true, OutboundConnectionsBlocked takes priority. This setting will get applied to Windows releases version 1809 and above.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOutboundConnectionsBlocked() {
        return this.backingStore.get("outboundConnectionsBlocked");
    }
    /**
     * Gets the outboundConnectionsRequired property value. Configures the firewall to allow all outgoing connections by default. When OutboundConnectionsRequired and OutboundConnectionsBlocked are both true, OutboundConnectionsBlocked takes priority. This setting will get applied to Windows releases version 1809 and above.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOutboundConnectionsRequired() {
        return this.backingStore.get("outboundConnectionsRequired");
    }
    /**
     * Gets the policyRulesFromGroupPolicyMerged property value. Configures the firewall to merge Firewall Rule policies from group policy with those from local store instead of ignoring the local store rules. When PolicyRulesFromGroupPolicyNotMerged and PolicyRulesFromGroupPolicyMerged are both true, PolicyRulesFromGroupPolicyMerged takes priority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPolicyRulesFromGroupPolicyMerged() {
        return this.backingStore.get("policyRulesFromGroupPolicyMerged");
    }
    /**
     * Gets the policyRulesFromGroupPolicyNotMerged property value. Configures the firewall to prevent merging Firewall Rule policies from group policy with those from local store instead of ignoring the local store rules. When PolicyRulesFromGroupPolicyNotMerged and PolicyRulesFromGroupPolicyMerged are both true, PolicyRulesFromGroupPolicyMerged takes priority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPolicyRulesFromGroupPolicyNotMerged() {
        return this.backingStore.get("policyRulesFromGroupPolicyNotMerged");
    }
    /**
     * Gets the securedPacketExemptionAllowed property value. Configures the firewall to allow the host computer to respond to unsolicited network traffic of that traffic is secured by IPSec even when stealthModeBlocked is set to true. When SecuredPacketExemptionBlocked and SecuredPacketExemptionAllowed are both true, SecuredPacketExemptionAllowed takes priority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSecuredPacketExemptionAllowed() {
        return this.backingStore.get("securedPacketExemptionAllowed");
    }
    /**
     * Gets the securedPacketExemptionBlocked property value. Configures the firewall to block the host computer to respond to unsolicited network traffic of that traffic is secured by IPSec even when stealthModeBlocked is set to true. When SecuredPacketExemptionBlocked and SecuredPacketExemptionAllowed are both true, SecuredPacketExemptionAllowed takes priority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSecuredPacketExemptionBlocked() {
        return this.backingStore.get("securedPacketExemptionBlocked");
    }
    /**
     * Gets the stealthModeBlocked property value. Prevent the server from operating in stealth mode. When StealthModeRequired and StealthModeBlocked are both true, StealthModeBlocked takes priority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStealthModeBlocked() {
        return this.backingStore.get("stealthModeBlocked");
    }
    /**
     * Gets the stealthModeRequired property value. Allow the server to operate in stealth mode. When StealthModeRequired and StealthModeBlocked are both true, StealthModeBlocked takes priority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStealthModeRequired() {
        return this.backingStore.get("stealthModeRequired");
    }
    /**
     * Gets the unicastResponsesToMulticastBroadcastsBlocked property value. Configures the firewall to block unicast responses to multicast broadcast traffic. When UnicastResponsesToMulticastBroadcastsRequired and UnicastResponsesToMulticastBroadcastsBlocked are both true, UnicastResponsesToMulticastBroadcastsBlocked takes priority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUnicastResponsesToMulticastBroadcastsBlocked() {
        return this.backingStore.get("unicastResponsesToMulticastBroadcastsBlocked");
    }
    /**
     * Gets the unicastResponsesToMulticastBroadcastsRequired property value. Configures the firewall to allow unicast responses to multicast broadcast traffic. When UnicastResponsesToMulticastBroadcastsRequired and UnicastResponsesToMulticastBroadcastsBlocked are both true, UnicastResponsesToMulticastBroadcastsBlocked takes priority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUnicastResponsesToMulticastBroadcastsRequired() {
        return this.backingStore.get("unicastResponsesToMulticastBroadcastsRequired");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("authorizedApplicationRulesFromGroupPolicyMerged", this.getAuthorizedApplicationRulesFromGroupPolicyMerged());
        writer.writeBooleanValue("authorizedApplicationRulesFromGroupPolicyNotMerged", this.getAuthorizedApplicationRulesFromGroupPolicyNotMerged());
        writer.writeBooleanValue("connectionSecurityRulesFromGroupPolicyMerged", this.getConnectionSecurityRulesFromGroupPolicyMerged());
        writer.writeBooleanValue("connectionSecurityRulesFromGroupPolicyNotMerged", this.getConnectionSecurityRulesFromGroupPolicyNotMerged());
        writer.writeEnumValue("firewallEnabled", this.getFirewallEnabled());
        writer.writeBooleanValue("globalPortRulesFromGroupPolicyMerged", this.getGlobalPortRulesFromGroupPolicyMerged());
        writer.writeBooleanValue("globalPortRulesFromGroupPolicyNotMerged", this.getGlobalPortRulesFromGroupPolicyNotMerged());
        writer.writeBooleanValue("inboundConnectionsBlocked", this.getInboundConnectionsBlocked());
        writer.writeBooleanValue("inboundConnectionsRequired", this.getInboundConnectionsRequired());
        writer.writeBooleanValue("inboundNotificationsBlocked", this.getInboundNotificationsBlocked());
        writer.writeBooleanValue("inboundNotificationsRequired", this.getInboundNotificationsRequired());
        writer.writeBooleanValue("incomingTrafficBlocked", this.getIncomingTrafficBlocked());
        writer.writeBooleanValue("incomingTrafficRequired", this.getIncomingTrafficRequired());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("outboundConnectionsBlocked", this.getOutboundConnectionsBlocked());
        writer.writeBooleanValue("outboundConnectionsRequired", this.getOutboundConnectionsRequired());
        writer.writeBooleanValue("policyRulesFromGroupPolicyMerged", this.getPolicyRulesFromGroupPolicyMerged());
        writer.writeBooleanValue("policyRulesFromGroupPolicyNotMerged", this.getPolicyRulesFromGroupPolicyNotMerged());
        writer.writeBooleanValue("securedPacketExemptionAllowed", this.getSecuredPacketExemptionAllowed());
        writer.writeBooleanValue("securedPacketExemptionBlocked", this.getSecuredPacketExemptionBlocked());
        writer.writeBooleanValue("stealthModeBlocked", this.getStealthModeBlocked());
        writer.writeBooleanValue("stealthModeRequired", this.getStealthModeRequired());
        writer.writeBooleanValue("unicastResponsesToMulticastBroadcastsBlocked", this.getUnicastResponsesToMulticastBroadcastsBlocked());
        writer.writeBooleanValue("unicastResponsesToMulticastBroadcastsRequired", this.getUnicastResponsesToMulticastBroadcastsRequired());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the authorizedApplicationRulesFromGroupPolicyMerged property value. Configures the firewall to merge authorized application rules from group policy with those from local store instead of ignoring the local store rules. When AuthorizedApplicationRulesFromGroupPolicyNotMerged and AuthorizedApplicationRulesFromGroupPolicyMerged are both true, AuthorizedApplicationRulesFromGroupPolicyMerged takes priority.
     * @param value Value to set for the authorizedApplicationRulesFromGroupPolicyMerged property.
     */
    public void setAuthorizedApplicationRulesFromGroupPolicyMerged(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("authorizedApplicationRulesFromGroupPolicyMerged", value);
    }
    /**
     * Sets the authorizedApplicationRulesFromGroupPolicyNotMerged property value. Configures the firewall to prevent merging authorized application rules from group policy with those from local store instead of ignoring the local store rules. When AuthorizedApplicationRulesFromGroupPolicyNotMerged and AuthorizedApplicationRulesFromGroupPolicyMerged are both true, AuthorizedApplicationRulesFromGroupPolicyMerged takes priority.
     * @param value Value to set for the authorizedApplicationRulesFromGroupPolicyNotMerged property.
     */
    public void setAuthorizedApplicationRulesFromGroupPolicyNotMerged(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("authorizedApplicationRulesFromGroupPolicyNotMerged", value);
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
     * Sets the connectionSecurityRulesFromGroupPolicyMerged property value. Configures the firewall to merge connection security rules from group policy with those from local store instead of ignoring the local store rules. When ConnectionSecurityRulesFromGroupPolicyNotMerged and ConnectionSecurityRulesFromGroupPolicyMerged are both true, ConnectionSecurityRulesFromGroupPolicyMerged takes priority.
     * @param value Value to set for the connectionSecurityRulesFromGroupPolicyMerged property.
     */
    public void setConnectionSecurityRulesFromGroupPolicyMerged(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("connectionSecurityRulesFromGroupPolicyMerged", value);
    }
    /**
     * Sets the connectionSecurityRulesFromGroupPolicyNotMerged property value. Configures the firewall to prevent merging connection security rules from group policy with those from local store instead of ignoring the local store rules. When ConnectionSecurityRulesFromGroupPolicyNotMerged and ConnectionSecurityRulesFromGroupPolicyMerged are both true, ConnectionSecurityRulesFromGroupPolicyMerged takes priority.
     * @param value Value to set for the connectionSecurityRulesFromGroupPolicyNotMerged property.
     */
    public void setConnectionSecurityRulesFromGroupPolicyNotMerged(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("connectionSecurityRulesFromGroupPolicyNotMerged", value);
    }
    /**
     * Sets the firewallEnabled property value. State Management Setting.
     * @param value Value to set for the firewallEnabled property.
     */
    public void setFirewallEnabled(@jakarta.annotation.Nullable final StateManagementSetting value) {
        this.backingStore.set("firewallEnabled", value);
    }
    /**
     * Sets the globalPortRulesFromGroupPolicyMerged property value. Configures the firewall to merge global port rules from group policy with those from local store instead of ignoring the local store rules. When GlobalPortRulesFromGroupPolicyNotMerged and GlobalPortRulesFromGroupPolicyMerged are both true, GlobalPortRulesFromGroupPolicyMerged takes priority.
     * @param value Value to set for the globalPortRulesFromGroupPolicyMerged property.
     */
    public void setGlobalPortRulesFromGroupPolicyMerged(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("globalPortRulesFromGroupPolicyMerged", value);
    }
    /**
     * Sets the globalPortRulesFromGroupPolicyNotMerged property value. Configures the firewall to prevent merging global port rules from group policy with those from local store instead of ignoring the local store rules. When GlobalPortRulesFromGroupPolicyNotMerged and GlobalPortRulesFromGroupPolicyMerged are both true, GlobalPortRulesFromGroupPolicyMerged takes priority.
     * @param value Value to set for the globalPortRulesFromGroupPolicyNotMerged property.
     */
    public void setGlobalPortRulesFromGroupPolicyNotMerged(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("globalPortRulesFromGroupPolicyNotMerged", value);
    }
    /**
     * Sets the inboundConnectionsBlocked property value. Configures the firewall to block all incoming connections by default. When InboundConnectionsRequired and InboundConnectionsBlocked are both true, InboundConnectionsBlocked takes priority.
     * @param value Value to set for the inboundConnectionsBlocked property.
     */
    public void setInboundConnectionsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("inboundConnectionsBlocked", value);
    }
    /**
     * Sets the inboundConnectionsRequired property value. Configures the firewall to allow all incoming connections by default. When InboundConnectionsRequired and InboundConnectionsBlocked are both true, InboundConnectionsBlocked takes priority.
     * @param value Value to set for the inboundConnectionsRequired property.
     */
    public void setInboundConnectionsRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("inboundConnectionsRequired", value);
    }
    /**
     * Sets the inboundNotificationsBlocked property value. Prevents the firewall from displaying notifications when an application is blocked from listening on a port. When InboundNotificationsRequired and InboundNotificationsBlocked are both true, InboundNotificationsBlocked takes priority.
     * @param value Value to set for the inboundNotificationsBlocked property.
     */
    public void setInboundNotificationsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("inboundNotificationsBlocked", value);
    }
    /**
     * Sets the inboundNotificationsRequired property value. Allows the firewall to display notifications when an application is blocked from listening on a port. When InboundNotificationsRequired and InboundNotificationsBlocked are both true, InboundNotificationsBlocked takes priority.
     * @param value Value to set for the inboundNotificationsRequired property.
     */
    public void setInboundNotificationsRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("inboundNotificationsRequired", value);
    }
    /**
     * Sets the incomingTrafficBlocked property value. Configures the firewall to block all incoming traffic regardless of other policy settings. When IncomingTrafficRequired and IncomingTrafficBlocked are both true, IncomingTrafficBlocked takes priority.
     * @param value Value to set for the incomingTrafficBlocked property.
     */
    public void setIncomingTrafficBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("incomingTrafficBlocked", value);
    }
    /**
     * Sets the incomingTrafficRequired property value. Configures the firewall to allow incoming traffic pursuant to other policy settings. When IncomingTrafficRequired and IncomingTrafficBlocked are both true, IncomingTrafficBlocked takes priority.
     * @param value Value to set for the incomingTrafficRequired property.
     */
    public void setIncomingTrafficRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("incomingTrafficRequired", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the outboundConnectionsBlocked property value. Configures the firewall to block all outgoing connections by default. When OutboundConnectionsRequired and OutboundConnectionsBlocked are both true, OutboundConnectionsBlocked takes priority. This setting will get applied to Windows releases version 1809 and above.
     * @param value Value to set for the outboundConnectionsBlocked property.
     */
    public void setOutboundConnectionsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("outboundConnectionsBlocked", value);
    }
    /**
     * Sets the outboundConnectionsRequired property value. Configures the firewall to allow all outgoing connections by default. When OutboundConnectionsRequired and OutboundConnectionsBlocked are both true, OutboundConnectionsBlocked takes priority. This setting will get applied to Windows releases version 1809 and above.
     * @param value Value to set for the outboundConnectionsRequired property.
     */
    public void setOutboundConnectionsRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("outboundConnectionsRequired", value);
    }
    /**
     * Sets the policyRulesFromGroupPolicyMerged property value. Configures the firewall to merge Firewall Rule policies from group policy with those from local store instead of ignoring the local store rules. When PolicyRulesFromGroupPolicyNotMerged and PolicyRulesFromGroupPolicyMerged are both true, PolicyRulesFromGroupPolicyMerged takes priority.
     * @param value Value to set for the policyRulesFromGroupPolicyMerged property.
     */
    public void setPolicyRulesFromGroupPolicyMerged(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("policyRulesFromGroupPolicyMerged", value);
    }
    /**
     * Sets the policyRulesFromGroupPolicyNotMerged property value. Configures the firewall to prevent merging Firewall Rule policies from group policy with those from local store instead of ignoring the local store rules. When PolicyRulesFromGroupPolicyNotMerged and PolicyRulesFromGroupPolicyMerged are both true, PolicyRulesFromGroupPolicyMerged takes priority.
     * @param value Value to set for the policyRulesFromGroupPolicyNotMerged property.
     */
    public void setPolicyRulesFromGroupPolicyNotMerged(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("policyRulesFromGroupPolicyNotMerged", value);
    }
    /**
     * Sets the securedPacketExemptionAllowed property value. Configures the firewall to allow the host computer to respond to unsolicited network traffic of that traffic is secured by IPSec even when stealthModeBlocked is set to true. When SecuredPacketExemptionBlocked and SecuredPacketExemptionAllowed are both true, SecuredPacketExemptionAllowed takes priority.
     * @param value Value to set for the securedPacketExemptionAllowed property.
     */
    public void setSecuredPacketExemptionAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securedPacketExemptionAllowed", value);
    }
    /**
     * Sets the securedPacketExemptionBlocked property value. Configures the firewall to block the host computer to respond to unsolicited network traffic of that traffic is secured by IPSec even when stealthModeBlocked is set to true. When SecuredPacketExemptionBlocked and SecuredPacketExemptionAllowed are both true, SecuredPacketExemptionAllowed takes priority.
     * @param value Value to set for the securedPacketExemptionBlocked property.
     */
    public void setSecuredPacketExemptionBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securedPacketExemptionBlocked", value);
    }
    /**
     * Sets the stealthModeBlocked property value. Prevent the server from operating in stealth mode. When StealthModeRequired and StealthModeBlocked are both true, StealthModeBlocked takes priority.
     * @param value Value to set for the stealthModeBlocked property.
     */
    public void setStealthModeBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("stealthModeBlocked", value);
    }
    /**
     * Sets the stealthModeRequired property value. Allow the server to operate in stealth mode. When StealthModeRequired and StealthModeBlocked are both true, StealthModeBlocked takes priority.
     * @param value Value to set for the stealthModeRequired property.
     */
    public void setStealthModeRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("stealthModeRequired", value);
    }
    /**
     * Sets the unicastResponsesToMulticastBroadcastsBlocked property value. Configures the firewall to block unicast responses to multicast broadcast traffic. When UnicastResponsesToMulticastBroadcastsRequired and UnicastResponsesToMulticastBroadcastsBlocked are both true, UnicastResponsesToMulticastBroadcastsBlocked takes priority.
     * @param value Value to set for the unicastResponsesToMulticastBroadcastsBlocked property.
     */
    public void setUnicastResponsesToMulticastBroadcastsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("unicastResponsesToMulticastBroadcastsBlocked", value);
    }
    /**
     * Sets the unicastResponsesToMulticastBroadcastsRequired property value. Configures the firewall to allow unicast responses to multicast broadcast traffic. When UnicastResponsesToMulticastBroadcastsRequired and UnicastResponsesToMulticastBroadcastsBlocked are both true, UnicastResponsesToMulticastBroadcastsBlocked takes priority.
     * @param value Value to set for the unicastResponsesToMulticastBroadcastsRequired property.
     */
    public void setUnicastResponsesToMulticastBroadcastsRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("unicastResponsesToMulticastBroadcastsRequired", value);
    }
}
