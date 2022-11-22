package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerExternalTaskSource extends PlannerTaskCreation implements Parsable {
    /** The contextScenarioId property */
    private String _contextScenarioId;
    /** The displayLinkType property */
    private PlannerExternalTaskSourceDisplayType _displayLinkType;
    /** The displayNameSegments property */
    private java.util.List<String> _displayNameSegments;
    /** The externalContextId property */
    private String _externalContextId;
    /** The externalObjectId property */
    private String _externalObjectId;
    /** The externalObjectVersion property */
    private String _externalObjectVersion;
    /** The webUrl property */
    private String _webUrl;
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
     * Gets the contextScenarioId property value. The contextScenarioId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContextScenarioId() {
        return this._contextScenarioId;
    }
    /**
     * Gets the displayLinkType property value. The displayLinkType property
     * @return a plannerExternalTaskSourceDisplayType
     */
    @javax.annotation.Nullable
    public PlannerExternalTaskSourceDisplayType getDisplayLinkType() {
        return this._displayLinkType;
    }
    /**
     * Gets the displayNameSegments property value. The displayNameSegments property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDisplayNameSegments() {
        return this._displayNameSegments;
    }
    /**
     * Gets the externalContextId property value. The externalContextId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalContextId() {
        return this._externalContextId;
    }
    /**
     * Gets the externalObjectId property value. The externalObjectId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalObjectId() {
        return this._externalObjectId;
    }
    /**
     * Gets the externalObjectVersion property value. The externalObjectVersion property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalObjectVersion() {
        return this._externalObjectVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
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
     * Gets the webUrl property value. The webUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this._webUrl;
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
     * Sets the contextScenarioId property value. The contextScenarioId property
     * @param value Value to set for the contextScenarioId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContextScenarioId(@javax.annotation.Nullable final String value) {
        this._contextScenarioId = value;
    }
    /**
     * Sets the displayLinkType property value. The displayLinkType property
     * @param value Value to set for the displayLinkType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayLinkType(@javax.annotation.Nullable final PlannerExternalTaskSourceDisplayType value) {
        this._displayLinkType = value;
    }
    /**
     * Sets the displayNameSegments property value. The displayNameSegments property
     * @param value Value to set for the displayNameSegments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayNameSegments(@javax.annotation.Nullable final java.util.List<String> value) {
        this._displayNameSegments = value;
    }
    /**
     * Sets the externalContextId property value. The externalContextId property
     * @param value Value to set for the externalContextId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalContextId(@javax.annotation.Nullable final String value) {
        this._externalContextId = value;
    }
    /**
     * Sets the externalObjectId property value. The externalObjectId property
     * @param value Value to set for the externalObjectId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalObjectId(@javax.annotation.Nullable final String value) {
        this._externalObjectId = value;
    }
    /**
     * Sets the externalObjectVersion property value. The externalObjectVersion property
     * @param value Value to set for the externalObjectVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalObjectVersion(@javax.annotation.Nullable final String value) {
        this._externalObjectVersion = value;
    }
    /**
     * Sets the webUrl property value. The webUrl property
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
