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
 * Defines the scope as all agent identities except those created by the specified builder platforms. Agent identity lifecycle policies only; using this scope on another policy type returns HTTP 400.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AllExcludingAgentBuilderPlatformsSubjectSet extends SubjectSet implements Parsable {
    /**
     * Instantiates a new {@link AllExcludingAgentBuilderPlatformsSubjectSet} and sets the default values.
     */
    public AllExcludingAgentBuilderPlatformsSubjectSet() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.allExcludingAgentBuilderPlatformsSubjectSet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AllExcludingAgentBuilderPlatformsSubjectSet}
     */
    @jakarta.annotation.Nonnull
    public static AllExcludingAgentBuilderPlatformsSubjectSet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AllExcludingAgentBuilderPlatformsSubjectSet();
    }
    /**
     * Gets the excludedAgentBuilderPlatforms property value. The excludedAgentBuilderPlatforms property
     * @return a {@link EnumSet<AgentBuilderPlatforms>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<AgentBuilderPlatforms> getExcludedAgentBuilderPlatforms() {
        return this.backingStore.get("excludedAgentBuilderPlatforms");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("excludedAgentBuilderPlatforms", (n) -> { this.setExcludedAgentBuilderPlatforms(n.getEnumSetValue(AgentBuilderPlatforms::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("excludedAgentBuilderPlatforms", this.getExcludedAgentBuilderPlatforms());
    }
    /**
     * Sets the excludedAgentBuilderPlatforms property value. The excludedAgentBuilderPlatforms property
     * @param value Value to set for the excludedAgentBuilderPlatforms property.
     */
    public void setExcludedAgentBuilderPlatforms(@jakarta.annotation.Nullable final EnumSet<AgentBuilderPlatforms> value) {
        this.backingStore.set("excludedAgentBuilderPlatforms", value);
    }
}
