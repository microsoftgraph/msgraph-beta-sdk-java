package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Role Scope Tag
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RoleScopeTag extends Entity implements Parsable {
    /**
     * Instantiates a new {@link RoleScopeTag} and sets the default values.
     */
    public RoleScopeTag() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RoleScopeTag}
     */
    @jakarta.annotation.Nonnull
    public static RoleScopeTag createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoleScopeTag();
    }
    /**
     * Gets the assignments property value. The list of assignments for this Role Scope Tag.
     * @return a {@link java.util.List<RoleScopeTagAutoAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RoleScopeTagAutoAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the description property value. Description of the Role Scope Tag.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display or friendly name of the Role Scope Tag.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(RoleScopeTagAutoAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isBuiltIn", (n) -> { this.setIsBuiltIn(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isBuiltIn property value. Description of the Role Scope Tag. This property is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBuiltIn() {
        return this.backingStore.get("isBuiltIn");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the assignments property value. The list of assignments for this Role Scope Tag.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<RoleScopeTagAutoAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the description property value. Description of the Role Scope Tag.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display or friendly name of the Role Scope Tag.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isBuiltIn property value. Description of the Role Scope Tag. This property is read-only.
     * @param value Value to set for the isBuiltIn property.
     */
    public void setIsBuiltIn(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isBuiltIn", value);
    }
}
