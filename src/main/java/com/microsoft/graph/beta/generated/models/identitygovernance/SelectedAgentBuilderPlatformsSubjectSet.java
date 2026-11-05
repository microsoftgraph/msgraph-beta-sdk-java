package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.graph.beta.models.SubjectSet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Defines the scope as only agent identities created by any of the selected builder platforms. It is valid only for agent identity lifecycle policies; using it on another policy type returns HTTP 400.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SelectedAgentBuilderPlatformsSubjectSet extends SubjectSet implements Parsable {
    /**
     * Instantiates a new {@link SelectedAgentBuilderPlatformsSubjectSet} and sets the default values.
     */
    public SelectedAgentBuilderPlatformsSubjectSet() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.selectedAgentBuilderPlatformsSubjectSet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SelectedAgentBuilderPlatformsSubjectSet}
     */
    @jakarta.annotation.Nonnull
    public static SelectedAgentBuilderPlatformsSubjectSet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SelectedAgentBuilderPlatformsSubjectSet();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("includedAgentBuilderPlatforms", (n) -> { this.setIncludedAgentBuilderPlatforms(n.getEnumSetValue(AgentBuilderPlatforms::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the includedAgentBuilderPlatforms property value. The includedAgentBuilderPlatforms property
     * @return a {@link EnumSet<AgentBuilderPlatforms>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<AgentBuilderPlatforms> getIncludedAgentBuilderPlatforms() {
        return this.backingStore.get("includedAgentBuilderPlatforms");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("includedAgentBuilderPlatforms", this.getIncludedAgentBuilderPlatforms());
    }
    /**
     * Sets the includedAgentBuilderPlatforms property value. The includedAgentBuilderPlatforms property
     * @param value Value to set for the includedAgentBuilderPlatforms property.
     */
    public void setIncludedAgentBuilderPlatforms(@jakarta.annotation.Nullable final EnumSet<AgentBuilderPlatforms> value) {
        this.backingStore.set("includedAgentBuilderPlatforms", value);
    }
}
