package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamTemplate extends Entity implements Parsable {
    /** The definitions property */
    private java.util.List<TeamTemplateDefinition> _definitions;
    /**
     * Instantiates a new TeamTemplate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamTemplate() {
        super();
        this.setOdataType("#microsoft.graph.teamTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamTemplate
     */
    @javax.annotation.Nonnull
    public static TeamTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamTemplate();
    }
    /**
     * Gets the definitions property value. The definitions property
     * @return a teamTemplateDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<TeamTemplateDefinition> getDefinitions() {
        return this._definitions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamTemplate currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("definitions", (n) -> { currentObject.setDefinitions(n.getCollectionOfObjectValues(TeamTemplateDefinition::createFromDiscriminatorValue)); });
        }};
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
        writer.writeCollectionOfObjectValues("definitions", this.getDefinitions());
    }
    /**
     * Sets the definitions property value. The definitions property
     * @param value Value to set for the definitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefinitions(@javax.annotation.Nullable final java.util.List<TeamTemplateDefinition> value) {
        this._definitions = value;
    }
}
