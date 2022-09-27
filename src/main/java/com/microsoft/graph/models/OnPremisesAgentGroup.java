package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class OnPremisesAgentGroup extends Entity implements Parsable {
    /** List of onPremisesAgent that are assigned to an onPremisesAgentGroup. Read-only. Nullable. */
    private java.util.List<OnPremisesAgent> _agents;
    /** Display name of the onPremisesAgentGroup. */
    private String _displayName;
    /** Indicates if the onPremisesAgentGroup is the default agent group. Only a single agent group can be the default onPremisesAgentGroup and is set by the system. */
    private Boolean _isDefault;
    /** List of publishedResource that are assigned to an onPremisesAgentGroup. Read-only. Nullable. */
    private java.util.List<PublishedResource> _publishedResources;
    /** The publishingType property */
    private OnPremisesPublishingType _publishingType;
    /**
     * Instantiates a new onPremisesAgentGroup and sets the default values.
     * @return a void
     */
    public OnPremisesAgentGroup() {
        super();
        this.setOdataType("#microsoft.graph.onPremisesAgentGroup");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onPremisesAgentGroup
     */
    @javax.annotation.Nonnull
    public static OnPremisesAgentGroup createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesAgentGroup();
    }
    /**
     * Gets the agents property value. List of onPremisesAgent that are assigned to an onPremisesAgentGroup. Read-only. Nullable.
     * @return a onPremisesAgent
     */
    @javax.annotation.Nullable
    public java.util.List<OnPremisesAgent> getAgents() {
        return this._agents;
    }
    /**
     * Gets the displayName property value. Display name of the onPremisesAgentGroup.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnPremisesAgentGroup currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("agents", (n) -> { currentObject.setAgents(n.getCollectionOfObjectValues(OnPremisesAgent::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("isDefault", (n) -> { currentObject.setIsDefault(n.getBooleanValue()); });
            this.put("publishedResources", (n) -> { currentObject.setPublishedResources(n.getCollectionOfObjectValues(PublishedResource::createFromDiscriminatorValue)); });
            this.put("publishingType", (n) -> { currentObject.setPublishingType(n.getEnumValue(OnPremisesPublishingType.class)); });
        }};
    }
    /**
     * Gets the isDefault property value. Indicates if the onPremisesAgentGroup is the default agent group. Only a single agent group can be the default onPremisesAgentGroup and is set by the system.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefault() {
        return this._isDefault;
    }
    /**
     * Gets the publishedResources property value. List of publishedResource that are assigned to an onPremisesAgentGroup. Read-only. Nullable.
     * @return a publishedResource
     */
    @javax.annotation.Nullable
    public java.util.List<PublishedResource> getPublishedResources() {
        return this._publishedResources;
    }
    /**
     * Gets the publishingType property value. The publishingType property
     * @return a onPremisesPublishingType
     */
    @javax.annotation.Nullable
    public OnPremisesPublishingType getPublishingType() {
        return this._publishingType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("agents", this.getAgents());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeCollectionOfObjectValues("publishedResources", this.getPublishedResources());
        writer.writeEnumValue("publishingType", this.getPublishingType());
    }
    /**
     * Sets the agents property value. List of onPremisesAgent that are assigned to an onPremisesAgentGroup. Read-only. Nullable.
     * @param value Value to set for the agents property.
     * @return a void
     */
    public void setAgents(@javax.annotation.Nullable final java.util.List<OnPremisesAgent> value) {
        this._agents = value;
    }
    /**
     * Sets the displayName property value. Display name of the onPremisesAgentGroup.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isDefault property value. Indicates if the onPremisesAgentGroup is the default agent group. Only a single agent group can be the default onPremisesAgentGroup and is set by the system.
     * @param value Value to set for the isDefault property.
     * @return a void
     */
    public void setIsDefault(@javax.annotation.Nullable final Boolean value) {
        this._isDefault = value;
    }
    /**
     * Sets the publishedResources property value. List of publishedResource that are assigned to an onPremisesAgentGroup. Read-only. Nullable.
     * @param value Value to set for the publishedResources property.
     * @return a void
     */
    public void setPublishedResources(@javax.annotation.Nullable final java.util.List<PublishedResource> value) {
        this._publishedResources = value;
    }
    /**
     * Sets the publishingType property value. The publishingType property
     * @param value Value to set for the publishingType property.
     * @return a void
     */
    public void setPublishingType(@javax.annotation.Nullable final OnPremisesPublishingType value) {
        this._publishingType = value;
    }
}
