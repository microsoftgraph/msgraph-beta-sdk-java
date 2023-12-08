package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContinuousAccessEvaluationPolicy extends Entity implements Parsable {
    /**
     * Instantiates a new ContinuousAccessEvaluationPolicy and sets the default values.
     */
    public ContinuousAccessEvaluationPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ContinuousAccessEvaluationPolicy
     */
    @jakarta.annotation.Nonnull
    public static ContinuousAccessEvaluationPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContinuousAccessEvaluationPolicy();
    }
    /**
     * Gets the description property value. Continuous access evaluation automatically blocks access to resources and applications in near real time when a user's access is removed or a client IP address changes. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The value is always Continuous Access Evaluation. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("groups", (n) -> { this.setGroups(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("migrate", (n) -> { this.setMigrate(n.getBooleanValue()); });
        deserializerMap.put("users", (n) -> { this.setUsers(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the groups property value. The collection of group identifiers in scope for evaluation. All groups are in scope when the collection is empty. Read-only.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getGroups() {
        return this.backingStore.get("groups");
    }
    /**
     * Gets the isEnabled property value. true to indicate whether continuous access evaluation should be performed; otherwise false. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the migrate property value. true to indicate that the continuous access evaluation policy settings should be or has been migrated to the conditional access policy.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMigrate() {
        return this.backingStore.get("migrate");
    }
    /**
     * Gets the users property value. The collection of user identifiers in scope for evaluation. All users are in scope when the collection is empty. Read-only.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getUsers() {
        return this.backingStore.get("users");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("groups", this.getGroups());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeBooleanValue("migrate", this.getMigrate());
        writer.writeCollectionOfPrimitiveValues("users", this.getUsers());
    }
    /**
     * Sets the description property value. Continuous access evaluation automatically blocks access to resources and applications in near real time when a user's access is removed or a client IP address changes. Read-only.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The value is always Continuous Access Evaluation. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the groups property value. The collection of group identifiers in scope for evaluation. All groups are in scope when the collection is empty. Read-only.
     * @param value Value to set for the groups property.
     */
    public void setGroups(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("groups", value);
    }
    /**
     * Sets the isEnabled property value. true to indicate whether continuous access evaluation should be performed; otherwise false. Read-only.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the migrate property value. true to indicate that the continuous access evaluation policy settings should be or has been migrated to the conditional access policy.
     * @param value Value to set for the migrate property.
     */
    public void setMigrate(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("migrate", value);
    }
    /**
     * Sets the users property value. The collection of user identifiers in scope for evaluation. All users are in scope when the collection is empty. Read-only.
     * @param value Value to set for the users property.
     */
    public void setUsers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("users", value);
    }
}
