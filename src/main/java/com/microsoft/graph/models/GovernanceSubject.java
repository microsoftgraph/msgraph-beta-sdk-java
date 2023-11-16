package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GovernanceSubject extends Entity implements Parsable {
    /**
     * Instantiates a new GovernanceSubject and sets the default values.
     */
    public GovernanceSubject() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GovernanceSubject
     */
    @jakarta.annotation.Nonnull
    public static GovernanceSubject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceSubject();
    }
    /**
     * Gets the displayName property value. The display name of the subject.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * Gets the email property value. The email address of the user subject. If the subject is in other types, it's empty.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.BackingStore.get("email");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("principalName", (n) -> { this.setPrincipalName(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the principalName property value. The principal name of the user subject. If the subject is in other types, it's empty.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrincipalName() {
        return this.BackingStore.get("principalName");
    }
    /**
     * Gets the type property value. The type of the subject. The value can be User, Group, and ServicePrincipal.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.BackingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("principalName", this.getPrincipalName());
        writer.writeStringValue("type", this.getType());
    }
    /**
     * Sets the displayName property value. The display name of the subject.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the email property value. The email address of the user subject. If the subject is in other types, it's empty.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("email", value);
    }
    /**
     * Sets the principalName property value. The principal name of the user subject. If the subject is in other types, it's empty.
     * @param value Value to set for the principalName property.
     */
    public void setPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("principalName", value);
    }
    /**
     * Sets the type property value. The type of the subject. The value can be User, Group, and ServicePrincipal.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("type", value);
    }
}
