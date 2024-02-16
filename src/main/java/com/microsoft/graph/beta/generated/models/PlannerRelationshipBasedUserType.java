package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerRelationshipBasedUserType extends PlannerTaskConfigurationRoleBase implements Parsable {
    /**
     * Instantiates a new {@link PlannerRelationshipBasedUserType} and sets the default values.
     */
    public PlannerRelationshipBasedUserType() {
        super();
        this.setOdataType("#microsoft.graph.plannerRelationshipBasedUserType");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlannerRelationshipBasedUserType}
     */
    @jakarta.annotation.Nonnull
    public static PlannerRelationshipBasedUserType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerRelationshipBasedUserType();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(PlannerRelationshipUserRoles::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the role property value. The role property
     * @return a {@link PlannerRelationshipUserRoles}
     */
    @jakarta.annotation.Nullable
    public PlannerRelationshipUserRoles getRole() {
        return this.backingStore.get("role");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("role", this.getRole());
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final PlannerRelationshipUserRoles value) {
        this.backingStore.set("role", value);
    }
}
