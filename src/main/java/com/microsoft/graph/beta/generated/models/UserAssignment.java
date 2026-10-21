package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserAssignment extends PlannerDelta implements Parsable {
    /**
     * Instantiates a new {@link UserAssignment} and sets the default values.
     */
    public UserAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserAssignment}
     */
    @jakarta.annotation.Nonnull
    public static UserAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserAssignment();
    }
    /**
     * Gets the assignedBy property value. Identity of the user (or application) that made the assignment.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getAssignedBy() {
        return this.backingStore.get("assignedBy");
    }
    /**
     * Gets the assignedDateTime property value. Date and time the assignment was made.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAssignedDateTime() {
        return this.backingStore.get("assignedDateTime");
    }
    /**
     * Gets the capabilities property value. Server-computed, read-only capability flags indicating which optional features are enabled for the entity.
     * @return a {@link UserAssignmentCapability}
     */
    @jakarta.annotation.Nullable
    public UserAssignmentCapability getCapabilities() {
        return this.backingStore.get("capabilities");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedBy", (n) -> { this.setAssignedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("assignedDateTime", (n) -> { this.setAssignedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("capabilities", (n) -> { this.setCapabilities(n.getObjectValue(UserAssignmentCapability::createFromDiscriminatorValue)); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the user property value. The user property
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getUser() {
        return this.backingStore.get("user");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("assignedBy", this.getAssignedBy());
        writer.writeOffsetDateTimeValue("assignedDateTime", this.getAssignedDateTime());
        writer.writeObjectValue("user", this.getUser());
    }
    /**
     * Sets the assignedBy property value. Identity of the user (or application) that made the assignment.
     * @param value Value to set for the assignedBy property.
     */
    public void setAssignedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("assignedBy", value);
    }
    /**
     * Sets the assignedDateTime property value. Date and time the assignment was made.
     * @param value Value to set for the assignedDateTime property.
     */
    public void setAssignedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("assignedDateTime", value);
    }
    /**
     * Sets the capabilities property value. Server-computed, read-only capability flags indicating which optional features are enabled for the entity.
     * @param value Value to set for the capabilities property.
     */
    public void setCapabilities(@jakarta.annotation.Nullable final UserAssignmentCapability value) {
        this.backingStore.set("capabilities", value);
    }
    /**
     * Sets the user property value. The user property
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("user", value);
    }
}
