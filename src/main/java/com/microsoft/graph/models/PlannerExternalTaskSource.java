package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerExternalTaskSource extends PlannerTaskCreation implements Parsable {
    /**
     * Instantiates a new PlannerExternalTaskSource and sets the default values.
     */
    public PlannerExternalTaskSource() {
        super();
        this.setOdataType("#microsoft.graph.plannerExternalTaskSource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerExternalTaskSource
     */
    @jakarta.annotation.Nonnull
    public static PlannerExternalTaskSource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerExternalTaskSource();
    }
    /**
     * Gets the contextScenarioId property value. Nullable. An identifier for the scenario associated with this external source. This should be in reverse DNS format. For example, Contoso company owned application for customer support would have a value like 'com.constoso.customerSupport'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContextScenarioId() {
        return this.backingStore.get("contextScenarioId");
    }
    /**
     * Gets the displayLinkType property value. Specifies how an application should display the link to the associated plannerExternalTaskSource. The possible values are: none, default.
     * @return a PlannerExternalTaskSourceDisplayType
     */
    @jakarta.annotation.Nullable
    public PlannerExternalTaskSourceDisplayType getDisplayLinkType() {
        return this.backingStore.get("displayLinkType");
    }
    /**
     * Gets the displayNameSegments property value. The segments of the name of the external experience. Segments represent a hierarchical structure that allows other apps to display the relationship.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDisplayNameSegments() {
        return this.backingStore.get("displayNameSegments");
    }
    /**
     * Gets the externalContextId property value. Nullable. The id of the external entity's containing entity or context.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalContextId() {
        return this.backingStore.get("externalContextId");
    }
    /**
     * Gets the externalObjectId property value. Nullable. The id of the entity that an external service associates with a task.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalObjectId() {
        return this.backingStore.get("externalObjectId");
    }
    /**
     * Gets the externalObjectVersion property value. Nullable. The external Item Version for the object specified by the externalObjectId.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalObjectVersion() {
        return this.backingStore.get("externalObjectVersion");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contextScenarioId", (n) -> { this.setContextScenarioId(n.getStringValue()); });
        deserializerMap.put("displayLinkType", (n) -> { this.setDisplayLinkType(n.getEnumValue(PlannerExternalTaskSourceDisplayType.class)); });
        deserializerMap.put("displayNameSegments", (n) -> { this.setDisplayNameSegments(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("externalContextId", (n) -> { this.setExternalContextId(n.getStringValue()); });
        deserializerMap.put("externalObjectId", (n) -> { this.setExternalObjectId(n.getStringValue()); });
        deserializerMap.put("externalObjectVersion", (n) -> { this.setExternalObjectVersion(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the webUrl property value. Nullable. URL of the user experience represented by the associated plannerExternalTaskSource.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.backingStore.get("webUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("contextScenarioId", this.getContextScenarioId());
        writer.writeEnumValue("displayLinkType", this.getDisplayLinkType());
        writer.writeCollectionOfPrimitiveValues("displayNameSegments", this.getDisplayNameSegments());
        writer.writeStringValue("externalContextId", this.getExternalContextId());
        writer.writeStringValue("externalObjectId", this.getExternalObjectId());
        writer.writeStringValue("externalObjectVersion", this.getExternalObjectVersion());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the contextScenarioId property value. Nullable. An identifier for the scenario associated with this external source. This should be in reverse DNS format. For example, Contoso company owned application for customer support would have a value like 'com.constoso.customerSupport'.
     * @param value Value to set for the contextScenarioId property.
     */
    public void setContextScenarioId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contextScenarioId", value);
    }
    /**
     * Sets the displayLinkType property value. Specifies how an application should display the link to the associated plannerExternalTaskSource. The possible values are: none, default.
     * @param value Value to set for the displayLinkType property.
     */
    public void setDisplayLinkType(@jakarta.annotation.Nullable final PlannerExternalTaskSourceDisplayType value) {
        this.backingStore.set("displayLinkType", value);
    }
    /**
     * Sets the displayNameSegments property value. The segments of the name of the external experience. Segments represent a hierarchical structure that allows other apps to display the relationship.
     * @param value Value to set for the displayNameSegments property.
     */
    public void setDisplayNameSegments(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("displayNameSegments", value);
    }
    /**
     * Sets the externalContextId property value. Nullable. The id of the external entity's containing entity or context.
     * @param value Value to set for the externalContextId property.
     */
    public void setExternalContextId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalContextId", value);
    }
    /**
     * Sets the externalObjectId property value. Nullable. The id of the entity that an external service associates with a task.
     * @param value Value to set for the externalObjectId property.
     */
    public void setExternalObjectId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalObjectId", value);
    }
    /**
     * Sets the externalObjectVersion property value. Nullable. The external Item Version for the object specified by the externalObjectId.
     * @param value Value to set for the externalObjectVersion property.
     */
    public void setExternalObjectVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalObjectVersion", value);
    }
    /**
     * Sets the webUrl property value. Nullable. URL of the user experience represented by the associated plannerExternalTaskSource.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webUrl", value);
    }
}
