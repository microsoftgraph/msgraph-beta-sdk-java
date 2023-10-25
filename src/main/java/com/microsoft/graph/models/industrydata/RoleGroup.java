package com.microsoft.graph.models.industrydata;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RoleGroup extends Entity implements Parsable {
    /**
     * The name of the role group.
     */
    private String displayName;
    /**
     * The set of roles included in the role group.
     */
    private java.util.List<RoleReferenceValue> roles;
    /**
     * Instantiates a new RoleGroup and sets the default values.
     */
    public RoleGroup() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RoleGroup
     */
    @jakarta.annotation.Nonnull
    public static RoleGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoleGroup();
    }
    /**
     * Gets the displayName property value. The name of the role group.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("roles", (n) -> { this.setRoles(n.getCollectionOfObjectValues(RoleReferenceValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the roles property value. The set of roles included in the role group.
     * @return a java.util.List<RoleReferenceValue>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RoleReferenceValue> getRoles() {
        return this.roles;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("roles", this.getRoles());
    }
    /**
     * Sets the displayName property value. The name of the role group.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the roles property value. The set of roles included in the role group.
     * @param value Value to set for the roles property.
     */
    public void setRoles(@jakarta.annotation.Nullable final java.util.List<RoleReferenceValue> value) {
        this.roles = value;
    }
}
