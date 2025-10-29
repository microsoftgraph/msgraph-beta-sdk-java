package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NetworkAccessRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link NetworkAccessRoot} and sets the default values.
     */
    public NetworkAccessRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link NetworkAccessRoot}
     */
    @jakarta.annotation.Nonnull
    public static NetworkAccessRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NetworkAccessRoot();
    }
    /**
     * Gets the alerts property value. The alerts property
     * @return a {@link java.util.List<Alert>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Alert> getAlerts() {
        return this.backingStore.get("alerts");
    }
    /**
     * Gets the connectivity property value. Connectivity represents all the connectivity components in Global Secure Access.
     * @return a {@link Connectivity}
     */
    @jakarta.annotation.Nullable
    public Connectivity getConnectivity() {
        return this.backingStore.get("connectivity");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alerts", (n) -> { this.setAlerts(n.getCollectionOfObjectValues(Alert::createFromDiscriminatorValue)); });
        deserializerMap.put("connectivity", (n) -> { this.setConnectivity(n.getObjectValue(Connectivity::createFromDiscriminatorValue)); });
        deserializerMap.put("filteringPolicies", (n) -> { this.setFilteringPolicies(n.getCollectionOfObjectValues(FilteringPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("forwardingPolicies", (n) -> { this.setForwardingPolicies(n.getCollectionOfObjectValues(ForwardingPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("logs", (n) -> { this.setLogs(n.getObjectValue(Logs::createFromDiscriminatorValue)); });
        deserializerMap.put("reports", (n) -> { this.setReports(n.getObjectValue(Reports::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(Settings::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantStatus", (n) -> { this.setTenantStatus(n.getObjectValue(TenantStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("threatIntelligencePolicies", (n) -> { this.setThreatIntelligencePolicies(n.getCollectionOfObjectValues(ThreatIntelligencePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("tls", (n) -> { this.setTls(n.getObjectValue(TlsTermination::createFromDiscriminatorValue)); });
        deserializerMap.put("tlsInspectionPolicies", (n) -> { this.setTlsInspectionPolicies(n.getCollectionOfObjectValues(TlsInspectionPolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the filteringPolicies property value. A filtering policy defines the specific traffic that is allowed or blocked through the Global Secure Access services for a filtering profile.
     * @return a {@link java.util.List<FilteringPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FilteringPolicy> getFilteringPolicies() {
        return this.backingStore.get("filteringPolicies");
    }
    /**
     * Gets the forwardingPolicies property value. The forwardingPolicies property
     * @return a {@link java.util.List<ForwardingPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ForwardingPolicy> getForwardingPolicies() {
        return this.backingStore.get("forwardingPolicies");
    }
    /**
     * Gets the logs property value. Represents network connections that are routed through Global Secure Access.
     * @return a {@link Logs}
     */
    @jakarta.annotation.Nullable
    public Logs getLogs() {
        return this.backingStore.get("logs");
    }
    /**
     * Gets the reports property value. Represents the status of the Global Secure Access services for the tenant.
     * @return a {@link Reports}
     */
    @jakarta.annotation.Nullable
    public Reports getReports() {
        return this.backingStore.get("reports");
    }
    /**
     * Gets the settings property value. Global Secure Access settings.
     * @return a {@link Settings}
     */
    @jakarta.annotation.Nullable
    public Settings getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Gets the tenantStatus property value. Represents the status of the Global Secure Access services for the tenant.
     * @return a {@link TenantStatus}
     */
    @jakarta.annotation.Nullable
    public TenantStatus getTenantStatus() {
        return this.backingStore.get("tenantStatus");
    }
    /**
     * Gets the threatIntelligencePolicies property value. The threatIntelligencePolicies property
     * @return a {@link java.util.List<ThreatIntelligencePolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ThreatIntelligencePolicy> getThreatIntelligencePolicies() {
        return this.backingStore.get("threatIntelligencePolicies");
    }
    /**
     * Gets the tls property value. A container for tenant-level TLS inspection settings for Global Secure Access.
     * @return a {@link TlsTermination}
     */
    @jakarta.annotation.Nullable
    public TlsTermination getTls() {
        return this.backingStore.get("tls");
    }
    /**
     * Gets the tlsInspectionPolicies property value. Allows you to configure TLS termination for your organization&apos;s network traffic through Global Secure Access.
     * @return a {@link java.util.List<TlsInspectionPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TlsInspectionPolicy> getTlsInspectionPolicies() {
        return this.backingStore.get("tlsInspectionPolicies");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("alerts", this.getAlerts());
        writer.writeObjectValue("connectivity", this.getConnectivity());
        writer.writeCollectionOfObjectValues("filteringPolicies", this.getFilteringPolicies());
        writer.writeCollectionOfObjectValues("forwardingPolicies", this.getForwardingPolicies());
        writer.writeObjectValue("logs", this.getLogs());
        writer.writeObjectValue("reports", this.getReports());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeObjectValue("tenantStatus", this.getTenantStatus());
        writer.writeCollectionOfObjectValues("threatIntelligencePolicies", this.getThreatIntelligencePolicies());
        writer.writeObjectValue("tls", this.getTls());
        writer.writeCollectionOfObjectValues("tlsInspectionPolicies", this.getTlsInspectionPolicies());
    }
    /**
     * Sets the alerts property value. The alerts property
     * @param value Value to set for the alerts property.
     */
    public void setAlerts(@jakarta.annotation.Nullable final java.util.List<Alert> value) {
        this.backingStore.set("alerts", value);
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
     * Sets the forwardingPolicies property value. The forwardingPolicies property
     * @param value Value to set for the forwardingPolicies property.
     */
    public void setForwardingPolicies(@jakarta.annotation.Nullable final java.util.List<ForwardingPolicy> value) {
        this.backingStore.set("forwardingPolicies", value);
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
    /**
     * Sets the threatIntelligencePolicies property value. The threatIntelligencePolicies property
     * @param value Value to set for the threatIntelligencePolicies property.
     */
    public void setThreatIntelligencePolicies(@jakarta.annotation.Nullable final java.util.List<ThreatIntelligencePolicy> value) {
        this.backingStore.set("threatIntelligencePolicies", value);
    }
    /**
     * Sets the tls property value. A container for tenant-level TLS inspection settings for Global Secure Access.
     * @param value Value to set for the tls property.
     */
    public void setTls(@jakarta.annotation.Nullable final TlsTermination value) {
        this.backingStore.set("tls", value);
    }
    /**
     * Sets the tlsInspectionPolicies property value. Allows you to configure TLS termination for your organization&apos;s network traffic through Global Secure Access.
     * @param value Value to set for the tlsInspectionPolicies property.
     */
    public void setTlsInspectionPolicies(@jakarta.annotation.Nullable final java.util.List<TlsInspectionPolicy> value) {
        this.backingStore.set("tlsInspectionPolicies", value);
    }
}
