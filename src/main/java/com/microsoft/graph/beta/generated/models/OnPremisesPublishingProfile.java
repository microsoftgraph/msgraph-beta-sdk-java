package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnPremisesPublishingProfile extends Entity implements Parsable {
    /**
     * Instantiates a new {@link OnPremisesPublishingProfile} and sets the default values.
     */
    public OnPremisesPublishingProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnPremisesPublishingProfile}
     */
    @jakarta.annotation.Nonnull
    public static OnPremisesPublishingProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesPublishingProfile();
    }
    /**
     * Gets the agentGroups property value. List of existing onPremisesAgentGroup objects. Read-only. Nullable.
     * @return a {@link java.util.List<OnPremisesAgentGroup>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnPremisesAgentGroup> getAgentGroups() {
        return this.backingStore.get("agentGroups");
    }
    /**
     * Gets the agents property value. List of existing onPremisesAgent objects. Read-only. Nullable.
     * @return a {@link java.util.List<OnPremisesAgent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnPremisesAgent> getAgents() {
        return this.backingStore.get("agents");
    }
    /**
     * Gets the applicationSegments property value. Represents the segment configurations that are allowed for an on-premises non-web application published through Microsoft Entra application proxy.
     * @return a {@link java.util.List<IpApplicationSegment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IpApplicationSegment> getApplicationSegments() {
        return this.backingStore.get("applicationSegments");
    }
    /**
     * Gets the connectorGroups property value. List of existing connectorGroup objects for applications published through Application Proxy. Read-only. Nullable.
     * @return a {@link java.util.List<ConnectorGroup>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConnectorGroup> getConnectorGroups() {
        return this.backingStore.get("connectorGroups");
    }
    /**
     * Gets the connectors property value. List of existing connector objects for applications published through Application Proxy. Read-only. Nullable.
     * @return a {@link java.util.List<Connector>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Connector> getConnectors() {
        return this.backingStore.get("connectors");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agentGroups", (n) -> { this.setAgentGroups(n.getCollectionOfObjectValues(OnPremisesAgentGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("agents", (n) -> { this.setAgents(n.getCollectionOfObjectValues(OnPremisesAgent::createFromDiscriminatorValue)); });
        deserializerMap.put("applicationSegments", (n) -> { this.setApplicationSegments(n.getCollectionOfObjectValues(IpApplicationSegment::createFromDiscriminatorValue)); });
        deserializerMap.put("connectorGroups", (n) -> { this.setConnectorGroups(n.getCollectionOfObjectValues(ConnectorGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("connectors", (n) -> { this.setConnectors(n.getCollectionOfObjectValues(Connector::createFromDiscriminatorValue)); });
        deserializerMap.put("hybridAgentUpdaterConfiguration", (n) -> { this.setHybridAgentUpdaterConfiguration(n.getObjectValue(HybridAgentUpdaterConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("isDefaultAccessEnabled", (n) -> { this.setIsDefaultAccessEnabled(n.getBooleanValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("publishedResources", (n) -> { this.setPublishedResources(n.getCollectionOfObjectValues(PublishedResource::createFromDiscriminatorValue)); });
        deserializerMap.put("sensors", (n) -> { this.setSensors(n.getCollectionOfObjectValues(PrivateAccessSensor::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hybridAgentUpdaterConfiguration property value. Represents a hybridAgentUpdaterConfiguration object.
     * @return a {@link HybridAgentUpdaterConfiguration}
     */
    @jakarta.annotation.Nullable
    public HybridAgentUpdaterConfiguration getHybridAgentUpdaterConfiguration() {
        return this.backingStore.get("hybridAgentUpdaterConfiguration");
    }
    /**
     * Gets the isDefaultAccessEnabled property value. Specifies whether default access for app proxy is enabled or disabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefaultAccessEnabled() {
        return this.backingStore.get("isDefaultAccessEnabled");
    }
    /**
     * Gets the isEnabled property value. Represents if Microsoft Entra application proxy is enabled for the tenant.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the publishedResources property value. List of existing publishedResource objects. Read-only. Nullable.
     * @return a {@link java.util.List<PublishedResource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PublishedResource> getPublishedResources() {
        return this.backingStore.get("publishedResources");
    }
    /**
     * Gets the sensors property value. A lightweight agent installed on domain controllers that helps secure access and enforce MFA to on-premise resources.
     * @return a {@link java.util.List<PrivateAccessSensor>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrivateAccessSensor> getSensors() {
        return this.backingStore.get("sensors");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("agentGroups", this.getAgentGroups());
        writer.writeCollectionOfObjectValues("agents", this.getAgents());
        writer.writeCollectionOfObjectValues("applicationSegments", this.getApplicationSegments());
        writer.writeCollectionOfObjectValues("connectorGroups", this.getConnectorGroups());
        writer.writeCollectionOfObjectValues("connectors", this.getConnectors());
        writer.writeObjectValue("hybridAgentUpdaterConfiguration", this.getHybridAgentUpdaterConfiguration());
        writer.writeBooleanValue("isDefaultAccessEnabled", this.getIsDefaultAccessEnabled());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeCollectionOfObjectValues("publishedResources", this.getPublishedResources());
        writer.writeCollectionOfObjectValues("sensors", this.getSensors());
    }
    /**
     * Sets the agentGroups property value. List of existing onPremisesAgentGroup objects. Read-only. Nullable.
     * @param value Value to set for the agentGroups property.
     */
    public void setAgentGroups(@jakarta.annotation.Nullable final java.util.List<OnPremisesAgentGroup> value) {
        this.backingStore.set("agentGroups", value);
    }
    /**
     * Sets the agents property value. List of existing onPremisesAgent objects. Read-only. Nullable.
     * @param value Value to set for the agents property.
     */
    public void setAgents(@jakarta.annotation.Nullable final java.util.List<OnPremisesAgent> value) {
        this.backingStore.set("agents", value);
    }
    /**
     * Sets the applicationSegments property value. Represents the segment configurations that are allowed for an on-premises non-web application published through Microsoft Entra application proxy.
     * @param value Value to set for the applicationSegments property.
     */
    public void setApplicationSegments(@jakarta.annotation.Nullable final java.util.List<IpApplicationSegment> value) {
        this.backingStore.set("applicationSegments", value);
    }
    /**
     * Sets the connectorGroups property value. List of existing connectorGroup objects for applications published through Application Proxy. Read-only. Nullable.
     * @param value Value to set for the connectorGroups property.
     */
    public void setConnectorGroups(@jakarta.annotation.Nullable final java.util.List<ConnectorGroup> value) {
        this.backingStore.set("connectorGroups", value);
    }
    /**
     * Sets the connectors property value. List of existing connector objects for applications published through Application Proxy. Read-only. Nullable.
     * @param value Value to set for the connectors property.
     */
    public void setConnectors(@jakarta.annotation.Nullable final java.util.List<Connector> value) {
        this.backingStore.set("connectors", value);
    }
    /**
     * Sets the hybridAgentUpdaterConfiguration property value. Represents a hybridAgentUpdaterConfiguration object.
     * @param value Value to set for the hybridAgentUpdaterConfiguration property.
     */
    public void setHybridAgentUpdaterConfiguration(@jakarta.annotation.Nullable final HybridAgentUpdaterConfiguration value) {
        this.backingStore.set("hybridAgentUpdaterConfiguration", value);
    }
    /**
     * Sets the isDefaultAccessEnabled property value. Specifies whether default access for app proxy is enabled or disabled.
     * @param value Value to set for the isDefaultAccessEnabled property.
     */
    public void setIsDefaultAccessEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDefaultAccessEnabled", value);
    }
    /**
     * Sets the isEnabled property value. Represents if Microsoft Entra application proxy is enabled for the tenant.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the publishedResources property value. List of existing publishedResource objects. Read-only. Nullable.
     * @param value Value to set for the publishedResources property.
     */
    public void setPublishedResources(@jakarta.annotation.Nullable final java.util.List<PublishedResource> value) {
        this.backingStore.set("publishedResources", value);
    }
    /**
     * Sets the sensors property value. A lightweight agent installed on domain controllers that helps secure access and enforce MFA to on-premise resources.
     * @param value Value to set for the sensors property.
     */
    public void setSensors(@jakarta.annotation.Nullable final java.util.List<PrivateAccessSensor> value) {
        this.backingStore.set("sensors", value);
    }
}
