package com.microsoft.graph.models.networkaccess;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NetworkAccessRoot extends Entity implements Parsable {
    /** The connectivity property */
    private Connectivity connectivity;
    /** The forwardingPolicies property */
    private java.util.List<ForwardingPolicy> forwardingPolicies;
    /** The forwardingProfiles property */
    private java.util.List<ForwardingProfile> forwardingProfiles;
    /** The logs property */
    private Logs logs;
    /** The reports property */
    private Reports reports;
    /** The settings property */
    private Settings settings;
    /** The tenantStatus property */
    private TenantStatus tenantStatus;
    /**
     * Instantiates a new NetworkAccessRoot and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public NetworkAccessRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a NetworkAccessRoot
     */
    @javax.annotation.Nonnull
    public static NetworkAccessRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NetworkAccessRoot();
    }
    /**
     * Gets the connectivity property value. The connectivity property
     * @return a connectivity
     */
    @javax.annotation.Nullable
    public Connectivity getConnectivity() {
        return this.connectivity;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * Gets the forwardingPolicies property value. The forwardingPolicies property
     * @return a forwardingPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<ForwardingPolicy> getForwardingPolicies() {
        return this.forwardingPolicies;
    }
    /**
     * Gets the forwardingProfiles property value. The forwardingProfiles property
     * @return a forwardingProfile
     */
    @javax.annotation.Nullable
    public java.util.List<ForwardingProfile> getForwardingProfiles() {
        return this.forwardingProfiles;
    }
    /**
     * Gets the logs property value. The logs property
     * @return a logs
     */
    @javax.annotation.Nullable
    public Logs getLogs() {
        return this.logs;
    }
    /**
     * Gets the reports property value. The reports property
     * @return a reports
     */
    @javax.annotation.Nullable
    public Reports getReports() {
        return this.reports;
    }
    /**
     * Gets the settings property value. The settings property
     * @return a settings
     */
    @javax.annotation.Nullable
    public Settings getSettings() {
        return this.settings;
    }
    /**
     * Gets the tenantStatus property value. The tenantStatus property
     * @return a tenantStatus
     */
    @javax.annotation.Nullable
    public TenantStatus getTenantStatus() {
        return this.tenantStatus;
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
        writer.writeObjectValue("connectivity", this.getConnectivity());
        writer.writeCollectionOfObjectValues("forwardingPolicies", this.getForwardingPolicies());
        writer.writeCollectionOfObjectValues("forwardingProfiles", this.getForwardingProfiles());
        writer.writeObjectValue("logs", this.getLogs());
        writer.writeObjectValue("reports", this.getReports());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeObjectValue("tenantStatus", this.getTenantStatus());
    }
    /**
     * Sets the connectivity property value. The connectivity property
     * @param value Value to set for the connectivity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectivity(@javax.annotation.Nullable final Connectivity value) {
        this.connectivity = value;
    }
    /**
     * Sets the forwardingPolicies property value. The forwardingPolicies property
     * @param value Value to set for the forwardingPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setForwardingPolicies(@javax.annotation.Nullable final java.util.List<ForwardingPolicy> value) {
        this.forwardingPolicies = value;
    }
    /**
     * Sets the forwardingProfiles property value. The forwardingProfiles property
     * @param value Value to set for the forwardingProfiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setForwardingProfiles(@javax.annotation.Nullable final java.util.List<ForwardingProfile> value) {
        this.forwardingProfiles = value;
    }
    /**
     * Sets the logs property value. The logs property
     * @param value Value to set for the logs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogs(@javax.annotation.Nullable final Logs value) {
        this.logs = value;
    }
    /**
     * Sets the reports property value. The reports property
     * @param value Value to set for the reports property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReports(@javax.annotation.Nullable final Reports value) {
        this.reports = value;
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettings(@javax.annotation.Nullable final Settings value) {
        this.settings = value;
    }
    /**
     * Sets the tenantStatus property value. The tenantStatus property
     * @param value Value to set for the tenantStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantStatus(@javax.annotation.Nullable final TenantStatus value) {
        this.tenantStatus = value;
    }
}
