package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerExternalTaskSource extends PlannerTaskCreation implements Parsable {
    /**
     * Nullable. An identifier for the scenario associated with this external source. This should be in reverse DNS format. For example, Contoso company owned application for customer support would have a value like 'com.constoso.customerSupport'.
     */
    private String contextScenarioId;
    /**
     * Specifies how an application should display the link to the associated plannerExternalTaskSource. The possible values are: none, default.
     */
    private PlannerExternalTaskSourceDisplayType displayLinkType;
    /**
     * The segments of the name of the external experience. Segments represent a hierarchical structure that allows other apps to display the relationship.
     */
    private java.util.List<String> displayNameSegments;
    /**
     * Nullable. The id of the external entity's containing entity or context.
     */
    private String externalContextId;
    /**
     * Nullable. The id of the entity that an external service associates with a task.
     */
    private String externalObjectId;
    /**
     * Nullable. The external Item Version for the object specified by the externalObjectId.
     */
    private String externalObjectVersion;
    /**
     * Nullable. URL of the user experience represented by the associated plannerExternalTaskSource.
     */
    private String webUrl;
    /**
     * Instantiates a new PlannerExternalTaskSource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlannerExternalTaskSource() {
        super();
        this.setOdataType("#microsoft.graph.plannerExternalTaskSource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerExternalTaskSource
     */
    @javax.annotation.Nonnull
    public static PlannerExternalTaskSource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerExternalTaskSource();
    }
    /**
     * Gets the contextScenarioId property value. Nullable. An identifier for the scenario associated with this external source. This should be in reverse DNS format. For example, Contoso company owned application for customer support would have a value like 'com.constoso.customerSupport'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContextScenarioId() {
        return this.contextScenarioId;
    }
    /**
     * Gets the displayLinkType property value. Specifies how an application should display the link to the associated plannerExternalTaskSource. The possible values are: none, default.
     * @return a plannerExternalTaskSourceDisplayType
     */
    @javax.annotation.Nullable
    public PlannerExternalTaskSourceDisplayType getDisplayLinkType() {
        return this.displayLinkType;
    }
    /**
     * Gets the displayNameSegments property value. The segments of the name of the external experience. Segments represent a hierarchical structure that allows other apps to display the relationship.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDisplayNameSegments() {
        return this.displayNameSegments;
    }
    /**
     * Gets the externalContextId property value. Nullable. The id of the external entity's containing entity or context.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalContextId() {
        return this.externalContextId;
    }
    /**
     * Gets the externalObjectId property value. Nullable. The id of the entity that an external service associates with a task.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalObjectId() {
        return this.externalObjectId;
    }
    /**
     * Gets the externalObjectVersion property value. Nullable. The external Item Version for the object specified by the externalObjectId.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalObjectVersion() {
        return this.externalObjectVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this.webUrl;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContextScenarioId(@javax.annotation.Nullable final String value) {
        this.contextScenarioId = value;
    }
    /**
     * Sets the displayLinkType property value. Specifies how an application should display the link to the associated plannerExternalTaskSource. The possible values are: none, default.
     * @param value Value to set for the displayLinkType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayLinkType(@javax.annotation.Nullable final PlannerExternalTaskSourceDisplayType value) {
        this.displayLinkType = value;
    }
    /**
     * Sets the displayNameSegments property value. The segments of the name of the external experience. Segments represent a hierarchical structure that allows other apps to display the relationship.
     * @param value Value to set for the displayNameSegments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayNameSegments(@javax.annotation.Nullable final java.util.List<String> value) {
        this.displayNameSegments = value;
    }
    /**
     * Sets the externalContextId property value. Nullable. The id of the external entity's containing entity or context.
     * @param value Value to set for the externalContextId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalContextId(@javax.annotation.Nullable final String value) {
        this.externalContextId = value;
    }
    /**
     * Sets the externalObjectId property value. Nullable. The id of the entity that an external service associates with a task.
     * @param value Value to set for the externalObjectId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalObjectId(@javax.annotation.Nullable final String value) {
        this.externalObjectId = value;
    }
    /**
     * Sets the externalObjectVersion property value. Nullable. The external Item Version for the object specified by the externalObjectId.
     * @param value Value to set for the externalObjectVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalObjectVersion(@javax.annotation.Nullable final String value) {
        this.externalObjectVersion = value;
    }
    /**
     * Sets the webUrl property value. Nullable. URL of the user experience represented by the associated plannerExternalTaskSource.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this.webUrl = value;
    }
}
