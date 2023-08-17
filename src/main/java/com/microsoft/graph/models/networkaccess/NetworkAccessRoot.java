package com.microsoft.graph.models.networkaccess;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NetworkAccessRoot extends Entity implements Parsable {
    /**
     * Connectivity represents all the connectivity components in Global Secure Access.
     */
    private Connectivity connectivity;
    /**
     * A forwarding policy defines the specific traffic that is routed through the Gloval Secure Access Service. It is then added to a forwarding profile.
     */
    private java.util.List<ForwardingPolicy> forwardingPolicies;
    /**
     * A forwarding profile determines which types of traffic are routed through the Global Secure Access services and which ones are skipped. The handling of specific traffic is determined by the forwarding policies that are added to the forwarding profile.
     */
    private java.util.List<ForwardingProfile> forwardingProfiles;
    /**
     * Represnts network connections that are routed through Global Secure Access.
     */
    private Logs logs;
    /**
     * Represents the status of the Global Secure Access services for the tenant.
     */
    private Reports reports;
    /**
     * Global Secure Access settings.
     */
    private Settings settings;
    /**
     * Represents the status of the Global Secure Access services for the tenant.
     */
    private TenantStatus tenantStatus;
    /**
     * Instantiates a new networkAccessRoot and sets the default values.
     */
    public NetworkAccessRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a networkAccessRoot
     */
    @jakarta.annotation.Nonnull
    public static NetworkAccessRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NetworkAccessRoot();
    }
    /**
     * Gets the connectivity property value. Connectivity represents all the connectivity components in Global Secure Access.
     * @return a connectivity
     */
    @jakarta.annotation.Nullable
    public Connectivity getConnectivity() {
        return this.connectivity;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectivity", (n) -> { this.setConnectivity(n.getObjectValue(Connectivity::createFromDiscriminatorValue)); });
        deserializerMap.put("forwardingPolicies", (n) -> { this.setForwardingPolicies(n.getCollectionOfObjectValues(ForwardingPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("forwardingProfiles", (n) -> { this.setForwardingProfiles(n.getCollectionOfObjectValues(ForwardingProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("logs", (n) -> { this.setLogs(n.getObjectValue(Logs::createFromDiscriminatorValue)); });
        deserializerMap.put("reports", (n) -> { this.setReports(n.getObjectValue(Reports::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(Settings::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantStatus", (n) -> { this.setTenantStatus(n.getObjectValue(TenantStatus::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the forwardingPolicies property value. A forwarding policy defines the specific traffic that is routed through the Gloval Secure Access Service. It is then added to a forwarding profile.
     * @return a forwardingPolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<ForwardingPolicy> getForwardingPolicies() {
        return this.forwardingPolicies;
    }
    /**
     * Gets the forwardingProfiles property value. A forwarding profile determines which types of traffic are routed through the Global Secure Access services and which ones are skipped. The handling of specific traffic is determined by the forwarding policies that are added to the forwarding profile.
     * @return a forwardingProfile
     */
    @jakarta.annotation.Nullable
    public java.util.List<ForwardingProfile> getForwardingProfiles() {
        return this.forwardingProfiles;
    }
    /**
     * Gets the logs property value. Represnts network connections that are routed through Global Secure Access.
     * @return a logs
     */
    @jakarta.annotation.Nullable
    public Logs getLogs() {
        return this.logs;
    }
    /**
     * Gets the reports property value. Represents the status of the Global Secure Access services for the tenant.
     * @return a reports
     */
    @jakarta.annotation.Nullable
    public Reports getReports() {
        return this.reports;
    }
    /**
     * Gets the settings property value. Global Secure Access settings.
     * @return a settings
     */
    @jakarta.annotation.Nullable
    public Settings getSettings() {
        return this.settings;
    }
    /**
     * Gets the tenantStatus property value. Represents the status of the Global Secure Access services for the tenant.
     * @return a tenantStatus
     */
    @jakarta.annotation.Nullable
    public TenantStatus getTenantStatus() {
        return this.tenantStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("connectivity", this.getConnectivity());
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
        this.connectivity = value;
    }
    /**
     * Sets the forwardingPolicies property value. A forwarding policy defines the specific traffic that is routed through the Gloval Secure Access Service. It is then added to a forwarding profile.
     * @param value Value to set for the forwardingPolicies property.
     */
    public void setForwardingPolicies(@jakarta.annotation.Nullable final java.util.List<ForwardingPolicy> value) {
        this.forwardingPolicies = value;
    }
    /**
     * Sets the forwardingProfiles property value. A forwarding profile determines which types of traffic are routed through the Global Secure Access services and which ones are skipped. The handling of specific traffic is determined by the forwarding policies that are added to the forwarding profile.
     * @param value Value to set for the forwardingProfiles property.
     */
    public void setForwardingProfiles(@jakarta.annotation.Nullable final java.util.List<ForwardingProfile> value) {
        this.forwardingProfiles = value;
    }
    /**
     * Sets the logs property value. Represnts network connections that are routed through Global Secure Access.
     * @param value Value to set for the logs property.
     */
    public void setLogs(@jakarta.annotation.Nullable final Logs value) {
        this.logs = value;
    }
    /**
     * Sets the reports property value. Represents the status of the Global Secure Access services for the tenant.
     * @param value Value to set for the reports property.
     */
    public void setReports(@jakarta.annotation.Nullable final Reports value) {
        this.reports = value;
    }
    /**
     * Sets the settings property value. Global Secure Access settings.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final Settings value) {
        this.settings = value;
    }
    /**
     * Sets the tenantStatus property value. Represents the status of the Global Secure Access services for the tenant.
     * @param value Value to set for the tenantStatus property.
     */
    public void setTenantStatus(@jakarta.annotation.Nullable final TenantStatus value) {
        this.tenantStatus = value;
    }
}
