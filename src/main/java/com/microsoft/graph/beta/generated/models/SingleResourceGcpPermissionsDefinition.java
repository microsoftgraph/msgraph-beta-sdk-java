package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SingleResourceGcpPermissionsDefinition extends PermissionsDefinition implements Parsable {
    /**
     * Instantiates a new {@link SingleResourceGcpPermissionsDefinition} and sets the default values.
     */
    public SingleResourceGcpPermissionsDefinition() {
        super();
        this.setOdataType("#microsoft.graph.singleResourceGcpPermissionsDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SingleResourceGcpPermissionsDefinition}
     */
    @jakarta.annotation.Nonnull
    public static SingleResourceGcpPermissionsDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SingleResourceGcpPermissionsDefinition();
    }
    /**
     * Gets the actionInfo property value. The actionInfo property
     * @return a {@link GcpPermissionsDefinitionAction}
     */
    @jakarta.annotation.Nullable
    public GcpPermissionsDefinitionAction getActionInfo() {
        return this.backingStore.get("actionInfo");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionInfo", (n) -> { this.setActionInfo(n.getObjectValue(GcpPermissionsDefinitionAction::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceId", (n) -> { this.setResourceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the resourceId property value. Identifier for the resource.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceId() {
        return this.backingStore.get("resourceId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("actionInfo", this.getActionInfo());
        writer.writeStringValue("resourceId", this.getResourceId());
    }
    /**
     * Sets the actionInfo property value. The actionInfo property
     * @param value Value to set for the actionInfo property.
     */
    public void setActionInfo(@jakarta.annotation.Nullable final GcpPermissionsDefinitionAction value) {
        this.backingStore.set("actionInfo", value);
    }
    /**
     * Sets the resourceId property value. Identifier for the resource.
     * @param value Value to set for the resourceId property.
     */
    public void setResourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceId", value);
    }
}
