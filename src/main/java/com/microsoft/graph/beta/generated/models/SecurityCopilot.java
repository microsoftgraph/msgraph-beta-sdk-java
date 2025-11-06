package com.microsoft.graph.beta.models;

import com.microsoft.graph.beta.models.security.securitycopilot.Workspace;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SecurityCopilot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SecurityCopilot} and sets the default values.
     */
    public SecurityCopilot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SecurityCopilot}
     */
    @jakarta.annotation.Nonnull
    public static SecurityCopilot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityCopilot();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("workspaces", (n) -> { this.setWorkspaces(n.getCollectionOfObjectValues(Workspace::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the workspaces property value. References a workspace in Security Copilot.
     * @return a {@link java.util.List<Workspace>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Workspace> getWorkspaces() {
        return this.backingStore.get("workspaces");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("workspaces", this.getWorkspaces());
    }
    /**
     * Sets the workspaces property value. References a workspace in Security Copilot.
     * @param value Value to set for the workspaces property.
     */
    public void setWorkspaces(@jakarta.annotation.Nullable final java.util.List<Workspace> value) {
        this.backingStore.set("workspaces", value);
    }
}
