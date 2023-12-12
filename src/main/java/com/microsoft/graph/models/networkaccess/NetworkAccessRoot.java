package com.microsoft.graph.models.networkaccess;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NetworkAccessRoot extends Entity implements Parsable {
    /**
     * Instantiates a new NetworkAccessRoot and sets the default values.
     */
    public NetworkAccessRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a NetworkAccessRoot
     */
    @jakarta.annotation.Nonnull
    public static NetworkAccessRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NetworkAccessRoot();
    }
    /**
     * Gets the connectivity property value. Connectivity represents all the connectivity components in Global Secure Access.
     * @return a Connectivity
     */
    @jakarta.annotation.Nullable
    public Connectivity getConnectivity() {
        return this.backingStore.get("connectivity");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectivity", (n) -> { this.setConnectivity(n.getObjectValue(Connectivity::createFromDiscriminatorValue)); });
        deserializerMap.put("filteringPolicies", (n) -> { this.setFilteringPolicies(n.getCollectionOfObjectValues(FilteringPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("filteringProfiles", (n) -> { this.setFilteringProfiles(n.getCollectionOfObjectValues(FilteringProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("forwardingPolicies", (n) -> { this.setForwardingPolicies(n.getCollectionOfObjectValues(ForwardingPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("forwardingProfiles", (n) -> { this.setForwardingProfiles(n.getCollectionOfObjectValues(ForwardingProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("logs", (n) -> { this.setLogs(n.getObjectValue(Logs::createFromDiscriminatorValue)); });
        deserializerMap.put("reports", (n) -> { this.setReports(n.getObjectValue(Reports::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(Settings::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantStatus", (n) -> { this.setTenantStatus(n.getObjectValue(TenantStatus::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the filteringPolicies property value. A filtering policy defines the specific traffic that is allowed or blocked through the Global Secure Access services for a filtering profile.
     * @return a java.util.List<FilteringPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<FilteringPolicy> getFilteringPolicies() {
        return this.backingStore.get("filteringPolicies");
    }
    /**
     * Gets the filteringProfiles property value. A filtering profile associates network access policies with Microsoft Entra ID Conditional Access policies, so that access policies can be applied to users and groups.
     * @return a java.util.List<FilteringProfile>
     */
    @jakarta.annotation.Nullable
    public java.util.List<FilteringProfile> getFilteringProfiles() {
        return this.backingStore.get("filteringProfiles");
    }
    /**
     * Gets the forwardingPolicies property value. A forwarding policy defines the specific traffic that is routed through the Global Secure Access Service. It's then added to a forwarding profile.
     * @return a java.util.List<ForwardingPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ForwardingPolicy> getForwardingPolicies() {
        return this.backingStore.get("forwardingPolicies");
    }
    /**
     * Gets the forwardingProfiles property value. A forwarding profile determines which types of traffic are routed through the Global Secure Access services and which ones are skipped. The handling of specific traffic is determined by the forwarding policies that are added to the forwarding profile.
     * @return a java.util.List<ForwardingProfile>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ForwardingProfile> getForwardingProfiles() {
        return this.backingStore.get("forwardingProfiles");
    }
    /**
     * Gets the logs property value. Represents network connections that are routed through Global Secure Access.
     * @return a Logs
     */
    @jakarta.annotation.Nullable
    public Logs getLogs() {
        return this.backingStore.get("logs");
    }
    /**
     * Gets the reports property value. Represents the status of the Global Secure Access services for the tenant.
     * @return a Reports
     */
    @jakarta.annotation.Nullable
    public Reports getReports() {
        return this.backingStore.get("reports");
    }
    /**
     * Gets the settings property value. Global Secure Access settings.
     * @return a Settings
     */
    @jakarta.annotation.Nullable
    public Settings getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Gets the tenantStatus property value. Represents the status of the Global Secure Access services for the tenant.
     * @return a TenantStatus
     */
    @jakarta.annotation.Nullable
    public TenantStatus getTenantStatus() {
        return this.backingStore.get("tenantStatus");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("connectivity", this.getConnectivity());
        writer.writeCollectionOfObjectValues("filteringPolicies", this.getFilteringPolicies());
        writer.writeCollectionOfObjectValues("filteringProfiles", this.getFilteringProfiles());
        writer.writeCollectionOfObjectValues("forwardingPolicies", this.getForwardingPolicies());
        writer.writeCollectionOfObjectValues("forwardingProfiles", this.getForwardingProfiles());
        writer.writeObjectValue("logs", this.getLogs());
        writer.writeObjectValue("reports", this.getReports());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeObjectValue("tenantStatus", this.getTenantStatus());
    }
    /**
     * Sets the connectivity property value. Connectivity represents all the connectivity components in Global Secure Access.
     * @param value Value to set for the connectivity property.
     */
    public void setConnectivity(@jakarta.annotation.Nullable final Connectivity value) {
        this.backingStore.set("connectivity", value);
    }
    /**
     * Sets the filteringPolicies property value. A filtering policy defines the specific traffic that is allowed or blocked through the Global Secure Access services for a filtering profile.
     * @param value Value to set for the filteringPolicies property.
     */
    public void setFilteringPolicies(@jakarta.annotation.Nullable final java.util.List<FilteringPolicy> value) {
        this.backingStore.set("filteringPolicies", value);
    }
    /**
     * Sets the filteringProfiles property value. A filtering profile associates network access policies with Microsoft Entra ID Conditional Access policies, so that access policies can be applied to users and groups.
     * @param value Value to set for the filteringProfiles property.
     */
    public void setFilteringProfiles(@jakarta.annotation.Nullable final java.util.List<FilteringProfile> value) {
        this.backingStore.set("filteringProfiles", value);
    }
    /**
     * Sets the forwardingPolicies property value. A forwarding policy defines the specific traffic that is routed through the Global Secure Access Service. It's then added to a forwarding profile.
     * @param value Value to set for the forwardingPolicies property.
     */
    public void setForwardingPolicies(@jakarta.annotation.Nullable final java.util.List<ForwardingPolicy> value) {
        this.backingStore.set("forwardingPolicies", value);
    }
    /**
     * Sets the forwardingProfiles property value. A forwarding profile determines which types of traffic are routed through the Global Secure Access services and which ones are skipped. The handling of specific traffic is determined by the forwarding policies that are added to the forwarding profile.
     * @param value Value to set for the forwardingProfiles property.
     */
    public void setForwardingProfiles(@jakarta.annotation.Nullable final java.util.List<ForwardingProfile> value) {
        this.backingStore.set("forwardingProfiles", value);
    }
    /**
     * Sets the logs property value. Represents network connections that are routed through Global Secure Access.
     * @param value Value to set for the logs property.
     */
    public void setLogs(@jakarta.annotation.Nullable final Logs value) {
        this.backingStore.set("logs", value);
    }
    /**
     * Sets the reports property value. Represents the status of the Global Secure Access services for the tenant.
     * @param value Value to set for the reports property.
     */
    public void setReports(@jakarta.annotation.Nullable final Reports value) {
        this.backingStore.set("reports", value);
    }
    /**
     * Sets the settings property value. Global Secure Access settings.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final Settings value) {
        this.backingStore.set("settings", value);
    }
    /**
     * Sets the tenantStatus property value. Represents the status of the Global Secure Access services for the tenant.
     * @param value Value to set for the tenantStatus property.
     */
    public void setTenantStatus(@jakarta.annotation.Nullable final TenantStatus value) {
        this.backingStore.set("tenantStatus", value);
    }
}
