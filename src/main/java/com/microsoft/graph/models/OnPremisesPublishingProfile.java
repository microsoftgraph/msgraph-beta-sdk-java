package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesPublishingProfile extends Entity implements Parsable {
    /** List of existing onPremisesAgentGroup objects. Read-only. Nullable. */
    private java.util.List<OnPremisesAgentGroup> _agentGroups;
    /** List of existing onPremisesAgent objects. Read-only. Nullable. */
    private java.util.List<OnPremisesAgent> _agents;
    /** List of existing connectorGroup objects for applications published through Application Proxy. Read-only. Nullable. */
    private java.util.List<ConnectorGroup> _connectorGroups;
    /** List of existing connector objects for applications published through Application Proxy. Read-only. Nullable. */
    private java.util.List<Connector> _connectors;
    /** Represents a hybridAgentUpdaterConfiguration object. */
    private HybridAgentUpdaterConfiguration _hybridAgentUpdaterConfiguration;
    /** Represents if Azure AD Application Proxy is enabled for the tenant. */
    private Boolean _isEnabled;
    /** List of existing publishedResource objects. Read-only. Nullable. */
    private java.util.List<PublishedResource> _publishedResources;
    /**
     * Instantiates a new OnPremisesPublishingProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnPremisesPublishingProfile() {
        super();
        this.setOdataType("#microsoft.graph.onPremisesPublishingProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OnPremisesPublishingProfile
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
        return this._agentGroups;
    }
    /**
     * Gets the agents property value. List of existing onPremisesAgent objects. Read-only. Nullable.
     * @return a onPremisesAgent
     */
    @javax.annotation.Nullable
    public java.util.List<OnPremisesAgent> getAgents() {
        return this._agents;
    }
    /**
     * Gets the connectorGroups property value. List of existing connectorGroup objects for applications published through Application Proxy. Read-only. Nullable.
     * @return a connectorGroup
     */
    @javax.annotation.Nullable
    public java.util.List<ConnectorGroup> getConnectorGroups() {
        return this._connectorGroups;
    }
    /**
     * Gets the connectors property value. List of existing connector objects for applications published through Application Proxy. Read-only. Nullable.
     * @return a connector
     */
    @javax.annotation.Nullable
    public java.util.List<Connector> getConnectors() {
        return this._connectors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnPremisesPublishingProfile currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("agentGroups", (n) -> { currentObject.setAgentGroups(n.getCollectionOfObjectValues(OnPremisesAgentGroup::createFromDiscriminatorValue)); });
            this.put("agents", (n) -> { currentObject.setAgents(n.getCollectionOfObjectValues(OnPremisesAgent::createFromDiscriminatorValue)); });
            this.put("connectorGroups", (n) -> { currentObject.setConnectorGroups(n.getCollectionOfObjectValues(ConnectorGroup::createFromDiscriminatorValue)); });
            this.put("connectors", (n) -> { currentObject.setConnectors(n.getCollectionOfObjectValues(Connector::createFromDiscriminatorValue)); });
            this.put("hybridAgentUpdaterConfiguration", (n) -> { currentObject.setHybridAgentUpdaterConfiguration(n.getObjectValue(HybridAgentUpdaterConfiguration::createFromDiscriminatorValue)); });
            this.put("isEnabled", (n) -> { currentObject.setIsEnabled(n.getBooleanValue()); });
            this.put("publishedResources", (n) -> { currentObject.setPublishedResources(n.getCollectionOfObjectValues(PublishedResource::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the hybridAgentUpdaterConfiguration property value. Represents a hybridAgentUpdaterConfiguration object.
     * @return a hybridAgentUpdaterConfiguration
     */
    @javax.annotation.Nullable
    public HybridAgentUpdaterConfiguration getHybridAgentUpdaterConfiguration() {
        return this._hybridAgentUpdaterConfiguration;
    }
    /**
     * Gets the isEnabled property value. Represents if Azure AD Application Proxy is enabled for the tenant.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this._isEnabled;
    }
    /**
     * Gets the publishedResources property value. List of existing publishedResource objects. Read-only. Nullable.
     * @return a publishedResource
     */
    @javax.annotation.Nullable
    public java.util.List<PublishedResource> getPublishedResources() {
        return this._publishedResources;
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
        this._agentGroups = value;
    }
    /**
     * Sets the agents property value. List of existing onPremisesAgent objects. Read-only. Nullable.
     * @param value Value to set for the agents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAgents(@javax.annotation.Nullable final java.util.List<OnPremisesAgent> value) {
        this._agents = value;
    }
    /**
     * Sets the connectorGroups property value. List of existing connectorGroup objects for applications published through Application Proxy. Read-only. Nullable.
     * @param value Value to set for the connectorGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectorGroups(@javax.annotation.Nullable final java.util.List<ConnectorGroup> value) {
        this._connectorGroups = value;
    }
    /**
     * Sets the connectors property value. List of existing connector objects for applications published through Application Proxy. Read-only. Nullable.
     * @param value Value to set for the connectors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectors(@javax.annotation.Nullable final java.util.List<Connector> value) {
        this._connectors = value;
    }
    /**
     * Sets the hybridAgentUpdaterConfiguration property value. Represents a hybridAgentUpdaterConfiguration object.
     * @param value Value to set for the hybridAgentUpdaterConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHybridAgentUpdaterConfiguration(@javax.annotation.Nullable final HybridAgentUpdaterConfiguration value) {
        this._hybridAgentUpdaterConfiguration = value;
    }
    /**
     * Sets the isEnabled property value. Represents if Azure AD Application Proxy is enabled for the tenant.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEnabled = value;
    }
    /**
     * Sets the publishedResources property value. List of existing publishedResource objects. Read-only. Nullable.
     * @param value Value to set for the publishedResources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublishedResources(@javax.annotation.Nullable final java.util.List<PublishedResource> value) {
        this._publishedResources = value;
    }
}
