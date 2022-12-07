package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerExternalPlanSource extends PlannerPlanCreation implements Parsable {
    /** The contextScenarioId property */
    private String _contextScenarioId;
    /** The externalContextId property */
    private String _externalContextId;
    /** The externalObjectId property */
    private String _externalObjectId;
    /**
     * Instantiates a new PlannerExternalPlanSource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlannerExternalPlanSource() {
        super();
        this.setOdataType("#microsoft.graph.plannerExternalPlanSource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerExternalPlanSource
     */
    @javax.annotation.Nonnull
    public static PlannerExternalPlanSource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerExternalPlanSource();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contextScenarioId", (n) -> { this.setContextScenarioId(n.getStringValue()); });
        deserializerMap.put("externalContextId", (n) -> { this.setExternalContextId(n.getStringValue()); });
        deserializerMap.put("externalObjectId", (n) -> { this.setExternalObjectId(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeStringValue("externalContextId", this.getExternalContextId());
        writer.writeStringValue("externalObjectId", this.getExternalObjectId());
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
}
