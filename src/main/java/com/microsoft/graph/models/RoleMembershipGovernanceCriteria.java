package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RoleMembershipGovernanceCriteria extends GovernanceCriteria implements Parsable {
    /**
     * Instantiates a new RoleMembershipGovernanceCriteria and sets the default values.
     */
    public RoleMembershipGovernanceCriteria() {
        super();
        this.setOdataType("#microsoft.graph.roleMembershipGovernanceCriteria");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RoleMembershipGovernanceCriteria
     */
    @jakarta.annotation.Nonnull
    public static RoleMembershipGovernanceCriteria createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoleMembershipGovernanceCriteria();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("roleId", (n) -> { this.setRoleId(n.getStringValue()); });
        deserializerMap.put("roleTemplateId", (n) -> { this.setRoleTemplateId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the roleId property value. The roleId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRoleId() {
        return this.backingStore.get("roleId");
    }
    /**
     * Gets the roleTemplateId property value. The roleTemplateId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRoleTemplateId() {
        return this.backingStore.get("roleTemplateId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("roleId", this.getRoleId());
        writer.writeStringValue("roleTemplateId", this.getRoleTemplateId());
    }
    /**
     * Sets the roleId property value. The roleId property
     * @param value Value to set for the roleId property.
     */
    public void setRoleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("roleId", value);
    }
    /**
     * Sets the roleTemplateId property value. The roleTemplateId property
     * @param value Value to set for the roleTemplateId property.
     */
    public void setRoleTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("roleTemplateId", value);
    }
}
