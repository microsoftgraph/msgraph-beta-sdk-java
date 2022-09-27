package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class PublishedResource extends Entity implements Parsable {
    /** List of onPremisesAgentGroups that a publishedResource is assigned to. Read-only. Nullable. */
    private java.util.List<OnPremisesAgentGroup> _agentGroups;
    /** Display Name of the publishedResource. */
    private String _displayName;
    /** The publishingType property */
    private OnPremisesPublishingType _publishingType;
    /** Name of the publishedResource. */
    private String _resourceName;
    /**
     * Instantiates a new publishedResource and sets the default values.
     * @return a void
     */
    public PublishedResource() {
        super();
        this.setOdataType("#microsoft.graph.publishedResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a publishedResource
     */
    @javax.annotation.Nonnull
    public static PublishedResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PublishedResource();
    }
    /**
     * Gets the agentGroups property value. List of onPremisesAgentGroups that a publishedResource is assigned to. Read-only. Nullable.
     * @return a onPremisesAgentGroup
     */
    @javax.annotation.Nullable
    public java.util.List<OnPremisesAgentGroup> getAgentGroups() {
        return this._agentGroups;
    }
    /**
     * Gets the displayName property value. Display Name of the publishedResource.
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
        final PublishedResource currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("agentGroups", (n) -> { currentObject.setAgentGroups(n.getCollectionOfObjectValues(OnPremisesAgentGroup::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("publishingType", (n) -> { currentObject.setPublishingType(n.getEnumValue(OnPremisesPublishingType.class)); });
            this.put("resourceName", (n) -> { currentObject.setResourceName(n.getStringValue()); });
        }};
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
     * Gets the resourceName property value. Name of the publishedResource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceName() {
        return this._resourceName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("agentGroups", this.getAgentGroups());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("publishingType", this.getPublishingType());
        writer.writeStringValue("resourceName", this.getResourceName());
    }
    /**
     * Sets the agentGroups property value. List of onPremisesAgentGroups that a publishedResource is assigned to. Read-only. Nullable.
     * @param value Value to set for the agentGroups property.
     * @return a void
     */
    public void setAgentGroups(@javax.annotation.Nullable final java.util.List<OnPremisesAgentGroup> value) {
        this._agentGroups = value;
    }
    /**
     * Sets the displayName property value. Display Name of the publishedResource.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the publishingType property value. The publishingType property
     * @param value Value to set for the publishingType property.
     * @return a void
     */
    public void setPublishingType(@javax.annotation.Nullable final OnPremisesPublishingType value) {
        this._publishingType = value;
    }
    /**
     * Sets the resourceName property value. Name of the publishedResource.
     * @param value Value to set for the resourceName property.
     * @return a void
     */
    public void setResourceName(@javax.annotation.Nullable final String value) {
        this._resourceName = value;
    }
}
