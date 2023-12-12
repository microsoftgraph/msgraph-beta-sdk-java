package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedRole extends Entity implements Parsable {
    /**
     * Instantiates a new PrivilegedRole and sets the default values.
     */
    public PrivilegedRole() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrivilegedRole
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedRole createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedRole();
    }
    /**
     * Gets the assignments property value. The assignments property
     * @return a java.util.List<PrivilegedRoleAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrivilegedRoleAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(PrivilegedRoleAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(PrivilegedRoleSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getObjectValue(PrivilegedRoleSummary::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the settings property value. The settings property
     * @return a PrivilegedRoleSettings
     */
    @jakarta.annotation.Nullable
    public PrivilegedRoleSettings getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Gets the summary property value. The summary property
     * @return a PrivilegedRoleSummary
     */
    @jakarta.annotation.Nullable
    public PrivilegedRoleSummary getSummary() {
        return this.backingStore.get("summary");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeObjectValue("summary", this.getSummary());
    }
    /**
     * Sets the assignments property value. The assignments property
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<PrivilegedRoleAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final PrivilegedRoleSettings value) {
        this.backingStore.set("settings", value);
    }
    /**
     * Sets the summary property value. The summary property
     * @param value Value to set for the summary property.
     */
    public void setSummary(@jakarta.annotation.Nullable final PrivilegedRoleSummary value) {
        this.backingStore.set("summary", value);
    }
}
