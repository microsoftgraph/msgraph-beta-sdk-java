package com.microsoft.graph.beta.models.teamsadministration;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamsPolicyAssignment extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TeamsPolicyAssignment} and sets the default values.
     */
    public TeamsPolicyAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TeamsPolicyAssignment}
     */
    @jakarta.annotation.Nonnull
    public static TeamsPolicyAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsPolicyAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("userAssignments", (n) -> { this.setUserAssignments(n.getCollectionOfObjectValues(TeamsPolicyUserAssignment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the userAssignments property value. Navigation property to the collection of user policy assignments.
     * @return a {@link java.util.List<TeamsPolicyUserAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamsPolicyUserAssignment> getUserAssignments() {
        return this.backingStore.get("userAssignments");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("userAssignments", this.getUserAssignments());
    }
    /**
     * Sets the userAssignments property value. Navigation property to the collection of user policy assignments.
     * @param value Value to set for the userAssignments property.
     */
    public void setUserAssignments(@jakarta.annotation.Nullable final java.util.List<TeamsPolicyUserAssignment> value) {
        this.backingStore.set("userAssignments", value);
    }
}
