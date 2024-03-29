package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerRosterMember extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PlannerRosterMember} and sets the default values.
     */
    public PlannerRosterMember() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlannerRosterMember}
     */
    @jakarta.annotation.Nonnull
    public static PlannerRosterMember createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerRosterMember();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("roles", (n) -> { this.setRoles(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the roles property value. Additional roles associated with the PlannerRosterMember, which determines permissions of the member in the plannerRoster. Currently there are no available roles to assign, and every member has full control over the contents of the plannerRoster.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoles() {
        return this.backingStore.get("roles");
    }
    /**
     * Gets the tenantId property value. Identifier of the tenant the user belongs to. Currently only the users from the same tenant can be added to a plannerRoster.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Gets the userId property value. Identifier of the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("roles", this.getRoles());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the roles property value. Additional roles associated with the PlannerRosterMember, which determines permissions of the member in the plannerRoster. Currently there are no available roles to assign, and every member has full control over the contents of the plannerRoster.
     * @param value Value to set for the roles property.
     */
    public void setRoles(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roles", value);
    }
    /**
     * Sets the tenantId property value. Identifier of the tenant the user belongs to. Currently only the users from the same tenant can be added to a plannerRoster.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
    /**
     * Sets the userId property value. Identifier of the user.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
