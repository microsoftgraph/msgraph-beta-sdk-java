package com.microsoft.graph.beta.models.teamsadministration;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamsAdminRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TeamsAdminRoot} and sets the default values.
     */
    public TeamsAdminRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TeamsAdminRoot}
     */
    @jakarta.annotation.Nonnull
    public static TeamsAdminRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsAdminRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("policy", (n) -> { this.setPolicy(n.getObjectValue(TeamsPolicyAssignment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the policy property value. The policy property
     * @return a {@link TeamsPolicyAssignment}
     */
    @jakarta.annotation.Nullable
    public TeamsPolicyAssignment getPolicy() {
        return this.backingStore.get("policy");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("policy", this.getPolicy());
    }
    /**
     * Sets the policy property value. The policy property
     * @param value Value to set for the policy property.
     */
    public void setPolicy(@jakarta.annotation.Nullable final TeamsPolicyAssignment value) {
        this.backingStore.set("policy", value);
    }
}
