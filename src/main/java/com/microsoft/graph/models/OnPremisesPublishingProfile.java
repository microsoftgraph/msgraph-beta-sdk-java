package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesPublishingProfile extends Entity implements Parsable {
    /**
     * List of existing onPremisesAgentGroup objects. Read-only. Nullable.
     */
    private java.util.List<OnPremisesAgentGroup> agentGroups;
    /**
     * List of existing onPremisesAgent objects. Read-only. Nullable.
     */
    private java.util.List<OnPremisesAgent> agents;
    /**
     * List of existing connectorGroup objects for applications published through Application Proxy. Read-only. Nullable.
     */
    private java.util.List<ConnectorGroup> connectorGroups;
    /**
     * List of existing connector objects for applications published through Application Proxy. Read-only. Nullable.
     */
    private java.util.List<Connector> connectors;
    /**
     * Represents a hybridAgentUpdaterConfiguration object.
     */
    private HybridAgentUpdaterConfiguration hybridAgentUpdaterConfiguration;
    /**
     * The isDefaultAccessEnabled property
     */
    private Boolean isDefaultAccessEnabled;
    /**
     * Represents if Azure AD Application Proxy is enabled for the tenant.
     */
    private Boolean isEnabled;
    /**
     * List of existing publishedResource objects. Read-only. Nullable.
     */
    private java.util.List<PublishedResource> publishedResources;
    /**
     * Instantiates a new onPremisesPublishingProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnPremisesPublishingProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onPremisesPublishingProfile
     */
    @javax.annotation.Nonnull
    public static OnPremisesPublishingProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesPublishingProfile();
    }
    /**
     * Gets the agentGroups property value. List of existing onPremisesAgentGroup objects. Read-only. Nullable.
     * @return a onPremisesAgentGroup
     */
    @javax.annotation.Nullable
    public java.util.List<OnPremisesAgentGroup> getAgentGroups() {
        return this.agentGroups;
    }
    /**
     * Gets the agents property value. List of existing onPremisesAgent objects. Read-only. Nullable.
     * @return a onPremisesAgent
     */
    @javax.annotation.Nullable
    public java.util.List<OnPremisesAgent> getAgents() {
        return this.agents;
    }
    /**
     * Gets the connectorGroups property value. List of existing connectorGroup objects for applications published through Application Proxy. Read-only. Nullable.
     * @return a connectorGroup
     */
    @javax.annotation.Nullable
    public java.util.List<ConnectorGroup> getConnectorGroups() {
        return this.connectorGroups;
    }
    /**
     * Gets the connectors property value. List of existing connector objects for applications published through Application Proxy. Read-only. Nullable.
     * @return a connector
     */
    @javax.annotation.Nullable
    public java.util.List<Connector> getConnectors() {
        return this.connectors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agentGroups", (n) -> { this.setAgentGroups(n.getCollectionOfObjectValues(OnPremisesAgentGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("agents", (n) -> { this.setAgents(n.getCollectionOfObjectValues(OnPremisesAgent::createFromDiscriminatorValue)); });
        deserializerMap.put("connectorGroups", (n) -> { this.setConnectorGroups(n.getCollectionOfObjectValues(ConnectorGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("connectors", (n) -> { this.setConnectors(n.getCollectionOfObjectValues(Connector::createFromDiscriminatorValue)); });
        deserializerMap.put("hybridAgentUpdaterConfiguration", (n) -> { this.setHybridAgentUpdaterConfiguration(n.getObjectValue(HybridAgentUpdaterConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("isDefaultAccessEnabled", (n) -> { this.setIsDefaultAccessEnabled(n.getBooleanValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("publishedResources", (n) -> { this.setPublishedResources(n.getCollectionOfObjectValues(PublishedResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hybridAgentUpdaterConfiguration property value. Represents a hybridAgentUpdaterConfiguration object.
     * @return a hybridAgentUpdaterConfiguration
     */
    @javax.annotation.Nullable
    public HybridAgentUpdaterConfiguration getHybridAgentUpdaterConfiguration() {
        return this.hybridAgentUpdaterConfiguration;
    }
    /**
     * Gets the isDefaultAccessEnabled property value. The isDefaultAccessEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefaultAccessEnabled() {
        return this.isDefaultAccessEnabled;
    }
    /**
     * Gets the isEnabled property value. Represents if Azure AD Application Proxy is enabled for the tenant.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Gets the publishedResources property value. List of existing publishedResource objects. Read-only. Nullable.
     * @return a publishedResource
     */
    @javax.annotation.Nullable
    public java.util.List<PublishedResource> getPublishedResources() {
        return this.publishedResources;
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
        writer.writeCollectionOfObjectValues("agentGroups", this.getAgentGroups());
        writer.writeCollectionOfObjectValues("agents", this.getAgents());
        writer.writeCollectionOfObjectValues("connectorGroups", this.getConnectorGroups());
        writer.writeCollectionOfObjectValues("connectors", this.getConnectors());
        writer.writeObjectValue("hybridAgentUpdaterConfiguration", this.getHybridAgentUpdaterConfiguration());
        writer.writeBooleanValue("isDefaultAccessEnabled", this.getIsDefaultAccessEnabled());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeCollectionOfObjectValues("publishedResources", this.getPublishedResources());
    }
    /**
     * Sets the agentGroups property value. List of existing onPremisesAgentGroup objects. Read-only. Nullable.
     * @param value Value to set for the agentGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAgentGroups(@javax.annotation.Nullable final java.util.List<OnPremisesAgentGroup> value) {
        this.agentGroups = value;
    }
    /**
     * Sets the agents property value. List of existing onPremisesAgent objects. Read-only. Nullable.
     * @param value Value to set for the agents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAgents(@javax.annotation.Nullable final java.util.List<OnPremisesAgent> value) {
        this.agents = value;
    }
    /**
     * Sets the connectorGroups property value. List of existing connectorGroup objects for applications published through Application Proxy. Read-only. Nullable.
     * @param value Value to set for the connectorGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectorGroups(@javax.annotation.Nullable final java.util.List<ConnectorGroup> value) {
        this.connectorGroups = value;
    }
    /**
     * Sets the connectors property value. List of existing connector objects for applications published through Application Proxy. Read-only. Nullable.
     * @param value Value to set for the connectors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectors(@javax.annotation.Nullable final java.util.List<Connector> value) {
        this.connectors = value;
    }
    /**
     * Sets the hybridAgentUpdaterConfiguration property value. Represents a hybridAgentUpdaterConfiguration object.
     * @param value Value to set for the hybridAgentUpdaterConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHybridAgentUpdaterConfiguration(@javax.annotation.Nullable final HybridAgentUpdaterConfiguration value) {
        this.hybridAgentUpdaterConfiguration = value;
    }
    /**
     * Sets the isDefaultAccessEnabled property value. The isDefaultAccessEnabled property
     * @param value Value to set for the isDefaultAccessEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDefaultAccessEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isDefaultAccessEnabled = value;
    }
    /**
     * Sets the isEnabled property value. Represents if Azure AD Application Proxy is enabled for the tenant.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
    /**
     * Sets the publishedResources property value. List of existing publishedResource objects. Read-only. Nullable.
     * @param value Value to set for the publishedResources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublishedResources(@javax.annotation.Nullable final java.util.List<PublishedResource> value) {
        this.publishedResources = value;
    }
}
