package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerRelationshipBasedUserType extends PlannerTaskConfigurationRoleBase implements Parsable {
    /** The role property */
    private PlannerRelationshipUserRoles _role;
    /**
     * Instantiates a new PlannerRelationshipBasedUserType and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlannerRelationshipBasedUserType() {
        super();
        this.setOdataType("#microsoft.graph.plannerRelationshipBasedUserType");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerRelationshipBasedUserType
     */
    @javax.annotation.Nonnull
    public static PlannerRelationshipBasedUserType createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerRelationshipBasedUserType();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(PlannerRelationshipUserRoles.class)); });
        return deserializerMap;
    }
    /**
     * Gets the role property value. The role property
     * @return a plannerRelationshipUserRoles
     */
    @javax.annotation.Nullable
    public PlannerRelationshipUserRoles getRole() {
        return this._role;
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
        writer.writeEnumValue("role", this.getRole());
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRole(@javax.annotation.Nullable final PlannerRelationshipUserRoles value) {
        this._role = value;
    }
}
