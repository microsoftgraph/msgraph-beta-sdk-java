package com.microsoft.graph.beta.models.security.securitycopilot;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Workspace extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Workspace} and sets the default values.
     */
    public Workspace() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Workspace}
     */
    @jakarta.annotation.Nonnull
    public static Workspace createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Workspace();
    }
    /**
     * Gets the displayName property value. The displayName property
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
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("plugins", (n) -> { this.setPlugins(n.getCollectionOfObjectValues(Plugin::createFromDiscriminatorValue)); });
        deserializerMap.put("sessions", (n) -> { this.setSessions(n.getCollectionOfObjectValues(Session::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the plugins property value. The plugins property
     * @return a {@link java.util.List<Plugin>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Plugin> getPlugins() {
        return this.backingStore.get("plugins");
    }
    /**
     * Gets the sessions property value. The sessions property
     * @return a {@link java.util.List<Session>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Session> getSessions() {
        return this.backingStore.get("sessions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("plugins", this.getPlugins());
        writer.writeCollectionOfObjectValues("sessions", this.getSessions());
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the plugins property value. The plugins property
     * @param value Value to set for the plugins property.
     */
    public void setPlugins(@jakarta.annotation.Nullable final java.util.List<Plugin> value) {
        this.backingStore.set("plugins", value);
    }
    /**
     * Sets the sessions property value. The sessions property
     * @param value Value to set for the sessions property.
     */
    public void setSessions(@jakarta.annotation.Nullable final java.util.List<Session> value) {
        this.backingStore.set("sessions", value);
    }
}
